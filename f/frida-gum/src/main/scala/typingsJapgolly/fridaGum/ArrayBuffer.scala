package typingsJapgolly.fridaGum

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayBuffer extends js.Object {
  /**
    * Gets a pointer to the base address of the ArrayBuffer's backing store.
    * It is the caller's responsibility to keep the buffer alive while the
    * backing store is still being used.
    */
  def unwrap(): NativePointer
}

object ArrayBuffer {
  @scala.inline
  def apply(unwrap: CallbackTo[NativePointer]): ArrayBuffer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("unwrap")(unwrap.toJsFn)
    __obj.asInstanceOf[ArrayBuffer]
  }
}

