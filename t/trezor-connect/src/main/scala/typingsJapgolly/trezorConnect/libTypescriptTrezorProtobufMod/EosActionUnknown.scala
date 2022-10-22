package typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EosActionUnknown extends StObject {
  
  var data_chunk: String
  
  var data_size: Double
}
object EosActionUnknown {
  
  inline def apply(data_chunk: String, data_size: Double): EosActionUnknown = {
    val __obj = js.Dynamic.literal(data_chunk = data_chunk.asInstanceOf[js.Any], data_size = data_size.asInstanceOf[js.Any])
    __obj.asInstanceOf[EosActionUnknown]
  }
  
  extension [Self <: EosActionUnknown](x: Self) {
    
    inline def setData_chunk(value: String): Self = StObject.set(x, "data_chunk", value.asInstanceOf[js.Any])
    
    inline def setData_size(value: Double): Self = StObject.set(x, "data_size", value.asInstanceOf[js.Any])
  }
}
