package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathDiscussionnumberTeamid extends StObject {
  
  var path: DiscussionnumberTeamid
}
object PathDiscussionnumberTeamid {
  
  inline def apply(path: DiscussionnumberTeamid): PathDiscussionnumberTeamid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathDiscussionnumberTeamid]
  }
  
  extension [Self <: PathDiscussionnumberTeamid](x: Self) {
    
    inline def setPath(value: DiscussionnumberTeamid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
