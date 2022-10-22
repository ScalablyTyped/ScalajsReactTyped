package typingsJapgolly.ts3NodejsLibrary.libTypesResponseTypesMod

import typingsJapgolly.ts3NodejsLibrary.libTransportTeamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientSetServerQueryLogin
  extends StObject
     with ResponseEntry {
  
  var clientLoginPassword: String
}
object ClientSetServerQueryLogin {
  
  inline def apply(clientLoginPassword: String): ClientSetServerQueryLogin = {
    val __obj = js.Dynamic.literal(clientLoginPassword = clientLoginPassword.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientSetServerQueryLogin]
  }
  
  extension [Self <: ClientSetServerQueryLogin](x: Self) {
    
    inline def setClientLoginPassword(value: String): Self = StObject.set(x, "clientLoginPassword", value.asInstanceOf[js.Any])
  }
}
