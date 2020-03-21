package typingsJapgolly.jsData

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArray extends js.Object {
  def array(value: js.Any): Boolean
  def boolean(value: js.Any): Boolean
  def integer(value: js.Any): Boolean
  def `null`(value: js.Any): Boolean
  def number(value: js.Any): Boolean
  def `object`(value: js.Any): Boolean
  def string(value: js.Any): Boolean
}

object AnonArray {
  @scala.inline
  def apply(
    array: js.Any => CallbackTo[Boolean],
    boolean: js.Any => CallbackTo[Boolean],
    integer: js.Any => CallbackTo[Boolean],
    `null`: js.Any => CallbackTo[Boolean],
    number: js.Any => CallbackTo[Boolean],
    `object`: js.Any => CallbackTo[Boolean],
    string: js.Any => CallbackTo[Boolean]
  ): AnonArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("array")(js.Any.fromFunction1((t0: js.Any) => array(t0).runNow()))
    __obj.updateDynamic("boolean")(js.Any.fromFunction1((t0: js.Any) => boolean(t0).runNow()))
    __obj.updateDynamic("integer")(js.Any.fromFunction1((t0: js.Any) => integer(t0).runNow()))
    __obj.updateDynamic("null")(js.Any.fromFunction1((t0: js.Any) => `null`(t0).runNow()))
    __obj.updateDynamic("number")(js.Any.fromFunction1((t0: js.Any) => number(t0).runNow()))
    __obj.updateDynamic("object")(js.Any.fromFunction1((t0: js.Any) => `object`(t0).runNow()))
    __obj.updateDynamic("string")(js.Any.fromFunction1((t0: js.Any) => string(t0).runNow()))
    __obj.asInstanceOf[AnonArray]
  }
}

