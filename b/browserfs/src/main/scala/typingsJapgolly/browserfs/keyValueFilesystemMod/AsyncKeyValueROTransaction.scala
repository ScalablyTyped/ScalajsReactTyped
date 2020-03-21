package typingsJapgolly.browserfs.keyValueFilesystemMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.browserfs.fileSystemMod.BFSCallback
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncKeyValueROTransaction extends js.Object {
  /**
    * Retrieves the data at the given key.
    * @param key The key to look under for data.
    */
  def get(key: String, cb: BFSCallback[Buffer]): Unit
}

object AsyncKeyValueROTransaction {
  @scala.inline
  def apply(get: (String, BFSCallback[Buffer]) => Callback): AsyncKeyValueROTransaction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.browserfs.fileSystemMod.BFSCallback[typingsJapgolly.node.Buffer]) => get(t0, t1).runNow()))
    __obj.asInstanceOf[AsyncKeyValueROTransaction]
  }
}

