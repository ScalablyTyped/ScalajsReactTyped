package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientidString extends StObject {
  
  /** The client ID of the GitHub app. */
  var client_id: String
}
object ClientidString {
  
  inline def apply(client_id: String): ClientidString = {
    val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientidString]
  }
  
  extension [Self <: ClientidString](x: Self) {
    
    inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
  }
}
