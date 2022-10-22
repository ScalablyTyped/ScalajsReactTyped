package typingsJapgolly.ionic

import typingsJapgolly.ionic.ionicStrings.bare
import typingsJapgolly.ionic.libProjectMod.Project
import typingsJapgolly.ionic.libProjectMod.ProjectDeps
import typingsJapgolly.ionic.libProjectMod.ProjectDetailsResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProjectBareMod {
  
  @JSImport("ionic/lib/project/bare", "BareProject")
  @js.native
  open class BareProject protected () extends Project {
    def this(details: ProjectDetailsResult, e: ProjectDeps) = this()
    
    @JSName("type")
    val type_BareProject: bare = js.native
  }
}
