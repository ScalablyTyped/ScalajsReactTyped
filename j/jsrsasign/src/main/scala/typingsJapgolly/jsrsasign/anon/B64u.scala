package typingsJapgolly.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait B64u extends StObject {
  
  var b64u: String
}
object B64u {
  
  inline def apply(b64u: String): B64u = {
    val __obj = js.Dynamic.literal(b64u = b64u.asInstanceOf[js.Any])
    __obj.asInstanceOf[B64u]
  }
  
  extension [Self <: B64u](x: Self) {
    
    inline def setB64u(value: String): Self = StObject.set(x, "b64u", value.asInstanceOf[js.Any])
  }
}
