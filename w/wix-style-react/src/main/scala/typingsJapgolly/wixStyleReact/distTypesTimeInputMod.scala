package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.csstype.mod.Property.Width
import typingsJapgolly.react.mod.FocusEventHandler
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.wixDesignSystemsLocaleUtils.distTypesDateTimeFormatConstantsMod.SupportedWixLocales_
import typingsJapgolly.wixStyleReact.anon.`14`
import typingsJapgolly.wixStyleReact.distTypesCommonMod.PopoverCommonProps
import typingsJapgolly.wixStyleReact.distTypesInputMod.InputSize
import typingsJapgolly.wixStyleReact.distTypesInputMod.InputStatus
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.bottomLine
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.long
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.none_
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.round
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.short
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTimeInputMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/types/TimeInput", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[TimeInputProps & RefAttributes[TimeInputImperativeActions]] = js.native
  
  trait TimeInputImperativeActions extends StObject {
    
    def blur(): Unit
    
    def focus(): Unit
  }
  object TimeInputImperativeActions {
    
    inline def apply(blur: Callback, focus: Callback): TimeInputImperativeActions = {
      val __obj = js.Dynamic.literal(blur = blur.toJsFn, focus = focus.toJsFn)
      __obj.asInstanceOf[TimeInputImperativeActions]
    }
    
    extension [Self <: TimeInputImperativeActions](x: Self) {
      
      inline def setBlur(value: Callback): Self = StObject.set(x, "blur", value.toJsFn)
      
      inline def setFocus(value: Callback): Self = StObject.set(x, "focus", value.toJsFn)
    }
  }
  
  trait TimeInputProps extends StObject {
    
    var border: js.UndefOr[standard | round | bottomLine | none_] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var excludePastTimes: js.UndefOr[Boolean] = js.undefined
    
    var filterTime: js.UndefOr[js.Function1[/* time */ js.Date, Boolean]] = js.undefined
    
    var invalidMessage: js.UndefOr[String] = js.undefined
    
    var locale: js.UndefOr[SupportedWixLocales_] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* hasDate */ `14`, Unit]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function1[/* e */ js.UndefOr[ReactFocusEventFrom[HTMLInputElement]], Unit]] = js.undefined
    
    var onInvalid: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var popoverProps: js.UndefOr[PopoverCommonProps] = js.undefined
    
    var prefix: js.UndefOr[Node] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[InputSize] = js.undefined
    
    var status: js.UndefOr[InputStatus] = js.undefined
    
    var statusMessage: js.UndefOr[Node] = js.undefined
    
    var step: js.UndefOr[Double] = js.undefined
    
    var suffix: js.UndefOr[Node] = js.undefined
    
    var timeStyle: js.UndefOr[long | short] = js.undefined
    
    var value: js.UndefOr[js.Date | Null] = js.undefined
    
    var width: js.UndefOr[Width[String | Double]] = js.undefined
  }
  object TimeInputProps {
    
    inline def apply(): TimeInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimeInputProps]
    }
    
    extension [Self <: TimeInputProps](x: Self) {
      
      inline def setBorder(value: standard | round | bottomLine | none_): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setExcludePastTimes(value: Boolean): Self = StObject.set(x, "excludePastTimes", value.asInstanceOf[js.Any])
      
      inline def setExcludePastTimesUndefined: Self = StObject.set(x, "excludePastTimes", js.undefined)
      
      inline def setFilterTime(value: /* time */ js.Date => Boolean): Self = StObject.set(x, "filterTime", js.Any.fromFunction1(value))
      
      inline def setFilterTimeUndefined: Self = StObject.set(x, "filterTime", js.undefined)
      
      inline def setInvalidMessage(value: String): Self = StObject.set(x, "invalidMessage", value.asInstanceOf[js.Any])
      
      inline def setInvalidMessageUndefined: Self = StObject.set(x, "invalidMessage", js.undefined)
      
      inline def setLocale(value: SupportedWixLocales_): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setOnBlur(value: ReactFocusEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: /* hasDate */ `14` => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* hasDate */ `14`) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFocus(value: /* e */ js.UndefOr[ReactFocusEventFrom[HTMLInputElement]] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: /* e */ js.UndefOr[ReactFocusEventFrom[HTMLInputElement]]) => value(t0).runNow()))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnInvalid(value: Callback): Self = StObject.set(x, "onInvalid", value.toJsFn)
      
      inline def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPopoverProps(value: PopoverCommonProps): Self = StObject.set(x, "popoverProps", value.asInstanceOf[js.Any])
      
      inline def setPopoverPropsUndefined: Self = StObject.set(x, "popoverProps", js.undefined)
      
      inline def setPrefix(value: VdomNode): Self = StObject.set(x, "prefix", value.rawNode.asInstanceOf[js.Any])
      
      inline def setPrefixNull: Self = StObject.set(x, "prefix", null)
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setPrefixVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "prefix", js.Array(value*))
      
      inline def setPrefixVdomElement(value: VdomElement): Self = StObject.set(x, "prefix", value.rawElement.asInstanceOf[js.Any])
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setSize(value: InputSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStatus(value: InputStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusMessage(value: VdomNode): Self = StObject.set(x, "statusMessage", value.rawNode.asInstanceOf[js.Any])
      
      inline def setStatusMessageNull: Self = StObject.set(x, "statusMessage", null)
      
      inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
      
      inline def setStatusMessageVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "statusMessage", js.Array(value*))
      
      inline def setStatusMessageVdomElement(value: VdomElement): Self = StObject.set(x, "statusMessage", value.rawElement.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setSuffix(value: VdomNode): Self = StObject.set(x, "suffix", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSuffixNull: Self = StObject.set(x, "suffix", null)
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      inline def setSuffixVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "suffix", js.Array(value*))
      
      inline def setSuffixVdomElement(value: VdomElement): Self = StObject.set(x, "suffix", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTimeStyle(value: long | short): Self = StObject.set(x, "timeStyle", value.asInstanceOf[js.Any])
      
      inline def setTimeStyleUndefined: Self = StObject.set(x, "timeStyle", js.undefined)
      
      inline def setValue(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWidth(value: Width[String | Double]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[TimeInputProps & RefAttributes[TimeInputImperativeActions]]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesTimeInputMod.foo` */
  override def _to: ForwardRefExoticComponent[TimeInputProps & RefAttributes[TimeInputImperativeActions]] = default
}
