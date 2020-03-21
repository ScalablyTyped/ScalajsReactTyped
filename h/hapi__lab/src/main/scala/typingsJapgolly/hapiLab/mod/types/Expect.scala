package typingsJapgolly.hapiLab.mod.types

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expect extends js.Object {
  /**
    * Assert the value to throw an argument error
    * 
    * @param value - the value being asserted.
    */
  def error[T](value: T): Unit
  /**
    * Assert the type of the value expected
    * 
    * @param value - the value being asserted.
    */
  def `type`[T](value: T): Unit
}

object Expect {
  @scala.inline
  def apply(error: js.Any => Callback, `type`: js.Any => Callback): Expect = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(js.Any.fromFunction1((t0: js.Any) => error(t0).runNow()))
    __obj.updateDynamic("type")(js.Any.fromFunction1((t0: js.Any) => `type`(t0).runNow()))
    __obj.asInstanceOf[Expect]
  }
}

