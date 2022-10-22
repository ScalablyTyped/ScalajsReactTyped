package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.antdStrings.input
import typingsJapgolly.antd.antdStrings.text_
import typingsJapgolly.antd.libConfigProviderContextMod.DirectionType
import typingsJapgolly.antd.libConfigProviderSizeContextMod.SizeType
import typingsJapgolly.antd.libInputClearableLabeledInputMod.ClearableInputProps
import typingsJapgolly.antd.libInputClearableLabeledInputMod.default
import typingsJapgolly.antd.libUtilStatusUtilsMod.InputStatus
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ClearableLabeledInput {
  
  inline def apply(
    bordered: Boolean,
    element: VdomElement,
    handleReset: ReactMouseEventFrom[HTMLElement] => Callback,
    inputType: text_ | input,
    prefixCls: String
  ): Builder = {
    val __props = js.Dynamic.literal(bordered = bordered.asInstanceOf[js.Any], element = element.rawElement.asInstanceOf[js.Any], handleReset = js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement]) => handleReset(t0).runNow()), inputType = inputType.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ClearableInputProps]))
  }
  
  @JSImport("antd/lib/input/ClearableLabeledInput", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def addonAfter(value: VdomNode): this.type = set("addonAfter", value.rawNode.asInstanceOf[js.Any])
    
    inline def addonAfterNull: this.type = set("addonAfter", null)
    
    inline def addonAfterVarargs(
      value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
    ): this.type = set("addonAfter", js.Array(value*))
    
    inline def addonAfterVdomElement(value: VdomElement): this.type = set("addonAfter", value.rawElement.asInstanceOf[js.Any])
    
    inline def addonBefore(value: VdomNode): this.type = set("addonBefore", value.rawNode.asInstanceOf[js.Any])
    
    inline def addonBeforeNull: this.type = set("addonBefore", null)
    
    inline def addonBeforeVarargs(
      value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
    ): this.type = set("addonBefore", js.Array(value*))
    
    inline def addonBeforeVdomElement(value: VdomElement): this.type = set("addonBefore", value.rawElement.asInstanceOf[js.Any])
    
    inline def allowClear(value: Boolean): this.type = set("allowClear", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def direction(value: DirectionType): this.type = set("direction", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def focused(value: Boolean): this.type = set("focused", value.asInstanceOf[js.Any])
    
    inline def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    
    inline def prefix(value: VdomNode): this.type = set("prefix", value.rawNode.asInstanceOf[js.Any])
    
    inline def prefixNull: this.type = set("prefix", null)
    
    inline def prefixVarargs(
      value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
    ): this.type = set("prefix", js.Array(value*))
    
    inline def prefixVdomElement(value: VdomElement): this.type = set("prefix", value.rawElement.asInstanceOf[js.Any])
    
    inline def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    inline def size(value: SizeType): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def status(value: InputStatus): this.type = set("status", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def suffix(value: VdomNode): this.type = set("suffix", value.rawNode.asInstanceOf[js.Any])
    
    inline def suffixNull: this.type = set("suffix", null)
    
    inline def suffixVarargs(
      value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
    ): this.type = set("suffix", js.Array(value*))
    
    inline def suffixVdomElement(value: VdomElement): this.type = set("suffix", value.rawElement.asInstanceOf[js.Any])
    
    inline def triggerFocus(value: Callback): this.type = set("triggerFocus", value.toJsFn)
    
    inline def value(value: Any): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ClearableInputProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
