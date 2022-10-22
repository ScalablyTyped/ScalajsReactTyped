package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GamepadEventInit
  extends StObject
     with EventInit {
  
  /* standard dom */
  var gamepad: org.scalajs.dom.Gamepad
}
object GamepadEventInit {
  
  inline def apply(gamepad: org.scalajs.dom.Gamepad): GamepadEventInit = {
    val __obj = js.Dynamic.literal(gamepad = gamepad.asInstanceOf[js.Any])
    __obj.asInstanceOf[GamepadEventInit]
  }
  
  extension [Self <: GamepadEventInit](x: Self) {
    
    inline def setGamepad(value: org.scalajs.dom.Gamepad): Self = StObject.set(x, "gamepad", value.asInstanceOf[js.Any])
  }
}
