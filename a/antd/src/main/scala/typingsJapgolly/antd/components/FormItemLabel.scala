package typingsJapgolly.antd.components

import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.anon.FormItemLabelPropsrequire
import typingsJapgolly.antd.libFormFormItemLabelMod.LabelTooltipType
import typingsJapgolly.antd.libFormFormMod.RequiredMark
import typingsJapgolly.antd.libFormInterfaceMod.FormLabelAlign
import typingsJapgolly.antd.libGridColMod.ColProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormItemLabel {
  
  inline def apply(prefixCls: String): Builder = {
    val __props = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[FormItemLabelPropsrequire]))
  }
  
  @JSImport("antd/lib/form/FormItemLabel", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def colon(value: Boolean): this.type = set("colon", value.asInstanceOf[js.Any])
    
    inline def htmlFor(value: String): this.type = set("htmlFor", value.asInstanceOf[js.Any])
    
    inline def label(value: VdomNode): this.type = set("label", value.rawNode.asInstanceOf[js.Any])
    
    inline def labelAlign(value: FormLabelAlign): this.type = set("labelAlign", value.asInstanceOf[js.Any])
    
    inline def labelCol(value: ColProps): this.type = set("labelCol", value.asInstanceOf[js.Any])
    
    inline def labelNull: this.type = set("label", null)
    
    inline def labelVarargs(
      value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
    ): this.type = set("label", js.Array(value*))
    
    inline def labelVdomElement(value: VdomElement): this.type = set("label", value.rawElement.asInstanceOf[js.Any])
    
    inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    inline def requiredMark(value: RequiredMark): this.type = set("requiredMark", value.asInstanceOf[js.Any])
    
    inline def tooltip(value: LabelTooltipType): this.type = set("tooltip", value.asInstanceOf[js.Any])
    
    inline def tooltipNull: this.type = set("tooltip", null)
    
    inline def tooltipVarargs(
      value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
    ): this.type = set("tooltip", js.Array(value*))
    
    inline def tooltipVdomElement(value: VdomElement): this.type = set("tooltip", value.rawElement.asInstanceOf[js.Any])
  }
  
  def withProps(p: FormItemLabelPropsrequire): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
