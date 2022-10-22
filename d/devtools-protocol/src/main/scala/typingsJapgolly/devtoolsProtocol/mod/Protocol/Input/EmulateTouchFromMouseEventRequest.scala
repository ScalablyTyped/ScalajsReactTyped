package typingsJapgolly.devtoolsProtocol.mod.Protocol.Input

import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.mouseMoved
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.mousePressed
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.mouseReleased
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.mouseWheel
import typingsJapgolly.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmulateTouchFromMouseEventRequest extends StObject {
  
  /**
    * Mouse button. Only "none", "left", "right" are supported.
    */
  var button: MouseButton
  
  /**
    * Number of times the mouse button was clicked (default: 0).
    */
  var clickCount: js.UndefOr[integer] = js.undefined
  
  /**
    * X delta in DIP for mouse wheel event (default: 0).
    */
  var deltaX: js.UndefOr[Double] = js.undefined
  
  /**
    * Y delta in DIP for mouse wheel event (default: 0).
    */
  var deltaY: js.UndefOr[Double] = js.undefined
  
  /**
    * Bit field representing pressed modifier keys. Alt=1, Ctrl=2, Meta/Command=4, Shift=8
    * (default: 0).
    */
  var modifiers: js.UndefOr[integer] = js.undefined
  
  /**
    * Time at which the event occurred (default: current time).
    */
  var timestamp: js.UndefOr[TimeSinceEpoch] = js.undefined
  
  /**
    * Type of the mouse event. (EmulateTouchFromMouseEventRequestType enum)
    */
  var `type`: mousePressed | mouseReleased | mouseMoved | mouseWheel
  
  /**
    * X coordinate of the mouse pointer in DIP.
    */
  var x: integer
  
  /**
    * Y coordinate of the mouse pointer in DIP.
    */
  var y: integer
}
object EmulateTouchFromMouseEventRequest {
  
  inline def apply(
    button: MouseButton,
    `type`: mousePressed | mouseReleased | mouseMoved | mouseWheel,
    x: integer,
    y: integer
  ): EmulateTouchFromMouseEventRequest = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmulateTouchFromMouseEventRequest]
  }
  
  extension [Self <: EmulateTouchFromMouseEventRequest](x: Self) {
    
    inline def setButton(value: MouseButton): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setClickCount(value: integer): Self = StObject.set(x, "clickCount", value.asInstanceOf[js.Any])
    
    inline def setClickCountUndefined: Self = StObject.set(x, "clickCount", js.undefined)
    
    inline def setDeltaX(value: Double): Self = StObject.set(x, "deltaX", value.asInstanceOf[js.Any])
    
    inline def setDeltaXUndefined: Self = StObject.set(x, "deltaX", js.undefined)
    
    inline def setDeltaY(value: Double): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
    
    inline def setDeltaYUndefined: Self = StObject.set(x, "deltaY", js.undefined)
    
    inline def setModifiers(value: integer): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
    
    inline def setTimestamp(value: TimeSinceEpoch): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setType(value: mousePressed | mouseReleased | mouseMoved | mouseWheel): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setX(value: integer): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: integer): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
