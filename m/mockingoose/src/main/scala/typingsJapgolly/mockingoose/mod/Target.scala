package typingsJapgolly.mockingoose.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Target extends js.Object {
  var __mocks: js.Any
  /**
    * Resets all mocks.
    */
  def resetAll(): Unit
  /**
    * Returns an object of mocks for all models. Only serializable if all mock results are primitives, not functions.
    */
  def toJSON(): js.Any
}

object Target {
  @scala.inline
  def apply(__mocks: js.Any, resetAll: Callback, toJSON: CallbackTo[js.Any]): Target = {
    val __obj = js.Dynamic.literal(__mocks = __mocks.asInstanceOf[js.Any])
    __obj.updateDynamic("resetAll")(resetAll.toJsFn)
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.asInstanceOf[Target]
  }
}

