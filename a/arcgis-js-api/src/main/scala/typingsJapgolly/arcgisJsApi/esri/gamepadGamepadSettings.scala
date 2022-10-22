package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`forward-down`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`forward-up`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.pan
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.zoom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait gamepadGamepadSettings
  extends StObject
     with Accessor {
  
  /**
    * Use this property to explicitly select the gamepad device for map and scene navigation.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-navigation-gamepad-GamepadSettings.html#device)
    */
  var device: GamepadInputDevice = js.native
  
  /**
    * Whether gamepad navigation is enabled on the View.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-navigation-gamepad-GamepadSettings.html#enabled)
    */
  var enabled: Boolean = js.native
  
  /**
    * This setting controls the behavior of forward and back movement of the left stick.
    *
    * @default pan
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-navigation-gamepad-GamepadSettings.html#mode)
    */
  var mode: pan | zoom = js.native
  
  /**
    * Determines whether pressing the tilt axis forwards make the view tilt down (towards the nadir), or up (towards the zenith).
    *
    * @default forward-down
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-navigation-gamepad-GamepadSettings.html#tiltDirection)
    */
  var tiltDirection: `forward-down` | `forward-up` = js.native
}
