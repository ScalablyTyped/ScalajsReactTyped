package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathChecksuiteidOwner extends StObject {
  
  var path: ChecksuiteidOwner
}
object PathChecksuiteidOwner {
  
  inline def apply(path: ChecksuiteidOwner): PathChecksuiteidOwner = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathChecksuiteidOwner]
  }
  
  extension [Self <: PathChecksuiteidOwner](x: Self) {
    
    inline def setPath(value: ChecksuiteidOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
