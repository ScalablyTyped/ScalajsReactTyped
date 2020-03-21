package typingsJapgolly.ionicUtilsFs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaddirPOptions extends js.Object {
  /**
    * Filter out items from the walk process from the final result.
    *
    * @return `true` to keep, otherwise the item is filtered out
    */
  val filter: js.UndefOr[js.Function1[/* item */ WalkerItem, Boolean]] = js.undefined
  /**
    * Called whenever an error occurs during the walk process.
    *
    * If excluded, the function will throw an error when first encountered.
    */
  val onError: js.UndefOr[js.Function1[/* err */ js.Error, Unit]] = js.undefined
  val walkerOptions: js.UndefOr[WalkerOptions] = js.undefined
}

object ReaddirPOptions {
  @scala.inline
  def apply(
    filter: /* item */ WalkerItem => CallbackTo[Boolean] = null,
    onError: /* err */ js.Error => Callback = null,
    walkerOptions: WalkerOptions = null
  ): ReaddirPOptions = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1((t0: /* item */ typingsJapgolly.ionicUtilsFs.mod.WalkerItem) => filter(t0).runNow()))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* err */ js.Error) => onError(t0).runNow()))
    if (walkerOptions != null) __obj.updateDynamic("walkerOptions")(walkerOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaddirPOptions]
  }
}

