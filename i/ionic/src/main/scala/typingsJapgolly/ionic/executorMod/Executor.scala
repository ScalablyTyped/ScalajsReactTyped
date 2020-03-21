package typingsJapgolly.ionic.executorMod

import typingsJapgolly.ionic.definitionsMod.CommandInstanceInfo
import typingsJapgolly.ionic.definitionsMod.CommandMetadata
import typingsJapgolly.ionic.definitionsMod.CommandMetadataOption
import typingsJapgolly.ionic.definitionsMod.ICommand
import typingsJapgolly.ionic.definitionsMod.INamespace
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadataInput
import typingsJapgolly.ionicCliFramework.mod.BaseExecutor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/executor", "Executor")
@js.native
class Executor () extends BaseExecutor[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption] {
  def run(command: ICommand, cmdargs: js.Array[String], hasLocationEnvExecutor: CommandInstanceInfo): js.Promise[Unit] = js.native
}

