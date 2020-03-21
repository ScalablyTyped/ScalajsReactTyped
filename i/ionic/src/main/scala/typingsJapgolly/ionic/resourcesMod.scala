package typingsJapgolly.ionic

import typingsJapgolly.ionic.cordovaBaseMod.CordovaCommand
import typingsJapgolly.ionic.definitionsMod.CommandInstanceInfo
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandLineInputs
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandLineOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/commands/cordova/resources", JSImport.Namespace)
@js.native
object resourcesMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsJapgolly.ionicCliFramework.definitionsMod.ICommand because Already inherited
  - typingsJapgolly.ionic.definitionsMod.ICommand because Already inherited
  - typingsJapgolly.ionic.definitionsMod.CommandPreRun because var conflicts: env, namespace, project. Inlined preRun */ @js.native
  class ResourcesCommand () extends CordovaCommand {
    def getBuildPlatforms(): js.Promise[js.Array[String]] = js.native
    def preRun(inputs: CommandLineInputs, options: CommandLineOptions, runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
    def runCordovaRes(platform: js.UndefOr[scala.Nothing], options: CommandLineOptions): js.Promise[Unit] = js.native
    def runCordovaRes(platform: String, options: CommandLineOptions): js.Promise[Unit] = js.native
    def runResourceServer(platform: js.UndefOr[scala.Nothing], options: CommandLineOptions): js.Promise[Unit] = js.native
    def runResourceServer(platform: String, options: CommandLineOptions): js.Promise[Unit] = js.native
  }
  
}

