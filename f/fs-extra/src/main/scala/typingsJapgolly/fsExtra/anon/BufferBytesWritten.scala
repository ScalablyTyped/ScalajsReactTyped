package typingsJapgolly.fsExtra.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferBytesWritten extends StObject {
  
  var buffer: js.typedarray.Uint8ClampedArray
  
  var bytesWritten: Double
}
object BufferBytesWritten {
  
  inline def apply(buffer: js.typedarray.Uint8ClampedArray, bytesWritten: Double): BufferBytesWritten = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferBytesWritten]
  }
  
  extension [Self <: BufferBytesWritten](x: Self) {
    
    inline def setBuffer(value: js.typedarray.Uint8ClampedArray): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
  }
}
