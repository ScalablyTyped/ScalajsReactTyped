package typingsJapgolly.dojo.dojo.base.kernel

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.dojo.dojo.store.api.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/_base/kernel.store.html
  *
  *
  */
trait store extends js.Object {
  /**
    *
    */
  var util: js.Object
  /**
    *
    * @param masterStore
    * @param cachingStore
    * @param options
    */
  def Cache(masterStore: js.Any, cachingStore: js.Any, options: js.Any): js.Any
  /**
    *
    */
  def DataStore(): Unit
  /**
    *
    */
  def JsonRest(): Unit
  /**
    *
    */
  def Memory(): Unit
  /**
    * The Observable store wrapper takes a store and sets an observe method on query()
    * results that can be used to monitor results for changes.
    * Observable wraps an existing store so that notifications can be made when a query
    * is performed.
    *
    * @param store
    */
  def Observable(store: Store): js.Any
}

object store {
  @scala.inline
  def apply(
    Cache: (js.Any, js.Any, js.Any) => CallbackTo[js.Any],
    DataStore: Callback,
    JsonRest: Callback,
    Memory: Callback,
    Observable: Store => CallbackTo[js.Any],
    util: js.Object
  ): store = {
    val __obj = js.Dynamic.literal(util = util.asInstanceOf[js.Any])
    __obj.updateDynamic("Cache")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => Cache(t0, t1, t2).runNow()))
    __obj.updateDynamic("DataStore")(DataStore.toJsFn)
    __obj.updateDynamic("JsonRest")(JsonRest.toJsFn)
    __obj.updateDynamic("Memory")(Memory.toJsFn)
    __obj.updateDynamic("Observable")(js.Any.fromFunction1((t0: typingsJapgolly.dojo.dojo.store.api.Store) => Observable(t0).runNow()))
    __obj.asInstanceOf[store]
  }
}

