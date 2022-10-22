package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.react.mod.ChangeEventHandler
import typingsJapgolly.react.mod.FocusEventHandler
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.wixStyleReact.distTypesCommonMod.PopoverCommonProps
import typingsJapgolly.wixStyleReact.distTypesDropdownLayoutMod.DropdownLayoutValueOption
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.`double-line`
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.`single-line`
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.bottomLine
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.error
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.large
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.loading
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.none_
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.round
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.small
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAtlasAddressInputMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/types/AtlasAddressInput", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[AtlasAddressInputProps & RefAttributes[AtlasAddressInputImperativeActions]] = js.native
  
  trait AtlasAddressInputImperativeActions extends StObject {
    
    def focus(): Unit
  }
  object AtlasAddressInputImperativeActions {
    
    inline def apply(focus: Callback): AtlasAddressInputImperativeActions = {
      val __obj = js.Dynamic.literal(focus = focus.toJsFn)
      __obj.asInstanceOf[AtlasAddressInputImperativeActions]
    }
    
    extension [Self <: AtlasAddressInputImperativeActions](x: Self) {
      
      inline def setFocus(value: Callback): Self = StObject.set(x, "focus", value.toJsFn)
    }
  }
  
  /* Inlined parent wix-style-react.wix-style-react/dist/types/common.OmitPolyfill<wix-style-react.wix-style-react/dist/types/AddressInput.AddressInputProps, 'options' | 'onSelect' | 'onManuallyInput'> */
  /* Inlined parent wix-style-react.wix-style-react/dist/types/providers/useAtlasClient.AtlasInitOptions */
  trait AtlasAddressInputProps extends StObject {
    
    var baseUrl: js.UndefOr[String] = js.undefined
    
    var border: js.UndefOr[standard | round | bottomLine | none_] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var clearButton: js.UndefOr[Boolean] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var debounceFn: js.UndefOr[js.Function2[/* callback */ js.Function, /* debounceMs */ Double, js.Function]] = js.undefined
    
    var debounceMs: js.UndefOr[Double] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var initialValue: js.UndefOr[String] = js.undefined
    
    var noResultsText: js.UndefOr[Node] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
    
    var onClear: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onError: js.UndefOr[
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AtlasError */ /* error */ Any, 
          Any
        ]
      ] = js.undefined
    
    var onFocus: js.UndefOr[js.Function1[/* e */ js.UndefOr[ReactFocusEventFrom[HTMLInputElement]], Unit]] = js.undefined
    
    var onSelect: js.UndefOr[
        js.Function2[/* option */ DropdownLayoutValueOption, /* getAddress */ GetAddress, Unit]
      ] = js.undefined
    
    var optionLayout: js.UndefOr[`single-line` | `double-line`] = js.undefined
    
    var optionPrefix: js.UndefOr[Node] = js.undefined
    
    var optionSuffix: js.UndefOr[Node] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var popoverProps: js.UndefOr[PopoverCommonProps] = js.undefined
    
    var selectOnSubmit: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[small | medium | large] = js.undefined
    
    var status: js.UndefOr[loading | error | warning] = js.undefined
    
    var statusMessage: js.UndefOr[Node] = js.undefined
    
    var token: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object AtlasAddressInputProps {
    
    inline def apply(): AtlasAddressInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AtlasAddressInputProps]
    }
    
    extension [Self <: AtlasAddressInputProps](x: Self) {
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setBorder(value: standard | round | bottomLine | none_): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClearButton(value: Boolean): Self = StObject.set(x, "clearButton", value.asInstanceOf[js.Any])
      
      inline def setClearButtonUndefined: Self = StObject.set(x, "clearButton", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDebounceFn(value: (/* callback */ js.Function, /* debounceMs */ Double) => js.Function): Self = StObject.set(x, "debounceFn", js.Any.fromFunction2(value))
      
      inline def setDebounceFnUndefined: Self = StObject.set(x, "debounceFn", js.undefined)
      
      inline def setDebounceMs(value: Double): Self = StObject.set(x, "debounceMs", value.asInstanceOf[js.Any])
      
      inline def setDebounceMsUndefined: Self = StObject.set(x, "debounceMs", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setInitialValue(value: String): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
      
      inline def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
      
      inline def setNoResultsText(value: VdomNode): Self = StObject.set(x, "noResultsText", value.rawNode.asInstanceOf[js.Any])
      
      inline def setNoResultsTextNull: Self = StObject.set(x, "noResultsText", null)
      
      inline def setNoResultsTextUndefined: Self = StObject.set(x, "noResultsText", js.undefined)
      
      inline def setNoResultsTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "noResultsText", js.Array(value*))
      
      inline def setNoResultsTextVdomElement(value: VdomElement): Self = StObject.set(x, "noResultsText", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnBlur(value: ReactFocusEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: ReactEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClear(value: Callback): Self = StObject.set(x, "onClear", value.toJsFn)
      
      inline def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
      
      inline def setOnError(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AtlasError */ /* error */ Any => Any
      ): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnFocus(value: /* e */ js.UndefOr[ReactFocusEventFrom[HTMLInputElement]] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: /* e */ js.UndefOr[ReactFocusEventFrom[HTMLInputElement]]) => value(t0).runNow()))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnSelect(value: (/* option */ DropdownLayoutValueOption, /* getAddress */ GetAddress) => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction2((t0: /* option */ DropdownLayoutValueOption, t1: /* getAddress */ GetAddress) => (value(t0, t1)).runNow()))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOptionLayout(value: `single-line` | `double-line`): Self = StObject.set(x, "optionLayout", value.asInstanceOf[js.Any])
      
      inline def setOptionLayoutUndefined: Self = StObject.set(x, "optionLayout", js.undefined)
      
      inline def setOptionPrefix(value: VdomNode): Self = StObject.set(x, "optionPrefix", value.rawNode.asInstanceOf[js.Any])
      
      inline def setOptionPrefixNull: Self = StObject.set(x, "optionPrefix", null)
      
      inline def setOptionPrefixUndefined: Self = StObject.set(x, "optionPrefix", js.undefined)
      
      inline def setOptionPrefixVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "optionPrefix", js.Array(value*))
      
      inline def setOptionPrefixVdomElement(value: VdomElement): Self = StObject.set(x, "optionPrefix", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOptionSuffix(value: VdomNode): Self = StObject.set(x, "optionSuffix", value.rawNode.asInstanceOf[js.Any])
      
      inline def setOptionSuffixNull: Self = StObject.set(x, "optionSuffix", null)
      
      inline def setOptionSuffixUndefined: Self = StObject.set(x, "optionSuffix", js.undefined)
      
      inline def setOptionSuffixVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "optionSuffix", js.Array(value*))
      
      inline def setOptionSuffixVdomElement(value: VdomElement): Self = StObject.set(x, "optionSuffix", value.rawElement.asInstanceOf[js.Any])
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPopoverProps(value: PopoverCommonProps): Self = StObject.set(x, "popoverProps", value.asInstanceOf[js.Any])
      
      inline def setPopoverPropsUndefined: Self = StObject.set(x, "popoverProps", js.undefined)
      
      inline def setSelectOnSubmit(value: Boolean): Self = StObject.set(x, "selectOnSubmit", value.asInstanceOf[js.Any])
      
      inline def setSelectOnSubmitUndefined: Self = StObject.set(x, "selectOnSubmit", js.undefined)
      
      inline def setSize(value: small | medium | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStatus(value: loading | error | warning): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusMessage(value: VdomNode): Self = StObject.set(x, "statusMessage", value.rawNode.asInstanceOf[js.Any])
      
      inline def setStatusMessageNull: Self = StObject.set(x, "statusMessage", null)
      
      inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
      
      inline def setStatusMessageVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "statusMessage", js.Array(value*))
      
      inline def setStatusMessageVdomElement(value: VdomElement): Self = StObject.set(x, "statusMessage", value.rawElement.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type GetAddress = js.Function0[
    js.Promise[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Address */ Any
    ]
  ]
  
  type _To = ForwardRefExoticComponent[AtlasAddressInputProps & RefAttributes[AtlasAddressInputImperativeActions]]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesAtlasAddressInputMod.foo` */
  override def _to: ForwardRefExoticComponent[AtlasAddressInputProps & RefAttributes[AtlasAddressInputImperativeActions]] = default
}
