package typingsJapgolly.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationSessionsChangeEvent extends StObject {
  
  /**
    * The {@link AuthenticationProvider} that has had its sessions change.
    */
  val provider: AuthenticationProviderInformation
}
object AuthenticationSessionsChangeEvent {
  
  inline def apply(provider: AuthenticationProviderInformation): AuthenticationSessionsChangeEvent = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationSessionsChangeEvent]
  }
  
  extension [Self <: AuthenticationSessionsChangeEvent](x: Self) {
    
    inline def setProvider(value: AuthenticationProviderInformation): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
  }
}
