package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathAuthoridOwner extends StObject {
  
  var path: AuthoridOwner
}
object PathAuthoridOwner {
  
  inline def apply(path: AuthoridOwner): PathAuthoridOwner = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathAuthoridOwner]
  }
  
  extension [Self <: PathAuthoridOwner](x: Self) {
    
    inline def setPath(value: AuthoridOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
