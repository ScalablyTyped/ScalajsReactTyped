package typingsJapgolly.awsSdkTypes.commandMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Command[ClientInput /* <: CommandInput */, InputType /* <: ClientInput */, ClientOutput /* <: MetadataBearer */, OutputType /* <: ClientOutput */, ResolvedConfiguration, StreamType] extends js.Object {
  val input: InputType
  def resolveMiddleware(
    stack: MiddlewareStack[ClientInput, ClientOutput, StreamType],
    configuration: ResolvedConfiguration
  ): Handler[InputType, OutputType]
}

object Command {
  @scala.inline
  def apply[ClientInput /* <: CommandInput */, InputType /* <: ClientInput */, ClientOutput /* <: MetadataBearer */, OutputType /* <: ClientOutput */, ResolvedConfiguration, StreamType](
    input: InputType,
    resolveMiddleware: (MiddlewareStack[ClientInput, ClientOutput, StreamType], ResolvedConfiguration) => CallbackTo[Handler[InputType, OutputType]]
  ): Command[ClientInput, InputType, ClientOutput, OutputType, ResolvedConfiguration, StreamType] = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    __obj.updateDynamic("resolveMiddleware")(js.Any.fromFunction2((t0: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[ClientInput, ClientOutput, StreamType], t1: ResolvedConfiguration) => resolveMiddleware(t0, t1).runNow()))
    __obj.asInstanceOf[Command[ClientInput, InputType, ClientOutput, OutputType, ResolvedConfiguration, StreamType]]
  }
}

