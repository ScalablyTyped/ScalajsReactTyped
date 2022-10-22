package typingsJapgolly.pkijs.mod

import typingsJapgolly.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRecipientEncryptedKey extends StObject {
  
  var encryptedKey: OctetString
  
  var rid: KeyAgreeRecipientIdentifier
}
object IRecipientEncryptedKey {
  
  inline def apply(encryptedKey: OctetString, rid: KeyAgreeRecipientIdentifier): IRecipientEncryptedKey = {
    val __obj = js.Dynamic.literal(encryptedKey = encryptedKey.asInstanceOf[js.Any], rid = rid.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRecipientEncryptedKey]
  }
  
  extension [Self <: IRecipientEncryptedKey](x: Self) {
    
    inline def setEncryptedKey(value: OctetString): Self = StObject.set(x, "encryptedKey", value.asInstanceOf[js.Any])
    
    inline def setRid(value: KeyAgreeRecipientIdentifier): Self = StObject.set(x, "rid", value.asInstanceOf[js.Any])
  }
}
