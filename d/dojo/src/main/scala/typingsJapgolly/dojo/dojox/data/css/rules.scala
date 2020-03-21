package typingsJapgolly.dojo.dojox.data.css

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/data/css.rules.html
  *
  *
  */
trait rules extends js.Object {
  /**
    *
    * @param fn
    * @param ctx
    * @param context
    */
  def forEach(fn: js.Any, ctx: js.Any, context: js.Any): Unit
}

object rules {
  @scala.inline
  def apply(forEach: (js.Any, js.Any, js.Any) => Callback): rules = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("forEach")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => forEach(t0, t1, t2).runNow()))
    __obj.asInstanceOf[rules]
  }
}

