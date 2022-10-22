package typingsJapgolly.jsrsasign.anon

import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.x509.TBSCertList
import typingsJapgolly.jsrsasign.jsrsasign.RSAKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rsaprvkey extends StObject {
  
  var rsaprvkey: RSAKey
  
  var tbsobj: TBSCertList
}
object Rsaprvkey {
  
  inline def apply(rsaprvkey: RSAKey, tbsobj: TBSCertList): Rsaprvkey = {
    val __obj = js.Dynamic.literal(rsaprvkey = rsaprvkey.asInstanceOf[js.Any], tbsobj = tbsobj.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rsaprvkey]
  }
  
  extension [Self <: Rsaprvkey](x: Self) {
    
    inline def setRsaprvkey(value: RSAKey): Self = StObject.set(x, "rsaprvkey", value.asInstanceOf[js.Any])
    
    inline def setTbsobj(value: TBSCertList): Self = StObject.set(x, "tbsobj", value.asInstanceOf[js.Any])
  }
}
