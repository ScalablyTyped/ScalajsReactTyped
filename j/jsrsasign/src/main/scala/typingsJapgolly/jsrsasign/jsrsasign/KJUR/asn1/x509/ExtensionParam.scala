package typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.x509

import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.ObjectIdentifierParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionParam extends StObject {
  
  var accessLocation: UriParam
  
  var accessMethod: ObjectIdentifierParam
}
object ExtensionParam {
  
  inline def apply(accessLocation: UriParam, accessMethod: ObjectIdentifierParam): ExtensionParam = {
    val __obj = js.Dynamic.literal(accessLocation = accessLocation.asInstanceOf[js.Any], accessMethod = accessMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionParam]
  }
  
  extension [Self <: ExtensionParam](x: Self) {
    
    inline def setAccessLocation(value: UriParam): Self = StObject.set(x, "accessLocation", value.asInstanceOf[js.Any])
    
    inline def setAccessMethod(value: ObjectIdentifierParam): Self = StObject.set(x, "accessMethod", value.asInstanceOf[js.Any])
  }
}
