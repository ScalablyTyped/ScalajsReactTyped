package typingsJapgolly.thrift.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TStructLike extends js.Object {
  def read(input: TProtocol): Unit
  def write(output: TProtocol): Unit
}

object TStructLike {
  @scala.inline
  def apply(read: TProtocol => Callback, write: TProtocol => Callback): TStructLike = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("read")(js.Any.fromFunction1((t0: typingsJapgolly.thrift.mod.TProtocol) => read(t0).runNow()))
    __obj.updateDynamic("write")(js.Any.fromFunction1((t0: typingsJapgolly.thrift.mod.TProtocol) => write(t0).runNow()))
    __obj.asInstanceOf[TStructLike]
  }
}

