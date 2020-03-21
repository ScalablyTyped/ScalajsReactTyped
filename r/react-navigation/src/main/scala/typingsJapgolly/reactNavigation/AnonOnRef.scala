package typingsJapgolly.reactNavigation

import japgolly.scalajs.react.raw.React.ComponentClassP
import japgolly.scalajs.react.raw.React.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnRef[T /* <: ComponentClassP[P with js.Object] */] extends js.Object {
  var onRef: js.UndefOr[Ref] = js.undefined
}

object AnonOnRef {
  @scala.inline
  def apply[T /* <: ComponentClassP[P with js.Object] */](onRef: Ref = null): AnonOnRef[T] = {
    val __obj = js.Dynamic.literal()
    if (onRef != null) __obj.updateDynamic("onRef")(onRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOnRef[T]]
  }
}

