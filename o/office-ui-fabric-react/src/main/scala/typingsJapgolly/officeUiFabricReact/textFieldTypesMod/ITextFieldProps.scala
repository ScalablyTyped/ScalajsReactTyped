package typingsJapgolly.officeUiFabricReact.textFieldTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.officeUiFabricReact.iconTypesMod.IIconProps
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.std.HTMLInputElement
import typingsJapgolly.std.HTMLTextAreaElement
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import typingsJapgolly.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextFieldProps extends AllHTMLAttributes[HTMLInputElement | HTMLTextAreaElement] {
  /**
    * Aria label for the text field.
    */
  var ariaLabel: js.UndefOr[String] = js.undefined
  /**
    * For multiline text fields, whether or not to auto adjust text field height.
    * @defaultvalue false
    */
  var autoAdjustHeight: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether or not the text field is borderless.
    * @defaultvalue false
    */
  var borderless: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional callback to access the ITextField component. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[ITextField]] = js.undefined
  /**
    * Default value of the text field. Only provide this if the text field is an uncontrolled component;
    * otherwise, use the `value` property.
    */
  @JSName("defaultValue")
  var defaultValue_ITextFieldProps: js.UndefOr[String] = js.undefined
  /**
    * Text field will start to validate after users stop typing for `deferredValidationTime` milliseconds.
    * Updates to this prop will not be respected.
    * @defaultvalue 200
    */
  var deferredValidationTime: js.UndefOr[Double] = js.undefined
  /**
    * Description displayed below the text field to provide additional details about what text to enter.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Static error message displayed below the text field. Use `onGetErrorMessage` to dynamically
    * change the error message displayed (if any) based on the current value. `errorMessage` and
    * `onGetErrorMessage` are mutually exclusive (`errorMessage` takes precedence).
    */
  var errorMessage: js.UndefOr[String | Element] = js.undefined
  /**
    * Props for an optional icon, displayed in the far right end of the text field.
    */
  var iconProps: js.UndefOr[IIconProps] = js.undefined
  /**
    * Optional class name that is added specifically to the input/textarea element.
    */
  var inputClassName: js.UndefOr[String] = js.undefined
  /**
    * Only used by MaskedTextField:
    * The masking string that defines the mask's behavior.
    * A backslash will escape any character.
    * Special format characters are:
    * '9': [0-9]
    * 'a': [a-zA-Z]
    * '*': [a-zA-Z0-9]
    *
    * @example `Phone Number: (999) 999-9999`
    */
  var mask: js.UndefOr[String] = js.undefined
  /**
    * Only used by MaskedTextField:
    * The character to show in place of unfilled characters of the mask.
    * @defaultvalue '_'
    */
  var maskChar: js.UndefOr[String] = js.undefined
  /**
    * Only used by MaskedTextField:
    * An object defining the format characters and corresponding regexp values.
    * Default format characters: \{
    *  '9': /[0-9]/,
    *  'a': /[a-zA-Z]/,
    *  '*': /[a-zA-Z0-9]/
    * \}
    */
  var maskFormat: js.UndefOr[StringDictionary[js.RegExp]] = js.undefined
  /**
    * Whether or not the text field is a multiline text field.
    * @defaultvalue false
    */
  var multiline: js.UndefOr[Boolean] = js.undefined
  /**
    * Callback for when the input value changes.
    * This is called on both `input` and `change` events.
    * (In a later version, this will probably only be called for the `change` event.)
    */
  @JSName("onChange")
  var onChange_ITextFieldProps: js.UndefOr[
    js.Function2[
      /* event */ ReactEventFrom[
        (org.scalajs.dom.raw.HTMLInputElement | org.scalajs.dom.raw.HTMLTextAreaElement) with org.scalajs.dom.raw.Element
      ], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ] = js.undefined
  /**
    * Function used to determine whether the input value is valid and get an error message if not.
    * Mutually exclusive with the static string `errorMessage` (it will take precedence over this).
    *
    * When it returns `string | JSX.Element`:
    * - If valid, it returns empty string.
    * - If invalid, it returns the error message and the text field will
    *   show a red border and show an error message below the text field.
    *
    * When it returns `Promise<string | JSX.Element>`:
    * - The resolved value is displayed as the error message.
    * - If rejected, the value is thrown away.
    */
  var onGetErrorMessage: js.UndefOr[
    js.Function1[/* value */ String, js.UndefOr[String | Element | (js.Thenable[String | Element])]]
  ] = js.undefined
  /**
    * Function called after validation completes.
    */
  var onNotifyValidationResult: js.UndefOr[
    js.Function2[/* errorMessage */ String | Element, /* value */ js.UndefOr[String], Unit]
  ] = js.undefined
  /**
    * Custom renderer for the description.
    */
  var onRenderDescription: js.UndefOr[IRenderFunction[ITextFieldProps]] = js.undefined
  /**
    * Custom renderer for the label.
    * If you don't call defaultRender, ensure that you give your custom-rendered label an id and that
    * you set the textfield's aria-labelledby prop to that id.
    */
  var onRenderLabel: js.UndefOr[IRenderFunction[ITextFieldProps]] = js.undefined
  /**
    * Custom render function for prefix.
    */
  var onRenderPrefix: js.UndefOr[IRenderFunction[ITextFieldProps]] = js.undefined
  /**
    * Custom render function for suffix.
    */
  var onRenderSuffix: js.UndefOr[IRenderFunction[ITextFieldProps]] = js.undefined
  /**
    * For multiline text fields, whether or not the field is resizable.
    * @defaultvalue true
    */
  var resizable: js.UndefOr[Boolean] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[ITextFieldStyleProps, ITextFieldStyles]] = js.undefined
  /**
    * Suffix displayed after the text field contents. This is not included in the value.
    * Ensure a descriptive label is present to assist screen readers, as the value does not include the suffix.
    */
  var suffix: js.UndefOr[String] = js.undefined
  /**
    * Theme (provided through customization).
    */
  var theme: js.UndefOr[ITheme] = js.undefined
  /**
    * Whether or not the text field is underlined.
    * @defaultvalue false
    */
  var underlined: js.UndefOr[Boolean] = js.undefined
  /**
    * Run validation when focus moves into the input, and **do not** validate on change.
    *
    * (Unless this prop and/or `validateOnFocusOut` is set to true, validation will run on every change.)
    * @defaultvalue false
    */
  var validateOnFocusIn: js.UndefOr[Boolean] = js.undefined
  /**
    * Run validation when focus moves out of the input, and **do not** validate on change.
    *
    * (Unless this prop and/or `validateOnFocusIn` is set to true, validation will run on every change.)
    * @defaultvalue false
    */
  var validateOnFocusOut: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether validation should run when the input is initially rendered.
    * @defaultvalue true
    */
  var validateOnLoad: js.UndefOr[Boolean] = js.undefined
  /**
    * Current value of the text field. Only provide this if the text field is a controlled component where you
    * are maintaining its current state; otherwise, use the `defaultValue` property.
    */
  @JSName("value")
  var value_ITextFieldProps: js.UndefOr[String] = js.undefined
}

object ITextFieldProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[org.scalajs.dom.raw.HTMLInputElement | org.scalajs.dom.raw.HTMLTextAreaElement] = null,
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
    onChange: (/* event */ ReactEventFrom[
      (org.scalajs.dom.raw.HTMLInputElement | org.scalajs.dom.raw.HTMLTextAreaElement) with org.scalajs.dom.raw.Element
    ], /* newValue */ js.UndefOr[String]) => Callback = null,
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
    value: String = null
  ): ITextFieldProps = {
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
    __obj.asInstanceOf[ITextFieldProps]
  }
}

