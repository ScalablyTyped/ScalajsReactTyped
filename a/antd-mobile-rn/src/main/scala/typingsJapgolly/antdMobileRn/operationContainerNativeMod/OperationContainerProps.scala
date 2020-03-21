package typingsJapgolly.antdMobileRn.operationContainerNativeMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.antdMobileRn.modalPropsTypeMod.Action
import typingsJapgolly.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationContainerProps extends js.Object {
  var actions: js.Array[Action[TextStyle]]
  var onAnimationEnd: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
}

object OperationContainerProps {
  @scala.inline
  def apply(actions: js.Array[Action[TextStyle]], onAnimationEnd: /* visible */ Boolean => Callback = null): OperationContainerProps = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1((t0: /* visible */ scala.Boolean) => onAnimationEnd(t0).runNow()))
    __obj.asInstanceOf[OperationContainerProps]
  }
}

