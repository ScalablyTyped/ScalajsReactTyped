package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Newowner extends StObject {
  
  /** @description The username or organization name the repository will be transferred to. */
  var new_owner: String
  
  /** @description ID of the team or teams to add to the repository. Teams can only be added to organization-owned repositories. */
  var team_ids: js.UndefOr[js.Array[Double]] = js.undefined
}
object Newowner {
  
  inline def apply(new_owner: String): Newowner = {
    val __obj = js.Dynamic.literal(new_owner = new_owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[Newowner]
  }
  
  extension [Self <: Newowner](x: Self) {
    
    inline def setNew_owner(value: String): Self = StObject.set(x, "new_owner", value.asInstanceOf[js.Any])
    
    inline def setTeam_ids(value: js.Array[Double]): Self = StObject.set(x, "team_ids", value.asInstanceOf[js.Any])
    
    inline def setTeam_idsUndefined: Self = StObject.set(x, "team_ids", js.undefined)
    
    inline def setTeam_idsVarargs(value: Double*): Self = StObject.set(x, "team_ids", js.Array(value*))
  }
}
