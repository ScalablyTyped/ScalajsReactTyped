package typingsJapgolly.uifabricUtilities.asAsyncMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.react.mod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAsAsyncOptions[TProps] extends js.Object {
  /**
    * Callback when async loading fails.
    */
  var onError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
  /**
    * Callback executed when async loading is complete.
    */
  var onLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Callback which returns a promise resolving an object which exports the component.
    */
  def load(): js.Promise[ReactType[TProps]]
}

object IAsAsyncOptions {
  @scala.inline
  def apply[TProps](
    load: CallbackTo[js.Promise[ReactType[TProps]]],
    onError: /* error */ js.Error => Callback = null,
    onLoad: js.UndefOr[Callback] = js.undefined
  ): IAsAsyncOptions[TProps] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("load")(load.toJsFn)
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* error */ js.Error) => onError(t0).runNow()))
    onLoad.foreach(p => __obj.updateDynamic("onLoad")(p.toJsFn))
    __obj.asInstanceOf[IAsAsyncOptions[TProps]]
  }
}

