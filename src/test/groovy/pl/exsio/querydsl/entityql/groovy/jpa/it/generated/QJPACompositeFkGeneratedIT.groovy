package pl.exsio.querydsl.entityql.groovy.jpa.it.generated

import com.querydsl.sql.SQLQueryFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ContextConfiguration
import pl.exsio.querydsl.entityql.groovy.config.SpringContext
import pl.exsio.querydsl.entityql.groovy.jpa.entity.it.CompositePk
import pl.exsio.querydsl.entityql.groovy.jpa.entity.it.SingularPk
import pl.exsio.querydsl.entityql.groovy.jpa.entity.it.generated.QCompositeFk
import pl.exsio.querydsl.entityql.groovy.jpa.entity.it.generated.QCompositePk
import pl.exsio.querydsl.entityql.groovy.jpa.entity.it.generated.QSingularPk
import spock.lang.Specification

import static com.querydsl.core.types.Projections.constructor

@ContextConfiguration(classes = [SpringContext])
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class QJPACompositeFkGeneratedIT extends Specification {

    @Autowired
    SQLQueryFactory queryFactory


    def "should get all rows from an Entity based on a Composite FK Join to Composite PK"() {
        given:
        QCompositePk compositePk = QCompositePk.INSTANCE
        QCompositeFk compositeFk = QCompositeFk.INSTANCE

        when:
        List<CompositePk> pks = queryFactory.query()
                .select(
                        constructor(
                                CompositePk,
                                compositePk.id1,
                                compositePk.id2,
                                compositePk.desc
                        ))
                .from(compositeFk)
                .innerJoin(compositeFk.compositePk, compositePk)
                .where(compositeFk.desc.eq("fkd2"))
                .fetch()

        then:
        pks.size() == 1
        pks.forEach { pk ->
            assert pk.id1 == 2L
            assert pk.id2 == "s2"
            assert pk.desc == "pkd2"
        }
    }

    def "should get all rows from an Entity based on a Composite FK Join to Singular PK"() {
        given:
        QSingularPk singularPk = QSingularPk.INSTANCE
        QCompositeFk compositeFk = QCompositeFk.INSTANCE

        when:
        List<SingularPk> pks = queryFactory.query()
                .select(
                        constructor(
                                SingularPk,
                                singularPk.id1,
                                singularPk.id2,
                                singularPk.desc
                        ))
                .from(compositeFk)
                .innerJoin(compositeFk.singularPk, singularPk)
                .where(compositeFk.desc.eq("fkd2"))
                .fetch()

        then:
        pks.size() == 1
        pks.forEach { pk ->
            assert pk.id1 == 2L
            assert pk.id2 == "s2"
            assert pk.desc == "pkd2"
        }
    }

    def "should get all rows from an Entity based on an inverse Composite FK Join to Composite PK"() {
        given:
        QCompositePk compositePk = QCompositePk.INSTANCE
        QCompositeFk compositeFk = QCompositeFk.INSTANCE

        when:
        List<CompositePk> pks = queryFactory.query()
                .select(
                        constructor(
                                CompositePk,
                                compositePk.id1,
                                compositePk.id2,
                                compositeFk.desc
                        ))
                .from(compositePk)
                .innerJoin(compositePk.compositeFks, compositeFk)
                .where(compositeFk.desc.eq("fkd2"))
                .fetch()

        then:
        pks.size() == 1
        pks.forEach { pk ->
            assert pk.id1 == 2L
            assert pk.id2 == "s2"
            assert pk.desc == "fkd2"
        }
    }

    def "should get all rows from an Entity based on an inverse Composite FK Join to Singular PK"() {
        given:
        QSingularPk singularPk = QSingularPk.INSTANCE
        QCompositeFk compositeFk = QCompositeFk.INSTANCE

        when:
        List<SingularPk> pks = queryFactory.query()
                .select(
                        constructor(
                                SingularPk,
                                singularPk.id1,
                                singularPk.id2,
                                compositeFk.desc
                        ))
                .from(singularPk)
                .innerJoin(singularPk.compositeFks, compositeFk)
                .where(compositeFk.desc.eq("fkd2"))
                .fetch()

        then:
        pks.size() == 1
        pks.forEach { pk ->
            assert pk.id1 == 2L
            assert pk.id2 == "s2"
            assert pk.desc == "fkd2"
        }
    }

}
