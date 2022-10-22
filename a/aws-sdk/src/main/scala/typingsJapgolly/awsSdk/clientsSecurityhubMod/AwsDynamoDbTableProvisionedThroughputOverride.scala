package typingsJapgolly.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsDynamoDbTableProvisionedThroughputOverride extends StObject {
  
  /**
    * The read capacity units for the replica.
    */
  var ReadCapacityUnits: js.UndefOr[Integer] = js.undefined
}
object AwsDynamoDbTableProvisionedThroughputOverride {
  
  inline def apply(): AwsDynamoDbTableProvisionedThroughputOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsDynamoDbTableProvisionedThroughputOverride]
  }
  
  extension [Self <: AwsDynamoDbTableProvisionedThroughputOverride](x: Self) {
    
    inline def setReadCapacityUnits(value: Integer): Self = StObject.set(x, "ReadCapacityUnits", value.asInstanceOf[js.Any])
    
    inline def setReadCapacityUnitsUndefined: Self = StObject.set(x, "ReadCapacityUnits", js.undefined)
  }
}
