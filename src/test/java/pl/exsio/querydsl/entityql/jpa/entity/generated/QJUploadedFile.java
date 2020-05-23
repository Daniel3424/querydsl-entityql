package pl.exsio.querydsl.entityql.jpa.entity.generated;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.ArrayPath;
import com.querydsl.sql.PrimaryKey;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Generated;
import pl.exsio.querydsl.entityql.QColumnMetadataFactory;
import pl.exsio.querydsl.entityql.QPathConfig;
import pl.exsio.querydsl.entityql.QPathFactory;
import pl.exsio.querydsl.entityql.QStaticModel;
import pl.exsio.querydsl.entityql.jpa.entity.JUploadedFile;
import pl.exsio.querydsl.entityql.path.QUuidPath;

/**
 * This class was generated by EntityQL (https://github.com/eXsio/querydsl-entityql). It is not
 * recommended to make any changes to this class. Any manual changes will be lost upon the next
 * class generation.
 */
@Generated("pl.exsio.querydsl.entityql.QExporter")
public final class QJUploadedFile extends QStaticModel<JUploadedFile> {

  private static final long serialVersionUID = -1335667740;

  public static final QJUploadedFile INSTANCE = new QJUploadedFile();

  public static final QJUploadedFile qJUploadedFile = INSTANCE;

  public final QUuidPath id;
  public final ArrayPath<byte[], Byte> data;

  public final PrimaryKey<JUploadedFile> _primaryKey;

  public QJUploadedFile() {
    this("JUPLOADED_FILES");
  }

  @SuppressWarnings(value = "unchecked")
  public QJUploadedFile(String variable) {
    super(JUploadedFile.class, variable, "", "JUPLOADED_FILES");

    id:
    {
      QPathConfig config = new QPathConfig(UUID.class, UUID.class, "FILE_ID", false, 1, 12);
      this.id = QPathFactory.<QUuidPath>create(this, config);
      addMetadata(this.id, QColumnMetadataFactory.create(config));
      this.columnsMap.put("id", this.id);
    }
    data:
    {
      QPathConfig config = new QPathConfig(byte[].class, Array.class, "DATA", false, 2, 2003);
      this.data = QPathFactory.<ArrayPath<byte[], Byte>>create(this, config);

      addMetadata(this.data, QColumnMetadataFactory.create(config));
      this.columnsMap.put("data", this.data);
    }

    _primaryKey:
    {
      this.primaryKeyColumns = Arrays.<Path<?>>asList(this.id);
      Path[] pkArray = (Path[]) primaryKeyColumns.<Path>toArray(new Path[0]);
      this._primaryKey = this.<JUploadedFile>createPrimaryKey(pkArray);
    }
  }
}
