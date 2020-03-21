package typingsJapgolly.dispatchr.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DispatcherOption extends js.Object {
  var errorHandler: js.UndefOr[js.Function2[/* e */ DispatcherError, /* context */ DispatcherContext, Unit]] = js.undefined
  var stores: js.UndefOr[js.Array[StoreClass]] = js.undefined
}

object DispatcherOption {
  @scala.inline
  def apply(
    errorHandler: (/* e */ DispatcherError, /* context */ DispatcherContext) => Callback = null,
    stores: js.Array[StoreClass] = null
  ): DispatcherOption = {
    val __obj = js.Dynamic.literal()
    if (errorHandler != null) __obj.updateDynamic("errorHandler")(js.Any.fromFunction2((t0: /* e */ typingsJapgolly.dispatchr.mod.DispatcherError, t1: /* context */ typingsJapgolly.dispatchr.mod.DispatcherContext) => errorHandler(t0, t1).runNow()))
    if (stores != null) __obj.updateDynamic("stores")(stores.asInstanceOf[js.Any])
    __obj.asInstanceOf[DispatcherOption]
  }
}

