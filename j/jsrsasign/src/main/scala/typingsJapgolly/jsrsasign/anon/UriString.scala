package typingsJapgolly.jsrsasign.anon

import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.x509.GeneralNameParam
import typingsJapgolly.jsrsasign.jsrsasign._GeneralName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UriString
  extends StObject
     with GeneralNameParam
     with _GeneralName {
  
  var uri: String
}
object UriString {
  
  inline def apply(uri: String): UriString = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[UriString]
  }
  
  extension [Self <: UriString](x: Self) {
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
