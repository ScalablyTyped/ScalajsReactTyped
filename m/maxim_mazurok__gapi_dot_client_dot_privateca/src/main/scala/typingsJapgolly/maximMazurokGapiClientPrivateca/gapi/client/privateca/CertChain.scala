package typingsJapgolly.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertChain extends StObject {
  
  /** The certificates that form the CA chain, from leaf to root order. */
  var certificates: js.UndefOr[js.Array[String]] = js.undefined
}
object CertChain {
  
  inline def apply(): CertChain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertChain]
  }
  
  extension [Self <: CertChain](x: Self) {
    
    inline def setCertificates(value: js.Array[String]): Self = StObject.set(x, "certificates", value.asInstanceOf[js.Any])
    
    inline def setCertificatesUndefined: Self = StObject.set(x, "certificates", js.undefined)
    
    inline def setCertificatesVarargs(value: String*): Self = StObject.set(x, "certificates", js.Array(value*))
  }
}
