package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathDiscussionnumberOrgTeamslug extends StObject {
  
  var path: DiscussionnumberOrgTeamslug
}
object PathDiscussionnumberOrgTeamslug {
  
  inline def apply(path: DiscussionnumberOrgTeamslug): PathDiscussionnumberOrgTeamslug = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathDiscussionnumberOrgTeamslug]
  }
  
  extension [Self <: PathDiscussionnumberOrgTeamslug](x: Self) {
    
    inline def setPath(value: DiscussionnumberOrgTeamslug): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
