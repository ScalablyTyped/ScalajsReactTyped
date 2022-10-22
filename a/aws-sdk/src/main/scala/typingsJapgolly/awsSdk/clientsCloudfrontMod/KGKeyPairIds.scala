package typingsJapgolly.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KGKeyPairIds extends StObject {
  
  /**
    * The identifier of the key group that contains the public keys.
    */
  var KeyGroupId: js.UndefOr[String] = js.undefined
  
  var KeyPairIds: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudfrontMod.KeyPairIds] = js.undefined
}
object KGKeyPairIds {
  
  inline def apply(): KGKeyPairIds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KGKeyPairIds]
  }
  
  extension [Self <: KGKeyPairIds](x: Self) {
    
    inline def setKeyGroupId(value: String): Self = StObject.set(x, "KeyGroupId", value.asInstanceOf[js.Any])
    
    inline def setKeyGroupIdUndefined: Self = StObject.set(x, "KeyGroupId", js.undefined)
    
    inline def setKeyPairIds(value: KeyPairIds): Self = StObject.set(x, "KeyPairIds", value.asInstanceOf[js.Any])
    
    inline def setKeyPairIdsUndefined: Self = StObject.set(x, "KeyPairIds", js.undefined)
  }
}
