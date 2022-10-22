package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBarChartMod {
  
  @JSImport("wix-style-react/dist/types/BarChart", JSImport.Default)
  @js.native
  open class default () extends Component[BarChartProps, BarChartState, Any]
  
  type BarChart = japgolly.scalajs.react.facade.React.Component[BarChartProps & js.Object, js.Object]
  
  trait BarChartItem extends StObject {
    
    var description: js.UndefOr[Node] = js.undefined
    
    var descriptionInfo: js.UndefOr[Node] = js.undefined
    
    var label: js.UndefOr[Node] = js.undefined
    
    var labelShort: js.UndefOr[Node] = js.undefined
    
    var onDescriptionInfoShown: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var value: Double
  }
  object BarChartItem {
    
    inline def apply(value: Double): BarChartItem = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[BarChartItem]
    }
    
    extension [Self <: BarChartItem](x: Self) {
      
      inline def setDescription(value: VdomNode): Self = StObject.set(x, "description", value.rawNode.asInstanceOf[js.Any])
      
      inline def setDescriptionInfo(value: VdomNode): Self = StObject.set(x, "descriptionInfo", value.rawNode.asInstanceOf[js.Any])
      
      inline def setDescriptionInfoNull: Self = StObject.set(x, "descriptionInfo", null)
      
      inline def setDescriptionInfoUndefined: Self = StObject.set(x, "descriptionInfo", js.undefined)
      
      inline def setDescriptionInfoVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "descriptionInfo", js.Array(value*))
      
      inline def setDescriptionInfoVdomElement(value: VdomElement): Self = StObject.set(x, "descriptionInfo", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDescriptionNull: Self = StObject.set(x, "description", null)
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDescriptionVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "description", js.Array(value*))
      
      inline def setDescriptionVdomElement(value: VdomElement): Self = StObject.set(x, "description", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLabel(value: VdomNode): Self = StObject.set(x, "label", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLabelNull: Self = StObject.set(x, "label", null)
      
      inline def setLabelShort(value: VdomNode): Self = StObject.set(x, "labelShort", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLabelShortNull: Self = StObject.set(x, "labelShort", null)
      
      inline def setLabelShortUndefined: Self = StObject.set(x, "labelShort", js.undefined)
      
      inline def setLabelShortVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "labelShort", js.Array(value*))
      
      inline def setLabelShortVdomElement(value: VdomElement): Self = StObject.set(x, "labelShort", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "label", js.Array(value*))
      
      inline def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnDescriptionInfoShown(value: Callback): Self = StObject.set(x, "onDescriptionInfoShown", value.toJsFn)
      
      inline def setOnDescriptionInfoShownUndefined: Self = StObject.set(x, "onDescriptionInfoShown", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait BarChartProps extends StObject {
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var items: js.Array[BarChartItem]
    
    var onDescriptionInfoShown: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var total: js.UndefOr[Double] = js.undefined
  }
  object BarChartProps {
    
    inline def apply(items: js.Array[BarChartItem]): BarChartProps = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[BarChartProps]
    }
    
    extension [Self <: BarChartProps](x: Self) {
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setItems(value: js.Array[BarChartItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: BarChartItem*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setOnDescriptionInfoShown(value: Callback): Self = StObject.set(x, "onDescriptionInfoShown", value.toJsFn)
      
      inline def setOnDescriptionInfoShownUndefined: Self = StObject.set(x, "onDescriptionInfoShown", js.undefined)
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    }
  }
  
  trait BarChartState extends StObject {
    
    var width: Double
  }
  object BarChartState {
    
    inline def apply(width: Double): BarChartState = {
      val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[BarChartState]
    }
    
    extension [Self <: BarChartState](x: Self) {
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
