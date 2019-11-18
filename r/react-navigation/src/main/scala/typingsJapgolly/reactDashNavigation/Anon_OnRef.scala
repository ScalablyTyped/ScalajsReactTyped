package typingsJapgolly.reactDashNavigation

import japgolly.scalajs.react.raw.React.ComponentClassP
import japgolly.scalajs.react.raw.React.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnRef[T /* <: ComponentClassP[P with js.Object] */] extends js.Object {
  var onRef: js.UndefOr[Ref] = js.undefined
}

object Anon_OnRef {
  @scala.inline
  def apply[T /* <: ComponentClassP[P with js.Object] */](onRef: Ref = null): Anon_OnRef[T] = {
    val __obj = js.Dynamic.literal()
    if (onRef != null) __obj.updateDynamic("onRef")(onRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_OnRef[T]]
  }
}

