package typingsJapgolly.fsExtraPromiseEs6.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FSWatcher extends js.Object {
  def close(): Unit
}

object FSWatcher {
  @scala.inline
  def apply(close: Callback): FSWatcher = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.asInstanceOf[FSWatcher]
  }
}

