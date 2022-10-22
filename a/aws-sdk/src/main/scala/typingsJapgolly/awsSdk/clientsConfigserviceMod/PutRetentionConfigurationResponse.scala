package typingsJapgolly.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutRetentionConfigurationResponse extends StObject {
  
  /**
    * Returns a retention configuration object.
    */
  var RetentionConfiguration: js.UndefOr[typingsJapgolly.awsSdk.clientsConfigserviceMod.RetentionConfiguration] = js.undefined
}
object PutRetentionConfigurationResponse {
  
  inline def apply(): PutRetentionConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutRetentionConfigurationResponse]
  }
  
  extension [Self <: PutRetentionConfigurationResponse](x: Self) {
    
    inline def setRetentionConfiguration(value: RetentionConfiguration): Self = StObject.set(x, "RetentionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setRetentionConfigurationUndefined: Self = StObject.set(x, "RetentionConfiguration", js.undefined)
  }
}
