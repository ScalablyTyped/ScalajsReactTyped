package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrgProjectid extends StObject {
  
  /** The organization name. The name is not case sensitive. */
  @JSName("org")
  var org_ : String
  
  /** The unique identifier of the project. */
  var project_id: Double
  
  /** The slug of the team name. */
  var team_slug: String
}
object OrgProjectid {
  
  inline def apply(org_ : String, project_id: Double, team_slug: String): OrgProjectid = {
    val __obj = js.Dynamic.literal(project_id = project_id.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgProjectid]
  }
  
  extension [Self <: OrgProjectid](x: Self) {
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setProject_id(value: Double): Self = StObject.set(x, "project_id", value.asInstanceOf[js.Any])
    
    inline def setTeam_slug(value: String): Self = StObject.set(x, "team_slug", value.asInstanceOf[js.Any])
  }
}
