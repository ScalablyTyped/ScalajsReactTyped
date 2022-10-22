package typingsJapgolly.firebaseAdmin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X509Certificate extends StObject {
  
  var x509Certificate: String
}
object X509Certificate {
  
  inline def apply(x509Certificate: String): X509Certificate = {
    val __obj = js.Dynamic.literal(x509Certificate = x509Certificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[X509Certificate]
  }
  
  extension [Self <: X509Certificate](x: Self) {
    
    inline def setX509Certificate(value: String): Self = StObject.set(x, "x509Certificate", value.asInstanceOf[js.Any])
  }
}
