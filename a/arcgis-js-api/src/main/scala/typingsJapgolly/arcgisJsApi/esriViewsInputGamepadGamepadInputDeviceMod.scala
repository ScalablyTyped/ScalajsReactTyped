package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.GamepadInputDevice
import typingsJapgolly.arcgisJsApi.esri.GamepadInputDeviceConstructor
import typingsJapgolly.arcgisJsApi.esri.GamepadInputDeviceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViewsInputGamepadGamepadInputDeviceMod extends Shortcut {
  
  @JSImport("esri/views/input/gamepad/GamepadInputDevice", JSImport.Namespace)
  @js.native
  val ^ : js.Object & GamepadInputDeviceConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/input/gamepad/GamepadInputDevice", JSImport.Namespace)
  @js.native
  /**
    * Properties and configuration of a gamepad.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-input-gamepad-GamepadInputDevice.html)
    */
  open class Class ()
    extends StObject
       with GamepadInputDevice {
    def this(properties: GamepadInputDeviceProperties) = this()
  }
  
  type _To = js.Object & GamepadInputDeviceConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriViewsInputGamepadGamepadInputDeviceMod.foo` */
  override def _to: js.Object & GamepadInputDeviceConstructor = ^
}
