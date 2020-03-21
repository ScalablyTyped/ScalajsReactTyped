package typingsJapgolly.reactNavigation

import japgolly.scalajs.react.raw.React.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnRefRef[T, P] extends js.Object {
  var onRef: js.UndefOr[Ref] = js.undefined
}

object AnonOnRefRef {
  @scala.inline
  def apply[T, P](onRef: Ref = null): AnonOnRefRef[T, P] = {
    val __obj = js.Dynamic.literal()
    if (onRef != null) __obj.updateDynamic("onRef")(onRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOnRefRef[T, P]]
  }
}

