package typingsJapgolly.parse.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Base64 extends StObject {
  
  var base64: String
}
object Base64 {
  
  inline def apply(base64: String): Base64 = {
    val __obj = js.Dynamic.literal(base64 = base64.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base64]
  }
  
  extension [Self <: Base64](x: Self) {
    
    inline def setBase64(value: String): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
  }
}
