package typingsJapgolly.consoleUi

import typingsJapgolly.consoleUi.mod.WriteLevel
import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCi extends js.Object {
  var ci: js.UndefOr[Boolean] = js.undefined
  var errorStream: js.UndefOr[WritableStream] = js.undefined
  var inputStream: js.UndefOr[ReadableStream] = js.undefined
  var outputStream: js.UndefOr[WritableStream] = js.undefined
  var writeLevel: js.UndefOr[WriteLevel] = js.undefined
}

object AnonCi {
  @scala.inline
  def apply(
    ci: js.UndefOr[Boolean] = js.undefined,
    errorStream: WritableStream = null,
    inputStream: ReadableStream = null,
    outputStream: WritableStream = null,
    writeLevel: WriteLevel = null
  ): AnonCi = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ci)) __obj.updateDynamic("ci")(ci.asInstanceOf[js.Any])
    if (errorStream != null) __obj.updateDynamic("errorStream")(errorStream.asInstanceOf[js.Any])
    if (inputStream != null) __obj.updateDynamic("inputStream")(inputStream.asInstanceOf[js.Any])
    if (outputStream != null) __obj.updateDynamic("outputStream")(outputStream.asInstanceOf[js.Any])
    if (writeLevel != null) __obj.updateDynamic("writeLevel")(writeLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCi]
  }
}

