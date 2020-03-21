package typingsJapgolly.reactBreadcrumbsDynamic.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreadcrumbsProviderProps extends js.Object {
  var shouldBreadcrumbsUpdate: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
}

object BreadcrumbsProviderProps {
  @scala.inline
  def apply(shouldBreadcrumbsUpdate: /* repeated */ js.Any => CallbackTo[js.Any] = null): BreadcrumbsProviderProps = {
    val __obj = js.Dynamic.literal()
    if (shouldBreadcrumbsUpdate != null) __obj.updateDynamic("shouldBreadcrumbsUpdate")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => shouldBreadcrumbsUpdate(t0).runNow()))
    __obj.asInstanceOf[BreadcrumbsProviderProps]
  }
}

