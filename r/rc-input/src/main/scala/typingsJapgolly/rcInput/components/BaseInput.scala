package typingsJapgolly.rcInput.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcInput.anon.ClearIcon
import typingsJapgolly.rcInput.esInterfaceMod.BaseInputProps
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BaseInput {
  
  inline def apply(inputElement: VdomElement): Builder = {
    val __props = js.Dynamic.literal(inputElement = inputElement.rawElement.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[BaseInputProps]))
  }
  
  @JSImport("rc-input", "BaseInput")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def addonAfter(value: VdomNode): this.type = set("addonAfter", value.rawNode.asInstanceOf[js.Any])
    
    inline def addonAfterNull: this.type = set("addonAfter", null)
    
    inline def addonAfterVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("addonAfter", js.Array(value*))
    
    inline def addonAfterVdomElement(value: VdomElement): this.type = set("addonAfter", value.rawElement.asInstanceOf[js.Any])
    
    inline def addonBefore(value: VdomNode): this.type = set("addonBefore", value.rawNode.asInstanceOf[js.Any])
    
    inline def addonBeforeNull: this.type = set("addonBefore", null)
    
    inline def addonBeforeVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("addonBefore", js.Array(value*))
    
    inline def addonBeforeVdomElement(value: VdomElement): this.type = set("addonBefore", value.rawElement.asInstanceOf[js.Any])
    
    inline def affixWrapperClassName(value: String): this.type = set("affixWrapperClassName", value.asInstanceOf[js.Any])
    
    inline def allowClear(value: Boolean | ClearIcon): this.type = set("allowClear", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def focused(value: Boolean): this.type = set("focused", value.asInstanceOf[js.Any])
    
    inline def groupClassName(value: String): this.type = set("groupClassName", value.asInstanceOf[js.Any])
    
    inline def handleReset(value: ReactMouseEventFrom[org.scalajs.dom.Element & org.scalajs.dom.Element] => Callback): this.type = set("handleReset", js.Any.fromFunction1((t0: ReactMouseEventFrom[org.scalajs.dom.Element & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    
    inline def inputClassName(value: String): this.type = set("inputClassName", value.asInstanceOf[js.Any])
    
    inline def prefix(value: VdomNode): this.type = set("prefix", value.rawNode.asInstanceOf[js.Any])
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def prefixNull: this.type = set("prefix", null)
    
    inline def prefixVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("prefix", js.Array(value*))
    
    inline def prefixVdomElement(value: VdomElement): this.type = set("prefix", value.rawElement.asInstanceOf[js.Any])
    
    inline def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def suffix(value: VdomNode): this.type = set("suffix", value.rawNode.asInstanceOf[js.Any])
    
    inline def suffixNull: this.type = set("suffix", null)
    
    inline def suffixVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("suffix", js.Array(value*))
    
    inline def suffixVdomElement(value: VdomElement): this.type = set("suffix", value.rawElement.asInstanceOf[js.Any])
    
    inline def triggerFocus(value: Callback): this.type = set("triggerFocus", value.toJsFn)
    
    inline def value(value: String | js.Array[String] | Double): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueVarargs(value: String*): this.type = set("value", js.Array(value*))
    
    inline def wrapperClassName(value: String): this.type = set("wrapperClassName", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BaseInputProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
