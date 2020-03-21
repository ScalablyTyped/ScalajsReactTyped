package typingsJapgolly.officeUiFabricReact.dialogContentTypesMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Element
import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.officeUiFabricReact.buttonTypesMod.IButtonProps
import typingsJapgolly.officeUiFabricReact.dialogContentBaseMod.DialogContentBase
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDialogContentProps extends ClassAttributes[DialogContentBase] {
  /**
    * Optional override class name
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Label to be passed to to aria-label of close button
    * @defaultvalue Close
    */
  var closeButtonAriaLabel: js.UndefOr[String] = js.undefined
  /**
    * Optional callback to access the IDialogContent interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IDialogContent]] = js.undefined
  /**
    * The classname for when the header is draggable
    */
  var draggableHeaderClassName: js.UndefOr[String] = js.undefined
  /**
    * Is inside a multiline wrapper
    */
  var isMultiline: js.UndefOr[Boolean] = js.undefined
  /**
    * A callback function for when the Dialog is dismissed from the close button or light dismiss, before the animation completes.
    */
  var onDismiss: js.UndefOr[js.Function1[/* ev */ js.UndefOr[ReactMouseEventFrom[HTMLButtonElement]], _]] = js.undefined
  /**
    * Responsive mode passed in from decorator.
    */
  var responsiveMode: js.UndefOr[typingsJapgolly.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode] = js.undefined
  /**
    * Show an 'x' close button in the upper-right corner
    */
  var showCloseButton: js.UndefOr[Boolean] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IDialogContentStyleProps, IDialogContentStyles]] = js.undefined
  /**
    * The subtext to display in the dialog
    */
  var subText: js.UndefOr[String] = js.undefined
  /**
    * The Id for subText container
    */
  var subTextId: js.UndefOr[String] = js.undefined
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
  /**
    * The title text to display at the top of the dialog.
    */
  var title: js.UndefOr[String | Element] = js.undefined
  /**
    * The Id for title container
    *
    * @deprecated use the `id` attribute in `titleProps` instead.
    */
  var titleId: js.UndefOr[String] = js.undefined
  /**
    * The props for title container.
    */
  var titleProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.undefined
  /**
    * Other top buttons that will show up next to the close button
    */
  var topButtonsProps: js.UndefOr[js.Array[IButtonProps]] = js.undefined
  /**
    * The type of Dialog to display.
    * @defaultvalue DialogType.normal
    */
  var `type`: js.UndefOr[DialogType] = js.undefined
}

object IDialogContentProps {
  @scala.inline
  def apply(
    className: String = null,
    closeButtonAriaLabel: String = null,
    componentRef: IRefObject[IDialogContent] = null,
    draggableHeaderClassName: String = null,
    isMultiline: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    onDismiss: /* ev */ js.UndefOr[ReactMouseEventFrom[HTMLButtonElement]] => CallbackTo[js.Any] = null,
    ref: LegacyRef[DialogContentBase] = null,
    responsiveMode: typingsJapgolly.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode = null,
    showCloseButton: js.UndefOr[Boolean] = js.undefined,
    styles: IStyleFunctionOrObject[IDialogContentStyleProps, IDialogContentStyles] = null,
    subText: String = null,
    subTextId: String = null,
    theme: ITheme = null,
    title: String | Element = null,
    titleId: String = null,
    titleProps: HTMLAttributes[HTMLDivElement] = null,
    topButtonsProps: js.Array[IButtonProps] = null,
    `type`: DialogType = null
  ): IDialogContentProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (closeButtonAriaLabel != null) __obj.updateDynamic("closeButtonAriaLabel")(closeButtonAriaLabel.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (draggableHeaderClassName != null) __obj.updateDynamic("draggableHeaderClassName")(draggableHeaderClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(isMultiline)) __obj.updateDynamic("isMultiline")(isMultiline.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction1((t0: /* ev */ js.UndefOr[
  japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLButtonElement]]) => onDismiss(t0).runNow()))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (responsiveMode != null) __obj.updateDynamic("responsiveMode")(responsiveMode.asInstanceOf[js.Any])
    if (!js.isUndefined(showCloseButton)) __obj.updateDynamic("showCloseButton")(showCloseButton.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (subText != null) __obj.updateDynamic("subText")(subText.asInstanceOf[js.Any])
    if (subTextId != null) __obj.updateDynamic("subTextId")(subTextId.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleId != null) __obj.updateDynamic("titleId")(titleId.asInstanceOf[js.Any])
    if (titleProps != null) __obj.updateDynamic("titleProps")(titleProps.asInstanceOf[js.Any])
    if (topButtonsProps != null) __obj.updateDynamic("topButtonsProps")(topButtonsProps.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDialogContentProps]
  }
}

