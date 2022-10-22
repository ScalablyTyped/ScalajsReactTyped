package typingsJapgolly.antDesignProUtils.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antd.libFormFormItemLabelMod.LabelTooltipType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ellipsis extends StObject {
  
  var ellipsis: js.UndefOr[Boolean | ShowTitle] = js.undefined
  
  var label: Node
  
  var subTitle: js.UndefOr[Node] = js.undefined
  
  var tooltip: js.UndefOr[String | LabelTooltipType] = js.undefined
}
object Ellipsis {
  
  inline def apply(): Ellipsis = {
    val __obj = js.Dynamic.literal(label = null)
    __obj.asInstanceOf[Ellipsis]
  }
  
  extension [Self <: Ellipsis](x: Self) {
    
    inline def setEllipsis(value: Boolean | ShowTitle): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
    
    inline def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
    
    inline def setLabel(value: VdomNode): Self = StObject.set(x, "label", value.rawNode.asInstanceOf[js.Any])
    
    inline def setLabelNull: Self = StObject.set(x, "label", null)
    
    inline def setLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "label", js.Array(value*))
    
    inline def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
    
    inline def setSubTitle(value: VdomNode): Self = StObject.set(x, "subTitle", value.rawNode.asInstanceOf[js.Any])
    
    inline def setSubTitleNull: Self = StObject.set(x, "subTitle", null)
    
    inline def setSubTitleUndefined: Self = StObject.set(x, "subTitle", js.undefined)
    
    inline def setSubTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "subTitle", js.Array(value*))
    
    inline def setSubTitleVdomElement(value: VdomElement): Self = StObject.set(x, "subTitle", value.rawElement.asInstanceOf[js.Any])
    
    inline def setTooltip(value: String | LabelTooltipType): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipNull: Self = StObject.set(x, "tooltip", null)
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setTooltipVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "tooltip", js.Array(value*))
    
    inline def setTooltipVdomElement(value: VdomElement): Self = StObject.set(x, "tooltip", value.rawElement.asInstanceOf[js.Any])
  }
}
