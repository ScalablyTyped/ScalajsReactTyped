package typingsJapgolly.easyXHeaders.NodeJS

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timer extends js.Object {
  def ref(): Unit
  def unref(): Unit
}

object Timer {
  @scala.inline
  def apply(ref: Callback, unref: Callback): Timer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ref")(ref.toJsFn)
    __obj.updateDynamic("unref")(unref.toJsFn)
    __obj.asInstanceOf[Timer]
  }
}

