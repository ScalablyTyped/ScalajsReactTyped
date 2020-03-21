package typingsJapgolly.easyXHeaders.readlineMod

import typingsJapgolly.easyXHeaders.NodeJS.ReadableStream
import typingsJapgolly.easyXHeaders.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadLineOptions extends js.Object {
  var completer: js.UndefOr[js.Function] = js.undefined
  var input: ReadableStream
  var output: WritableStream
  var terminal: js.UndefOr[Boolean] = js.undefined
}

object ReadLineOptions {
  @scala.inline
  def apply(
    input: ReadableStream,
    output: WritableStream,
    completer: js.Function = null,
    terminal: js.UndefOr[Boolean] = js.undefined
  ): ReadLineOptions = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    if (completer != null) __obj.updateDynamic("completer")(completer.asInstanceOf[js.Any])
    if (!js.isUndefined(terminal)) __obj.updateDynamic("terminal")(terminal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadLineOptions]
  }
}

