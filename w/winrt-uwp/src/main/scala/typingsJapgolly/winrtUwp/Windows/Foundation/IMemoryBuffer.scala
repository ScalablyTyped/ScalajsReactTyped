package typingsJapgolly.winrtUwp.Windows.Foundation

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a reference counted memory buffer. */
trait IMemoryBuffer
  extends StObject
     with IClosable {
  
  /**
    * Returns a new managed object that implements the IMemoryBufferReference interface.
    * @return A new managed object that implements the IMemoryBufferReference interface.
    */
  def createReference(): IMemoryBufferReference
}
object IMemoryBuffer {
  
  inline def apply(close: Callback, createReference: CallbackTo[IMemoryBufferReference]): IMemoryBuffer = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, createReference = createReference.toJsFn)
    __obj.asInstanceOf[IMemoryBuffer]
  }
  
  extension [Self <: IMemoryBuffer](x: Self) {
    
    inline def setCreateReference(value: CallbackTo[IMemoryBufferReference]): Self = StObject.set(x, "createReference", value.toJsFn)
  }
}
