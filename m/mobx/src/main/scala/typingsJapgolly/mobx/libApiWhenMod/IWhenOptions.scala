package typingsJapgolly.mobx.libApiWhenMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWhenOptions extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ js.Any, Unit]] = js.undefined
  /**
    * Experimental.
    * Warns if the view doesn't track observables
    */
  var requiresObservable: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object IWhenOptions {
  @scala.inline
  def apply(
    name: String = null,
    onError: /* error */ js.Any => Callback = null,
    requiresObservable: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null
  ): IWhenOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* error */ js.Any) => onError(t0).runNow()))
    if (!js.isUndefined(requiresObservable)) __obj.updateDynamic("requiresObservable")(requiresObservable.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWhenOptions]
  }
}

