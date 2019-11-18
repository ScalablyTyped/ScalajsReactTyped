package typingsJapgolly.node.streamMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pipe extends js.Object {
  def close(): Unit
  def hasRef(): Boolean
  def ref(): Unit
  def unref(): Unit
}

object Pipe {
  @scala.inline
  def apply(close: Callback, hasRef: CallbackTo[Boolean], ref: Callback, unref: Callback): Pipe = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("hasRef")(hasRef.toJsFn)
    __obj.updateDynamic("ref")(ref.toJsFn)
    __obj.updateDynamic("unref")(unref.toJsFn)
    __obj.asInstanceOf[Pipe]
  }
}

