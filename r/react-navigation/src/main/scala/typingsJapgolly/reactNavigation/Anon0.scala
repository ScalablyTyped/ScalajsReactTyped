package typingsJapgolly.reactNavigation

import japgolly.scalajs.react.raw.React.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0[T, P] extends js.Object {
  var onRef: js.UndefOr[Ref] = js.undefined
}

object Anon0 {
  @scala.inline
  def apply[T, P](onRef: Ref = null): Anon0[T, P] = {
    val __obj = js.Dynamic.literal()
    if (onRef != null) __obj.updateDynamic("onRef")(onRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon0[T, P]]
  }
}

