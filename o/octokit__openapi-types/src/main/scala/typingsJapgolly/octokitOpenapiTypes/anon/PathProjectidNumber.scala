package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathProjectidNumber extends StObject {
  
  var path: ProjectidNumber
}
object PathProjectidNumber {
  
  inline def apply(path: ProjectidNumber): PathProjectidNumber = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathProjectidNumber]
  }
  
  extension [Self <: PathProjectidNumber](x: Self) {
    
    inline def setPath(value: ProjectidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
