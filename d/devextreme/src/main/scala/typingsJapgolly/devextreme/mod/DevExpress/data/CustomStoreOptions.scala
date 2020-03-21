package typingsJapgolly.devextreme.mod.DevExpress.data

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devextreme.AnonFilter
import typingsJapgolly.devextreme.devextremeStrings.processed
import typingsJapgolly.devextreme.devextremeStrings.raw
import typingsJapgolly.devextreme.mod._Global_.JQueryPromise
import typingsJapgolly.devextreme.mod._Global_.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomStoreOptions extends StoreOptions[CustomStore] {
  /** Specifies a custom implementation of the byKey(key) method. */
  var byKey: js.UndefOr[js.Function1[/* key */ js.Any | String | Double, Promise[_] | JQueryPromise[_]]] = js.undefined
  /** Specifies whether raw data should be saved in the cache. Applies only if loadMode is "raw". */
  var cacheRawData: js.UndefOr[Boolean] = js.undefined
  /** Specifies a custom implementation of the insert(values) method. */
  var insert: js.UndefOr[js.Function1[/* values */ js.Any, Promise[_] | JQueryPromise[_]]] = js.undefined
  /** Specifies a custom implementation of the load(options) method. */
  var load: js.UndefOr[
    js.Function1[/* options */ LoadOptions, Promise[_] | JQueryPromise[_] | js.Array[_]]
  ] = js.undefined
  /** Specifies how data returned by the load function is treated. */
  var loadMode: js.UndefOr[processed | raw] = js.undefined
  /** Specifies a custom implementation of the remove(key) method. */
  var remove: js.UndefOr[
    js.Function1[/* key */ js.Any | String | Double, Promise[Unit] | JQueryPromise[Unit]]
  ] = js.undefined
  /** Specifies a custom implementation of the totalCount(options) method. */
  var totalCount: js.UndefOr[
    js.Function1[/* loadOptions */ AnonFilter, Promise[Double] | JQueryPromise[Double]]
  ] = js.undefined
  /** Specifies a custom implementation of the update(key, values) method. */
  var update: js.UndefOr[
    js.Function2[
      /* key */ js.Any | String | Double, 
      /* values */ js.Any, 
      Promise[_] | JQueryPromise[_]
    ]
  ] = js.undefined
  /** Specifies whether the store combines the search and filter expressions. Defaults to true if the loadMode is "raw" and false if it is "processed". */
  var useDefaultSearch: js.UndefOr[Boolean] = js.undefined
}

object CustomStoreOptions {
  @scala.inline
  def apply(
    byKey: /* key */ js.Any | String | Double => CallbackTo[Promise[js.Any] | JQueryPromise[js.Any]] = null,
    cacheRawData: js.UndefOr[Boolean] = js.undefined,
    errorHandler: js.Function = null,
    insert: /* values */ js.Any => CallbackTo[Promise[js.Any] | JQueryPromise[js.Any]] = null,
    key: String | js.Array[String] = null,
    load: /* options */ LoadOptions => CallbackTo[Promise[js.Any] | JQueryPromise[js.Any] | js.Array[js.Any]] = null,
    loadMode: processed | raw = null,
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
    onUpdating: (/* key */ js.Any | String | Double, /* values */ js.Any) => CallbackTo[js.Any] = null,
    remove: /* key */ js.Any | String | Double => CallbackTo[Promise[Unit] | JQueryPromise[Unit]] = null,
    totalCount: /* loadOptions */ AnonFilter => CallbackTo[Promise[Double] | JQueryPromise[Double]] = null,
    update: (/* key */ js.Any | String | Double, /* values */ js.Any) => CallbackTo[Promise[js.Any] | JQueryPromise[js.Any]] = null,
    useDefaultSearch: js.UndefOr[Boolean] = js.undefined
  ): CustomStoreOptions = {
    val __obj = js.Dynamic.literal()
    if (byKey != null) __obj.updateDynamic("byKey")(js.Any.fromFunction1((t0: /* key */ js.Any | java.lang.String | scala.Double) => byKey(t0).runNow()))
    if (!js.isUndefined(cacheRawData)) __obj.updateDynamic("cacheRawData")(cacheRawData.asInstanceOf[js.Any])
    if (errorHandler != null) __obj.updateDynamic("errorHandler")(errorHandler.asInstanceOf[js.Any])
    if (insert != null) __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: /* values */ js.Any) => insert(t0).runNow()))
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.devextreme.mod.DevExpress.data.LoadOptions) => load(t0).runNow()))
    if (loadMode != null) __obj.updateDynamic("loadMode")(loadMode.asInstanceOf[js.Any])
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
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: /* key */ js.Any | java.lang.String | scala.Double) => remove(t0).runNow()))
    if (totalCount != null) __obj.updateDynamic("totalCount")(js.Any.fromFunction1((t0: /* loadOptions */ typingsJapgolly.devextreme.AnonFilter) => totalCount(t0).runNow()))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction2((t0: /* key */ js.Any | java.lang.String | scala.Double, t1: /* values */ js.Any) => update(t0, t1).runNow()))
    if (!js.isUndefined(useDefaultSearch)) __obj.updateDynamic("useDefaultSearch")(useDefaultSearch.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomStoreOptions]
  }
}

