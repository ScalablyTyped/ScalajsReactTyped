package typingsJapgolly.fsExtra.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathEntryStream extends js.Object {
  def read(): PathEntry | Null
}

object PathEntryStream {
  @scala.inline
  def apply(read: CallbackTo[PathEntry | Null]): PathEntryStream = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("read")(read.toJsFn)
    __obj.asInstanceOf[PathEntryStream]
  }
}

