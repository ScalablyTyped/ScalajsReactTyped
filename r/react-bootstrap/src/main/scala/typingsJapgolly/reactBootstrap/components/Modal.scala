package typingsJapgolly.reactBootstrap.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.reactBootstrap.mod.Sizes
import typingsJapgolly.reactBootstrap.mod.TransitionCallbacks
import typingsJapgolly.reactBootstrap.modalMod.ModalProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Modal {
  def apply(
    onHide: js.Function,
    AllHTMLAttributes: AllHTMLAttributes[typingsJapgolly.reactBootstrap.modalMod.Modal] = null,
    ClassAttributes: ClassAttributes[typingsJapgolly.reactBootstrap.modalMod.Modal] = null,
    TransitionCallbacks: TransitionCallbacks = null,
    animation: js.UndefOr[Boolean] = js.undefined,
    backdrop: Boolean | String = null,
    backdropClassName: String = null,
    backdropStyle: js.Any = null,
    backdropTransitionTimeout: Int | Double = null,
    bsClass: String = null,
    bsSize: Sizes = null,
    container: js.Any = null,
    containerClassName: String = null,
    dialogClassName: String = null,
    dialogComponent: js.Any = null,
    dialogTransitionTimeout: Int | Double = null,
    enforceFocus: js.UndefOr[Boolean] = js.undefined,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    onBackdropClick: /* node */ HTMLElement => CallbackTo[js.Any] = null,
    onEscapeKeyDown: /* node */ HTMLElement => CallbackTo[js.Any] = null,
    onEscapeKeyUp: /* node */ HTMLElement => CallbackTo[js.Any] = null,
    onShow: /* node */ HTMLElement => CallbackTo[js.Any] = null,
    restoreFocus: js.UndefOr[Boolean] = js.undefined,
    show: js.UndefOr[Boolean] = js.undefined,
    transition: VdomElement = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ModalProps, typingsJapgolly.reactBootstrap.mod.Modal, Unit, ModalProps] = {
    val __obj = js.Dynamic.literal(onHide = onHide.asInstanceOf[js.Any])
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (TransitionCallbacks != null) js.Dynamic.global.Object.assign(__obj, TransitionCallbacks)
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (backdrop != null) __obj.updateDynamic("backdrop")(backdrop.asInstanceOf[js.Any])
    if (backdropClassName != null) __obj.updateDynamic("backdropClassName")(backdropClassName.asInstanceOf[js.Any])
    if (backdropStyle != null) __obj.updateDynamic("backdropStyle")(backdropStyle.asInstanceOf[js.Any])
    if (backdropTransitionTimeout != null) __obj.updateDynamic("backdropTransitionTimeout")(backdropTransitionTimeout.asInstanceOf[js.Any])
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass.asInstanceOf[js.Any])
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (containerClassName != null) __obj.updateDynamic("containerClassName")(containerClassName.asInstanceOf[js.Any])
    if (dialogClassName != null) __obj.updateDynamic("dialogClassName")(dialogClassName.asInstanceOf[js.Any])
    if (dialogComponent != null) __obj.updateDynamic("dialogComponent")(dialogComponent.asInstanceOf[js.Any])
    if (dialogTransitionTimeout != null) __obj.updateDynamic("dialogTransitionTimeout")(dialogTransitionTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(enforceFocus)) __obj.updateDynamic("enforceFocus")(enforceFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard.asInstanceOf[js.Any])
    if (onBackdropClick != null) __obj.updateDynamic("onBackdropClick")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onBackdropClick(t0).runNow()))
    if (onEscapeKeyDown != null) __obj.updateDynamic("onEscapeKeyDown")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onEscapeKeyDown(t0).runNow()))
    if (onEscapeKeyUp != null) __obj.updateDynamic("onEscapeKeyUp")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onEscapeKeyUp(t0).runNow()))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onShow(t0).runNow()))
    if (!js.isUndefined(restoreFocus)) __obj.updateDynamic("restoreFocus")(restoreFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.rawElement.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactBootstrap.modalMod.ModalProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactBootstrap.mod.Modal](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactBootstrap.modalMod.ModalProps])(children: _*)
  }
  @JSImport("react-bootstrap", "Modal")
  @js.native
  object componentImport extends js.Object
  
}

