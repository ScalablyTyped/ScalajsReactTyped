package typingsJapgolly.dojo.dojox.dtl.filter

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/filter/integers.html
  *
  *
  */
trait integers extends js.Object {
  /**
    *
    * @param value
    * @param arg
    */
  def add(value: js.Any, arg: js.Any): Double
  /**
    * Given a whole number, returns the 1-based requested digit of it
    *
    * @param value
    * @param arg
    */
  def get_digit(value: js.Any, arg: js.Any): Double
}

object integers {
  @scala.inline
  def apply(add: (js.Any, js.Any) => CallbackTo[Double], get_digit: (js.Any, js.Any) => CallbackTo[Double]): integers = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => add(t0, t1).runNow()))
    __obj.updateDynamic("get_digit")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => get_digit(t0, t1).runNow()))
    __obj.asInstanceOf[integers]
  }
}

