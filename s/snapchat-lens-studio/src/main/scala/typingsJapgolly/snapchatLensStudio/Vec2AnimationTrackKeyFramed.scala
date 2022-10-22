package typingsJapgolly.snapchatLensStudio

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an animation track using vec2 value keyframes. */
trait Vec2AnimationTrackKeyFramed
  extends StObject
     with ScriptObject {
  
  /** Adds a keyframe value value at time time. */
  def addKey(time: Double, value: vec2): Unit
  
  /** Removes all keyframes. */
  def removeAllKeys(): Unit
  
  /** Removes the keyframe at index. */
  def removeKeyAt(index: Double): Unit
}
object Vec2AnimationTrackKeyFramed {
  
  inline def apply(
    addKey: (Double, vec2) => Callback,
    getTypeName: CallbackTo[String],
    isOfType: String => Boolean,
    removeAllKeys: Callback,
    removeKeyAt: Double => Callback
  ): Vec2AnimationTrackKeyFramed = {
    val __obj = js.Dynamic.literal(addKey = js.Any.fromFunction2((t0: Double, t1: vec2) => (addKey(t0, t1)).runNow()), getTypeName = getTypeName.toJsFn, isOfType = js.Any.fromFunction1(isOfType), removeAllKeys = removeAllKeys.toJsFn, removeKeyAt = js.Any.fromFunction1((t0: Double) => removeKeyAt(t0).runNow()))
    __obj.asInstanceOf[Vec2AnimationTrackKeyFramed]
  }
  
  extension [Self <: Vec2AnimationTrackKeyFramed](x: Self) {
    
    inline def setAddKey(value: (Double, vec2) => Callback): Self = StObject.set(x, "addKey", js.Any.fromFunction2((t0: Double, t1: vec2) => (value(t0, t1)).runNow()))
    
    inline def setRemoveAllKeys(value: Callback): Self = StObject.set(x, "removeAllKeys", value.toJsFn)
    
    inline def setRemoveKeyAt(value: Double => Callback): Self = StObject.set(x, "removeKeyAt", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
