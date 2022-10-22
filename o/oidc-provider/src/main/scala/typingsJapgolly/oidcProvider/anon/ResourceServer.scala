package typingsJapgolly.oidcProvider.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceServer
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var client: typingsJapgolly.oidcProvider.mod.Client
  
  var resourceServer: js.UndefOr[typingsJapgolly.oidcProvider.mod.ResourceServer] = js.undefined
  
  var scope: String
}
object ResourceServer {
  
  inline def apply(client: typingsJapgolly.oidcProvider.mod.Client, scope: String): ResourceServer = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceServer]
  }
  
  extension [Self <: ResourceServer](x: Self) {
    
    inline def setClient(value: typingsJapgolly.oidcProvider.mod.Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setResourceServer(value: typingsJapgolly.oidcProvider.mod.ResourceServer): Self = StObject.set(x, "resourceServer", value.asInstanceOf[js.Any])
    
    inline def setResourceServerUndefined: Self = StObject.set(x, "resourceServer", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
  }
}
