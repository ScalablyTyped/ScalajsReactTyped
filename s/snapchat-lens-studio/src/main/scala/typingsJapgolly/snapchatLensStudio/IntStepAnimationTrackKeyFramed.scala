package typingsJapgolly.snapchatLensStudio

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an animation track using stepped integer value keyframes. */
trait IntStepAnimationTrackKeyFramed
  extends StObject
     with ScriptObject {
  
  /** Adds a key with value value at time time. */
  def addKey(time: Double, value: Double): Unit
  
  /** Removes all keys. */
  def removeAllKeys(): Unit
  
  /** Removes key at index index. */
  def removeKeyAt(index: Double): Unit
}
object IntStepAnimationTrackKeyFramed {
  
  inline def apply(
    addKey: (Double, Double) => Callback,
    getTypeName: CallbackTo[String],
    isOfType: String => Boolean,
    removeAllKeys: Callback,
    removeKeyAt: Double => Callback
  ): IntStepAnimationTrackKeyFramed = {
    val __obj = js.Dynamic.literal(addKey = js.Any.fromFunction2((t0: Double, t1: Double) => (addKey(t0, t1)).runNow()), getTypeName = getTypeName.toJsFn, isOfType = js.Any.fromFunction1(isOfType), removeAllKeys = removeAllKeys.toJsFn, removeKeyAt = js.Any.fromFunction1((t0: Double) => removeKeyAt(t0).runNow()))
    __obj.asInstanceOf[IntStepAnimationTrackKeyFramed]
  }
  
  extension [Self <: IntStepAnimationTrackKeyFramed](x: Self) {
    
    inline def setAddKey(value: (Double, Double) => Callback): Self = StObject.set(x, "addKey", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setRemoveAllKeys(value: Callback): Self = StObject.set(x, "removeAllKeys", value.toJsFn)
    
    inline def setRemoveKeyAt(value: Double => Callback): Self = StObject.set(x, "removeKeyAt", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
