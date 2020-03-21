package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.officeUiFabricReact.buttonTypesMod.IButtonProps
import typingsJapgolly.officeUiFabricReact.dialogContentTypesMod.DialogType
import typingsJapgolly.officeUiFabricReact.dialogContentTypesMod.IDialogContent
import typingsJapgolly.officeUiFabricReact.dialogContentTypesMod.IDialogContentProps
import typingsJapgolly.officeUiFabricReact.dialogContentTypesMod.IDialogContentStyleProps
import typingsJapgolly.officeUiFabricReact.dialogContentTypesMod.IDialogContentStyles
import typingsJapgolly.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DialogContent {
  def apply(
    className: String = null,
    closeButtonAriaLabel: String = null,
    componentRef: IRefObject[IDialogContent] = null,
    draggableHeaderClassName: String = null,
    isMultiline: js.UndefOr[Boolean] = js.undefined,
    onDismiss: /* ev */ js.UndefOr[ReactMouseEventFrom[HTMLButtonElement]] => CallbackTo[js.Any] = null,
    responsiveMode: ResponsiveMode = null,
    showCloseButton: js.UndefOr[Boolean] = js.undefined,
    styles: IStyleFunctionOrObject[IDialogContentStyleProps, IDialogContentStyles] = null,
    subText: String = null,
    subTextId: String = null,
    theme: ITheme = null,
    title: String | Element = null,
    titleId: String = null,
    titleProps: HTMLAttributes[HTMLDivElement] = null,
    topButtonsProps: js.Array[IButtonProps] = null,
    `type`: DialogType = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IDialogContentProps, 
    LegacyRef[typingsJapgolly.officeUiFabricReact.dialogContentBaseMod.DialogContentBase], 
    Unit, 
    IDialogContentProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (closeButtonAriaLabel != null) __obj.updateDynamic("closeButtonAriaLabel")(closeButtonAriaLabel.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (draggableHeaderClassName != null) __obj.updateDynamic("draggableHeaderClassName")(draggableHeaderClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(isMultiline)) __obj.updateDynamic("isMultiline")(isMultiline.asInstanceOf[js.Any])
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction1((t0: /* ev */ js.UndefOr[
  japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLButtonElement]]) => onDismiss(t0).runNow()))
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.dialogContentTypesMod.IDialogContentProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.react.mod.LegacyRef[typingsJapgolly.officeUiFabricReact.dialogContentBaseMod.DialogContentBase]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.dialogContentTypesMod.IDialogContentProps])(children: _*)
  }
  @JSImport("office-ui-fabric-react", "DialogContent")
  @js.native
  object componentImport extends js.Object
  
}

