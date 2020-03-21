package typingsJapgolly.virtualDom.VirtualDOM

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VPatchOptions[T /* <: Element */] extends js.Object {
  var patch: js.UndefOr[PatchFn[T]] = js.undefined
}

object VPatchOptions {
  @scala.inline
  def apply[T /* <: Element */](
    patch: (T, /* patches */ js.Array[VPatch], /* renderOptions */ VPatchOptions[T]) => CallbackTo[T] = null
  ): VPatchOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (patch != null) __obj.updateDynamic("patch")(js.Any.fromFunction3((t0: T, t1: /* patches */ js.Array[typingsJapgolly.virtualDom.VirtualDOM.VPatch], t2: /* renderOptions */ typingsJapgolly.virtualDom.VirtualDOM.VPatchOptions[T]) => patch(t0, t1, t2).runNow()))
    __obj.asInstanceOf[VPatchOptions[T]]
  }
}

