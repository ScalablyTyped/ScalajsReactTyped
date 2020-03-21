package typingsJapgolly.typescript.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileWatcher extends js.Object {
  def close(): Unit
}

object FileWatcher {
  @scala.inline
  def apply(close: Callback): FileWatcher = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.asInstanceOf[FileWatcher]
  }
}

