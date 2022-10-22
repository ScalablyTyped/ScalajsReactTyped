package typingsJapgolly.awsSdkTypes.distTypesEventStreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Int64 extends StObject {
  
  val bytes: js.typedarray.Uint8Array
}
object Int64 {
  
  inline def apply(bytes: js.typedarray.Uint8Array): Int64 = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Int64]
  }
  
  extension [Self <: Int64](x: Self) {
    
    inline def setBytes(value: js.typedarray.Uint8Array): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
  }
}
