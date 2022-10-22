package typingsJapgolly.snapchatLensStudio

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an animation track using vec3 animation tracks. */
trait Vec3AnimationTrackXYZ
  extends StObject
     with ScriptObject {
  
  /** Returns the child track at index index */
  def getChildTrackByIndex(index: Double): AnimationTrack
  
  /** Sets the child track at index index to track */
  def setChildTrackByIndex(index: Double, track: AnimationTrack): Unit
}
object Vec3AnimationTrackXYZ {
  
  inline def apply(
    getChildTrackByIndex: Double => AnimationTrack,
    getTypeName: CallbackTo[String],
    isOfType: String => Boolean,
    setChildTrackByIndex: (Double, AnimationTrack) => Callback
  ): Vec3AnimationTrackXYZ = {
    val __obj = js.Dynamic.literal(getChildTrackByIndex = js.Any.fromFunction1(getChildTrackByIndex), getTypeName = getTypeName.toJsFn, isOfType = js.Any.fromFunction1(isOfType), setChildTrackByIndex = js.Any.fromFunction2((t0: Double, t1: AnimationTrack) => (setChildTrackByIndex(t0, t1)).runNow()))
    __obj.asInstanceOf[Vec3AnimationTrackXYZ]
  }
  
  extension [Self <: Vec3AnimationTrackXYZ](x: Self) {
    
    inline def setGetChildTrackByIndex(value: Double => AnimationTrack): Self = StObject.set(x, "getChildTrackByIndex", js.Any.fromFunction1(value))
    
    inline def setSetChildTrackByIndex(value: (Double, AnimationTrack) => Callback): Self = StObject.set(x, "setChildTrackByIndex", js.Any.fromFunction2((t0: Double, t1: AnimationTrack) => (value(t0, t1)).runNow()))
  }
}
