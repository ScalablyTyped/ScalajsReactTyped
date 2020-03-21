package typingsJapgolly.sinonjsFakeTimers.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeTimer extends js.Object {
  /**
    * Stub method call. Does nothing.
    */
  def ref(): Unit
  /**
    * Stub method call. Does nothing.
    */
  def unref(): Unit
}

object NodeTimer {
  @scala.inline
  def apply(ref: Callback, unref: Callback): NodeTimer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ref")(ref.toJsFn)
    __obj.updateDynamic("unref")(unref.toJsFn)
    __obj.asInstanceOf[NodeTimer]
  }
}

