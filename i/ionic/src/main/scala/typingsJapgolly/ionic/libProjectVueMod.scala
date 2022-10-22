package typingsJapgolly.ionic

import typingsJapgolly.ionic.ionicStrings.vue
import typingsJapgolly.ionic.libProjectMod.Project
import typingsJapgolly.ionic.libProjectMod.ProjectDeps
import typingsJapgolly.ionic.libProjectMod.ProjectDetailsResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProjectVueMod {
  
  @JSImport("ionic/lib/project/vue", "VueProject")
  @js.native
  open class VueProject protected () extends Project {
    def this(details: ProjectDetailsResult, e: ProjectDeps) = this()
    
    @JSName("type")
    val type_VueProject: vue = js.native
  }
}
