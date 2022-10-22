package typingsJapgolly.winrtUwp.Windows.Foundation

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a reference counted memory buffer. */
trait MemoryBuffer extends StObject {
  
  /** Disconnects this MemoryBuffer object from the actual memory buffer. */
  def close(): Unit
  
  /**
    * Returns a new managed object that implements the IMemoryBufferReference interface.
    * @return A new managed object that implements the IMemoryBufferReference interface.
    */
  def createReference(): IMemoryBufferReference
}
object MemoryBuffer {
  
  inline def apply(close: Callback, createReference: CallbackTo[IMemoryBufferReference]): MemoryBuffer = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, createReference = createReference.toJsFn)
    __obj.asInstanceOf[MemoryBuffer]
  }
  
  extension [Self <: MemoryBuffer](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setCreateReference(value: CallbackTo[IMemoryBufferReference]): Self = StObject.set(x, "createReference", value.toJsFn)
  }
}
