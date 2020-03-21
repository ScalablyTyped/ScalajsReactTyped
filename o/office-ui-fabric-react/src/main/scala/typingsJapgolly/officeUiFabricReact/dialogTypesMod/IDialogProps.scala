package typingsJapgolly.officeUiFabricReact.dialogTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Element
import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.officeUiFabricReact.buttonTypesMod.IButtonProps
import typingsJapgolly.officeUiFabricReact.dialogBaseMod.DialogBase
import typingsJapgolly.officeUiFabricReact.dialogContentTypesMod.DialogType
import typingsJapgolly.officeUiFabricReact.dialogContentTypesMod.IDialogContentProps
import typingsJapgolly.officeUiFabricReact.iaccessiblepopuppropsMod.IAccessiblePopupProps
import typingsJapgolly.officeUiFabricReact.modalTypesMod.IModalProps
import typingsJapgolly.officeUiFabricReact.withResponsiveModeMod.IWithResponsiveModeState
import typingsJapgolly.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.uifabricMergeStyles.irawstylebaseMod.ICSSPixelUnitRule
import typingsJapgolly.uifabricMergeStyles.irawstylebaseMod.ICSSRule
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDialogProps
  extends ClassAttributes[DialogBase]
     with IWithResponsiveModeState
     with IAccessiblePopupProps {
  /**
    * Optional id for aria-DescribedBy
    * @deprecated Pass through via `modalProps.subtitleAriaId` instead.
    */
  var ariaDescribedById: js.UndefOr[String] = js.undefined
  /**
    * Optional id for aria-LabelledBy
    * @deprecated Pass through via `modalProps.titleAriaId` instead.
    */
  var ariaLabelledById: js.UndefOr[String] = js.undefined
  /**
    * Optional class name to be added to the root class
    * @deprecated Pass through via `modalProps.className` instead
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Optional callback to access the IDialog interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    * @deprecated Unused, returns no value
    */
  var componentRef: js.UndefOr[IRefObject[IDialog]] = js.undefined
  /**
    * Optional override for container class
    * @deprecated Pass through via `modalProps.className` instead
    */
  var containerClassName: js.UndefOr[String] = js.undefined
  /**
    * Optional override content class
    * @deprecated Pass through via `dialogContentProps` instead as `className`.
    */
  var contentClassName: js.UndefOr[String] = js.undefined
  /**
    * Props to be passed through to Dialog Content
    */
  var dialogContentProps: js.UndefOr[IDialogContentProps] = js.undefined
  /**
    * Whether the dialog is hidden.
    * @defaultvalue true
    */
  var hidden: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the dialog can be light dismissed by clicking outside the dialog (on the overlay).
    * @defaultvalue false
    * @deprecated Pass through via `modalProps` instead
    */
  var isBlocking: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the overlay is dark themed.
    * @defaultvalue true
    * @deprecated Pass through via `modalProps` instead
    */
  var isDarkOverlay: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the dialog is displayed.
    * Deprecated, use `hidden` instead.
    * @defaultvalue false
    * @deprecated Use `hidden` instead
    */
  var isOpen: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the maximum width for the dialog. It limits the width property to be larger
    * than the value specified in max-width.
    */
  var maxWidth: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.undefined
  /**
    * Sets the minimum width of the dialog. It limits the width property to be not
    * smaller than the value specified in min-width.
    */
  var minWidth: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.undefined
  /**
    * Props to be passed through to Modal
    */
  var modalProps: js.UndefOr[IModalProps] = js.undefined
  /**
    * A callback function for when the Dialog is dismissed from the close button or light dismiss.
    * Can also be specified separately in content and modal.
    */
  var onDismiss: js.UndefOr[js.Function1[/* ev */ js.UndefOr[ReactMouseEventFrom[HTMLButtonElement]], _]] = js.undefined
  /**
    * A callback function which is called after the Dialog is dismissed and the animation is complete.
    * @deprecated Pass through via `modalProps` instead
    */
  var onDismissed: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * A callback function for when the Dialog content is mounted on the overlay layer
    * @deprecated Pass through via `modalProps.layerProps` instead
    */
  var onLayerDidMount: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Deprecated at 0.81.2, use `onLayerDidMount` instead.
    * @deprecated Use `onLayerDidMount` instead.
    */
  var onLayerMounted: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IDialogStyleProps, IDialogStyles]] = js.undefined
  /**
    * The subtext to display in the dialog.
    * @deprecated Pass through via `dialogContentProps` instead.
    */
  var subText: js.UndefOr[String] = js.undefined
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
  /**
    * The title text to display at the top of the dialog.
    * @deprecated Pass through via `dialogContentProps` instead.
    */
  var title: js.UndefOr[String | Element] = js.undefined
  /**
    * Other top buttons that will show up next to the close button
    * @deprecated Pass through via `dialogContentProps` instead.
    */
  var topButtonsProps: js.UndefOr[js.Array[IButtonProps]] = js.undefined
  /**
    * The type of Dialog to display.
    * @defaultvalue DialogType.normal
    * @deprecated Pass through via `dialogContentProps` instead.
    */
  var `type`: js.UndefOr[DialogType] = js.undefined
}

object IDialogProps {
  @scala.inline
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
    key: Key = null,
    maxWidth: ICSSRule | ICSSPixelUnitRule = null,
    minWidth: ICSSRule | ICSSPixelUnitRule = null,
    modalProps: IModalProps = null,
    onDismiss: /* ev */ js.UndefOr[ReactMouseEventFrom[HTMLButtonElement]] => CallbackTo[js.Any] = null,
    onDismissed: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    onLayerDidMount: js.UndefOr[Callback] = js.undefined,
    onLayerMounted: js.UndefOr[Callback] = js.undefined,
    ref: LegacyRef[DialogBase] = null,
    responsiveMode: ResponsiveMode = null,
    styles: IStyleFunctionOrObject[IDialogStyleProps, IDialogStyles] = null,
    subText: String = null,
    theme: ITheme = null,
    title: String | Element = null,
    topButtonsProps: js.Array[IButtonProps] = null,
    `type`: DialogType = null
  ): IDialogProps = {
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
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (modalProps != null) __obj.updateDynamic("modalProps")(modalProps.asInstanceOf[js.Any])
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction1((t0: /* ev */ js.UndefOr[
  japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLButtonElement]]) => onDismiss(t0).runNow()))
    onDismissed.foreach(p => __obj.updateDynamic("onDismissed")(p.toJsFn))
    onLayerDidMount.foreach(p => __obj.updateDynamic("onLayerDidMount")(p.toJsFn))
    onLayerMounted.foreach(p => __obj.updateDynamic("onLayerMounted")(p.toJsFn))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (responsiveMode != null) __obj.updateDynamic("responsiveMode")(responsiveMode.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (subText != null) __obj.updateDynamic("subText")(subText.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (topButtonsProps != null) __obj.updateDynamic("topButtonsProps")(topButtonsProps.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDialogProps]
  }
}

