package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathIssuenumberNameOwner extends StObject {
  
  var path: IssuenumberNameOwner
}
object PathIssuenumberNameOwner {
  
  inline def apply(path: IssuenumberNameOwner): PathIssuenumberNameOwner = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathIssuenumberNameOwner]
  }
  
  extension [Self <: PathIssuenumberNameOwner](x: Self) {
    
    inline def setPath(value: IssuenumberNameOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
