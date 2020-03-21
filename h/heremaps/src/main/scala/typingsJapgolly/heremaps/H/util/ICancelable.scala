package typingsJapgolly.heremaps.H.util

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface to cancelable requests and actions.
  */
trait ICancelable extends js.Object {
  /**
    * This method is used to cancel current action
    */
  def cancel(): Unit
}

object ICancelable {
  @scala.inline
  def apply(cancel: Callback): ICancelable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel.toJsFn)
    __obj.asInstanceOf[ICancelable]
  }
}

