package typingsJapgolly.antd

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.antd.anon.FormItemLabelPropsrequire
import typingsJapgolly.antd.anon.Icon
import typingsJapgolly.antd.libFormFormMod.RequiredMark
import typingsJapgolly.antd.libFormInterfaceMod.FormLabelAlign
import typingsJapgolly.antd.libGridColMod.ColProps
import typingsJapgolly.antd.libTooltipMod.TooltipProps
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormFormItemLabelMod extends Shortcut {
  
  @JSImport("antd/lib/form/FormItemLabel", JSImport.Default)
  @js.native
  val default: FC[FormItemLabelPropsrequire] = js.native
  
  trait FormItemLabelProps extends StObject {
    
    var colon: js.UndefOr[Boolean] = js.undefined
    
    var htmlFor: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[Node] = js.undefined
    
    var labelAlign: js.UndefOr[FormLabelAlign] = js.undefined
    
    var labelCol: js.UndefOr[ColProps] = js.undefined
    
    var requiredMark: js.UndefOr[RequiredMark] = js.undefined
    
    var tooltip: js.UndefOr[LabelTooltipType] = js.undefined
  }
  object FormItemLabelProps {
    
    inline def apply(): FormItemLabelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormItemLabelProps]
    }
    
    extension [Self <: FormItemLabelProps](x: Self) {
      
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
      
      inline def setRequiredMark(value: RequiredMark): Self = StObject.set(x, "requiredMark", value.asInstanceOf[js.Any])
      
      inline def setRequiredMarkUndefined: Self = StObject.set(x, "requiredMark", js.undefined)
      
      inline def setTooltip(value: LabelTooltipType): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipNull: Self = StObject.set(x, "tooltip", null)
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setTooltipVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "tooltip", js.Array(value*))
      
      inline def setTooltipVdomElement(value: VdomElement): Self = StObject.set(x, "tooltip", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  type LabelTooltipType = WrapperTooltipProps | Node
  
  type WrapperTooltipProps = TooltipProps & Icon
  
  type _To = FC[FormItemLabelPropsrequire]
  
  /* This means you don't have to write `default`, but can instead just say `libFormFormItemLabelMod.foo` */
  override def _to: FC[FormItemLabelPropsrequire] = default
}
