package typingsJapgolly.jsrsasign.anon

import typingsJapgolly.jsrsasign.jsrsasign.ASN1HEXParseResult
import typingsJapgolly.jsrsasign.jsrsasign._GeneralName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Other
  extends StObject
     with _GeneralName {
  
  var other: ASN1HEXParseResult
}
object Other {
  
  inline def apply(other: ASN1HEXParseResult): Other = {
    val __obj = js.Dynamic.literal(other = other.asInstanceOf[js.Any])
    __obj.asInstanceOf[Other]
  }
  
  extension [Self <: Other](x: Self) {
    
    inline def setOther(value: ASN1HEXParseResult): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
    
    inline def setOtherVarargs(value: Any*): Self = StObject.set(x, "other", js.Array(value*))
  }
}
