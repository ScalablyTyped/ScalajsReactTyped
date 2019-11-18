package typingsJapgolly.node.NodeJS

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// compatibility with older typings
trait Timer extends js.Object {
  def hasRef(): Boolean
  def ref(): this.type
  def refresh(): this.type
  def unref(): this.type
}

object Timer {
  @scala.inline
  def apply(
    hasRef: CallbackTo[Boolean],
    ref: CallbackTo[Timer],
    refresh: CallbackTo[Timer],
    unref: CallbackTo[Timer]
  ): Timer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hasRef")(hasRef.toJsFn)
    __obj.updateDynamic("ref")(ref.toJsFn)
    __obj.updateDynamic("refresh")(refresh.toJsFn)
    __obj.updateDynamic("unref")(unref.toJsFn)
    __obj.asInstanceOf[Timer]
  }
}

