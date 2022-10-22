package typingsJapgolly.snapchatLensStudio

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an animation track using quaternion value keyframes. */
trait QuaternionAnimationTrackKeyFramed
  extends StObject
     with ScriptObject {
  
  /** Adds a key with value value at time time. */
  def addKey(time: Double, value: quat): Unit
  
  /** Removes all keys. */
  def removeAllKeys(): Unit
  
  /** Removes key at index index. */
  def removeKeyAt(index: Double): Unit
}
object QuaternionAnimationTrackKeyFramed {
  
  inline def apply(
    addKey: (Double, quat) => Callback,
    getTypeName: CallbackTo[String],
    isOfType: String => Boolean,
    removeAllKeys: Callback,
    removeKeyAt: Double => Callback
  ): QuaternionAnimationTrackKeyFramed = {
    val __obj = js.Dynamic.literal(addKey = js.Any.fromFunction2((t0: Double, t1: quat) => (addKey(t0, t1)).runNow()), getTypeName = getTypeName.toJsFn, isOfType = js.Any.fromFunction1(isOfType), removeAllKeys = removeAllKeys.toJsFn, removeKeyAt = js.Any.fromFunction1((t0: Double) => removeKeyAt(t0).runNow()))
    __obj.asInstanceOf[QuaternionAnimationTrackKeyFramed]
  }
  
  extension [Self <: QuaternionAnimationTrackKeyFramed](x: Self) {
    
    inline def setAddKey(value: (Double, quat) => Callback): Self = StObject.set(x, "addKey", js.Any.fromFunction2((t0: Double, t1: quat) => (value(t0, t1)).runNow()))
    
    inline def setRemoveAllKeys(value: Callback): Self = StObject.set(x, "removeAllKeys", value.toJsFn)
    
    inline def setRemoveKeyAt(value: Double => Callback): Self = StObject.set(x, "removeKeyAt", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
