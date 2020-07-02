 package pl.exsio.querydsl.entityql.groovy.spring_data_jdbc.entity.it.generated

 import com.querydsl.core.types.Path
 import com.querydsl.sql.PrimaryKey
 import pl.exsio.querydsl.entityql.QColumnMetadataFactory
 import pl.exsio.querydsl.entityql.QPathConfig
 import pl.exsio.querydsl.entityql.QPathFactory
 import pl.exsio.querydsl.entityql.QStaticModel
 import pl.exsio.querydsl.entityql.groovy.spring_data_jdbc.entity.it.GroupAdmin
 import com.querydsl.core.types.dsl.NumberPath
 import com.querydsl.core.types.dsl.StringPath
 import javax.annotation.Generated
 import java.util.Arrays
 import groovy.transform.CompileStatic
 /**
 *
 * This class was generated by EntityQL (https://github.com/eXsio/querydsl-entityql).
 * It is not recommended to make any changes to this class.
 * Any manual changes will be lost upon the next class generation.
 *
 */
 @CompileStatic
 @Generated("pl.exsio.querydsl.entityql.QExporter")
 public final class QGroupAdmin extends QStaticModel<GroupAdmin> {

     private static final long serialVersionUID = -1049580923

     public static final QGroupAdmin INSTANCE = new QGroupAdmin()

     public static final QGroupAdmin qGroupAdmin = INSTANCE

     public final NumberPath <Long> id

     public final StringPath name

     public final PrimaryKey<GroupAdmin> _primaryKey

     public QGroupAdmin() {
         this("GROUP_ADMINS")
     }
     @SuppressWarnings(value = "unchecked")
     public QGroupAdmin(String variable) {
         super(GroupAdmin.class, variable, "", "GROUP_ADMINS")
         id: {
             QPathConfig config = new QPathConfig(Long.class, Long.class, "GA_ID", true, 1, -5)
             this.id = QPathFactory.<NumberPath <Long>>create(this, config)
             addMetadata(this.id, QColumnMetadataFactory.create(config))
             this.columnsMap.put("id", this.id)
         }

         name: {
             QPathConfig config = new QPathConfig(String.class, String.class, "NAME", true, 2, 12)
             this.name = QPathFactory.<StringPath>create(this, config)
             addMetadata(this.name, QColumnMetadataFactory.create(config))
             this.columnsMap.put("name", this.name)
         }

         _primaryKey: {
             this.primaryKeyColumns = Arrays.<Path<?>>asList(this.id)
             Path[] pkArray = (Path[]) primaryKeyColumns.<Path>toArray(new Path[0])
             this._primaryKey = this.<GroupAdmin>createPrimaryKey(pkArray)
         }

     }
 } 