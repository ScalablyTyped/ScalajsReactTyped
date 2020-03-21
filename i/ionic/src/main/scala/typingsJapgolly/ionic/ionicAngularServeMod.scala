package typingsJapgolly.ionic

import typingsJapgolly.ionic.definitionsMod.IonicAngularServeOptions
import typingsJapgolly.ionic.ionicAngularMod.IonicAngularProject
import typingsJapgolly.ionic.libServeMod.ServeRunner
import typingsJapgolly.ionic.libServeMod.ServeRunnerDeps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/project/ionic-angular/serve", JSImport.Namespace)
@js.native
object ionicAngularServeMod extends js.Object {
  @js.native
  class IonicAngularServeRunner protected () extends ServeRunner[IonicAngularServeOptions] {
    def this(e: IonicAngularServeRunnerDeps) = this()
    @JSName("e")
    val e_IonicAngularServeRunner: IonicAngularServeRunnerDeps = js.native
  }
  
  @js.native
  trait IonicAngularServeRunnerDeps extends ServeRunnerDeps {
    @JSName("project")
    val project_IonicAngularServeRunnerDeps: IonicAngularProject = js.native
  }
  
  val DEFAULT_SERVE_SCRIPT_VALUE: String = js.native
}

