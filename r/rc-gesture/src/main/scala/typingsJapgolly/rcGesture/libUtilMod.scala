package typingsJapgolly.rcGesture

import typingsJapgolly.rcGesture.anon.Angle
import typingsJapgolly.rcGesture.anon.X
import typingsJapgolly.rcGesture.rcGestureInts.`16`
import typingsJapgolly.rcGesture.rcGestureInts.`1`
import typingsJapgolly.rcGesture.rcGestureInts.`2`
import typingsJapgolly.rcGesture.rcGestureInts.`4`
import typingsJapgolly.rcGesture.rcGestureInts.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilMod {
  
  @JSImport("rc-gesture/lib/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calcMoveStatus(startTouches: Any, touches: Any, time: Any): Angle = (^.asInstanceOf[js.Dynamic].applyDynamic("calcMoveStatus")(startTouches.asInstanceOf[js.Any], touches.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[Angle]
  
  inline def calcMutliFingerStatus(touches: Any): js.UndefOr[X] = ^.asInstanceOf[js.Dynamic].applyDynamic("calcMutliFingerStatus")(touches.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[X]]
  
  inline def calcRotation(startMutliFingerStatus: Any, mutliFingerStatus: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calcRotation")(startMutliFingerStatus.asInstanceOf[js.Any], mutliFingerStatus.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getDirection(x: Any, y: Any): `1` | `2` | `4` | `8` | `16` = (^.asInstanceOf[js.Dynamic].applyDynamic("getDirection")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[`1` | `2` | `4` | `8` | `16`]
  
  inline def getDirectionEventName(direction: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getDirectionEventName")(direction.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getEventName(prefix: Any, status: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getEventName")(prefix.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getMovingDirection(point1: Any, point2: Any): `1` | `2` | `4` | `8` | `16` = (^.asInstanceOf[js.Dynamic].applyDynamic("getMovingDirection")(point1.asInstanceOf[js.Any], point2.asInstanceOf[js.Any])).asInstanceOf[`1` | `2` | `4` | `8` | `16`]
  
  inline def now(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Double]
  
  inline def shouldTriggerDirection(direction: Any, directionSetting: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldTriggerDirection")(direction.asInstanceOf[js.Any], directionSetting.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def shouldTriggerSwipe(delta: Any, velocity: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldTriggerSwipe")(delta.asInstanceOf[js.Any], velocity.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
