package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetuserUsername extends StObject {
  
  var target_user: String
  
  /** The handle for the GitHub user account. */
  var username: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['username'] */ js.Any
}
object TargetuserUsername {
  
  inline def apply(
    target_user: String,
    username: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['username'] */ js.Any
  ): TargetuserUsername = {
    val __obj = js.Dynamic.literal(target_user = target_user.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetuserUsername]
  }
  
  extension [Self <: TargetuserUsername](x: Self) {
    
    inline def setTarget_user(value: String): Self = StObject.set(x, "target_user", value.asInstanceOf[js.Any])
    
    inline def setUsername(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['username'] */ js.Any
    ): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
