package typingsJapgolly.awsSdk.clientsAmplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBackendAuthMFAConfig extends StObject {
  
  /**
    * The MFA mode for the backend of your Amplify project.
    */
  var MFAMode: js.UndefOr[typingsJapgolly.awsSdk.clientsAmplifybackendMod.MFAMode] = js.undefined
  
  /**
    * The settings of your MFA configuration for the backend of your Amplify project.
    */
  var Settings: js.UndefOr[typingsJapgolly.awsSdk.clientsAmplifybackendMod.Settings] = js.undefined
}
object UpdateBackendAuthMFAConfig {
  
  inline def apply(): UpdateBackendAuthMFAConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateBackendAuthMFAConfig]
  }
  
  extension [Self <: UpdateBackendAuthMFAConfig](x: Self) {
    
    inline def setMFAMode(value: MFAMode): Self = StObject.set(x, "MFAMode", value.asInstanceOf[js.Any])
    
    inline def setMFAModeUndefined: Self = StObject.set(x, "MFAMode", js.undefined)
    
    inline def setSettings(value: Settings): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "Settings", js.undefined)
  }
}
