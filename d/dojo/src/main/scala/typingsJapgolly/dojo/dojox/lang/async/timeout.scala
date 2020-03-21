package typingsJapgolly.dojo.dojox.lang.async

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/lang/async/timeout.html
  *
  *
  */
trait timeout extends js.Object {
  /**
    *
    * @param ms
    */
  def failOn(ms: js.Any): Unit
  /**
    *
    * @param ms
    */
  def from(ms: js.Any): Unit
}

object timeout {
  @scala.inline
  def apply(failOn: js.Any => Callback, from: js.Any => Callback): timeout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failOn")(js.Any.fromFunction1((t0: js.Any) => failOn(t0).runNow()))
    __obj.updateDynamic("from")(js.Any.fromFunction1((t0: js.Any) => from(t0).runNow()))
    __obj.asInstanceOf[timeout]
  }
}

