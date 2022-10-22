package typingsJapgolly.winrtUwp.Windows.Foundation

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a reference to an IMemoryBuffer object. */
trait IMemoryBufferReference
  extends StObject
     with IClosable {
  
  /** Gets the size of the memory buffer in bytes. */
  var capacity: Double
}
object IMemoryBufferReference {
  
  inline def apply(capacity: Double, close: Callback): IMemoryBufferReference = {
    val __obj = js.Dynamic.literal(capacity = capacity.asInstanceOf[js.Any], close = close.toJsFn)
    __obj.asInstanceOf[IMemoryBufferReference]
  }
  
  extension [Self <: IMemoryBufferReference](x: Self) {
    
    inline def setCapacity(value: Double): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
  }
}
