package typingsJapgolly.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketInventoryConfigurationOutput extends StObject {
  
  /**
    * Specifies the inventory configuration.
    */
  var InventoryConfiguration: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.InventoryConfiguration] = js.undefined
}
object GetBucketInventoryConfigurationOutput {
  
  inline def apply(): GetBucketInventoryConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketInventoryConfigurationOutput]
  }
  
  extension [Self <: GetBucketInventoryConfigurationOutput](x: Self) {
    
    inline def setInventoryConfiguration(value: InventoryConfiguration): Self = StObject.set(x, "InventoryConfiguration", value.asInstanceOf[js.Any])
    
    inline def setInventoryConfigurationUndefined: Self = StObject.set(x, "InventoryConfiguration", js.undefined)
  }
}
