package typingsJapgolly.hammerjs

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.PointerEvent
import org.scalajs.dom.TouchEvent
import typingsJapgolly.hammerjs.hammerjsInts.`1`
import typingsJapgolly.hammerjs.hammerjsInts.`2`
import typingsJapgolly.hammerjs.hammerjsInts.`4`
import typingsJapgolly.hammerjs.hammerjsInts.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HammerInput extends StObject {
  
  /** Angle moved. */
  var angle: Double
  
  /** Center position for multi-touch, or just the single pointer. */
  var center: HammerPoint
  
  /** Array with all new/moved/lost pointers. */
  var changedPointers: js.Array[Any]
  
  /** Total time in ms since the first input. */
  var deltaTime: Double
  
  /** Movement of the X axis. */
  var deltaX: Double
  
  /** Movement of the Y axis. */
  var deltaY: Double
  
  def destroy(): Unit
  
  /** Direction moved. Matches the DIRECTION constants. */
  var direction: Double
  
  /** Distance moved. */
  var distance: Double
  
  /** Event type, matches the INPUT constants. */
  var eventType: `1` | `2` | `4` | `8`
  
  def handler(): Unit
  
  def init(): Unit
  
  /** true when the final (last) input. */
  var isFinal: Boolean
  
  /** true when the first input. */
  var isFirst: Boolean
  
  /** Maximum number of pointers detected in the gesture */
  var maxPointers: Double
  
  /** Direction moved from it's starting point. Matches the DIRECTION constants. */
  var offsetDirection: Double
  
  var overallVelocity: Double
  
  var overallVelocityX: Double
  
  var overallVelocityY: Double
  
  /** Primary pointer type, could be touch, mouse, pen or kinect. */
  var pointerType: String
  
  /** Array with all pointers, including the ended pointers (touchend, mouseup). */
  var pointers: js.Array[Any]
  
  /** Reference to the srcEvent.preventDefault() method. Only for experts! */
  var preventDefault: js.Function
  
  /** Rotation that has been done when multi-touch. 0 on a single touch. */
  var rotation: Double
  
  /** Scaling that has been done when multi-touch. 1 on a single touch. */
  var scale: Double
  
  /** Source event object, type TouchEvent, MouseEvent or PointerEvent. */
  var srcEvent: TouchEvent | MouseEvent | PointerEvent
  
  /** Target that received the event. */
  var target: HTMLElement
  
  /** Timestamp of a gesture */
  var timeStamp: Double
  
  /** Name of the event. Like panstart. */
  var `type`: String
  
  /** Highest velocityX/Y value. */
  var velocity: Double
  
  /** Velocity on the X axis, in px/ms. */
  var velocityX: Double
  
  /** Velocity on the Y axis, in px/ms */
  var velocityY: Double
}
object HammerInput {
  
  inline def apply(
    angle: Double,
    center: HammerPoint,
    changedPointers: js.Array[Any],
    deltaTime: Double,
    deltaX: Double,
    deltaY: Double,
    destroy: Callback,
    direction: Double,
    distance: Double,
    eventType: `1` | `2` | `4` | `8`,
    handler: Callback,
    init: Callback,
    isFinal: Boolean,
    isFirst: Boolean,
    maxPointers: Double,
    offsetDirection: Double,
    overallVelocity: Double,
    overallVelocityX: Double,
    overallVelocityY: Double,
    pointerType: String,
    pointers: js.Array[Any],
    preventDefault: js.Function,
    rotation: Double,
    scale: Double,
    srcEvent: TouchEvent | MouseEvent | PointerEvent,
    target: HTMLElement,
    timeStamp: Double,
    `type`: String,
    velocity: Double,
    velocityX: Double,
    velocityY: Double
  ): HammerInput = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], changedPointers = changedPointers.asInstanceOf[js.Any], deltaTime = deltaTime.asInstanceOf[js.Any], deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], destroy = destroy.toJsFn, direction = direction.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], handler = handler.toJsFn, init = init.toJsFn, isFinal = isFinal.asInstanceOf[js.Any], isFirst = isFirst.asInstanceOf[js.Any], maxPointers = maxPointers.asInstanceOf[js.Any], offsetDirection = offsetDirection.asInstanceOf[js.Any], overallVelocity = overallVelocity.asInstanceOf[js.Any], overallVelocityX = overallVelocityX.asInstanceOf[js.Any], overallVelocityY = overallVelocityY.asInstanceOf[js.Any], pointerType = pointerType.asInstanceOf[js.Any], pointers = pointers.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], srcEvent = srcEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any], velocityX = velocityX.asInstanceOf[js.Any], velocityY = velocityY.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HammerInput]
  }
  
  extension [Self <: HammerInput](x: Self) {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setCenter(value: HammerPoint): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setChangedPointers(value: js.Array[Any]): Self = StObject.set(x, "changedPointers", value.asInstanceOf[js.Any])
    
    inline def setChangedPointersVarargs(value: Any*): Self = StObject.set(x, "changedPointers", js.Array(value*))
    
    inline def setDeltaTime(value: Double): Self = StObject.set(x, "deltaTime", value.asInstanceOf[js.Any])
    
    inline def setDeltaX(value: Double): Self = StObject.set(x, "deltaX", value.asInstanceOf[js.Any])
    
    inline def setDeltaY(value: Double): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setEventType(value: `1` | `2` | `4` | `8`): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setHandler(value: Callback): Self = StObject.set(x, "handler", value.toJsFn)
    
    inline def setInit(value: Callback): Self = StObject.set(x, "init", value.toJsFn)
    
    inline def setIsFinal(value: Boolean): Self = StObject.set(x, "isFinal", value.asInstanceOf[js.Any])
    
    inline def setIsFirst(value: Boolean): Self = StObject.set(x, "isFirst", value.asInstanceOf[js.Any])
    
    inline def setMaxPointers(value: Double): Self = StObject.set(x, "maxPointers", value.asInstanceOf[js.Any])
    
    inline def setOffsetDirection(value: Double): Self = StObject.set(x, "offsetDirection", value.asInstanceOf[js.Any])
    
    inline def setOverallVelocity(value: Double): Self = StObject.set(x, "overallVelocity", value.asInstanceOf[js.Any])
    
    inline def setOverallVelocityX(value: Double): Self = StObject.set(x, "overallVelocityX", value.asInstanceOf[js.Any])
    
    inline def setOverallVelocityY(value: Double): Self = StObject.set(x, "overallVelocityY", value.asInstanceOf[js.Any])
    
    inline def setPointerType(value: String): Self = StObject.set(x, "pointerType", value.asInstanceOf[js.Any])
    
    inline def setPointers(value: js.Array[Any]): Self = StObject.set(x, "pointers", value.asInstanceOf[js.Any])
    
    inline def setPointersVarargs(value: Any*): Self = StObject.set(x, "pointers", js.Array(value*))
    
    inline def setPreventDefault(value: js.Function): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setSrcEvent(value: TouchEvent | MouseEvent | PointerEvent): Self = StObject.set(x, "srcEvent", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVelocity(value: Double): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
    
    inline def setVelocityX(value: Double): Self = StObject.set(x, "velocityX", value.asInstanceOf[js.Any])
    
    inline def setVelocityY(value: Double): Self = StObject.set(x, "velocityY", value.asInstanceOf[js.Any])
  }
}
