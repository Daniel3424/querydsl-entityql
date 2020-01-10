package pl.exsio.querydsl.entityql.config.entity.generated;

import com.querydsl.core.dml.StoreClause;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.StringPath;
import com.querydsl.sql.PrimaryKey;
import pl.exsio.querydsl.entityql.*;
import pl.exsio.querydsl.entityql.ex.InvalidArgumentException;
import pl.exsio.querydsl.entityql.path.QEnumPath;
import pl.exsio.querydsl.entityql.path.QObjectPath;

import java.util.ArrayList;
import java.util.List;

public final class QJUser extends QBase<pl.exsio.querydsl.entityql.config.entity.JUser> {

  public static final QJUser INSTANCE = new QJUser();

  public final NumberPath<java.lang.Long> id;

  public final StringPath name;

  public final QEnumPath<pl.exsio.querydsl.entityql.config.entity.JUser.Type> typeStr;

  public final NumberPath<java.lang.Long> typeOrd;

  public final NumberPath<java.lang.Long> typeDef;

  public final QObjectPath<java.lang.Object> createdBy;

  public final QObjectPath<java.util.Date> createdAt;

  public final PrimaryKey<pl.exsio.querydsl.entityql.config.entity.JUser> _primaryKey;

  public QJUser() {
    this("JUSERS");
  }

  @SuppressWarnings(value = "unchecked")
  public QJUser(String variable) {
    super(pl.exsio.querydsl.entityql.config.entity.JUser.class, variable, "", "JUSERS");

    id:
    {
      this.id =
          ((NumberPath<java.lang.Long>)
              QPathFactory.create(
                      this,
                      new QPathConfig(
                          java.lang.Long.class, java.lang.Long.class, "USER_ID", true, 1, -5))
                  .get());
      addMetadata(this.id, QColumnMetadataFactory.create("USER_ID", 1, -5, true));
    }

    name:
    {
      this.name =
          ((StringPath)
              QPathFactory.create(
                      this,
                      new QPathConfig(
                          java.lang.String.class, java.lang.String.class, "NAME", true, 2, 12))
                  .get());
      addMetadata(this.name, QColumnMetadataFactory.create("NAME", 2, 12, true));
    }

    typeStr:
    {
      this.typeStr =
          ((QEnumPath<pl.exsio.querydsl.entityql.config.entity.JUser.Type>)
              QPathFactory.create(
                      this,
                      new QPathConfig(
                          pl.exsio.querydsl.entityql.config.entity.JUser.Type.class,
                          java.lang.Enum.class,
                          "USER_TYPE",
                          false,
                          4,
                          12))
                  .get());
      addMetadata(this.typeStr, QColumnMetadataFactory.create("USER_TYPE", 4, 12, false));
    }

    typeOrd:
    {
      this.typeOrd =
          ((NumberPath<java.lang.Long>)
              QPathFactory.create(
                      this,
                      new QPathConfig(
                          pl.exsio.querydsl.entityql.config.entity.JUser.Type.class,
                          java.lang.Long.class,
                          "USER_TYPE_ORD",
                          false,
                          5,
                          -5))
                  .get());
      addMetadata(this.typeOrd, QColumnMetadataFactory.create("USER_TYPE_ORD", 5, -5, false));
    }

    typeDef:
    {
      this.typeDef =
          ((NumberPath<java.lang.Long>)
              QPathFactory.create(
                      this,
                      new QPathConfig(
                          pl.exsio.querydsl.entityql.config.entity.JUser.Type.class,
                          java.lang.Long.class,
                          "USER_TYPE_DEF",
                          false,
                          6,
                          -5))
                  .get());
      addMetadata(this.typeDef, QColumnMetadataFactory.create("USER_TYPE_DEF", 6, -5, false));
    }

    createdBy:
    {
      this.createdBy =
          ((QObjectPath<java.lang.Object>)
              QPathFactory.create(
                      this,
                      new QPathConfig(
                          java.lang.Object.class,
                          java.lang.Object.class,
                          "CREATED_BY",
                          true,
                          7,
                          1111))
                  .get());
      addMetadata(this.createdBy, QColumnMetadataFactory.create("CREATED_BY", 7, 1111, true));
    }

    createdAt:
    {
      this.createdAt =
          ((QObjectPath<java.util.Date>)
              QPathFactory.create(
                      this,
                      new QPathConfig(
                          java.util.Date.class,
                          java.lang.Object.class,
                          "CREATED_AT",
                          true,
                          8,
                          1111))
                  .get());
      addMetadata(this.createdAt, QColumnMetadataFactory.create("CREATED_AT", 8, 1111, true));
    }

    _primaryKey:
    {
      List<Path> paths = new ArrayList();

      paths.add(this.id);

      this._primaryKey = createPrimaryKey(paths.<Path>toArray(new Path[0]));
    }
  }

  @SuppressWarnings(value = "unchecked")
  public <C extends StoreClause<C>> StoreClause<C> set(StoreClause<C> clause, Object... params) {
    if (params.length % 2 != 0) {
      throw new InvalidArgumentException("Odd number of parameters");
    }
    for (int i = 0; i < params.length - 1; i += 2) {
      Object key = params[i];
      Object value = params[i + 1];
      if (!(key instanceof Path)) {
        throw new InvalidArgumentException("Param key has to be Path");
      }
      clause.set((Path<Object>) key, value);
    }
    return clause;
  }

  public Q<pl.exsio.querydsl.entityql.config.entity.JUser> dynamic() {
    return EntityQL.qEntity(pl.exsio.querydsl.entityql.config.entity.JUser.class);
  }

  public Q<pl.exsio.querydsl.entityql.config.entity.JUser> dynamic(String variable) {
    return EntityQL.qEntity(pl.exsio.querydsl.entityql.config.entity.JUser.class, variable);
  }
}