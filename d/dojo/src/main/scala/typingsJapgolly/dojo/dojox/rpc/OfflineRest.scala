package typingsJapgolly.dojo.dojox.rpc

import japgolly.scalajs.react.Callback
import typingsJapgolly.dojo.dojo.data.api.Read
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/rpc/OfflineRest.html
  *
  * Makes the REST service be able to store changes in local
  * storage so it can be used offline automatically.
  *
  */
trait OfflineRest extends js.Object {
  /**
    *
    */
  var stores: js.Array[_]
  /**
    * Adds a store to the monitored store for local storage
    *
    * @param store Store to add
    * @param baseQuery               OptionalThis is the base query to should be used to load the items forthe store. Generally you want to load all the items that should beavailable when offline.
    */
  def addStore(store: Read, baseQuery: String): Unit
  /**
    *
    */
  def downloadChanges(): Unit
  /**
    *
    */
  def sendChanges(): Unit
  /**
    *
    */
  def sync(): Unit
  /**
    *
    */
  def turnOffAutoSync(): Unit
}

object OfflineRest {
  @scala.inline
  def apply(
    addStore: (Read, String) => Callback,
    downloadChanges: Callback,
    sendChanges: Callback,
    stores: js.Array[_],
    sync: Callback,
    turnOffAutoSync: Callback
  ): OfflineRest = {
    val __obj = js.Dynamic.literal(stores = stores.asInstanceOf[js.Any])
    __obj.updateDynamic("addStore")(js.Any.fromFunction2((t0: typingsJapgolly.dojo.dojo.data.api.Read, t1: java.lang.String) => addStore(t0, t1).runNow()))
    __obj.updateDynamic("downloadChanges")(downloadChanges.toJsFn)
    __obj.updateDynamic("sendChanges")(sendChanges.toJsFn)
    __obj.updateDynamic("sync")(sync.toJsFn)
    __obj.updateDynamic("turnOffAutoSync")(turnOffAutoSync.toJsFn)
    __obj.asInstanceOf[OfflineRest]
  }
}

