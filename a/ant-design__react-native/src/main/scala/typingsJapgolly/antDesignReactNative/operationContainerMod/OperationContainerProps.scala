package typingsJapgolly.antDesignReactNative.operationContainerMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.antDesignReactNative.modalPropsTypeMod.Action
import typingsJapgolly.antDesignReactNative.modalPropsTypeMod.CallbackOnBackHandler
import typingsJapgolly.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationContainerProps extends js.Object {
  var actions: js.Array[Action[TextStyle]]
  var onAnimationEnd: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
  var onBackHandler: js.UndefOr[CallbackOnBackHandler] = js.undefined
}

object OperationContainerProps {
  @scala.inline
  def apply(
    actions: js.Array[Action[TextStyle]],
    onAnimationEnd: /* visible */ Boolean => Callback = null,
    onBackHandler: js.UndefOr[CallbackTo[Boolean]] = js.undefined
  ): OperationContainerProps = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1((t0: /* visible */ scala.Boolean) => onAnimationEnd(t0).runNow()))
    onBackHandler.foreach(p => __obj.updateDynamic("onBackHandler")(p.toJsFn))
    __obj.asInstanceOf[OperationContainerProps]
  }
}

