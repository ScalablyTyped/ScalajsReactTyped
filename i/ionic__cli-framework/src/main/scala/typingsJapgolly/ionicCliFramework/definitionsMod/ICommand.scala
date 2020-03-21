package typingsJapgolly.ionicCliFramework.definitionsMod

import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICommand[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] extends js.Object {
  var namespace: N = js.native
  def getMetadata(): js.Promise[M] = js.native
  def getMetadata(runinfo: Partial[CommandInstanceInfo[C, N, M, I, O]]): js.Promise[M] = js.native
  def run(inputs: CommandLineInputs, options: CommandLineOptions): js.Promise[Unit] = js.native
  def run(
    inputs: CommandLineInputs,
    options: CommandLineOptions,
    runinfo: Partial[CommandInstanceInfo[C, N, M, I, O]]
  ): js.Promise[Unit] = js.native
  def validate(argv: CommandLineInputs): js.Promise[Unit] = js.native
}

