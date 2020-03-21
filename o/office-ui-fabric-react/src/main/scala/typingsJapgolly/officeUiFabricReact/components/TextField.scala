package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLTextAreaElement
import typingsJapgolly.officeUiFabricReact.iconTypesMod.IIconProps
import typingsJapgolly.officeUiFabricReact.textFieldTypesMod.ITextField
import typingsJapgolly.officeUiFabricReact.textFieldTypesMod.ITextFieldProps
import typingsJapgolly.officeUiFabricReact.textFieldTypesMod.ITextFieldStyleProps
import typingsJapgolly.officeUiFabricReact.textFieldTypesMod.ITextFieldStyles
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TextField {
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLInputElement | HTMLTextAreaElement] = null,
    ariaLabel: String = null,
    autoAdjustHeight: js.UndefOr[Boolean] = js.undefined,
    borderless: js.UndefOr[Boolean] = js.undefined,
    componentRef: IRefObject[ITextField] = null,
    defaultValue: String = null,
    deferredValidationTime: Int | Double = null,
    description: String = null,
    errorMessage: String | Element = null,
    iconProps: IIconProps = null,
    inputClassName: String = null,
    mask: String = null,
    maskChar: String = null,
    maskFormat: StringDictionary[js.RegExp] = null,
    multiline: js.UndefOr[Boolean] = js.undefined,
    onChange: (/* event */ ReactEventFrom[(HTMLInputElement | HTMLTextAreaElement) with org.scalajs.dom.raw.Element], /* newValue */ js.UndefOr[String]) => Callback = null,
    onGetErrorMessage: /* value */ String => CallbackTo[js.UndefOr[String | Element | (js.Thenable[String | Element])]] = null,
    onNotifyValidationResult: (/* errorMessage */ String | Element, /* value */ js.UndefOr[String]) => Callback = null,
    onRenderDescription: (/* props */ js.UndefOr[ITextFieldProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[ITextFieldProps], Element | Null]]) => CallbackTo[Element | Null] = null,
    onRenderLabel: (/* props */ js.UndefOr[ITextFieldProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[ITextFieldProps], Element | Null]]) => CallbackTo[Element | Null] = null,
    onRenderPrefix: (/* props */ js.UndefOr[ITextFieldProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[ITextFieldProps], Element | Null]]) => CallbackTo[Element | Null] = null,
    onRenderSuffix: (/* props */ js.UndefOr[ITextFieldProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[ITextFieldProps], Element | Null]]) => CallbackTo[Element | Null] = null,
    resizable: js.UndefOr[Boolean] = js.undefined,
    styles: IStyleFunctionOrObject[ITextFieldStyleProps, ITextFieldStyles] = null,
    suffix: String = null,
    theme: ITheme = null,
    underlined: js.UndefOr[Boolean] = js.undefined,
    validateOnFocusIn: js.UndefOr[Boolean] = js.undefined,
    validateOnFocusOut: js.UndefOr[Boolean] = js.undefined,
    validateOnLoad: js.UndefOr[Boolean] = js.undefined,
    value: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    ITextFieldProps, 
    MountedWithRawType[ITextFieldProps, js.Object, RawMounted[ITextFieldProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(autoAdjustHeight)) __obj.updateDynamic("autoAdjustHeight")(autoAdjustHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(borderless)) __obj.updateDynamic("borderless")(borderless.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (deferredValidationTime != null) __obj.updateDynamic("deferredValidationTime")(deferredValidationTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (iconProps != null) __obj.updateDynamic("iconProps")(iconProps.asInstanceOf[js.Any])
    if (inputClassName != null) __obj.updateDynamic("inputClassName")(inputClassName.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (maskChar != null) __obj.updateDynamic("maskChar")(maskChar.asInstanceOf[js.Any])
    if (maskFormat != null) __obj.updateDynamic("maskFormat")(maskFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[
  (org.scalajs.dom.raw.HTMLInputElement | org.scalajs.dom.raw.HTMLTextAreaElement) with org.scalajs.dom.raw.Element], t1: /* newValue */ js.UndefOr[java.lang.String]) => onChange(t0, t1).runNow()))
    if (onGetErrorMessage != null) __obj.updateDynamic("onGetErrorMessage")(js.Any.fromFunction1((t0: /* value */ java.lang.String) => onGetErrorMessage(t0).runNow()))
    if (onNotifyValidationResult != null) __obj.updateDynamic("onNotifyValidationResult")(js.Any.fromFunction2((t0: /* errorMessage */ java.lang.String | japgolly.scalajs.react.raw.React.Element, t1: /* value */ js.UndefOr[java.lang.String]) => onNotifyValidationResult(t0, t1).runNow()))
    if (onRenderDescription != null) __obj.updateDynamic("onRenderDescription")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.textFieldTypesMod.ITextFieldProps], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.textFieldTypesMod.ITextFieldProps], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderDescription(t0, t1).runNow()))
    if (onRenderLabel != null) __obj.updateDynamic("onRenderLabel")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.textFieldTypesMod.ITextFieldProps], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.textFieldTypesMod.ITextFieldProps], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderLabel(t0, t1).runNow()))
    if (onRenderPrefix != null) __obj.updateDynamic("onRenderPrefix")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.textFieldTypesMod.ITextFieldProps], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.textFieldTypesMod.ITextFieldProps], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderPrefix(t0, t1).runNow()))
    if (onRenderSuffix != null) __obj.updateDynamic("onRenderSuffix")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.textFieldTypesMod.ITextFieldProps], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.textFieldTypesMod.ITextFieldProps], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderSuffix(t0, t1).runNow()))
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(underlined)) __obj.updateDynamic("underlined")(underlined.asInstanceOf[js.Any])
    if (!js.isUndefined(validateOnFocusIn)) __obj.updateDynamic("validateOnFocusIn")(validateOnFocusIn.asInstanceOf[js.Any])
    if (!js.isUndefined(validateOnFocusOut)) __obj.updateDynamic("validateOnFocusOut")(validateOnFocusOut.asInstanceOf[js.Any])
    if (!js.isUndefined(validateOnLoad)) __obj.updateDynamic("validateOnLoad")(validateOnLoad.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.officeUiFabricReact.textFieldTypesMod.ITextFieldProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.textFieldTypesMod.ITextFieldProps])(children: _*)
  }
  @JSImport("office-ui-fabric-react", "TextField")
  @js.native
  object componentImport extends js.Object
  
}

