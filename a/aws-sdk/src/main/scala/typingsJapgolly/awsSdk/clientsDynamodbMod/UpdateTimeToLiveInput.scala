package typingsJapgolly.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTimeToLiveInput extends StObject {
  
  /**
    * The name of the table to be configured.
    */
  var TableName: typingsJapgolly.awsSdk.clientsDynamodbMod.TableName
  
  /**
    * Represents the settings used to enable or disable Time to Live for the specified table.
    */
  var TimeToLiveSpecification: typingsJapgolly.awsSdk.clientsDynamodbMod.TimeToLiveSpecification
}
object UpdateTimeToLiveInput {
  
  inline def apply(TableName: TableName, TimeToLiveSpecification: TimeToLiveSpecification): UpdateTimeToLiveInput = {
    val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any], TimeToLiveSpecification = TimeToLiveSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTimeToLiveInput]
  }
  
  extension [Self <: UpdateTimeToLiveInput](x: Self) {
    
    inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTimeToLiveSpecification(value: TimeToLiveSpecification): Self = StObject.set(x, "TimeToLiveSpecification", value.asInstanceOf[js.Any])
  }
}
