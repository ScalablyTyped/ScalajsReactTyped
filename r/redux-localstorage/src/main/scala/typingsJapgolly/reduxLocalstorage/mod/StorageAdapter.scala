package typingsJapgolly.reduxLocalstorage.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageAdapter[A] extends js.Object {
  var `0`: A
  def del(key: String, callback: AdapterCallback): Unit
  def get(key: String, callback: AdapterCallback): Unit
  def put(key: String, value: js.Any, callback: AdapterCallback): Unit
}

object StorageAdapter {
  @scala.inline
  def apply[A](
    `0`: A,
    del: (String, AdapterCallback) => Callback,
    get: (String, AdapterCallback) => Callback,
    put: (String, js.Any, AdapterCallback) => Callback
  ): StorageAdapter[A] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("del")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.reduxLocalstorage.mod.AdapterCallback) => del(t0, t1).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.reduxLocalstorage.mod.AdapterCallback) => get(t0, t1).runNow()))
    __obj.updateDynamic("put")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Any, t2: typingsJapgolly.reduxLocalstorage.mod.AdapterCallback) => put(t0, t1, t2).runNow()))
    __obj.asInstanceOf[StorageAdapter[A]]
  }
}

