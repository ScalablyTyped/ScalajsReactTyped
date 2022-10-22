package typingsJapgolly.antd.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antd.libFormFormItemLabelMod.LabelTooltipType
import typingsJapgolly.antd.libFormInterfaceMod.FormLabelAlign
import typingsJapgolly.antd.libGridColMod.ColProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined antd.antd/lib/form/FormItemLabel.FormItemLabelProps & {  required :boolean | undefined,   prefixCls :string} */
trait FormItemLabelPropsrequire extends StObject {
  
  var colon: js.UndefOr[Boolean] = js.undefined
  
  var htmlFor: js.UndefOr[String] = js.undefined
  
  var label: js.UndefOr[Node] = js.undefined
  
  var labelAlign: js.UndefOr[FormLabelAlign] = js.undefined
  
  var labelCol: js.UndefOr[ColProps] = js.undefined
  
  var prefixCls: String
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var requiredMark: js.UndefOr[typingsJapgolly.antd.libFormFormMod.RequiredMark] = js.undefined
  
  var tooltip: js.UndefOr[LabelTooltipType] = js.undefined
}
object FormItemLabelPropsrequire {
  
  inline def apply(prefixCls: String): FormItemLabelPropsrequire = {
    val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormItemLabelPropsrequire]
  }
  
  extension [Self <: FormItemLabelPropsrequire](x: Self) {
    
    inline def setColon(value: Boolean): Self = StObject.set(x, "colon", value.asInstanceOf[js.Any])
    
    inline def setColonUndefined: Self = StObject.set(x, "colon", js.undefined)
    
    inline def setHtmlFor(value: String): Self = StObject.set(x, "htmlFor", value.asInstanceOf[js.Any])
    
    inline def setHtmlForUndefined: Self = StObject.set(x, "htmlFor", js.undefined)
    
    inline def setLabel(value: VdomNode): Self = StObject.set(x, "label", value.rawNode.asInstanceOf[js.Any])
    
    inline def setLabelAlign(value: FormLabelAlign): Self = StObject.set(x, "labelAlign", value.asInstanceOf[js.Any])
    
    inline def setLabelAlignUndefined: Self = StObject.set(x, "labelAlign", js.undefined)
    
    inline def setLabelCol(value: ColProps): Self = StObject.set(x, "labelCol", value.asInstanceOf[js.Any])
    
    inline def setLabelColUndefined: Self = StObject.set(x, "labelCol", js.undefined)
    
    inline def setLabelNull: Self = StObject.set(x, "label", null)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "label", js.Array(value*))
    
    inline def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
    
    inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredMark(value: typingsJapgolly.antd.libFormFormMod.RequiredMark): Self = StObject.set(x, "requiredMark", value.asInstanceOf[js.Any])
    
    inline def setRequiredMarkUndefined: Self = StObject.set(x, "requiredMark", js.undefined)
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setTooltip(value: LabelTooltipType): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipNull: Self = StObject.set(x, "tooltip", null)
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setTooltipVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "tooltip", js.Array(value*))
    
    inline def setTooltipVdomElement(value: VdomElement): Self = StObject.set(x, "tooltip", value.rawElement.asInstanceOf[js.Any])
  }
}
