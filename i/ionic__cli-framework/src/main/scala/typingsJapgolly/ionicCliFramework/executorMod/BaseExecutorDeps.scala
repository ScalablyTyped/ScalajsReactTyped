package typingsJapgolly.ionicCliFramework.executorMod

import typingsJapgolly.ionicCliFramework.colorsMod.Colors
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadata
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadataInput
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadataOption
import typingsJapgolly.ionicCliFramework.definitionsMod.ICommand
import typingsJapgolly.ionicCliFramework.definitionsMod.INamespace
import typingsJapgolly.node.processMod._Global_.NodeJS.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseExecutorDeps[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] extends js.Object {
  val colors: js.UndefOr[Colors] = js.undefined
  val namespace: N
  val stderr: js.UndefOr[WriteStream] = js.undefined
  val stdout: js.UndefOr[WriteStream] = js.undefined
}

object BaseExecutorDeps {
  @scala.inline
  def apply[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](namespace: N, colors: Colors = null, stderr: WriteStream = null, stdout: WriteStream = null): BaseExecutorDeps[C, N, M, I, O] = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (stderr != null) __obj.updateDynamic("stderr")(stderr.asInstanceOf[js.Any])
    if (stdout != null) __obj.updateDynamic("stdout")(stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseExecutorDeps[C, N, M, I, O]]
  }
}

