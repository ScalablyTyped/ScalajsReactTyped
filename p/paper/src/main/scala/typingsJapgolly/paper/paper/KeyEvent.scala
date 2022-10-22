package typingsJapgolly.paper.paper

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
  * The KeyEvent object is received by the {@link Tool}'s keyboard
  * handlers {@link Tool#onKeyDown}, {@link Tool#onKeyUp}. The KeyEvent object is
  * the only parameter passed to these functions and contains information about
  * the keyboard event.
  */
trait KeyEvent
  extends StObject
     with Event {
  
  /** 
    * The character representation of the key that caused this key event,
    * taking into account the current key-modifiers (e.g. shift, control,
    * caps-lock, etc.)
    */
  var character: String
  
  /** 
    * The key that caused this key event, either as a lower-case character or
    * special key descriptor.
    */
  var key: String
  
  /** 
    * The type of mouse event.
    */
  var `type`: String
}
object KeyEvent {
  
  inline def apply(
    character: String,
    key: String,
    modifiers: Any,
    preventDefault: Callback,
    stop: Callback,
    stopPropagation: Callback,
    timeStamp: Double,
    `type`: String
  ): KeyEvent = {
    val __obj = js.Dynamic.literal(character = character.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], modifiers = modifiers.asInstanceOf[js.Any], preventDefault = preventDefault.toJsFn, stop = stop.toJsFn, stopPropagation = stopPropagation.toJsFn, timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyEvent]
  }
  
  extension [Self <: KeyEvent](x: Self) {
    
    inline def setCharacter(value: String): Self = StObject.set(x, "character", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
