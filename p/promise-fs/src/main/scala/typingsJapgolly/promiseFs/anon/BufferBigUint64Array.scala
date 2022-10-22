package typingsJapgolly.promiseFs.anon

import typingsJapgolly.std.BigUint64Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferBigUint64Array extends StObject {
  
  var buffer: BigUint64Array
  
  var bytesRead: Double
}
object BufferBigUint64Array {
  
  inline def apply(buffer: BigUint64Array, bytesRead: Double): BufferBigUint64Array = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferBigUint64Array]
  }
  
  extension [Self <: BufferBigUint64Array](x: Self) {
    
    inline def setBuffer(value: BigUint64Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setBytesRead(value: Double): Self = StObject.set(x, "bytesRead", value.asInstanceOf[js.Any])
  }
}
