package typingsJapgolly.rollupPluginTypescript2.icacheMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICache[DataType] extends js.Object {
  def exists(name: String): Boolean
  def `match`(names: js.Array[String]): Boolean
  def path(name: String): String
  def read(name: String): js.UndefOr[DataType | Null]
  def roll(): Unit
  def touch(name: String): Unit
  def write(name: String, data: DataType): Unit
}

object ICache {
  @scala.inline
  def apply[DataType](
    exists: String => CallbackTo[Boolean],
    `match`: js.Array[String] => CallbackTo[Boolean],
    path: String => CallbackTo[String],
    read: String => CallbackTo[js.UndefOr[DataType | Null]],
    roll: Callback,
    touch: String => Callback,
    write: (String, DataType) => Callback
  ): ICache[DataType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("exists")(js.Any.fromFunction1((t0: java.lang.String) => exists(t0).runNow()))
    __obj.updateDynamic("match")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => `match`(t0).runNow()))
    __obj.updateDynamic("path")(js.Any.fromFunction1((t0: java.lang.String) => path(t0).runNow()))
    __obj.updateDynamic("read")(js.Any.fromFunction1((t0: java.lang.String) => read(t0).runNow()))
    __obj.updateDynamic("roll")(roll.toJsFn)
    __obj.updateDynamic("touch")(js.Any.fromFunction1((t0: java.lang.String) => touch(t0).runNow()))
    __obj.updateDynamic("write")(js.Any.fromFunction2((t0: java.lang.String, t1: DataType) => write(t0, t1).runNow()))
    __obj.asInstanceOf[ICache[DataType]]
  }
}

