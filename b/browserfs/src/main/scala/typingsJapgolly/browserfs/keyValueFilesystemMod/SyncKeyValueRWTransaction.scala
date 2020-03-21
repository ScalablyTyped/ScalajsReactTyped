package typingsJapgolly.browserfs.keyValueFilesystemMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncKeyValueRWTransaction extends SyncKeyValueROTransaction {
  /**
    * Aborts and rolls back the transaction.
    */
  def abort(): Unit
  /**
    * Commits the transaction.
    */
  def commit(): Unit
  /**
    * Deletes the data at the given key.
    * @param key The key to delete from the store.
    */
  def del(key: String): Unit
  /**
    * Adds the data to the store under the given key.
    * @param key The key to add the data under.
    * @param data The data to add to the store.
    * @param overwrite If 'true', overwrite any existing data. If 'false',
    *   avoids storing the data if the key exists.
    * @return True if storage succeeded, false otherwise.
    */
  def put(key: String, data: Buffer, overwrite: Boolean): Boolean
}

object SyncKeyValueRWTransaction {
  @scala.inline
  def apply(
    abort: Callback,
    commit: Callback,
    del: String => Callback,
    get: String => CallbackTo[js.UndefOr[Buffer]],
    put: (String, Buffer, Boolean) => CallbackTo[Boolean]
  ): SyncKeyValueRWTransaction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abort")(abort.toJsFn)
    __obj.updateDynamic("commit")(commit.toJsFn)
    __obj.updateDynamic("del")(js.Any.fromFunction1((t0: java.lang.String) => del(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("put")(js.Any.fromFunction3((t0: java.lang.String, t1: typingsJapgolly.node.Buffer, t2: scala.Boolean) => put(t0, t1, t2).runNow()))
    __obj.asInstanceOf[SyncKeyValueRWTransaction]
  }
}

