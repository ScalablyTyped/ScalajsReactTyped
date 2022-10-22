package typingsJapgolly.jsrsasign.anon

import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.x509.GeneralNameParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Certsubj
  extends StObject
     with GeneralNameParam {
  
  var certsubj: String
}
object Certsubj {
  
  inline def apply(certsubj: String): Certsubj = {
    val __obj = js.Dynamic.literal(certsubj = certsubj.asInstanceOf[js.Any])
    __obj.asInstanceOf[Certsubj]
  }
  
  extension [Self <: Certsubj](x: Self) {
    
    inline def setCertsubj(value: String): Self = StObject.set(x, "certsubj", value.asInstanceOf[js.Any])
  }
}
