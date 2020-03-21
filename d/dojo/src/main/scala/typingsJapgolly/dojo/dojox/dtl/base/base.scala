package typingsJapgolly.dojo.dojox.dtl.base

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/_base._base.html
  *
  *
  */
trait base extends js.Object {
  /**
    * Escapes a string's HTML
    *
    * @param value
    */
  def escape(value: js.Any): Unit
  /**
    *
    * @param value
    */
  def safe(value: js.Any): Unit
}

object base {
  @scala.inline
  def apply(escape: js.Any => Callback, safe: js.Any => Callback): base = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("escape")(js.Any.fromFunction1((t0: js.Any) => escape(t0).runNow()))
    __obj.updateDynamic("safe")(js.Any.fromFunction1((t0: js.Any) => safe(t0).runNow()))
    __obj.asInstanceOf[base]
  }
}

