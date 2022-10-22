package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Autolinkid extends StObject {
  
  /** The unique identifier of the autolink. */
  var autolink_id: Double
  
  /** The account owner of the repository. The name is not case sensitive. */
  var owner: String
  
  /** The name of the repository. The name is not case sensitive. */
  var repo: String
}
object Autolinkid {
  
  inline def apply(autolink_id: Double, owner: String, repo: String): Autolinkid = {
    val __obj = js.Dynamic.literal(autolink_id = autolink_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Autolinkid]
  }
  
  extension [Self <: Autolinkid](x: Self) {
    
    inline def setAutolink_id(value: Double): Self = StObject.set(x, "autolink_id", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
