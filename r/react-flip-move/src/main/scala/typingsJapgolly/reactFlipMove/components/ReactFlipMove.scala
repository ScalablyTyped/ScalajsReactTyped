package typingsJapgolly.reactFlipMove.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.ClientRect
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.reactFlipMove.mod.FlipMove.AnimationProp
import typingsJapgolly.reactFlipMove.mod.FlipMove.FlipMoveProps
import typingsJapgolly.reactFlipMove.mod.FlipMove.Styles
import typingsJapgolly.reactFlipMove.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactFlipMove {
  def apply(
    appearAnimation: AnimationProp = null,
    className: String = null,
    delay: Double | String = null,
    disableAllAnimations: js.UndefOr[Boolean] = js.undefined,
    duration: Double | String = null,
    easing: String = null,
    enterAnimation: AnimationProp = null,
    getPosition: /* node */ HTMLElement => CallbackTo[ClientRect] = null,
    leaveAnimation: AnimationProp = null,
    maintainContainerHeight: js.UndefOr[Boolean] = js.undefined,
    onFinish: (/* childElement */ Element, /* domNode */ HTMLElement) => Callback = null,
    onFinishAll: (/* childElements */ js.Array[Element], /* domNodes */ js.Array[HTMLElement]) => Callback = null,
    onStart: (/* childElement */ Element, /* domNode */ HTMLElement) => Callback = null,
    onStartAll: (/* childElements */ js.Array[Element], /* domNodes */ js.Array[HTMLElement]) => Callback = null,
    staggerDelayBy: Double | String = null,
    staggerDurationBy: Double | String = null,
    style: Styles = null,
    typeName: String = null,
    verticalAlignment: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[FlipMoveProps, default, Unit, FlipMoveProps] = {
    val __obj = js.Dynamic.literal()
  
      if (appearAnimation != null) __obj.updateDynamic("appearAnimation")(appearAnimation.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAllAnimations)) __obj.updateDynamic("disableAllAnimations")(disableAllAnimations.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (enterAnimation != null) __obj.updateDynamic("enterAnimation")(enterAnimation.asInstanceOf[js.Any])
    if (getPosition != null) __obj.updateDynamic("getPosition")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => getPosition(t0).runNow()))
    if (leaveAnimation != null) __obj.updateDynamic("leaveAnimation")(leaveAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(maintainContainerHeight)) __obj.updateDynamic("maintainContainerHeight")(maintainContainerHeight.asInstanceOf[js.Any])
    if (onFinish != null) __obj.updateDynamic("onFinish")(js.Any.fromFunction2((t0: /* childElement */ japgolly.scalajs.react.raw.React.Element, t1: /* domNode */ org.scalajs.dom.raw.HTMLElement) => onFinish(t0, t1).runNow()))
    if (onFinishAll != null) __obj.updateDynamic("onFinishAll")(js.Any.fromFunction2((t0: /* childElements */ js.Array[japgolly.scalajs.react.raw.React.Element], t1: /* domNodes */ js.Array[org.scalajs.dom.raw.HTMLElement]) => onFinishAll(t0, t1).runNow()))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction2((t0: /* childElement */ japgolly.scalajs.react.raw.React.Element, t1: /* domNode */ org.scalajs.dom.raw.HTMLElement) => onStart(t0, t1).runNow()))
    if (onStartAll != null) __obj.updateDynamic("onStartAll")(js.Any.fromFunction2((t0: /* childElements */ js.Array[japgolly.scalajs.react.raw.React.Element], t1: /* domNodes */ js.Array[org.scalajs.dom.raw.HTMLElement]) => onStartAll(t0, t1).runNow()))
    if (staggerDelayBy != null) __obj.updateDynamic("staggerDelayBy")(staggerDelayBy.asInstanceOf[js.Any])
    if (staggerDurationBy != null) __obj.updateDynamic("staggerDurationBy")(staggerDurationBy.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (typeName != null) __obj.updateDynamic("typeName")(typeName.asInstanceOf[js.Any])
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactFlipMove.mod.FlipMove.FlipMoveProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactFlipMove.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactFlipMove.mod.FlipMove.FlipMoveProps])(children: _*)
  }
  @JSImport("react-flip-move", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

