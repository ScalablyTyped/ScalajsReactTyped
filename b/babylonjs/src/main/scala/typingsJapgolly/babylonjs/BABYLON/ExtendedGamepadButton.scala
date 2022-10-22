package typingsJapgolly.babylonjs.BABYLON

import typingsJapgolly.std.GamepadButton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtendedGamepadButton
  extends StObject
     with GamepadButton
object ExtendedGamepadButton {
  
  inline def apply(pressed: Boolean, touched: Boolean, value: Double): ExtendedGamepadButton = {
    val __obj = js.Dynamic.literal(pressed = pressed.asInstanceOf[js.Any], touched = touched.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedGamepadButton]
  }
}
