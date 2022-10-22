package typingsJapgolly.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicaGlobalSecondaryIndexDescription extends StObject {
  
  /**
    * The name of the global secondary index.
    */
  var IndexName: js.UndefOr[typingsJapgolly.awsSdk.clientsDynamodbMod.IndexName] = js.undefined
  
  /**
    * If not described, uses the source table GSI's read capacity settings.
    */
  var ProvisionedThroughputOverride: js.UndefOr[typingsJapgolly.awsSdk.clientsDynamodbMod.ProvisionedThroughputOverride] = js.undefined
}
object ReplicaGlobalSecondaryIndexDescription {
  
  inline def apply(): ReplicaGlobalSecondaryIndexDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicaGlobalSecondaryIndexDescription]
  }
  
  extension [Self <: ReplicaGlobalSecondaryIndexDescription](x: Self) {
    
    inline def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    inline def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
    
    inline def setProvisionedThroughputOverride(value: ProvisionedThroughputOverride): Self = StObject.set(x, "ProvisionedThroughputOverride", value.asInstanceOf[js.Any])
    
    inline def setProvisionedThroughputOverrideUndefined: Self = StObject.set(x, "ProvisionedThroughputOverride", js.undefined)
  }
}
