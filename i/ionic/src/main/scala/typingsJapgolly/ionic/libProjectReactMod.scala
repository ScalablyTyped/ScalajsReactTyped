package typingsJapgolly.ionic

import typingsJapgolly.ionic.ionicStrings.react
import typingsJapgolly.ionic.libProjectMod.Project
import typingsJapgolly.ionic.libProjectMod.ProjectDeps
import typingsJapgolly.ionic.libProjectMod.ProjectDetailsResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProjectReactMod {
  
  @JSImport("ionic/lib/project/react", "ReactProject")
  @js.native
  open class ReactProject protected () extends Project {
    def this(details: ProjectDetailsResult, e: ProjectDeps) = this()
    
    @JSName("type")
    val type_ReactProject: react = js.native
  }
}
