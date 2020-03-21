package typingsJapgolly.ionic

import typingsJapgolly.ionic.definitionsMod.ReactServeOptions
import typingsJapgolly.ionic.ionicStrings.`React Scripts`
import typingsJapgolly.ionic.ionicStrings.`react-scripts`
import typingsJapgolly.ionic.ionicStrings.ionicColonserve
import typingsJapgolly.ionic.libServeMod.ServeCLI
import typingsJapgolly.ionic.libServeMod.ServeRunner
import typingsJapgolly.ionic.libServeMod.ServeRunnerDeps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/project/react/serve", JSImport.Namespace)
@js.native
object reactServeMod extends js.Object {
  @js.native
  class ReactServeCLI () extends ServeCLI[ReactServeOptions] {
    var chunks: Double = js.native
    @JSName("name")
    val name_ReactServeCLI: `React Scripts` = js.native
    @JSName("pkg")
    val pkg_ReactServeCLI: `react-scripts` = js.native
    @JSName("prefix")
    val prefix_ReactServeCLI: `react-scripts` = js.native
    @JSName("program")
    val program_ReactServeCLI: `react-scripts` = js.native
    @JSName("script")
    val script_ReactServeCLI: ionicColonserve = js.native
  }
  
  @js.native
  class ReactServeRunner protected () extends ServeRunner[ReactServeOptions] {
    def this(e: ServeRunnerDeps) = this()
  }
  
}

