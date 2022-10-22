package typingsJapgolly.openssiWebsdk.mod

import typingsJapgolly.openssiWebsdk.anon.Did
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionAgent extends StObject {
  
  var name: AgentName
  
  var pairwise: Did
  
  var public: Did
  
  var role: String
  
  var url: AgentURL
}
object ConnectionAgent {
  
  inline def apply(name: AgentName, pairwise: Did, public: Did, role: String, url: AgentURL): ConnectionAgent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pairwise = pairwise.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionAgent]
  }
  
  extension [Self <: ConnectionAgent](x: Self) {
    
    inline def setName(value: AgentName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPairwise(value: Did): Self = StObject.set(x, "pairwise", value.asInstanceOf[js.Any])
    
    inline def setPublic(value: Did): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: AgentURL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
