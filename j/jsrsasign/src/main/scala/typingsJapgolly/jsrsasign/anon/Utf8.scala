package typingsJapgolly.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Utf8 extends StObject {
  
  var utf8: String
}
object Utf8 {
  
  inline def apply(utf8: String): Utf8 = {
    val __obj = js.Dynamic.literal(utf8 = utf8.asInstanceOf[js.Any])
    __obj.asInstanceOf[Utf8]
  }
  
  extension [Self <: Utf8](x: Self) {
    
    inline def setUtf8(value: String): Self = StObject.set(x, "utf8", value.asInstanceOf[js.Any])
  }
}
