package typingsJapgolly.winrt.Windows.Media.Protection

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRevocationAndRenewalItem extends StObject {
  
  var headerHash: String
  
  var name: String
  
  var publicKeyHash: String
  
  var reasons: RevocationAndRenewalReasons
  
  var renewalId: String
}
object IRevocationAndRenewalItem {
  
  inline def apply(
    headerHash: String,
    name: String,
    publicKeyHash: String,
    reasons: RevocationAndRenewalReasons,
    renewalId: String
  ): IRevocationAndRenewalItem = {
    val __obj = js.Dynamic.literal(headerHash = headerHash.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publicKeyHash = publicKeyHash.asInstanceOf[js.Any], reasons = reasons.asInstanceOf[js.Any], renewalId = renewalId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRevocationAndRenewalItem]
  }
  
  extension [Self <: IRevocationAndRenewalItem](x: Self) {
    
    inline def setHeaderHash(value: String): Self = StObject.set(x, "headerHash", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyHash(value: String): Self = StObject.set(x, "publicKeyHash", value.asInstanceOf[js.Any])
    
    inline def setReasons(value: RevocationAndRenewalReasons): Self = StObject.set(x, "reasons", value.asInstanceOf[js.Any])
    
    inline def setRenewalId(value: String): Self = StObject.set(x, "renewalId", value.asInstanceOf[js.Any])
  }
}
