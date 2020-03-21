package typingsJapgolly.ionic

import typingsJapgolly.ionic.definitionsMod.IonicAngularGenerateOptions
import typingsJapgolly.ionic.ionicAngularMod.IonicAngularProject
import typingsJapgolly.ionic.libGenerateMod.GenerateRunner
import typingsJapgolly.ionic.libGenerateMod.GenerateRunnerDeps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/project/ionic-angular/generate", JSImport.Namespace)
@js.native
object ionicAngularGenerateMod extends js.Object {
  @js.native
  class IonicAngularGenerateRunner protected () extends GenerateRunner[IonicAngularGenerateOptions] {
    def this(e: IonicAngularGenerateRunnerDeps) = this()
    @JSName("e")
    val e_IonicAngularGenerateRunner: IonicAngularGenerateRunnerDeps = js.native
    def getModules(context: js.Any, kind: String): js.Promise[_] = js.native
    def tabsPrompt(): js.Promise[js.Array[String]] = js.native
  }
  
  @js.native
  trait IonicAngularGenerateRunnerDeps extends GenerateRunnerDeps {
    @JSName("project")
    val project_IonicAngularGenerateRunnerDeps: IonicAngularProject = js.native
  }
  
}

