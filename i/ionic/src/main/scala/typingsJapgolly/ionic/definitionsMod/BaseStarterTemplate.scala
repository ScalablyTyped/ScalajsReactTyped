package typingsJapgolly.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseStarterTemplate extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var projectType: ProjectType
}
object BaseStarterTemplate {
  
  inline def apply(name: String, projectType: ProjectType): BaseStarterTemplate = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], projectType = projectType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseStarterTemplate]
  }
  
  extension [Self <: BaseStarterTemplate](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProjectType(value: ProjectType): Self = StObject.set(x, "projectType", value.asInstanceOf[js.Any])
  }
}
