package typingsJapgolly.antd

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.antd.antdStrings.input
import typingsJapgolly.antd.antdStrings.text_
import typingsJapgolly.antd.libConfigProviderContextMod.DirectionType
import typingsJapgolly.antd.libConfigProviderSizeContextMod.SizeType
import typingsJapgolly.antd.libFormContextMod.FormItemStatusContextProps
import typingsJapgolly.antd.libUtilStatusUtilsMod.InputStatus
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInputClearableLabeledInputMod {
  
  @JSImport("antd/lib/input/ClearableLabeledInput", JSImport.Default)
  @js.native
  open class default () extends ClearableLabeledInput
  
  /** This basic props required for input and textarea. */
  trait BasicProps extends StObject {
    
    var allowClear: js.UndefOr[Boolean] = js.undefined
    
    var bordered: Boolean
    
    var className: js.UndefOr[String] = js.undefined
    
    var direction: js.UndefOr[DirectionType] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var element: Element
    
    var focused: js.UndefOr[Boolean] = js.undefined
    
    def handleReset(event: ReactMouseEventFrom[HTMLElement]): Unit
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var inputType: text_ | input
    
    var prefixCls: String
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var value: js.UndefOr[Any] = js.undefined
  }
  object BasicProps {
    
    inline def apply(
      bordered: Boolean,
      element: VdomElement,
      handleReset: ReactMouseEventFrom[HTMLElement] => Callback,
      inputType: text_ | input,
      prefixCls: String
    ): BasicProps = {
      val __obj = js.Dynamic.literal(bordered = bordered.asInstanceOf[js.Any], element = element.rawElement.asInstanceOf[js.Any], handleReset = js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement]) => handleReset(t0).runNow()), inputType = inputType.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[BasicProps]
    }
    
    extension [Self <: BasicProps](x: Self) {
      
      inline def setAllowClear(value: Boolean): Self = StObject.set(x, "allowClear", value.asInstanceOf[js.Any])
      
      inline def setAllowClearUndefined: Self = StObject.set(x, "allowClear", js.undefined)
      
      inline def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDirection(value: DirectionType): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setElement(value: VdomElement): Self = StObject.set(x, "element", value.rawElement.asInstanceOf[js.Any])
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
      
      inline def setHandleReset(value: ReactMouseEventFrom[HTMLElement] => Callback): Self = StObject.set(x, "handleReset", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement]) => value(t0).runNow()))
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setInputType(value: text_ | input): Self = StObject.set(x, "inputType", value.asInstanceOf[js.Any])
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait ClearableInputProps
    extends StObject
       with BasicProps {
    
    var addonAfter: js.UndefOr[Node] = js.undefined
    
    var addonBefore: js.UndefOr[Node] = js.undefined
    
    var prefix: js.UndefOr[Node] = js.undefined
    
    var size: js.UndefOr[SizeType] = js.undefined
    
    var status: js.UndefOr[InputStatus] = js.undefined
    
    var suffix: js.UndefOr[Node] = js.undefined
    
    var triggerFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object ClearableInputProps {
    
    inline def apply(
      bordered: Boolean,
      element: VdomElement,
      handleReset: ReactMouseEventFrom[HTMLElement] => Callback,
      inputType: text_ | input,
      prefixCls: String
    ): ClearableInputProps = {
      val __obj = js.Dynamic.literal(bordered = bordered.asInstanceOf[js.Any], element = element.rawElement.asInstanceOf[js.Any], handleReset = js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement]) => handleReset(t0).runNow()), inputType = inputType.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClearableInputProps]
    }
    
    extension [Self <: ClearableInputProps](x: Self) {
      
      inline def setAddonAfter(value: VdomNode): Self = StObject.set(x, "addonAfter", value.rawNode.asInstanceOf[js.Any])
      
      inline def setAddonAfterNull: Self = StObject.set(x, "addonAfter", null)
      
      inline def setAddonAfterUndefined: Self = StObject.set(x, "addonAfter", js.undefined)
      
      inline def setAddonAfterVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "addonAfter", js.Array(value*))
      
      inline def setAddonAfterVdomElement(value: VdomElement): Self = StObject.set(x, "addonAfter", value.rawElement.asInstanceOf[js.Any])
      
      inline def setAddonBefore(value: VdomNode): Self = StObject.set(x, "addonBefore", value.rawNode.asInstanceOf[js.Any])
      
      inline def setAddonBeforeNull: Self = StObject.set(x, "addonBefore", null)
      
      inline def setAddonBeforeUndefined: Self = StObject.set(x, "addonBefore", js.undefined)
      
      inline def setAddonBeforeVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "addonBefore", js.Array(value*))
      
      inline def setAddonBeforeVdomElement(value: VdomElement): Self = StObject.set(x, "addonBefore", value.rawElement.asInstanceOf[js.Any])
      
      inline def setPrefix(value: VdomNode): Self = StObject.set(x, "prefix", value.rawNode.asInstanceOf[js.Any])
      
      inline def setPrefixNull: Self = StObject.set(x, "prefix", null)
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setPrefixVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "prefix", js.Array(value*))
      
      inline def setPrefixVdomElement(value: VdomElement): Self = StObject.set(x, "prefix", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSize(value: SizeType): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStatus(value: InputStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setSuffix(value: VdomNode): Self = StObject.set(x, "suffix", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSuffixNull: Self = StObject.set(x, "suffix", null)
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      inline def setSuffixVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "suffix", js.Array(value*))
      
      inline def setSuffixVdomElement(value: VdomElement): Self = StObject.set(x, "suffix", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTriggerFocus(value: Callback): Self = StObject.set(x, "triggerFocus", value.toJsFn)
      
      inline def setTriggerFocusUndefined: Self = StObject.set(x, "triggerFocus", js.undefined)
    }
  }
  
  @js.native
  trait ClearableLabeledInput
    extends Component[ClearableInputProps, js.Object, Any] {
    
    def renderClearIcon(prefixCls: String): typingsJapgolly.react.mod.global.JSX.Element = js.native
    
    def renderTextAreaWithClearIcon(prefixCls: String, element: Element, statusContext: FormItemStatusContextProps): typingsJapgolly.react.mod.global.JSX.Element = js.native
  }
}
