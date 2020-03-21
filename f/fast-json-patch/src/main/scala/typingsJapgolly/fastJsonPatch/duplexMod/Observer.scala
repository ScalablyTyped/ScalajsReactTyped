package typingsJapgolly.fastJsonPatch.duplexMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.fastJsonPatch.coreMod.Operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observer[T] extends js.Object {
  var `object`: T
  var patches: js.Array[Operation]
  def callback(patches: js.Array[Operation]): Unit
  def unobserve(): Unit
}

object Observer {
  @scala.inline
  def apply[T](
    callback: js.Array[Operation] => Callback,
    `object`: T,
    patches: js.Array[Operation],
    unobserve: Callback
  ): Observer[T] = {
    val __obj = js.Dynamic.literal(patches = patches.asInstanceOf[js.Any])
    __obj.updateDynamic("callback")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.fastJsonPatch.coreMod.Operation]) => callback(t0).runNow()))
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("unobserve")(unobserve.toJsFn)
    __obj.asInstanceOf[Observer[T]]
  }
}

