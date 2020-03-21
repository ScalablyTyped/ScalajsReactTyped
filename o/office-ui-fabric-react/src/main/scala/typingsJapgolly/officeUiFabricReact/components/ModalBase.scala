package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.officeUiFabricReact.layerTypesMod.ILayerProps
import typingsJapgolly.officeUiFabricReact.modalTypesMod.IDragOptions
import typingsJapgolly.officeUiFabricReact.modalTypesMod.IModal
import typingsJapgolly.officeUiFabricReact.modalTypesMod.IModalProps
import typingsJapgolly.officeUiFabricReact.modalTypesMod.IModalStyleProps
import typingsJapgolly.officeUiFabricReact.modalTypesMod.IModalStyles
import typingsJapgolly.officeUiFabricReact.overlayTypesMod.IOverlayProps
import typingsJapgolly.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ModalBase {
  def apply(
    allowTouchBodyScroll: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    closeButtonAriaLabel: String = null,
    componentRef: IRefObject[IModal] = null,
    containerClassName: String = null,
    dragOptions: IDragOptions = null,
    elementToFocusOnDismiss: HTMLElement = null,
    firstFocusableSelector: String | js.Function0[String] = null,
    forceFocusInsideTrap: js.UndefOr[Boolean] = js.undefined,
    ignoreExternalFocusing: js.UndefOr[Boolean] = js.undefined,
    isBlocking: js.UndefOr[Boolean] = js.undefined,
    isClickableOutsideFocusTrap: js.UndefOr[Boolean] = js.undefined,
    isDarkOverlay: js.UndefOr[Boolean] = js.undefined,
    isModeless: js.UndefOr[Boolean] = js.undefined,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    layerProps: ILayerProps = null,
    onDismiss: /* ev */ js.UndefOr[ReactMouseEventFrom[HTMLButtonElement]] => CallbackTo[js.Any] = null,
    onDismissed: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    onLayerDidMount: js.UndefOr[Callback] = js.undefined,
    overlay: IOverlayProps = null,
    responsiveMode: ResponsiveMode = null,
    scrollableContentClassName: String = null,
    styles: IStyleFunctionOrObject[IModalStyleProps, IModalStyles] = null,
    subtitleAriaId: String = null,
    theme: ITheme = null,
    titleAriaId: String = null,
    topOffsetFixed: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[IModalProps, typingsJapgolly.officeUiFabricReact.mod.ModalBase, Unit, IModalProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(allowTouchBodyScroll)) __obj.updateDynamic("allowTouchBodyScroll")(allowTouchBodyScroll.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (closeButtonAriaLabel != null) __obj.updateDynamic("closeButtonAriaLabel")(closeButtonAriaLabel.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (containerClassName != null) __obj.updateDynamic("containerClassName")(containerClassName.asInstanceOf[js.Any])
    if (dragOptions != null) __obj.updateDynamic("dragOptions")(dragOptions.asInstanceOf[js.Any])
    if (elementToFocusOnDismiss != null) __obj.updateDynamic("elementToFocusOnDismiss")(elementToFocusOnDismiss.asInstanceOf[js.Any])
    if (firstFocusableSelector != null) __obj.updateDynamic("firstFocusableSelector")(firstFocusableSelector.asInstanceOf[js.Any])
    if (!js.isUndefined(forceFocusInsideTrap)) __obj.updateDynamic("forceFocusInsideTrap")(forceFocusInsideTrap.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreExternalFocusing)) __obj.updateDynamic("ignoreExternalFocusing")(ignoreExternalFocusing.asInstanceOf[js.Any])
    if (!js.isUndefined(isBlocking)) __obj.updateDynamic("isBlocking")(isBlocking.asInstanceOf[js.Any])
    if (!js.isUndefined(isClickableOutsideFocusTrap)) __obj.updateDynamic("isClickableOutsideFocusTrap")(isClickableOutsideFocusTrap.asInstanceOf[js.Any])
    if (!js.isUndefined(isDarkOverlay)) __obj.updateDynamic("isDarkOverlay")(isDarkOverlay.asInstanceOf[js.Any])
    if (!js.isUndefined(isModeless)) __obj.updateDynamic("isModeless")(isModeless.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (layerProps != null) __obj.updateDynamic("layerProps")(layerProps.asInstanceOf[js.Any])
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction1((t0: /* ev */ js.UndefOr[
  japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLButtonElement]]) => onDismiss(t0).runNow()))
    onDismissed.foreach(p => __obj.updateDynamic("onDismissed")(p.toJsFn))
    onLayerDidMount.foreach(p => __obj.updateDynamic("onLayerDidMount")(p.toJsFn))
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (responsiveMode != null) __obj.updateDynamic("responsiveMode")(responsiveMode.asInstanceOf[js.Any])
    if (scrollableContentClassName != null) __obj.updateDynamic("scrollableContentClassName")(scrollableContentClassName.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (subtitleAriaId != null) __obj.updateDynamic("subtitleAriaId")(subtitleAriaId.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (titleAriaId != null) __obj.updateDynamic("titleAriaId")(titleAriaId.asInstanceOf[js.Any])
    if (!js.isUndefined(topOffsetFixed)) __obj.updateDynamic("topOffsetFixed")(topOffsetFixed.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.modalTypesMod.IModalProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.officeUiFabricReact.mod.ModalBase](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.modalTypesMod.IModalProps])(children: _*)
  }
  @JSImport("office-ui-fabric-react", "ModalBase")
  @js.native
  object componentImport extends js.Object
  
}

