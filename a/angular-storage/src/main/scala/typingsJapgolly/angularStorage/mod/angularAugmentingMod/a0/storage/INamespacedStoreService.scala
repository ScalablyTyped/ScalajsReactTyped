package typingsJapgolly.angularStorage.mod.angularAugmentingMod.a0.storage

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INamespacedStoreService extends js.Object {
  /**
  			 * Returns the saved value with they key name.
  			 *
  			 * @param {String} name - The key name for the location of the value
  			 * @returns The saved value; if you saved an object, you get an object
  			 */
  def get(name: String): js.Any
  /**
  			 * Deletes the saved value with the key name
  			 *
  			 * @param {String} name - The key name for the location of the value to remove
  			 */
  def remove(name: String): Unit
  /**
  			 * Sets a new value to the storage with the key name. It can be any object.
  			 *
  			 * @param {String} name - The key name for the location of the value
  			 * @param value - The value to store
  			 */
  def set(name: String, value: js.Any): Unit
}

object INamespacedStoreService {
  @scala.inline
  def apply(get: String => CallbackTo[js.Any], remove: String => Callback, set: (String, js.Any) => Callback): INamespacedStoreService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: java.lang.String) => remove(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => set(t0, t1).runNow()))
    __obj.asInstanceOf[INamespacedStoreService]
  }
}

