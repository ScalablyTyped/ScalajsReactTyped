package typingsJapgolly.node.NodeJS

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Immediate extends RefCounted {
  var _onImmediate: js.Function
  def hasRef(): Boolean
}

object Immediate {
  @scala.inline
  def apply(
    _onImmediate: js.Function,
    hasRef: CallbackTo[Boolean],
    ref: CallbackTo[Immediate],
    unref: CallbackTo[Immediate]
  ): Immediate = {
    val __obj = js.Dynamic.literal(_onImmediate = _onImmediate.asInstanceOf[js.Any])
    __obj.updateDynamic("hasRef")(hasRef.toJsFn)
    __obj.updateDynamic("ref")(ref.toJsFn)
    __obj.updateDynamic("unref")(unref.toJsFn)
    __obj.asInstanceOf[Immediate]
  }
}

