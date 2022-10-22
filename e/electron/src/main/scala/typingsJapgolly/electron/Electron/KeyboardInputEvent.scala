package typingsJapgolly.electron.Electron

import typingsJapgolly.electron.electronStrings.char
import typingsJapgolly.electron.electronStrings.keyDown
import typingsJapgolly.electron.electronStrings.keyUp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyboardInputEvent
  extends StObject
     with InputEvent {
  
  // Docs: https://electronjs.org/docs/api/structures/keyboard-input-event
  /**
    * The character that will be sent as the keyboard event. Should only use the valid
    * key codes in Accelerator.
    */
  var keyCode: String
  
  /**
    * The type of the event, can be `keyDown`, `keyUp` or `char`.
    */
  var `type`: keyDown | keyUp | char
}
object KeyboardInputEvent {
  
  inline def apply(keyCode: String, `type`: keyDown | keyUp | char): KeyboardInputEvent = {
    val __obj = js.Dynamic.literal(keyCode = keyCode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardInputEvent]
  }
  
  extension [Self <: KeyboardInputEvent](x: Self) {
    
    inline def setKeyCode(value: String): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
    
    inline def setType(value: keyDown | keyUp | char): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
