package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathReactionidReleaseid extends StObject {
  
  var path: ReactionidReleaseid
}
object PathReactionidReleaseid {
  
  inline def apply(path: ReactionidReleaseid): PathReactionidReleaseid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathReactionidReleaseid]
  }
  
  extension [Self <: PathReactionidReleaseid](x: Self) {
    
    inline def setPath(value: ReactionidReleaseid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
