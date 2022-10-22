package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.document
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.none_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.view
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GamepadSettingsProperties extends StObject {
  
  /**
    * Determines what focus is required for gamepad events to be dispatched.
    *
    * @default document
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-input-gamepad-GamepadSettings.html#enabledFocusMode)
    */
  var enabledFocusMode: js.UndefOr[document | view | none_] = js.undefined
}
object GamepadSettingsProperties {
  
  inline def apply(): GamepadSettingsProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GamepadSettingsProperties]
  }
  
  extension [Self <: GamepadSettingsProperties](x: Self) {
    
    inline def setEnabledFocusMode(value: document | view | none_): Self = StObject.set(x, "enabledFocusMode", value.asInstanceOf[js.Any])
    
    inline def setEnabledFocusModeUndefined: Self = StObject.set(x, "enabledFocusMode", js.undefined)
  }
}
