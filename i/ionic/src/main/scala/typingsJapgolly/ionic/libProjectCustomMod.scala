package typingsJapgolly.ionic

import typingsJapgolly.ionic.ionicStrings.custom
import typingsJapgolly.ionic.libProjectMod.Project
import typingsJapgolly.ionic.libProjectMod.ProjectDeps
import typingsJapgolly.ionic.libProjectMod.ProjectDetailsResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProjectCustomMod {
  
  @JSImport("ionic/lib/project/custom", "CustomProject")
  @js.native
  open class CustomProject protected () extends Project {
    def this(details: ProjectDetailsResult, e: ProjectDeps) = this()
    
    @JSName("type")
    val type_CustomProject: custom = js.native
  }
}
