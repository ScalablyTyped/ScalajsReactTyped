package typingsJapgolly.ionic.definitionsMod

import typingsJapgolly.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuperAgentError
  extends StObject
     with Error {
  
  var response: typingsJapgolly.superagent.mod.Response
}
object SuperAgentError {
  
  inline def apply(message: String, name: String, response: typingsJapgolly.superagent.mod.Response): SuperAgentError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuperAgentError]
  }
  
  extension [Self <: SuperAgentError](x: Self) {
    
    inline def setResponse(value: typingsJapgolly.superagent.mod.Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
