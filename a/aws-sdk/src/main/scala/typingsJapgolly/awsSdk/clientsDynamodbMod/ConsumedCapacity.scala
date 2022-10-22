package typingsJapgolly.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsumedCapacity extends StObject {
  
  /**
    * The total number of capacity units consumed by the operation.
    */
  var CapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.undefined
  
  /**
    * The amount of throughput consumed on each global index affected by the operation.
    */
  var GlobalSecondaryIndexes: js.UndefOr[SecondaryIndexesCapacityMap] = js.undefined
  
  /**
    * The amount of throughput consumed on each local index affected by the operation.
    */
  var LocalSecondaryIndexes: js.UndefOr[SecondaryIndexesCapacityMap] = js.undefined
  
  /**
    * The total number of read capacity units consumed by the operation.
    */
  var ReadCapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.undefined
  
  /**
    * The amount of throughput consumed on the table affected by the operation.
    */
  var Table: js.UndefOr[Capacity] = js.undefined
  
  /**
    * The name of the table that was affected by the operation.
    */
  var TableName: js.UndefOr[typingsJapgolly.awsSdk.clientsDynamodbMod.TableName] = js.undefined
  
  /**
    * The total number of write capacity units consumed by the operation.
    */
  var WriteCapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.undefined
}
object ConsumedCapacity {
  
  inline def apply(): ConsumedCapacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsumedCapacity]
  }
  
  extension [Self <: ConsumedCapacity](x: Self) {
    
    inline def setCapacityUnits(value: ConsumedCapacityUnits): Self = StObject.set(x, "CapacityUnits", value.asInstanceOf[js.Any])
    
    inline def setCapacityUnitsUndefined: Self = StObject.set(x, "CapacityUnits", js.undefined)
    
    inline def setGlobalSecondaryIndexes(value: SecondaryIndexesCapacityMap): Self = StObject.set(x, "GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
    
    inline def setGlobalSecondaryIndexesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexes", js.undefined)
    
    inline def setLocalSecondaryIndexes(value: SecondaryIndexesCapacityMap): Self = StObject.set(x, "LocalSecondaryIndexes", value.asInstanceOf[js.Any])
    
    inline def setLocalSecondaryIndexesUndefined: Self = StObject.set(x, "LocalSecondaryIndexes", js.undefined)
    
    inline def setReadCapacityUnits(value: ConsumedCapacityUnits): Self = StObject.set(x, "ReadCapacityUnits", value.asInstanceOf[js.Any])
    
    inline def setReadCapacityUnitsUndefined: Self = StObject.set(x, "ReadCapacityUnits", js.undefined)
    
    inline def setTable(value: Capacity): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
    
    inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
    
    inline def setTableUndefined: Self = StObject.set(x, "Table", js.undefined)
    
    inline def setWriteCapacityUnits(value: ConsumedCapacityUnits): Self = StObject.set(x, "WriteCapacityUnits", value.asInstanceOf[js.Any])
    
    inline def setWriteCapacityUnitsUndefined: Self = StObject.set(x, "WriteCapacityUnits", js.undefined)
  }
}
