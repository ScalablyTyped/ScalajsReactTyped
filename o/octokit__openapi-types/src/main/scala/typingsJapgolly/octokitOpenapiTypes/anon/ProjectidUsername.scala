package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectidUsername extends StObject {
  
  /** The unique identifier of the project. */
  var project_id: Double
  
  /** The handle for the GitHub user account. */
  var username: String
}
object ProjectidUsername {
  
  inline def apply(project_id: Double, username: String): ProjectidUsername = {
    val __obj = js.Dynamic.literal(project_id = project_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectidUsername]
  }
  
  extension [Self <: ProjectidUsername](x: Self) {
    
    inline def setProject_id(value: Double): Self = StObject.set(x, "project_id", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
