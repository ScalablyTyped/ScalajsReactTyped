package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectidTeamid extends StObject {
  
  /** The unique identifier of the project. */
  var project_id: Double
  
  /** The unique identifier of the team. */
  var team_id: Double
}
object ProjectidTeamid {
  
  inline def apply(project_id: Double, team_id: Double): ProjectidTeamid = {
    val __obj = js.Dynamic.literal(project_id = project_id.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectidTeamid]
  }
  
  extension [Self <: ProjectidTeamid](x: Self) {
    
    inline def setProject_id(value: Double): Self = StObject.set(x, "project_id", value.asInstanceOf[js.Any])
    
    inline def setTeam_id(value: Double): Self = StObject.set(x, "team_id", value.asInstanceOf[js.Any])
  }
}
