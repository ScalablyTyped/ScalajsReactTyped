package typingsJapgolly.ionic

import typingsJapgolly.ionic.ionicStrings.`ionic-angular`
import typingsJapgolly.ionic.libProjectMod.Project
import typingsJapgolly.ionic.libProjectMod.ProjectDeps
import typingsJapgolly.ionic.libProjectMod.ProjectDetailsResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProjectIonicAngularMod {
  
  @JSImport("ionic/lib/project/ionic-angular", "IonicAngularProject")
  @js.native
  open class IonicAngularProject protected () extends Project {
    def this(details: ProjectDetailsResult, e: ProjectDeps) = this()
    
    @JSName("type")
    val type_IonicAngularProject: `ionic-angular` = js.native
  }
}
