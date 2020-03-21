package typingsJapgolly.blueprintjsCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.blueprintjsCore.alertMod.IAlertProps
import typingsJapgolly.blueprintjsCore.intentMod.Intent
import typingsJapgolly.blueprintjsCore.propsMod.MaybeElement
import typingsJapgolly.blueprintjsIcons.iconNameMod.IconName
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Alert {
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
    transitionDuration: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[IAlertProps, typingsJapgolly.blueprintjsCore.mod.Alert, Unit, IAlertProps] = {
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsCore.alertMod.IAlertProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsCore.mod.Alert](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsCore.alertMod.IAlertProps])(children: _*)
  }
  @JSImport("@blueprintjs/core", "Alert")
  @js.native
  object componentImport extends js.Object
  
}

