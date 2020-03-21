package typingsJapgolly.browserfs.keyValueFilesystemMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleSyncStore extends js.Object {
  def del(key: String): Unit
  def get(key: String): js.UndefOr[Buffer]
  def put(key: String, data: Buffer, overwrite: Boolean): Boolean
}

object SimpleSyncStore {
  @scala.inline
  def apply(
    del: String => Callback,
    get: String => CallbackTo[js.UndefOr[Buffer]],
    put: (String, Buffer, Boolean) => CallbackTo[Boolean]
  ): SimpleSyncStore = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("del")(js.Any.fromFunction1((t0: java.lang.String) => del(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("put")(js.Any.fromFunction3((t0: java.lang.String, t1: typingsJapgolly.node.Buffer, t2: scala.Boolean) => put(t0, t1, t2).runNow()))
    __obj.asInstanceOf[SimpleSyncStore]
  }
}

