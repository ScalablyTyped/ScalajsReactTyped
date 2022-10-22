package typingsJapgolly.awsSdk.clientsPinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutConfigurationSetReputationOptionsRequest extends StObject {
  
  /**
    * The name of the configuration set that you want to enable or disable reputation metric tracking for.
    */
  var ConfigurationSetName: typingsJapgolly.awsSdk.clientsPinpointemailMod.ConfigurationSetName
  
  /**
    * If true, tracking of reputation metrics is enabled for the configuration set. If false, tracking of reputation metrics is disabled for the configuration set.
    */
  var ReputationMetricsEnabled: js.UndefOr[Enabled] = js.undefined
}
object PutConfigurationSetReputationOptionsRequest {
  
  inline def apply(ConfigurationSetName: ConfigurationSetName): PutConfigurationSetReputationOptionsRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutConfigurationSetReputationOptionsRequest]
  }
  
  extension [Self <: PutConfigurationSetReputationOptionsRequest](x: Self) {
    
    inline def setConfigurationSetName(value: ConfigurationSetName): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    inline def setReputationMetricsEnabled(value: Enabled): Self = StObject.set(x, "ReputationMetricsEnabled", value.asInstanceOf[js.Any])
    
    inline def setReputationMetricsEnabledUndefined: Self = StObject.set(x, "ReputationMetricsEnabled", js.undefined)
  }
}
