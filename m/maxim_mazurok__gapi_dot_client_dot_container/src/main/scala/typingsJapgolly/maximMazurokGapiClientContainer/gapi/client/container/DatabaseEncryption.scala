package typingsJapgolly.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatabaseEncryption extends StObject {
  
  /** Name of CloudKMS key to use for the encryption of secrets in etcd. Ex. projects/my-project/locations/global/keyRings/my-ring/cryptoKeys/my-key */
  var keyName: js.UndefOr[String] = js.undefined
  
  /** Denotes the state of etcd encryption. */
  var state: js.UndefOr[String] = js.undefined
}
object DatabaseEncryption {
  
  inline def apply(): DatabaseEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatabaseEncryption]
  }
  
  extension [Self <: DatabaseEncryption](x: Self) {
    
    inline def setKeyName(value: String): Self = StObject.set(x, "keyName", value.asInstanceOf[js.Any])
    
    inline def setKeyNameUndefined: Self = StObject.set(x, "keyName", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
