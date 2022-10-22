package typingsJapgolly.jsrsasign.anon

import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.x509.GeneralNameParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dn
  extends StObject
     with GeneralNameParam {
  
  var dn: String
}
object Dn {
  
  inline def apply(dn: String): Dn = {
    val __obj = js.Dynamic.literal(dn = dn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dn]
  }
  
  extension [Self <: Dn](x: Self) {
    
    inline def setDn(value: String): Self = StObject.set(x, "dn", value.asInstanceOf[js.Any])
  }
}
