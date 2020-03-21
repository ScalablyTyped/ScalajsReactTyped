package typingsJapgolly.vscodeLanguageclient.mod

import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamInfo extends js.Object {
  var detached: js.UndefOr[Boolean] = js.undefined
  var reader: ReadableStream
  var writer: WritableStream
}

object StreamInfo {
  @scala.inline
  def apply(reader: ReadableStream, writer: WritableStream, detached: js.UndefOr[Boolean] = js.undefined): StreamInfo = {
    val __obj = js.Dynamic.literal(reader = reader.asInstanceOf[js.Any], writer = writer.asInstanceOf[js.Any])
    if (!js.isUndefined(detached)) __obj.updateDynamic("detached")(detached.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamInfo]
  }
}

