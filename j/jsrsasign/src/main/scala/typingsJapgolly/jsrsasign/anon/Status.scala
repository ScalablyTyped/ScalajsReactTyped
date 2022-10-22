package typingsJapgolly.jsrsasign.anon

import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Status extends StObject {
  
  var status: Failinfo
  
  var tst: ASN1Object
}
object Status {
  
  inline def apply(status: Failinfo, tst: ASN1Object): Status = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], tst = tst.asInstanceOf[js.Any])
    __obj.asInstanceOf[Status]
  }
  
  extension [Self <: Status](x: Self) {
    
    inline def setStatus(value: Failinfo): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTst(value: ASN1Object): Self = StObject.set(x, "tst", value.asInstanceOf[js.Any])
  }
}
