package typingsJapgolly.rcFieldForm.nameMapMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.rcFieldForm.interfaceMod.InternalNamePath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NameMap like a `Map` but accepts `string[]` as key.
  */
trait NameMap[T] extends js.Object {
  var list: js.Any
  def delete(key: InternalNamePath): Unit
  def get(key: InternalNamePath): T
  def map[U](callback: js.Function1[/* kv */ KV[T], U]): js.Array[U]
  def set(key: InternalNamePath, value: T): Unit
  def toJSON(): StringDictionary[T]
  def update(key: InternalNamePath, updater: js.Function1[/* origin */ T, T | Null]): Unit
}

object NameMap {
  @scala.inline
  def apply[T](
    delete: InternalNamePath => Callback,
    get: InternalNamePath => CallbackTo[T],
    list: js.Any,
    map: js.Function1[/* kv */ KV[T], js.Any] => CallbackTo[js.Array[js.Any]],
    set: (InternalNamePath, T) => Callback,
    toJSON: CallbackTo[StringDictionary[T]],
    update: (InternalNamePath, js.Function1[/* origin */ T, T | Null]) => Callback
  ): NameMap[T] = {
    val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any])
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.rcFieldForm.interfaceMod.InternalNamePath) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.rcFieldForm.interfaceMod.InternalNamePath) => get(t0).runNow()))
    __obj.updateDynamic("map")(js.Any.fromFunction1((t0: js.Function1[/* kv */ typingsJapgolly.rcFieldForm.nameMapMod.KV[T], js.Any]) => map(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: typingsJapgolly.rcFieldForm.interfaceMod.InternalNamePath, t1: T) => set(t0, t1).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("update")(js.Any.fromFunction2((t0: typingsJapgolly.rcFieldForm.interfaceMod.InternalNamePath, t1: js.Function1[/* origin */ T, T | scala.Null]) => update(t0, t1).runNow()))
    __obj.asInstanceOf[NameMap[T]]
  }
}

