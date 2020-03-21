package typingsJapgolly.browserfs.keyValueFilesystemMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.browserfs.apiErrorMod.ApiError
import typingsJapgolly.browserfs.fileSystemMod.BFSCallback
import typingsJapgolly.browserfs.fileSystemMod.BFSOneArgCallback
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncKeyValueRWTransaction extends AsyncKeyValueROTransaction {
  /**
    * Aborts and rolls back the transaction.
    */
  def abort(cb: BFSOneArgCallback): Unit
  /**
    * Commits the transaction.
    */
  def commit(cb: BFSOneArgCallback): Unit
  /**
    * Deletes the data at the given key.
    * @param key The key to delete from the store.
    */
  def del(key: String, cb: BFSOneArgCallback): Unit
  /**
    * Adds the data to the store under the given key. Overwrites any existing
    * data.
    * @param key The key to add the data under.
    * @param data The data to add to the store.
    * @param overwrite If 'true', overwrite any existing data. If 'false',
    *   avoids writing the data if the key exists.
    * @param cb Triggered with an error and whether or not the value was
    *   committed.
    */
  def put(
    key: String,
    data: Buffer,
    overwrite: Boolean,
    cb: js.Function2[/* e */ ApiError, /* committed */ js.UndefOr[Boolean], Unit]
  ): Unit
}

object AsyncKeyValueRWTransaction {
  @scala.inline
  def apply(
    abort: BFSOneArgCallback => Callback,
    commit: BFSOneArgCallback => Callback,
    del: (String, BFSOneArgCallback) => Callback,
    get: (String, BFSCallback[Buffer]) => Callback,
    put: (String, Buffer, Boolean, js.Function2[/* e */ ApiError, /* committed */ js.UndefOr[Boolean], Unit]) => Callback
  ): AsyncKeyValueRWTransaction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abort")(js.Any.fromFunction1((t0: typingsJapgolly.browserfs.fileSystemMod.BFSOneArgCallback) => abort(t0).runNow()))
    __obj.updateDynamic("commit")(js.Any.fromFunction1((t0: typingsJapgolly.browserfs.fileSystemMod.BFSOneArgCallback) => commit(t0).runNow()))
    __obj.updateDynamic("del")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.browserfs.fileSystemMod.BFSOneArgCallback) => del(t0, t1).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.browserfs.fileSystemMod.BFSCallback[typingsJapgolly.node.Buffer]) => get(t0, t1).runNow()))
    __obj.updateDynamic("put")(js.Any.fromFunction4((t0: java.lang.String, t1: typingsJapgolly.node.Buffer, t2: scala.Boolean, t3: js.Function2[
  /* e */ typingsJapgolly.browserfs.apiErrorMod.ApiError, 
  /* committed */ js.UndefOr[scala.Boolean], 
  scala.Unit]) => put(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[AsyncKeyValueRWTransaction]
  }
}

