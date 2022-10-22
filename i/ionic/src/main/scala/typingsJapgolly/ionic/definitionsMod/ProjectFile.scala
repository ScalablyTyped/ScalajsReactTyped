package typingsJapgolly.ionic.definitionsMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.ionic.definitionsMod.IProjectConfig
  - typingsJapgolly.ionic.definitionsMod.IMultiProjectConfig
*/
trait ProjectFile extends StObject
object ProjectFile {
  
  inline def IMultiProjectConfig(projects: StringDictionary[js.UndefOr[IProjectConfig]]): typingsJapgolly.ionic.definitionsMod.IMultiProjectConfig = {
    val __obj = js.Dynamic.literal(projects = projects.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.ionic.definitionsMod.IMultiProjectConfig]
  }
  
  inline def IProjectConfig(integrations: ProjectIntegrations, name: String): typingsJapgolly.ionic.definitionsMod.IProjectConfig = {
    val __obj = js.Dynamic.literal(integrations = integrations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.ionic.definitionsMod.IProjectConfig]
  }
}
