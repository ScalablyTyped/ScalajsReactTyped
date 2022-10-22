package typingsJapgolly.jsrsasign.anon

import typingsJapgolly.jsrsasign.jsrsasign._ASN1HEXParseResult
import typingsJapgolly.jsrsasign.jsrsasignStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Null
  extends StObject
     with _ASN1HEXParseResult {
  
  var `null`: _empty
}
object Null {
  
  inline def apply(): Null = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("null")("")
    __obj.asInstanceOf[Null]
  }
  
  extension [Self <: Null](x: Self) {
    
    inline def setNull(value: _empty): Self = StObject.set(x, "null", value.asInstanceOf[js.Any])
  }
}
