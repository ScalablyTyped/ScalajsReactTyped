package typingsJapgolly.tampermonkey.Tampermonkey

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenTabObject extends js.Object {
  var closed: Boolean
  /** Set closed listener */
  var onclosed: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** Closes tab */
  def close(): Unit
}

object OpenTabObject {
  @scala.inline
  def apply(close: Callback, closed: Boolean, onclosed: js.UndefOr[Callback] = js.undefined): OpenTabObject = {
    val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any])
    __obj.updateDynamic("close")(close.toJsFn)
    onclosed.foreach(p => __obj.updateDynamic("onclosed")(p.toJsFn))
    __obj.asInstanceOf[OpenTabObject]
  }
}

