package typingsJapgolly.snapchatLensStudio

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a rotation animation track using euler angles. */
trait QuaternionAnimationTrackXYZEuler
  extends StObject
     with ScriptObject {
  
  /** Returns child track at index index. */
  def getChildTrackByIndex(index: Double): AnimationTrack
  
  /** Sets child track at index index to track track. */
  def setChildTrackByIndex(index: Double, track: AnimationTrack): Unit
}
object QuaternionAnimationTrackXYZEuler {
  
  inline def apply(
    getChildTrackByIndex: Double => AnimationTrack,
    getTypeName: CallbackTo[String],
    isOfType: String => Boolean,
    setChildTrackByIndex: (Double, AnimationTrack) => Callback
  ): QuaternionAnimationTrackXYZEuler = {
    val __obj = js.Dynamic.literal(getChildTrackByIndex = js.Any.fromFunction1(getChildTrackByIndex), getTypeName = getTypeName.toJsFn, isOfType = js.Any.fromFunction1(isOfType), setChildTrackByIndex = js.Any.fromFunction2((t0: Double, t1: AnimationTrack) => (setChildTrackByIndex(t0, t1)).runNow()))
    __obj.asInstanceOf[QuaternionAnimationTrackXYZEuler]
  }
  
  extension [Self <: QuaternionAnimationTrackXYZEuler](x: Self) {
    
    inline def setGetChildTrackByIndex(value: Double => AnimationTrack): Self = StObject.set(x, "getChildTrackByIndex", js.Any.fromFunction1(value))
    
    inline def setSetChildTrackByIndex(value: (Double, AnimationTrack) => Callback): Self = StObject.set(x, "setChildTrackByIndex", js.Any.fromFunction2((t0: Double, t1: AnimationTrack) => (value(t0, t1)).runNow()))
  }
}
