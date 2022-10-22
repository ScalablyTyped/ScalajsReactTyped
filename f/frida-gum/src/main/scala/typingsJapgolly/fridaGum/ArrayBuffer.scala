package typingsJapgolly.fridaGum

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayBuffer extends StObject {
  
  /**
    * Gets a pointer to the base address of the ArrayBuffer's backing store.
    * It is the caller's responsibility to keep the buffer alive while the
    * backing store is still being used.
    */
  def unwrap(): NativePointer
}
object ArrayBuffer {
  
  inline def apply(unwrap: CallbackTo[NativePointer]): ArrayBuffer = {
    val __obj = js.Dynamic.literal(unwrap = unwrap.toJsFn)
    __obj.asInstanceOf[ArrayBuffer]
  }
  
  extension [Self <: ArrayBuffer](x: Self) {
    
    inline def setUnwrap(value: CallbackTo[NativePointer]): Self = StObject.set(x, "unwrap", value.toJsFn)
  }
}
