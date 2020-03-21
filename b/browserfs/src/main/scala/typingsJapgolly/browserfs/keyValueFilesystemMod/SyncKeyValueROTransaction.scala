package typingsJapgolly.browserfs.keyValueFilesystemMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncKeyValueROTransaction extends js.Object {
  /**
    * Retrieves the data at the given key. Throws an ApiError if an error occurs
    * or if the key does not exist.
    * @param key The key to look under for data.
    * @return The data stored under the key, or undefined if not present.
    */
  def get(key: String): js.UndefOr[Buffer]
}

object SyncKeyValueROTransaction {
  @scala.inline
  def apply(get: String => CallbackTo[js.UndefOr[Buffer]]): SyncKeyValueROTransaction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.asInstanceOf[SyncKeyValueROTransaction]
  }
}

