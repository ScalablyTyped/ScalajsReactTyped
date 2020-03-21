package typingsJapgolly.isInteractive.mod

import typingsJapgolly.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		The stream to check.
  		@default process.stdout
  		*/
  val stream: js.UndefOr[WritableStream] = js.undefined
}

object Options {
  @scala.inline
  def apply(stream: WritableStream = null): Options = {
    val __obj = js.Dynamic.literal()
    if (stream != null) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

