package typingsJapgolly.dojo.dojox

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/rails.html
  *
  *
  */
trait rails extends js.Object {
  /**
    *
    * @param selector
    * @param evtName
    * @param fn
    */
  def live(selector: js.Any, evtName: js.Any, fn: js.Any): Unit
}

object rails {
  @scala.inline
  def apply(live: (js.Any, js.Any, js.Any) => Callback): rails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("live")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => live(t0, t1, t2).runNow()))
    __obj.asInstanceOf[rails]
  }
}

