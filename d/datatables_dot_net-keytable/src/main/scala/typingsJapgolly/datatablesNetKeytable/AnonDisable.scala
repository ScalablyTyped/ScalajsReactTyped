package typingsJapgolly.datatablesNetKeytable

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.datatablesNetKeytable.DataTables.Api
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisable extends js.Object {
  /*
    * Disable KeyTable's interactions (mouse and keyboard)
    */
  def disable(): Api
  /*
    * Enable or disable KeyTable's interactions (mouse and keyboard)
    */
  def enable(): Api
}

object AnonDisable {
  @scala.inline
  def apply(disable: CallbackTo[Api], enable: CallbackTo[Api]): AnonDisable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("disable")(disable.toJsFn)
    __obj.updateDynamic("enable")(enable.toJsFn)
    __obj.asInstanceOf[AnonDisable]
  }
}

