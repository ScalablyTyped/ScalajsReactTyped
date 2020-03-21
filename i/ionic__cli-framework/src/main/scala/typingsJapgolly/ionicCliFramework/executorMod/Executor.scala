package typingsJapgolly.ionicCliFramework.executorMod

import typingsJapgolly.ionicCliFramework.commandMod.Command
import typingsJapgolly.ionicCliFramework.commandMod.Namespace
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadata
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadataInput
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadataOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/executor", "Executor")
@js.native
class Executor () extends BaseExecutor[
      Command, 
      Namespace, 
      CommandMetadata[CommandMetadataInput, CommandMetadataOption], 
      CommandMetadataInput, 
      CommandMetadataOption
    ]

