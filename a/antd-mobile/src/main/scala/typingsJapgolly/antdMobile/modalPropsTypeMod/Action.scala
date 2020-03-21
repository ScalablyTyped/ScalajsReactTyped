package typingsJapgolly.antdMobile.modalPropsTypeMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action[T] extends js.Object {
  var onPress: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit | js.Promise[_]]] = js.undefined
  var style: js.UndefOr[T | String] = js.undefined
  var text: String
}

object Action {
  @scala.inline
  def apply[T](
    text: String,
    onPress: /* repeated */ js.Any => CallbackTo[Unit | js.Promise[js.Any]] = null,
    style: T | String = null
  ): Action[T] = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onPress(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action[T]]
  }
}

