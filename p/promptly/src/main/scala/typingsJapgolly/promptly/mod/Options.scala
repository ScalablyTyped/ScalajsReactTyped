package typingsJapgolly.promptly.mod

import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var default: js.UndefOr[String] = js.undefined
  var input: js.UndefOr[ReadableStream] = js.undefined
  var output: js.UndefOr[WritableStream] = js.undefined
  var replace: js.UndefOr[String] = js.undefined
  var retry: js.UndefOr[Boolean] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
  var trim: js.UndefOr[Boolean] = js.undefined
  var validator: js.UndefOr[js.Any] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    default: String = null,
    input: ReadableStream = null,
    output: WritableStream = null,
    replace: String = null,
    retry: js.UndefOr[Boolean] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined,
    trim: js.UndefOr[Boolean] = js.undefined,
    validator: js.Any = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (replace != null) __obj.updateDynamic("replace")(replace.asInstanceOf[js.Any])
    if (!js.isUndefined(retry)) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim.asInstanceOf[js.Any])
    if (validator != null) __obj.updateDynamic("validator")(validator.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

