package typingsJapgolly.reactSelect.typesMod

import japgolly.scalajs.react.raw.React.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsWithInnerRef extends js.Object {
  /** The inner reference. */
  var innerRef: Ref
}

object PropsWithInnerRef {
  @scala.inline
  def apply(innerRef: Ref = null): PropsWithInnerRef = {
    val __obj = js.Dynamic.literal()
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsWithInnerRef]
  }
}

