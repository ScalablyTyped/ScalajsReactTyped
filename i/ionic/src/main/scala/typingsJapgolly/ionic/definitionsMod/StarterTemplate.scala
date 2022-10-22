package typingsJapgolly.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.ionic.definitionsMod.RepoStarterTemplate
  - typingsJapgolly.ionic.definitionsMod.ManagedStarterTemplate
*/
trait StarterTemplate extends StObject
object StarterTemplate {
  
  inline def ManagedStarterTemplate(id: String, name: String, projectType: ProjectType): typingsJapgolly.ionic.definitionsMod.ManagedStarterTemplate = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], projectType = projectType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("managed")
    __obj.asInstanceOf[typingsJapgolly.ionic.definitionsMod.ManagedStarterTemplate]
  }
  
  inline def RepoStarterTemplate(name: String, projectType: ProjectType, repo: String): typingsJapgolly.ionic.definitionsMod.RepoStarterTemplate = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], projectType = projectType.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("repo")
    __obj.asInstanceOf[typingsJapgolly.ionic.definitionsMod.RepoStarterTemplate]
  }
}
