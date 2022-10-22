package typingsJapgolly.schematicsAngular

import typingsJapgolly.angularDevkitCore.srcVirtualFsPathMod.Path_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilityParseNameMod {
  
  @JSImport("@schematics/angular/utility/parse-name", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseName(path: String, name: String): Location = (^.asInstanceOf[js.Dynamic].applyDynamic("parseName")(path.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Location]
  
  trait Location extends StObject {
    
    var name: String
    
    var path: Path_
  }
  object Location {
    
    inline def apply(name: String, path: Path_): Location = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Location]
    }
    
    extension [Self <: Location](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: Path_): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
