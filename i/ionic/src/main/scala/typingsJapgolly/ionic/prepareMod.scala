package typingsJapgolly.ionic

import typingsJapgolly.ionic.cordovaBaseMod.CordovaCommand
import typingsJapgolly.ionic.definitionsMod.CommandInstanceInfo
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandLineInputs
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandLineOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/commands/cordova/prepare", JSImport.Namespace)
@js.native
object prepareMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsJapgolly.ionicCliFramework.definitionsMod.ICommand because Already inherited
  - typingsJapgolly.ionic.definitionsMod.ICommand because Already inherited
  - typingsJapgolly.ionic.definitionsMod.CommandPreRun because var conflicts: env, namespace, project. Inlined preRun */ @js.native
  class PrepareCommand () extends CordovaCommand {
    def preRun(inputs: CommandLineInputs, options: CommandLineOptions, runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
  }
  
}

