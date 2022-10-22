package typingsJapgolly.pkijs.mod

import typingsJapgolly.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEncapsulatedContentInfo extends StObject {
  
  var eContent: js.UndefOr[OctetString] = js.undefined
  
  var eContentType: String
}
object IEncapsulatedContentInfo {
  
  inline def apply(eContentType: String): IEncapsulatedContentInfo = {
    val __obj = js.Dynamic.literal(eContentType = eContentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEncapsulatedContentInfo]
  }
  
  extension [Self <: IEncapsulatedContentInfo](x: Self) {
    
    inline def setEContent(value: OctetString): Self = StObject.set(x, "eContent", value.asInstanceOf[js.Any])
    
    inline def setEContentType(value: String): Self = StObject.set(x, "eContentType", value.asInstanceOf[js.Any])
    
    inline def setEContentUndefined: Self = StObject.set(x, "eContent", js.undefined)
  }
}
