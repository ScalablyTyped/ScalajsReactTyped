package typingsJapgolly.ionic.definitionsMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMultiProjectConfig
  extends StObject
     with ProjectFile {
  
  var defaultProject: js.UndefOr[String] = js.undefined
  
  var projects: StringDictionary[js.UndefOr[IProjectConfig]]
}
object IMultiProjectConfig {
  
  inline def apply(projects: StringDictionary[js.UndefOr[IProjectConfig]]): IMultiProjectConfig = {
    val __obj = js.Dynamic.literal(projects = projects.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMultiProjectConfig]
  }
  
  extension [Self <: IMultiProjectConfig](x: Self) {
    
    inline def setDefaultProject(value: String): Self = StObject.set(x, "defaultProject", value.asInstanceOf[js.Any])
    
    inline def setDefaultProjectUndefined: Self = StObject.set(x, "defaultProject", js.undefined)
    
    inline def setProjects(value: StringDictionary[js.UndefOr[IProjectConfig]]): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
  }
}
