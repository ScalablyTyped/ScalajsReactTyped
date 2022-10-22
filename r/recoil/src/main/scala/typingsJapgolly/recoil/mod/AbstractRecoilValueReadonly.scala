package typingsJapgolly.recoil.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.recoil.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbstractRecoilValueReadonly[T] extends StObject {
  
  var __tag: js.Array[T]
  
  var key: NodeKey
  
  def toJSON(): Key
}
object AbstractRecoilValueReadonly {
  
  inline def apply[T](__tag: js.Array[T], key: NodeKey, toJSON: CallbackTo[Key]): AbstractRecoilValueReadonly[T] = {
    val __obj = js.Dynamic.literal(__tag = __tag.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], toJSON = toJSON.toJsFn)
    __obj.asInstanceOf[AbstractRecoilValueReadonly[T]]
  }
  
  extension [Self <: AbstractRecoilValueReadonly[?], T](x: Self & AbstractRecoilValueReadonly[T]) {
    
    inline def setKey(value: NodeKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setToJSON(value: CallbackTo[Key]): Self = StObject.set(x, "toJSON", value.toJsFn)
    
    inline def set__tag(value: js.Array[T]): Self = StObject.set(x, "__tag", value.asInstanceOf[js.Any])
    
    inline def set__tagVarargs(value: T*): Self = StObject.set(x, "__tag", js.Array(value*))
  }
}
