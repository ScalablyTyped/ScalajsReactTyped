package typingsJapgolly.maximMazurokGapiClientSecretmanager.gapi.client.secretmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Replication extends StObject {
  
  /** The Secret will automatically be replicated without any restrictions. */
  var automatic: js.UndefOr[Automatic] = js.undefined
  
  /** The Secret will only be replicated into the locations specified. */
  var userManaged: js.UndefOr[UserManaged] = js.undefined
}
object Replication {
  
  inline def apply(): Replication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Replication]
  }
  
  extension [Self <: Replication](x: Self) {
    
    inline def setAutomatic(value: Automatic): Self = StObject.set(x, "automatic", value.asInstanceOf[js.Any])
    
    inline def setAutomaticUndefined: Self = StObject.set(x, "automatic", js.undefined)
    
    inline def setUserManaged(value: UserManaged): Self = StObject.set(x, "userManaged", value.asInstanceOf[js.Any])
    
    inline def setUserManagedUndefined: Self = StObject.set(x, "userManaged", js.undefined)
  }
}
