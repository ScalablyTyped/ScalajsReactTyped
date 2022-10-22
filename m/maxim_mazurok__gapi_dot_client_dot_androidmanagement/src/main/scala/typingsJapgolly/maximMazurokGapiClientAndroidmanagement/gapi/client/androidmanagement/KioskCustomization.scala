package typingsJapgolly.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KioskCustomization extends StObject {
  
  /** Specifies whether the Settings app is allowed in kiosk mode. */
  var deviceSettings: js.UndefOr[String] = js.undefined
  
  /** Sets the behavior of a device in kiosk mode when a user presses and holds (long-presses) the Power button. */
  var powerButtonActions: js.UndefOr[String] = js.undefined
  
  /** Specifies whether system info and notifications are disabled in kiosk mode. */
  var statusBar: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether system error dialogs for crashed or unresponsive apps are blocked in kiosk mode. When blocked, the system will force-stop the app as if the user chooses the "close
    * app" option on the UI.
    */
  var systemErrorWarnings: js.UndefOr[String] = js.undefined
  
  /** Specifies which navigation features are enabled (e.g. Home, Overview buttons) in kiosk mode. */
  var systemNavigation: js.UndefOr[String] = js.undefined
}
object KioskCustomization {
  
  inline def apply(): KioskCustomization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KioskCustomization]
  }
  
  extension [Self <: KioskCustomization](x: Self) {
    
    inline def setDeviceSettings(value: String): Self = StObject.set(x, "deviceSettings", value.asInstanceOf[js.Any])
    
    inline def setDeviceSettingsUndefined: Self = StObject.set(x, "deviceSettings", js.undefined)
    
    inline def setPowerButtonActions(value: String): Self = StObject.set(x, "powerButtonActions", value.asInstanceOf[js.Any])
    
    inline def setPowerButtonActionsUndefined: Self = StObject.set(x, "powerButtonActions", js.undefined)
    
    inline def setStatusBar(value: String): Self = StObject.set(x, "statusBar", value.asInstanceOf[js.Any])
    
    inline def setStatusBarUndefined: Self = StObject.set(x, "statusBar", js.undefined)
    
    inline def setSystemErrorWarnings(value: String): Self = StObject.set(x, "systemErrorWarnings", value.asInstanceOf[js.Any])
    
    inline def setSystemErrorWarningsUndefined: Self = StObject.set(x, "systemErrorWarnings", js.undefined)
    
    inline def setSystemNavigation(value: String): Self = StObject.set(x, "systemNavigation", value.asInstanceOf[js.Any])
    
    inline def setSystemNavigationUndefined: Self = StObject.set(x, "systemNavigation", js.undefined)
  }
}
