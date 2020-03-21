package typingsJapgolly.node.NodeJS

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timeout extends Timer

object Timeout {
  @scala.inline
  def apply(
    hasRef: CallbackTo[Boolean],
    ref: CallbackTo[Timeout],
    refresh: CallbackTo[Timeout],
    unref: CallbackTo[Timeout]
  ): Timeout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hasRef")(hasRef.toJsFn)
    __obj.updateDynamic("ref")(ref.toJsFn)
    __obj.updateDynamic("refresh")(refresh.toJsFn)
    __obj.updateDynamic("unref")(unref.toJsFn)
    __obj.asInstanceOf[Timeout]
  }
}

