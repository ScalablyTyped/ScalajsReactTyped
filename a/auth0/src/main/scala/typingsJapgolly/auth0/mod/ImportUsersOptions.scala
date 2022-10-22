package typingsJapgolly.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.auth0.mod.ImportUsersFromFileOptions
  - typingsJapgolly.auth0.mod.ImportUsersFromJsonOptions
*/
trait ImportUsersOptions extends StObject
object ImportUsersOptions {
  
  inline def ImportUsersFromFileOptions(connection_id: String, users: String): typingsJapgolly.auth0.mod.ImportUsersFromFileOptions = {
    val __obj = js.Dynamic.literal(connection_id = connection_id.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.auth0.mod.ImportUsersFromFileOptions]
  }
  
  inline def ImportUsersFromJsonOptions(connection_id: String, users_json: String): typingsJapgolly.auth0.mod.ImportUsersFromJsonOptions = {
    val __obj = js.Dynamic.literal(connection_id = connection_id.asInstanceOf[js.Any], users_json = users_json.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.auth0.mod.ImportUsersFromJsonOptions]
  }
}
