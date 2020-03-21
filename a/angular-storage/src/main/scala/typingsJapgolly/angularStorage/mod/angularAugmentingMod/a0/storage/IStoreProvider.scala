package typingsJapgolly.angularStorage.mod.angularAugmentingMod.a0.storage

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStoreProvider extends js.Object {
  /**
  		     * Sets the storage.
  		     *
  		     * @param {String} storage - The storage name
  		     */
  def setStore(storage: String): Unit
}

object IStoreProvider {
  @scala.inline
  def apply(setStore: String => Callback): IStoreProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setStore")(js.Any.fromFunction1((t0: java.lang.String) => setStore(t0).runNow()))
    __obj.asInstanceOf[IStoreProvider]
  }
}

