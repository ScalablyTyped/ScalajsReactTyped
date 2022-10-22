package typingsJapgolly.jsrsasign.anon

import typingsJapgolly.jsrsasign.jsrsasign._ASN1HEXParseResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntHex
  extends StObject
     with _ASN1HEXParseResult {
  
  var int: Hex
}
object IntHex {
  
  inline def apply(int: Hex): IntHex = {
    val __obj = js.Dynamic.literal(int = int.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntHex]
  }
  
  extension [Self <: IntHex](x: Self) {
    
    inline def setInt(value: Hex): Self = StObject.set(x, "int", value.asInstanceOf[js.Any])
  }
}
