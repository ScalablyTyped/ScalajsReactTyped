package typingsJapgolly.rcGesture

import typingsJapgolly.rcGesture.mod.Finger
import typingsJapgolly.rcGesture.mod.MultiFingerStatus
import typingsJapgolly.rcGesture.mod.SingeFingerMoveStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Angle extends StObject {
    
    var angle: Double
    
    var time: Any
    
    var velocity: Double
    
    var x: Double
    
    var y: Double
    
    var z: Double
  }
  object Angle {
    
    inline def apply(angle: Double, time: Any, velocity: Double, x: Double, y: Double, z: Double): Angle = {
      val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
      __obj.asInstanceOf[Angle]
    }
    
    extension [Self <: Angle](x: Self) {
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Any): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setVelocity(value: Double): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    }
  }
  
  trait AvailablePan extends StObject {
    
    var availablePan: js.UndefOr[Boolean] = js.undefined
    
    var direction: js.UndefOr[Double] = js.undefined
    
    var moveStatus: js.UndefOr[SingeFingerMoveStatus] = js.undefined
    
    var mutliFingerStatus: js.UndefOr[js.Array[MultiFingerStatus]] = js.undefined
    
    var pan: js.UndefOr[Boolean] = js.undefined
    
    var pinch: js.UndefOr[Boolean] = js.undefined
    
    var preTouches: js.Array[Finger]
    
    var press: js.UndefOr[Boolean] = js.undefined
    
    var rotate: js.UndefOr[Boolean] = js.undefined
    
    var rotation: js.UndefOr[Double] = js.undefined
    
    var scale: js.UndefOr[Double] = js.undefined
    
    var srcEvent: Any
    
    var startMutliFingerStatus: js.UndefOr[js.Array[MultiFingerStatus]] = js.undefined
    
    var startTime: Double
    
    var startTouches: js.Array[Finger]
    
    var swipe: js.UndefOr[Boolean] = js.undefined
    
    var time: Double
    
    var touches: js.Array[Finger]
  }
  object AvailablePan {
    
    inline def apply(
      preTouches: js.Array[Finger],
      srcEvent: Any,
      startTime: Double,
      startTouches: js.Array[Finger],
      time: Double,
      touches: js.Array[Finger]
    ): AvailablePan = {
      val __obj = js.Dynamic.literal(preTouches = preTouches.asInstanceOf[js.Any], srcEvent = srcEvent.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], startTouches = startTouches.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], touches = touches.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvailablePan]
    }
    
    extension [Self <: AvailablePan](x: Self) {
      
      inline def setAvailablePan(value: Boolean): Self = StObject.set(x, "availablePan", value.asInstanceOf[js.Any])
      
      inline def setAvailablePanUndefined: Self = StObject.set(x, "availablePan", js.undefined)
      
      inline def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setMoveStatus(value: SingeFingerMoveStatus): Self = StObject.set(x, "moveStatus", value.asInstanceOf[js.Any])
      
      inline def setMoveStatusUndefined: Self = StObject.set(x, "moveStatus", js.undefined)
      
      inline def setMutliFingerStatus(value: js.Array[MultiFingerStatus]): Self = StObject.set(x, "mutliFingerStatus", value.asInstanceOf[js.Any])
      
      inline def setMutliFingerStatusUndefined: Self = StObject.set(x, "mutliFingerStatus", js.undefined)
      
      inline def setMutliFingerStatusVarargs(value: MultiFingerStatus*): Self = StObject.set(x, "mutliFingerStatus", js.Array(value*))
      
      inline def setPan(value: Boolean): Self = StObject.set(x, "pan", value.asInstanceOf[js.Any])
      
      inline def setPanUndefined: Self = StObject.set(x, "pan", js.undefined)
      
      inline def setPinch(value: Boolean): Self = StObject.set(x, "pinch", value.asInstanceOf[js.Any])
      
      inline def setPinchUndefined: Self = StObject.set(x, "pinch", js.undefined)
      
      inline def setPreTouches(value: js.Array[Finger]): Self = StObject.set(x, "preTouches", value.asInstanceOf[js.Any])
      
      inline def setPreTouchesVarargs(value: Finger*): Self = StObject.set(x, "preTouches", js.Array(value*))
      
      inline def setPress(value: Boolean): Self = StObject.set(x, "press", value.asInstanceOf[js.Any])
      
      inline def setPressUndefined: Self = StObject.set(x, "press", js.undefined)
      
      inline def setRotate(value: Boolean): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setSrcEvent(value: Any): Self = StObject.set(x, "srcEvent", value.asInstanceOf[js.Any])
      
      inline def setStartMutliFingerStatus(value: js.Array[MultiFingerStatus]): Self = StObject.set(x, "startMutliFingerStatus", value.asInstanceOf[js.Any])
      
      inline def setStartMutliFingerStatusUndefined: Self = StObject.set(x, "startMutliFingerStatus", js.undefined)
      
      inline def setStartMutliFingerStatusVarargs(value: MultiFingerStatus*): Self = StObject.set(x, "startMutliFingerStatus", js.Array(value*))
      
      inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setStartTouches(value: js.Array[Finger]): Self = StObject.set(x, "startTouches", value.asInstanceOf[js.Any])
      
      inline def setStartTouchesVarargs(value: Finger*): Self = StObject.set(x, "startTouches", js.Array(value*))
      
      inline def setSwipe(value: Boolean): Self = StObject.set(x, "swipe", value.asInstanceOf[js.Any])
      
      inline def setSwipeUndefined: Self = StObject.set(x, "swipe", js.undefined)
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTouches(value: js.Array[Finger]): Self = StObject.set(x, "touches", value.asInstanceOf[js.Any])
      
      inline def setTouchesVarargs(value: Finger*): Self = StObject.set(x, "touches", js.Array(value*))
    }
  }
  
  trait Direction extends StObject {
    
    var direction: String
    
    var enablePinch: Boolean
    
    var enableRotate: Boolean
  }
  object Direction {
    
    inline def apply(direction: String, enablePinch: Boolean, enableRotate: Boolean): Direction = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], enablePinch = enablePinch.asInstanceOf[js.Any], enableRotate = enableRotate.asInstanceOf[js.Any])
      __obj.asInstanceOf[Direction]
    }
    
    extension [Self <: Direction](x: Self) {
      
      inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setEnablePinch(value: Boolean): Self = StObject.set(x, "enablePinch", value.asInstanceOf[js.Any])
      
      inline def setEnableRotate(value: Boolean): Self = StObject.set(x, "enableRotate", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var angle: Double
    
    var x: Double
    
    var y: Double
    
    var z: Double
  }
  object X {
    
    inline def apply(angle: Double, x: Double, y: Double, z: Double): X = {
      val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    extension [Self <: X](x: Self) {
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    }
  }
}
