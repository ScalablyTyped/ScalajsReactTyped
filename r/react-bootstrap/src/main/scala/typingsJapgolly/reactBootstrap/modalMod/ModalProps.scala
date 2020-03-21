package typingsJapgolly.reactBootstrap.modalMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.reactBootstrap.mod.Sizes
import typingsJapgolly.reactBootstrap.mod.TransitionCallbacks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalProps
  extends AllHTMLAttributes[Modal]
     with TransitionCallbacks
     with ClassAttributes[Modal] {
  // Optional
  var animation: js.UndefOr[Boolean] = js.undefined
  var backdrop: js.UndefOr[Boolean | String] = js.undefined
  var backdropClassName: js.UndefOr[String] = js.undefined
  var backdropStyle: js.UndefOr[js.Any] = js.undefined
  var backdropTransitionTimeout: js.UndefOr[Double] = js.undefined
  var bsClass: js.UndefOr[String] = js.undefined
  var bsSize: js.UndefOr[Sizes] = js.undefined
  var container: js.UndefOr[js.Any] = js.undefined
   // TODO: Add more specific type
  var containerClassName: js.UndefOr[String] = js.undefined
  var dialogClassName: js.UndefOr[String] = js.undefined
  var dialogComponent: js.UndefOr[js.Any] = js.undefined
   // TODO: Add more specific type
  var dialogTransitionTimeout: js.UndefOr[Double] = js.undefined
  var enforceFocus: js.UndefOr[Boolean] = js.undefined
  var keyboard: js.UndefOr[Boolean] = js.undefined
  var onBackdropClick: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.undefined
  var onEscapeKeyDown: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.undefined
  /**
    * @deprecated since Sept 25, 2017, use onEscapeKeyDown instead
    **/
  var onEscapeKeyUp: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.undefined
  // Required
  var onHide: js.Function
  var onShow: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.undefined
  var restoreFocus: js.UndefOr[Boolean] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
  var transition: js.UndefOr[Element] = js.undefined
}

object ModalProps {
  @scala.inline
  def apply(
    onHide: js.Function,
    AllHTMLAttributes: AllHTMLAttributes[Modal] = null,
    ClassAttributes: ClassAttributes[Modal] = null,
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
    transition: VdomElement = null
  ): ModalProps = {
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
    __obj.asInstanceOf[ModalProps]
  }
}

