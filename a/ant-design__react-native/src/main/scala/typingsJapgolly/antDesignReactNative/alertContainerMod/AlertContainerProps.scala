package typingsJapgolly.antDesignReactNative.alertContainerMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antDesignReactNative.modalPropsTypeMod.Action
import typingsJapgolly.antDesignReactNative.modalPropsTypeMod.CallbackOnBackHandler
import typingsJapgolly.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertContainerProps extends js.Object {
  var actions: js.Array[Action[TextStyle]]
  var content: Node
  var onAnimationEnd: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
  var onBackHandler: js.UndefOr[CallbackOnBackHandler] = js.undefined
  var title: Node
}

object AlertContainerProps {
  @scala.inline
  def apply(
    actions: js.Array[Action[TextStyle]],
    content: VdomNode = null,
    onAnimationEnd: /* visible */ Boolean => Callback = null,
    onBackHandler: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    title: VdomNode = null
  ): AlertContainerProps = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.rawNode.asInstanceOf[js.Any])
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1((t0: /* visible */ scala.Boolean) => onAnimationEnd(t0).runNow()))
    onBackHandler.foreach(p => __obj.updateDynamic("onBackHandler")(p.toJsFn))
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertContainerProps]
  }
}

