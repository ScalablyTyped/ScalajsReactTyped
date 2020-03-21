package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.officeUiFabricReact.buttonTypesMod.IButtonProps
import typingsJapgolly.officeUiFabricReact.dialogContentTypesMod.DialogType
import typingsJapgolly.officeUiFabricReact.dialogContentTypesMod.IDialogContentProps
import typingsJapgolly.officeUiFabricReact.dialogTypesMod.IDialog
import typingsJapgolly.officeUiFabricReact.dialogTypesMod.IDialogProps
import typingsJapgolly.officeUiFabricReact.dialogTypesMod.IDialogStyleProps
import typingsJapgolly.officeUiFabricReact.dialogTypesMod.IDialogStyles
import typingsJapgolly.officeUiFabricReact.modalTypesMod.IModalProps
import typingsJapgolly.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode
import typingsJapgolly.uifabricMergeStyles.irawstylebaseMod.ICSSPixelUnitRule
import typingsJapgolly.uifabricMergeStyles.irawstylebaseMod.ICSSRule
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DialogBase {
  def apply(
    ariaDescribedById: String = null,
    ariaLabelledById: String = null,
    className: String = null,
    closeButtonAriaLabel: String = null,
    componentRef: IRefObject[IDialog] = null,
    containerClassName: String = null,
    contentClassName: String = null,
    dialogContentProps: IDialogContentProps = null,
    elementToFocusOnDismiss: HTMLElement = null,
    firstFocusableSelector: String | js.Function0[String] = null,
    forceFocusInsideTrap: js.UndefOr[Boolean] = js.undefined,
    hidden: js.UndefOr[Boolean] = js.undefined,
    ignoreExternalFocusing: js.UndefOr[Boolean] = js.undefined,
    isBlocking: js.UndefOr[Boolean] = js.undefined,
    isClickableOutsideFocusTrap: js.UndefOr[Boolean] = js.undefined,
    isDarkOverlay: js.UndefOr[Boolean] = js.undefined,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    maxWidth: ICSSRule | ICSSPixelUnitRule = null,
    minWidth: ICSSRule | ICSSPixelUnitRule = null,
    modalProps: IModalProps = null,
    onDismiss: /* ev */ js.UndefOr[ReactMouseEventFrom[HTMLButtonElement]] => CallbackTo[js.Any] = null,
    onDismissed: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    onLayerDidMount: js.UndefOr[Callback] = js.undefined,
    onLayerMounted: js.UndefOr[Callback] = js.undefined,
    responsiveMode: ResponsiveMode = null,
    styles: IStyleFunctionOrObject[IDialogStyleProps, IDialogStyles] = null,
    subText: String = null,
    theme: ITheme = null,
    title: String | Element = null,
    topButtonsProps: js.Array[IButtonProps] = null,
    `type`: DialogType = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[IDialogProps, typingsJapgolly.officeUiFabricReact.mod.DialogBase, Unit, IDialogProps] = {
    val __obj = js.Dynamic.literal()
  
      if (ariaDescribedById != null) __obj.updateDynamic("ariaDescribedById")(ariaDescribedById.asInstanceOf[js.Any])
    if (ariaLabelledById != null) __obj.updateDynamic("ariaLabelledById")(ariaLabelledById.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (closeButtonAriaLabel != null) __obj.updateDynamic("closeButtonAriaLabel")(closeButtonAriaLabel.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (containerClassName != null) __obj.updateDynamic("containerClassName")(containerClassName.asInstanceOf[js.Any])
    if (contentClassName != null) __obj.updateDynamic("contentClassName")(contentClassName.asInstanceOf[js.Any])
    if (dialogContentProps != null) __obj.updateDynamic("dialogContentProps")(dialogContentProps.asInstanceOf[js.Any])
    if (elementToFocusOnDismiss != null) __obj.updateDynamic("elementToFocusOnDismiss")(elementToFocusOnDismiss.asInstanceOf[js.Any])
    if (firstFocusableSelector != null) __obj.updateDynamic("firstFocusableSelector")(firstFocusableSelector.asInstanceOf[js.Any])
    if (!js.isUndefined(forceFocusInsideTrap)) __obj.updateDynamic("forceFocusInsideTrap")(forceFocusInsideTrap.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreExternalFocusing)) __obj.updateDynamic("ignoreExternalFocusing")(ignoreExternalFocusing.asInstanceOf[js.Any])
    if (!js.isUndefined(isBlocking)) __obj.updateDynamic("isBlocking")(isBlocking.asInstanceOf[js.Any])
    if (!js.isUndefined(isClickableOutsideFocusTrap)) __obj.updateDynamic("isClickableOutsideFocusTrap")(isClickableOutsideFocusTrap.asInstanceOf[js.Any])
    if (!js.isUndefined(isDarkOverlay)) __obj.updateDynamic("isDarkOverlay")(isDarkOverlay.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (modalProps != null) __obj.updateDynamic("modalProps")(modalProps.asInstanceOf[js.Any])
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction1((t0: /* ev */ js.UndefOr[
  japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLButtonElement]]) => onDismiss(t0).runNow()))
    onDismissed.foreach(p => __obj.updateDynamic("onDismissed")(p.toJsFn))
    onLayerDidMount.foreach(p => __obj.updateDynamic("onLayerDidMount")(p.toJsFn))
    onLayerMounted.foreach(p => __obj.updateDynamic("onLayerMounted")(p.toJsFn))
    if (responsiveMode != null) __obj.updateDynamic("responsiveMode")(responsiveMode.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (subText != null) __obj.updateDynamic("subText")(subText.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (topButtonsProps != null) __obj.updateDynamic("topButtonsProps")(topButtonsProps.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.dialogTypesMod.IDialogProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.officeUiFabricReact.mod.DialogBase](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.dialogTypesMod.IDialogProps])(children: _*)
  }
  @JSImport("office-ui-fabric-react", "DialogBase")
  @js.native
  object componentImport extends js.Object
  
}

