 package pl.exsio.querydsl.entityql.kotlin.jpa.entity.generated

 import com.querydsl.sql.PrimaryKey
 import pl.exsio.querydsl.entityql.QColumnMetadataFactory
 import pl.exsio.querydsl.entityql.QPathConfig
 import pl.exsio.querydsl.entityql.QPathFactory
 import pl.exsio.querydsl.entityql.QStaticModel
 import com.querydsl.sql.ForeignKey
 import pl.exsio.querydsl.entityql.kotlin.jpa.entity.KOrder
 import com.querydsl.core.types.dsl.NumberPath
 import pl.exsio.querydsl.entityql.kotlin.jpa.entity.KUser
 import pl.exsio.querydsl.entityql.kotlin.jpa.entity.KOrderItem
 import javax.annotation.Generated
 import com.querydsl.core.types.Path
 

 /**
 *
 * This class was generated by EntityQL (https://github.com/eXsio/querydsl-entityql).
 * It is not recommended to make any changes to this class.
 * Any manual changes will be lost upon the next class generation.
 *
 */
 @Generated("pl.exsio.querydsl.entityql.QExporter")
 class QKOrder : QStaticModel<KOrder> {

     companion object {
         val instance: QKOrder = QKOrder()
         val qKOrder: QKOrder = QKOrder.instance
     }

     val id: NumberPath <Long> = run {
         val config = QPathConfig(Long::class.java, Long::class.java, "ORDER_ID", true, 1, -5)
         val id = QPathFactory.create<NumberPath <Long>>(this, config)
         addMetadata(id, QColumnMetadataFactory.create(config))
         this.columnsMap.put("id", id)
         id
     }

     val userId: NumberPath <Long> = run {
         val config = QPathConfig(Long::class.java, Long::class.java, "USER_ID", false, 2, -5)
         val userId = QPathFactory.create<NumberPath <Long>>(this, config)
         addMetadata(userId, QColumnMetadataFactory.create(config))
         this.columnsMap.put("userId", userId)
         userId
     }

     val user: ForeignKey<KUser<*>> = run {
         val user = this.createForeignKey<KUser<*>>(this.userId, "USER_ID")
         this.joinColumnsMap.put("user", user)
         user
     }

     val items: ForeignKey<KOrderItem> = run {
         val config0 = QPathConfig(Long::class.java, Long::class.java, "ORDER_ID", false, 3, -5)
         val items0 = QPathFactory.create<Path<*>>(this, config0)
         addMetadata(items0, QColumnMetadataFactory.create(config0))
         val items = this.createInvForeignKey<KOrderItem>(listOf(items0), listOf("ITEM_ORDER_ID"))
         this.inverseJoinColumnsMap.put("items", items)
         items
      }

     val itemsReferenced: ForeignKey<KOrderItem> = run {
         val config0 = QPathConfig(Long::class.java, Long::class.java, "ORDER_ID", false, 4, -5)
         val itemsReferenced0 = QPathFactory.create<Path<*>>(this, config0)
         addMetadata(itemsReferenced0, QColumnMetadataFactory.create(config0))
         val itemsReferenced = this.createInvForeignKey<KOrderItem>(listOf(itemsReferenced0), listOf("ITEM_ORDER_ID"))
         this.inverseJoinColumnsMap.put("itemsReferenced", itemsReferenced)
         itemsReferenced
      }

     val _primaryKey: PrimaryKey<KOrder> = run {
         val list = mutableListOf<Path<*>>(this.id)
         this.primaryKeyColumns = list
         this.createPrimaryKey(*list.toTypedArray())
     }

     constructor(): this("ORDERS")

     constructor(variable: String): super(KOrder::class.java, variable, "", "ORDERS")
 } 