package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathReactionidTeamslug extends StObject {
  
  var path: ReactionidTeamslug
}
object PathReactionidTeamslug {
  
  inline def apply(path: ReactionidTeamslug): PathReactionidTeamslug = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathReactionidTeamslug]
  }
  
  extension [Self <: PathReactionidTeamslug](x: Self) {
    
    inline def setPath(value: ReactionidTeamslug): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
