package typingsJapgolly.reactCopyWrite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsumerPropsBase[T] extends js.Object {
  var select: js.UndefOr[js.Array[SelectorFn[T]]] = js.undefined
}

object ConsumerPropsBase {
  @scala.inline
  def apply[T](select: js.Array[SelectorFn[T]] = null): ConsumerPropsBase[T] = {
    val __obj = js.Dynamic.literal()
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumerPropsBase[T]]
  }
}

