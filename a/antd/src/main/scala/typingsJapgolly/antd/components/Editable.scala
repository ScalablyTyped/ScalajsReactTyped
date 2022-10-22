package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.libConfigProviderContextMod.DirectionType
import typingsJapgolly.antd.libTypographyEditableMod.EditableProps
import typingsJapgolly.rcTextarea.esResizableTextAreaMod.AutoSizeType
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Editable {
  
  inline def apply(onCancel: Callback, onSave: String => Callback, value: String): Builder = {
    val __props = js.Dynamic.literal(onCancel = onCancel.toJsFn, onSave = js.Any.fromFunction1((t0: String) => onSave(t0).runNow()), value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[EditableProps]))
  }
  
  @JSImport("antd/lib/typography/Editable", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    inline def autoSize(value: Boolean | AutoSizeType): this.type = set("autoSize", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def component(value: String): this.type = set("component", value.asInstanceOf[js.Any])
    
    inline def direction(value: DirectionType): this.type = set("direction", value.asInstanceOf[js.Any])
    
    inline def enterIcon(value: VdomNode): this.type = set("enterIcon", value.rawNode.asInstanceOf[js.Any])
    
    inline def enterIconNull: this.type = set("enterIcon", null)
    
    inline def enterIconVarargs(
      value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
    ): this.type = set("enterIcon", js.Array(value*))
    
    inline def enterIconVdomElement(value: VdomElement): this.type = set("enterIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def maxLength(value: Double): this.type = set("maxLength", value.asInstanceOf[js.Any])
    
    inline def onEnd(value: Callback): this.type = set("onEnd", value.toJsFn)
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: EditableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
