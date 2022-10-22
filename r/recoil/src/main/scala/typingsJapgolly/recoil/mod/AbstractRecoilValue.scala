package typingsJapgolly.recoil.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.recoil.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// recoilValue.d.ts
trait AbstractRecoilValue[T] extends StObject {
  
  def __cTag(t: T): Unit
  
  var __tag: js.Array[T]
  
  // for contravariance
  var key: NodeKey
  
  def toJSON(): Key
}
object AbstractRecoilValue {
  
  inline def apply[T](__cTag: T => Callback, __tag: js.Array[T], key: NodeKey, toJSON: CallbackTo[Key]): AbstractRecoilValue[T] = {
    val __obj = js.Dynamic.literal(__cTag = js.Any.fromFunction1((t0: T) => __cTag(t0).runNow()), __tag = __tag.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], toJSON = toJSON.toJsFn)
    __obj.asInstanceOf[AbstractRecoilValue[T]]
  }
  
  extension [Self <: AbstractRecoilValue[?], T](x: Self & AbstractRecoilValue[T]) {
    
    inline def setKey(value: NodeKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setToJSON(value: CallbackTo[Key]): Self = StObject.set(x, "toJSON", value.toJsFn)
    
    inline def set__cTag(value: T => Callback): Self = StObject.set(x, "__cTag", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
    
    inline def set__tag(value: js.Array[T]): Self = StObject.set(x, "__tag", value.asInstanceOf[js.Any])
    
    inline def set__tagVarargs(value: T*): Self = StObject.set(x, "__tag", js.Array(value*))
  }
}
