package typingsJapgolly.devextreme.mod.DevExpress.data

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalStoreOptions extends ArrayStoreOptions[LocalStore] {
  /** Specifies a delay in milliseconds between when data changes and the moment these changes are saved in the local storage. Applies only if immediate is false. */
  var flushInterval: js.UndefOr[Double] = js.undefined
  /** Specifies whether the LocalStore saves changes in the local storage immediately. */
  var immediate: js.UndefOr[Boolean] = js.undefined
  /** Specifies the name under which data should be saved in the local storage. The `dx-data-localStore-` prefix will be added to the name. */
  var name: js.UndefOr[String] = js.undefined
}

object LocalStoreOptions {
  @scala.inline
  def apply(
    data: js.Array[_] = null,
    errorHandler: js.Function = null,
    flushInterval: Int | Double = null,
    immediate: js.UndefOr[Boolean] = js.undefined,
    key: String | js.Array[String] = null,
    name: String = null,
    onInserted: (/* values */ js.Any, /* key */ js.Any | String | Double) => CallbackTo[js.Any] = null,
    onInserting: /* values */ js.Any => CallbackTo[js.Any] = null,
    onLoaded: /* result */ js.Array[js.Any] => CallbackTo[js.Any] = null,
    onLoading: /* loadOptions */ LoadOptions => CallbackTo[js.Any] = null,
    onModified: js.Function = null,
    onModifying: js.Function = null,
    onPush: /* changes */ js.Array[js.Any] => CallbackTo[js.Any] = null,
    onRemoved: /* key */ js.Any | String | Double => CallbackTo[js.Any] = null,
    onRemoving: /* key */ js.Any | String | Double => CallbackTo[js.Any] = null,
    onUpdated: (/* key */ js.Any | String | Double, /* values */ js.Any) => CallbackTo[js.Any] = null,
    onUpdating: (/* key */ js.Any | String | Double, /* values */ js.Any) => CallbackTo[js.Any] = null
  ): LocalStoreOptions = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (errorHandler != null) __obj.updateDynamic("errorHandler")(errorHandler.asInstanceOf[js.Any])
    if (flushInterval != null) __obj.updateDynamic("flushInterval")(flushInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onInserted != null) __obj.updateDynamic("onInserted")(js.Any.fromFunction2((t0: /* values */ js.Any, t1: /* key */ js.Any | java.lang.String | scala.Double) => onInserted(t0, t1).runNow()))
    if (onInserting != null) __obj.updateDynamic("onInserting")(js.Any.fromFunction1((t0: /* values */ js.Any) => onInserting(t0).runNow()))
    if (onLoaded != null) __obj.updateDynamic("onLoaded")(js.Any.fromFunction1((t0: /* result */ js.Array[js.Any]) => onLoaded(t0).runNow()))
    if (onLoading != null) __obj.updateDynamic("onLoading")(js.Any.fromFunction1((t0: /* loadOptions */ typingsJapgolly.devextreme.mod.DevExpress.data.LoadOptions) => onLoading(t0).runNow()))
    if (onModified != null) __obj.updateDynamic("onModified")(onModified.asInstanceOf[js.Any])
    if (onModifying != null) __obj.updateDynamic("onModifying")(onModifying.asInstanceOf[js.Any])
    if (onPush != null) __obj.updateDynamic("onPush")(js.Any.fromFunction1((t0: /* changes */ js.Array[js.Any]) => onPush(t0).runNow()))
    if (onRemoved != null) __obj.updateDynamic("onRemoved")(js.Any.fromFunction1((t0: /* key */ js.Any | java.lang.String | scala.Double) => onRemoved(t0).runNow()))
    if (onRemoving != null) __obj.updateDynamic("onRemoving")(js.Any.fromFunction1((t0: /* key */ js.Any | java.lang.String | scala.Double) => onRemoving(t0).runNow()))
    if (onUpdated != null) __obj.updateDynamic("onUpdated")(js.Any.fromFunction2((t0: /* key */ js.Any | java.lang.String | scala.Double, t1: /* values */ js.Any) => onUpdated(t0, t1).runNow()))
    if (onUpdating != null) __obj.updateDynamic("onUpdating")(js.Any.fromFunction2((t0: /* key */ js.Any | java.lang.String | scala.Double, t1: /* values */ js.Any) => onUpdating(t0, t1).runNow()))
    __obj.asInstanceOf[LocalStoreOptions]
  }
}

