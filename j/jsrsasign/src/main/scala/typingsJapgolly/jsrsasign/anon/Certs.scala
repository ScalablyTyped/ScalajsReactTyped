package typingsJapgolly.jsrsasign.anon

import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Certs extends StObject {
  
  var certs: js.Array[String]
  
  var content: StringParam
  
  var signerInfos: js.Array[HashAlg]
}
object Certs {
  
  inline def apply(certs: js.Array[String], content: StringParam, signerInfos: js.Array[HashAlg]): Certs = {
    val __obj = js.Dynamic.literal(certs = certs.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], signerInfos = signerInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[Certs]
  }
  
  extension [Self <: Certs](x: Self) {
    
    inline def setCerts(value: js.Array[String]): Self = StObject.set(x, "certs", value.asInstanceOf[js.Any])
    
    inline def setCertsVarargs(value: String*): Self = StObject.set(x, "certs", js.Array(value*))
    
    inline def setContent(value: StringParam): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setSignerInfos(value: js.Array[HashAlg]): Self = StObject.set(x, "signerInfos", value.asInstanceOf[js.Any])
    
    inline def setSignerInfosVarargs(value: HashAlg*): Self = StObject.set(x, "signerInfos", js.Array(value*))
  }
}
