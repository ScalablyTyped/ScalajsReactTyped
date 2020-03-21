package typingsJapgolly.dojo.dojox.lang.async

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/lang/async/event.html
  *
  *
  */
trait event extends js.Object {
  /**
    *
    * @param src
    * @param name
    */
  def failOn(src: js.Any, name: js.Any): Unit
  /**
    *
    * @param src
    * @param name
    */
  def from(src: js.Any, name: js.Any): Unit
}

object event {
  @scala.inline
  def apply(failOn: (js.Any, js.Any) => Callback, from: (js.Any, js.Any) => Callback): event = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failOn")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => failOn(t0, t1).runNow()))
    __obj.updateDynamic("from")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => from(t0, t1).runNow()))
    __obj.asInstanceOf[event]
  }
}

