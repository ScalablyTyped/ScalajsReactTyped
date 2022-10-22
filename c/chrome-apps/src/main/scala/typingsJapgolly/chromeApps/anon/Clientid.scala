package typingsJapgolly.chromeApps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Clientid extends StObject {
  
  /** You need to register your app in the Google APIs Console to get the client ID. */
  var client_id: String
  
  /** Applies to these scopes */
  var scopes: js.Array[String]
}
object Clientid {
  
  inline def apply(client_id: String, scopes: js.Array[String]): Clientid = {
    val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clientid]
  }
  
  extension [Self <: Clientid](x: Self) {
    
    inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
    
    inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
  }
}
