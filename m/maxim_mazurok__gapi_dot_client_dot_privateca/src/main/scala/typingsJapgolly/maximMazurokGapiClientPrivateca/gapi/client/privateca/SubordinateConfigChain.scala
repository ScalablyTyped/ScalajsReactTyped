package typingsJapgolly.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubordinateConfigChain extends StObject {
  
  /** Required. Expected to be in leaf-to-root order according to RFC 5246. */
  var pemCertificates: js.UndefOr[js.Array[String]] = js.undefined
}
object SubordinateConfigChain {
  
  inline def apply(): SubordinateConfigChain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubordinateConfigChain]
  }
  
  extension [Self <: SubordinateConfigChain](x: Self) {
    
    inline def setPemCertificates(value: js.Array[String]): Self = StObject.set(x, "pemCertificates", value.asInstanceOf[js.Any])
    
    inline def setPemCertificatesUndefined: Self = StObject.set(x, "pemCertificates", js.undefined)
    
    inline def setPemCertificatesVarargs(value: String*): Self = StObject.set(x, "pemCertificates", js.Array(value*))
  }
}
