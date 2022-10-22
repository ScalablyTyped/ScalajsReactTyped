package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Checkrunid extends StObject {
  
  /** The unique identifier of the check run. */
  var check_run_id: Double
  
  /** The account owner of the repository. The name is not case sensitive. */
  var owner: String
  
  /** The name of the repository. The name is not case sensitive. */
  var repo: String
}
object Checkrunid {
  
  inline def apply(check_run_id: Double, owner: String, repo: String): Checkrunid = {
    val __obj = js.Dynamic.literal(check_run_id = check_run_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checkrunid]
  }
  
  extension [Self <: Checkrunid](x: Self) {
    
    inline def setCheck_run_id(value: Double): Self = StObject.set(x, "check_run_id", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
