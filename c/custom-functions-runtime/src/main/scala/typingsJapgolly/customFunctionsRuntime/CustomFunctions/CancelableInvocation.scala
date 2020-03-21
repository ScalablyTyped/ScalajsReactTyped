package typingsJapgolly.customFunctionsRuntime.CustomFunctions

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about the invocation of a cancelable custom function.
  * A cancelable custom function can provide a handler for the onCanceled event.
  *
  * To indicate that a function is cancelable, in the metadata JSON file, the function options should specify:
  * `{ "cancelable": true }`
  *
  * If the metadata JSON file is being generated from JSDoc comments, include the tag `@cancelable`.
  */
trait CancelableInvocation extends Invocation {
  /**
    * Event handler called when the custom function is canceled.
    */
  def onCanceled(): Unit
}

object CancelableInvocation {
  @scala.inline
  def apply(onCanceled: Callback, address: String = null): CancelableInvocation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onCanceled")(onCanceled.toJsFn)
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelableInvocation]
  }
}

