package typingsJapgolly.reduxBootstrap.interfacesMod.interfaces

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterProps extends js.Object {
  var onError: js.UndefOr[js.Function1[/* error */ js.Any, _]] = js.undefined
  var onUpdate: js.UndefOr[js.Function0[_]] = js.undefined
}

object RouterProps {
  @scala.inline
  def apply(
    onError: /* error */ js.Any => CallbackTo[js.Any] = null,
    onUpdate: js.UndefOr[CallbackTo[js.Any]] = js.undefined
  ): RouterProps = {
    val __obj = js.Dynamic.literal()
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* error */ js.Any) => onError(t0).runNow()))
    onUpdate.foreach(p => __obj.updateDynamic("onUpdate")(p.toJsFn))
    __obj.asInstanceOf[RouterProps]
  }
}

