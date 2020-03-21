package typingsJapgolly.devextreme.mod.DevExpress.data

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreOptions[T] extends js.Object {
  /** Specifies the function that is executed when the store throws an error. */
  var errorHandler: js.UndefOr[js.Function] = js.undefined
  /** Specifies the key property (or properties) used to access data items. */
  var key: js.UndefOr[String | js.Array[String]] = js.undefined
  /** A function that is executed after a data item is added to the store. */
  var onInserted: js.UndefOr[js.Function2[/* values */ js.Any, /* key */ js.Any | String | Double, _]] = js.undefined
  /** A function that is executed before a data item is added to the store. */
  var onInserting: js.UndefOr[js.Function1[/* values */ js.Any, _]] = js.undefined
  /** A function that is executed after data is loaded to the store. */
  var onLoaded: js.UndefOr[js.Function1[/* result */ js.Array[_], _]] = js.undefined
  /** A function that is executed before data is loaded to the store. */
  var onLoading: js.UndefOr[js.Function1[/* loadOptions */ LoadOptions, _]] = js.undefined
  /** A function that is executed after a data item is added, updated, or removed from the store. */
  var onModified: js.UndefOr[js.Function] = js.undefined
  /** A function that is executed before a data item is added, updated, or removed from the store. */
  var onModifying: js.UndefOr[js.Function] = js.undefined
  /** The function executed before changes are pushed to the store. */
  var onPush: js.UndefOr[js.Function1[/* changes */ js.Array[_], _]] = js.undefined
  /** A function that is executed after a data item is removed from the store. */
  var onRemoved: js.UndefOr[js.Function1[/* key */ js.Any | String | Double, _]] = js.undefined
  /** A function that is executed before a data item is removed from the store. */
  var onRemoving: js.UndefOr[js.Function1[/* key */ js.Any | String | Double, _]] = js.undefined
  /** A function that is executed after a data item is updated in the store. */
  var onUpdated: js.UndefOr[js.Function2[/* key */ js.Any | String | Double, /* values */ js.Any, _]] = js.undefined
  /** A function that is executed before a data item is updated in the store. */
  var onUpdating: js.UndefOr[js.Function2[/* key */ js.Any | String | Double, /* values */ js.Any, _]] = js.undefined
}

object StoreOptions {
  @scala.inline
  def apply[T](
    errorHandler: js.Function = null,
    key: String | js.Array[String] = null,
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
  ): StoreOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (errorHandler != null) __obj.updateDynamic("errorHandler")(errorHandler.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[StoreOptions[T]]
  }
}

