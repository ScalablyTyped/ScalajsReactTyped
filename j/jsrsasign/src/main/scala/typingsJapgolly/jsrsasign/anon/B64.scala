package typingsJapgolly.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait B64 extends StObject {
  
  var b64: String
}
object B64 {
  
  inline def apply(b64: String): B64 = {
    val __obj = js.Dynamic.literal(b64 = b64.asInstanceOf[js.Any])
    __obj.asInstanceOf[B64]
  }
  
  extension [Self <: B64](x: Self) {
    
    inline def setB64(value: String): Self = StObject.set(x, "b64", value.asInstanceOf[js.Any])
  }
}
