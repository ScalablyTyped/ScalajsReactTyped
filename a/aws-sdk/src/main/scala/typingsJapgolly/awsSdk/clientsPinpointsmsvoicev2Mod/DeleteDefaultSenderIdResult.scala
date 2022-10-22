package typingsJapgolly.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDefaultSenderIdResult extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the configuration set.
    */
  var ConfigurationSetArn: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the configuration set.
    */
  var ConfigurationSetName: js.UndefOr[typingsJapgolly.awsSdk.clientsPinpointsmsvoicev2Mod.ConfigurationSetName] = js.undefined
  
  /**
    * The current sender ID for the configuration set.
    */
  var SenderId: js.UndefOr[typingsJapgolly.awsSdk.clientsPinpointsmsvoicev2Mod.SenderId] = js.undefined
}
object DeleteDefaultSenderIdResult {
  
  inline def apply(): DeleteDefaultSenderIdResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDefaultSenderIdResult]
  }
  
  extension [Self <: DeleteDefaultSenderIdResult](x: Self) {
    
    inline def setConfigurationSetArn(value: String): Self = StObject.set(x, "ConfigurationSetArn", value.asInstanceOf[js.Any])
    
    inline def setConfigurationSetArnUndefined: Self = StObject.set(x, "ConfigurationSetArn", js.undefined)
    
    inline def setConfigurationSetName(value: ConfigurationSetName): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    inline def setConfigurationSetNameUndefined: Self = StObject.set(x, "ConfigurationSetName", js.undefined)
    
    inline def setSenderId(value: SenderId): Self = StObject.set(x, "SenderId", value.asInstanceOf[js.Any])
    
    inline def setSenderIdUndefined: Self = StObject.set(x, "SenderId", js.undefined)
  }
}
