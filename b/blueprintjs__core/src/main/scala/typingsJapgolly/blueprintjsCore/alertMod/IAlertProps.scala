package typingsJapgolly.blueprintjsCore.alertMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.blueprintjsCore.intentMod.Intent
import typingsJapgolly.blueprintjsCore.overlayMod.IOverlayLifecycleProps
import typingsJapgolly.blueprintjsCore.propsMod.IProps
import typingsJapgolly.blueprintjsCore.propsMod.MaybeElement
import typingsJapgolly.blueprintjsIcons.iconNameMod.IconName
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAlertProps
  extends IOverlayLifecycleProps
     with IProps {
  /**
    * Whether pressing <kbd>escape</kbd> when focused on the Alert should cancel the alert.
    * If this prop is enabled, then either `onCancel` or `onClose` must also be defined.
    * @default false
    */
  var canEscapeKeyCancel: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether clicking outside the Alert should cancel the alert.
    * If this prop is enabled, then either `onCancel` or `onClose` must also be defined.
    * @default false
    */
  var canOutsideClickCancel: js.UndefOr[Boolean] = js.undefined
  /**
    * The text for the cancel button.
    * If this prop is defined, then either `onCancel` or `onClose` must also be defined.
    */
  var cancelButtonText: js.UndefOr[String] = js.undefined
  /**
    * The text for the confirm (right-most) button.
    * This button will always appear, and uses the value of the `intent` prop below.
    * @default "OK"
    */
  var confirmButtonText: js.UndefOr[String] = js.undefined
  /** Name of a Blueprint UI icon (or an icon element) to display on the left side. */
  var icon: js.UndefOr[IconName | MaybeElement] = js.undefined
  /**
    * The intent to be applied to the confirm (right-most) button.
    */
  var intent: js.UndefOr[Intent] = js.undefined
  /**
    * Toggles the visibility of the alert.
    * This prop is required because the component is controlled.
    */
  var isOpen: Boolean
  /**
    * Handler invoked when the alert is canceled. Alerts can be **canceled** in the following ways:
    * - clicking the cancel button (if `cancelButtonText` is defined)
    * - pressing the escape key (if `canEscapeKeyCancel` is enabled)
    * - clicking on the overlay backdrop (if `canOutsideClickCancel` is enabled)
    *
    * If any of the `cancel` props are defined, then either `onCancel` or `onClose` must be defined.
    */
  var onCancel: js.UndefOr[js.Function1[/* evt */ js.UndefOr[ReactEventFrom[HTMLElement]], Unit]] = js.undefined
  /**
    * Handler invoked when the Alert is confirmed or canceled; see `onConfirm` and `onCancel` for more details.
    * First argument is `true` if confirmed, `false` otherwise.
    * This is an alternative to defining separate `onConfirm` and `onCancel` handlers.
    */
  var onClose: js.UndefOr[
    js.Function2[/* confirmed */ Boolean, /* evt */ js.UndefOr[ReactEventFrom[HTMLElement]], Unit]
  ] = js.undefined
  /**
    * Handler invoked when the confirm button is clicked. Alerts can be **confirmed** in the following ways:
    * - clicking the confirm button
    * - focusing on the confirm button and pressing `enter` or `space`
    */
  var onConfirm: js.UndefOr[js.Function1[/* evt */ js.UndefOr[ReactEventFrom[HTMLElement]], Unit]] = js.undefined
  /**
    * The container element into which the overlay renders its contents, when `usePortal` is `true`.
    * This prop is ignored if `usePortal` is `false`.
    * @default document.body
    */
  var portalContainer: js.UndefOr[HTMLElement] = js.undefined
  /**
    * CSS styles to apply to the alert.
    */
  var style: js.UndefOr[CSSProperties] = js.undefined
  /**
    * Indicates how long (in milliseconds) the overlay's enter/leave transition takes.
    * This is used by React `CSSTransition` to know when a transition completes and must match
    * the duration of the animation in CSS. Only set this prop if you override Blueprint's default
    * transitions with new transitions of a different length.
    * @default 300
    */
  var transitionDuration: js.UndefOr[Double] = js.undefined
}

object IAlertProps {
  @scala.inline
  def apply(
    isOpen: Boolean,
    canEscapeKeyCancel: js.UndefOr[Boolean] = js.undefined,
    canOutsideClickCancel: js.UndefOr[Boolean] = js.undefined,
    cancelButtonText: String = null,
    className: String = null,
    confirmButtonText: String = null,
    icon: IconName | MaybeElement = null,
    intent: Intent = null,
    onCancel: /* evt */ js.UndefOr[ReactEventFrom[HTMLElement]] => Callback = null,
    onClose: (/* confirmed */ Boolean, /* evt */ js.UndefOr[ReactEventFrom[HTMLElement]]) => Callback = null,
    onClosed: /* node */ HTMLElement => Callback = null,
    onClosing: /* node */ HTMLElement => Callback = null,
    onConfirm: /* evt */ js.UndefOr[ReactEventFrom[HTMLElement]] => Callback = null,
    onOpened: /* node */ HTMLElement => Callback = null,
    onOpening: /* node */ HTMLElement => Callback = null,
    portalContainer: HTMLElement = null,
    style: CSSProperties = null,
    transitionDuration: Int | Double = null
  ): IAlertProps = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(canEscapeKeyCancel)) __obj.updateDynamic("canEscapeKeyCancel")(canEscapeKeyCancel.asInstanceOf[js.Any])
    if (!js.isUndefined(canOutsideClickCancel)) __obj.updateDynamic("canOutsideClickCancel")(canOutsideClickCancel.asInstanceOf[js.Any])
    if (cancelButtonText != null) __obj.updateDynamic("cancelButtonText")(cancelButtonText.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (confirmButtonText != null) __obj.updateDynamic("confirmButtonText")(confirmButtonText.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction1((t0: /* evt */ js.UndefOr[japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]]) => onCancel(t0).runNow()))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction2((t0: /* confirmed */ scala.Boolean, t1: /* evt */ js.UndefOr[japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]]) => onClose(t0, t1).runNow()))
    if (onClosed != null) __obj.updateDynamic("onClosed")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onClosed(t0).runNow()))
    if (onClosing != null) __obj.updateDynamic("onClosing")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onClosing(t0).runNow()))
    if (onConfirm != null) __obj.updateDynamic("onConfirm")(js.Any.fromFunction1((t0: /* evt */ js.UndefOr[japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]]) => onConfirm(t0).runNow()))
    if (onOpened != null) __obj.updateDynamic("onOpened")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onOpened(t0).runNow()))
    if (onOpening != null) __obj.updateDynamic("onOpening")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onOpening(t0).runNow()))
    if (portalContainer != null) __obj.updateDynamic("portalContainer")(portalContainer.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAlertProps]
  }
}

