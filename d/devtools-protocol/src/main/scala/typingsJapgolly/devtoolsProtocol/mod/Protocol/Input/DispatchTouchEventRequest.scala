package typingsJapgolly.devtoolsProtocol.mod.Protocol.Input

import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.touchCancel
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.touchEnd
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.touchMove
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.touchStart
import typingsJapgolly.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DispatchTouchEventRequest extends StObject {
  
  /**
    * Bit field representing pressed modifier keys. Alt=1, Ctrl=2, Meta/Command=4, Shift=8
    * (default: 0).
    */
  var modifiers: js.UndefOr[integer] = js.undefined
  
  /**
    * Time at which the event occurred.
    */
  var timestamp: js.UndefOr[TimeSinceEpoch] = js.undefined
  
  /**
    * Active touch points on the touch device. One event per any changed point (compared to
    * previous touch event in a sequence) is generated, emulating pressing/moving/releasing points
    * one by one.
    */
  var touchPoints: js.Array[TouchPoint]
  
  /**
    * Type of the touch event. TouchEnd and TouchCancel must not contain any touch points, while
    * TouchStart and TouchMove must contains at least one. (DispatchTouchEventRequestType enum)
    */
  var `type`: touchStart | touchEnd | touchMove | touchCancel
}
object DispatchTouchEventRequest {
  
  inline def apply(touchPoints: js.Array[TouchPoint], `type`: touchStart | touchEnd | touchMove | touchCancel): DispatchTouchEventRequest = {
    val __obj = js.Dynamic.literal(touchPoints = touchPoints.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DispatchTouchEventRequest]
  }
  
  extension [Self <: DispatchTouchEventRequest](x: Self) {
    
    inline def setModifiers(value: integer): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
    
    inline def setTimestamp(value: TimeSinceEpoch): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setTouchPoints(value: js.Array[TouchPoint]): Self = StObject.set(x, "touchPoints", value.asInstanceOf[js.Any])
    
    inline def setTouchPointsVarargs(value: TouchPoint*): Self = StObject.set(x, "touchPoints", js.Array(value*))
    
    inline def setType(value: touchStart | touchEnd | touchMove | touchCancel): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
