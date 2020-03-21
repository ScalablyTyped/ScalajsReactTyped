package typingsJapgolly.fridaGum

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Callbacks to be notified synchronously on memory access.
  */
trait MemoryAccessCallbacks extends js.Object {
  def onAccess(details: MemoryAccessDetails): Unit
}

object MemoryAccessCallbacks {
  @scala.inline
  def apply(onAccess: MemoryAccessDetails => Callback): MemoryAccessCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onAccess")(js.Any.fromFunction1((t0: typingsJapgolly.fridaGum.MemoryAccessDetails) => onAccess(t0).runNow()))
    __obj.asInstanceOf[MemoryAccessCallbacks]
  }
}

