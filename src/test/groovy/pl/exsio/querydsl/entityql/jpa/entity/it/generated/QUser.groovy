package pl.exsio.querydsl.entityql.jpa.entity.it.generated

import com.querydsl.core.types.Path
import com.querydsl.core.types.dsl.BooleanPath
import com.querydsl.core.types.dsl.NumberPath
import com.querydsl.core.types.dsl.StringPath
import com.querydsl.sql.PrimaryKey
import groovy.transform.CompileStatic
import pl.exsio.querydsl.entityql.QColumnMetadataFactory
import pl.exsio.querydsl.entityql.QPathConfig
import pl.exsio.querydsl.entityql.QPathFactory
import pl.exsio.querydsl.entityql.QStaticModel
import pl.exsio.querydsl.entityql.config.enums.by_name.UserTypeByName
import pl.exsio.querydsl.entityql.config.enums.by_ordinal.UserTypeByOrdinal
import pl.exsio.querydsl.entityql.jpa.entity.it.User
import pl.exsio.querydsl.entityql.path.QEnumPath
import pl.exsio.querydsl.entityql.path.QObjectPath

/**
 * This class was generated by EntityQL (https://github.com/eXsio/querydsl-entityql). It is not
 * recommended to make any changes to this class. Any manual changes will be lost upon the next
 * class generation.
 */
@CompileStatic
public final class QUser extends QStaticModel<User> {

  public static final QUser INSTANCE = new QUser();

  public final NumberPath<Long> id;

  public final StringPath name;

  public final QEnumPath<UserTypeByName> typeStr;

  public final QEnumPath<UserTypeByOrdinal> typeOrd;

  public final QObjectPath<Object> createdBy;

  public final QObjectPath<Date> createdAt;

  public final BooleanPath enabled;

  public final PrimaryKey<User> _primaryKey;

  public QUser() {
    this("USERS");
  }

  @SuppressWarnings(value = "unchecked")
  public QUser(String variable) {
    super(User.class, variable, "", "USERS");

    id:
    {
      QPathConfig config = new QPathConfig(Long.class, Long.class, "USER_ID", true, 1, -5);

      this.id = QPathFactory.<NumberPath<Long>>create(this, config);

      addMetadata(this.id, QColumnMetadataFactory.create(config));
    }

    name:
    {
      QPathConfig config = new QPathConfig(String.class, String.class, "NAME", true, 2, 12);

      this.name = QPathFactory.<StringPath>create(this, config);

      addMetadata(this.name, QColumnMetadataFactory.create(config));
    }

    typeStr:
    {
      QPathConfig config =
          new QPathConfig(UserTypeByName.class, Enum.class, "TYPE_STR", false, 4, 12);

      this.typeStr = QPathFactory.<QEnumPath<UserTypeByName>>create(this, config);

      addMetadata(this.typeStr, QColumnMetadataFactory.create(config));
    }

    typeOrd:
    {
      QPathConfig config =
          new QPathConfig(UserTypeByOrdinal.class, Enum.class, "TYPE_ORD", false, 5, 12);

      this.typeOrd = QPathFactory.<QEnumPath<UserTypeByOrdinal>>create(this, config);

      addMetadata(this.typeOrd, QColumnMetadataFactory.create(config));
    }

    createdBy:
    {
      QPathConfig config = new QPathConfig(Object.class, Object.class, "CREATED_BY", true, 6, 1111);

      this.createdBy = QPathFactory.<QObjectPath<Object>>create(this, config);

      addMetadata(this.createdBy, QColumnMetadataFactory.create(config));
    }

    createdAt:
    {
      QPathConfig config = new QPathConfig(Date.class, Object.class, "CREATED_AT", true, 7, 1111);

      this.createdAt = QPathFactory.<QObjectPath<Date>>create(this, config);

      addMetadata(this.createdAt, QColumnMetadataFactory.create(config));
    }

    enabled:
    {
      QPathConfig config = new QPathConfig(Boolean.class, Boolean.class, "ENABLED", true, 8, 1111);

      this.enabled = QPathFactory.<BooleanPath>create(this, config);

      addMetadata(this.enabled, QColumnMetadataFactory.create(config));
    }

    _primaryKey:
    {
      List<Path> paths = new ArrayList();

      paths.add(this.id);

      this._primaryKey = this.<User>createPrimaryKey(paths.<Path>toArray(new Path[0]));
    }
  }
}
