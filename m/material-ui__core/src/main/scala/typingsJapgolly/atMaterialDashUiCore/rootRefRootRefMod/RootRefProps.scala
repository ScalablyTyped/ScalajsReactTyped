package typingsJapgolly.atMaterialDashUiCore.rootRefRootRefMod

import japgolly.scalajs.react.raw.React.RefHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RootRefProps[T] extends js.Object {
  var rootRef: js.UndefOr[(js.Function1[/* instance */ T | Null, Unit]) | RefHandle[T]] = js.undefined
}

object RootRefProps {
  @scala.inline
  def apply[T](rootRef: (js.Function1[/* instance */ T | Null, Unit]) | RefHandle[T] = null): RootRefProps[T] = {
    val __obj = js.Dynamic.literal()
    if (rootRef != null) __obj.updateDynamic("rootRef")(rootRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootRefProps[T]]
  }
}

