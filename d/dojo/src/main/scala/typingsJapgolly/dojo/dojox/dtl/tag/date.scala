package typingsJapgolly.dojo.dojox.dtl.tag

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/tag/date.html
  *
  *
  */
trait date extends js.Object {
  /**
    *
    * @param format
    * @param node
    */
  def NowNode(format: js.Any, node: js.Any): Unit
  /**
    *
    * @param parser
    * @param token
    */
  def now(parser: js.Any, token: js.Any): Unit
}

object date {
  @scala.inline
  def apply(NowNode: (js.Any, js.Any) => Callback, now: (js.Any, js.Any) => Callback): date = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("NowNode")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => NowNode(t0, t1).runNow()))
    __obj.updateDynamic("now")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => now(t0, t1).runNow()))
    __obj.asInstanceOf[date]
  }
}

