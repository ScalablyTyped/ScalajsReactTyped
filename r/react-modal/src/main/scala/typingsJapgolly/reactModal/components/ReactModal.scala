package typingsJapgolly.reactModal.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.reactModal.mod.Aria
import typingsJapgolly.reactModal.mod.Classes
import typingsJapgolly.reactModal.mod.OnAfterOpenCallbackOptions
import typingsJapgolly.reactModal.mod.Props
import typingsJapgolly.reactModal.mod.Styles
import typingsJapgolly.reactModal.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactModal {
  def apply(
    isOpen: Boolean,
    appElement: HTMLElement | js.Object = null,
    aria: Aria = null,
    ariaHideApp: js.UndefOr[Boolean] = js.undefined,
    bodyOpenClassName: String = null,
    className: String | Classes = null,
    closeTimeoutMS: Int | Double = null,
    contentLabel: String = null,
    contentRef: /* instance */ HTMLDivElement => Callback = null,
    data: js.Any = null,
    htmlOpenClassName: String = null,
    id: String = null,
    onAfterClose: js.UndefOr[Callback] = js.undefined,
    onAfterOpen: /* obj */ js.UndefOr[OnAfterOpenCallbackOptions] => Callback = null,
    onRequestClose: /* event */ ReactMouseEventFrom[Element] | ReactKeyboardEventFrom[Element] => Callback = null,
    overlayClassName: String | Classes = null,
    overlayRef: /* instance */ HTMLDivElement => Callback = null,
    parentSelector: js.UndefOr[CallbackTo[HTMLElement]] = js.undefined,
    portalClassName: String = null,
    role: String = null,
    shouldCloseOnEsc: js.UndefOr[Boolean] = js.undefined,
    shouldCloseOnOverlayClick: js.UndefOr[Boolean] = js.undefined,
    shouldFocusAfterRender: js.UndefOr[Boolean] = js.undefined,
    shouldReturnFocusAfterClose: js.UndefOr[Boolean] = js.undefined,
    style: Styles = null,
    testId: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, ^, Unit, Props] = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
  
      if (appElement != null) __obj.updateDynamic("appElement")(appElement.asInstanceOf[js.Any])
    if (aria != null) __obj.updateDynamic("aria")(aria.asInstanceOf[js.Any])
    if (!js.isUndefined(ariaHideApp)) __obj.updateDynamic("ariaHideApp")(ariaHideApp.asInstanceOf[js.Any])
    if (bodyOpenClassName != null) __obj.updateDynamic("bodyOpenClassName")(bodyOpenClassName.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (closeTimeoutMS != null) __obj.updateDynamic("closeTimeoutMS")(closeTimeoutMS.asInstanceOf[js.Any])
    if (contentLabel != null) __obj.updateDynamic("contentLabel")(contentLabel.asInstanceOf[js.Any])
    if (contentRef != null) __obj.updateDynamic("contentRef")(js.Any.fromFunction1((t0: /* instance */ org.scalajs.dom.raw.HTMLDivElement) => contentRef(t0).runNow()))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (htmlOpenClassName != null) __obj.updateDynamic("htmlOpenClassName")(htmlOpenClassName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    onAfterClose.foreach(p => __obj.updateDynamic("onAfterClose")(p.toJsFn))
    if (onAfterOpen != null) __obj.updateDynamic("onAfterOpen")(js.Any.fromFunction1((t0: /* obj */ js.UndefOr[typingsJapgolly.reactModal.mod.OnAfterOpenCallbackOptions]) => onAfterOpen(t0).runNow()))
    if (onRequestClose != null) __obj.updateDynamic("onRequestClose")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element] | japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.Element]) => onRequestClose(t0).runNow()))
    if (overlayClassName != null) __obj.updateDynamic("overlayClassName")(overlayClassName.asInstanceOf[js.Any])
    if (overlayRef != null) __obj.updateDynamic("overlayRef")(js.Any.fromFunction1((t0: /* instance */ org.scalajs.dom.raw.HTMLDivElement) => overlayRef(t0).runNow()))
    parentSelector.foreach(p => __obj.updateDynamic("parentSelector")(p.toJsFn))
    if (portalClassName != null) __obj.updateDynamic("portalClassName")(portalClassName.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldCloseOnEsc)) __obj.updateDynamic("shouldCloseOnEsc")(shouldCloseOnEsc.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldCloseOnOverlayClick)) __obj.updateDynamic("shouldCloseOnOverlayClick")(shouldCloseOnOverlayClick.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldFocusAfterRender)) __obj.updateDynamic("shouldFocusAfterRender")(shouldFocusAfterRender.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldReturnFocusAfterClose)) __obj.updateDynamic("shouldReturnFocusAfterClose")(shouldReturnFocusAfterClose.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (testId != null) __obj.updateDynamic("testId")(testId.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactModal.mod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactModal.mod.^](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactModal.mod.Props])(children: _*)
  }
  @JSImport("react-modal", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}

