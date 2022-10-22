package typingsJapgolly.recharts.mod

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.recharts.anon.PartialMargin
import typingsJapgolly.recharts.rechartsStrings.centric
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.recharts.mod.CategoricalChartWrapper because var conflicts: onClick, onMouseDown, onMouseEnter, onMouseLeave, onMouseMove, onMouseUp. Inlined syncId, compact, width, height, data, layout, stackOffset, throttleDelay, margin, barCategoryGap, barGap, barSize, baseValue, maxBarSize, style, className, children, reverseStackOrder */ trait PieChartProps
  extends StObject
     with EventAttributes {
  
  var barCategoryGap: js.UndefOr[Double | String] = js.undefined
  
  var barGap: js.UndefOr[Double | String] = js.undefined
  
  var barSize: js.UndefOr[Double | String] = js.undefined
  
  var baseValue: js.UndefOr[BaseValueType] = js.undefined
  
  var children: js.UndefOr[Node | js.Array[Node]] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var compact: js.UndefOr[Boolean] = js.undefined
  
  var cx: js.UndefOr[Double | String] = js.undefined
  
  var cy: js.UndefOr[Double | String] = js.undefined
  
  var data: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var endAngle: js.UndefOr[Double] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var innerRadius: js.UndefOr[Double | String] = js.undefined
  
  var layout: js.UndefOr[centric] = js.undefined
  
  var margin: js.UndefOr[PartialMargin] = js.undefined
  
  var maxBarSize: js.UndefOr[Double] = js.undefined
  
  var outerRadius: js.UndefOr[Double | String] = js.undefined
  
  var reverseStackOrder: js.UndefOr[Boolean] = js.undefined
  
  var stackOffset: js.UndefOr[StackOffsetType] = js.undefined
  
  var startAngle: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[js.Object] = js.undefined
  
  var syncId: js.UndefOr[String | Double] = js.undefined
  
  var throttleDelay: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object PieChartProps {
  
  inline def apply(): PieChartProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PieChartProps]
  }
  
  extension [Self <: PieChartProps](x: Self) {
    
    inline def setBarCategoryGap(value: Double | String): Self = StObject.set(x, "barCategoryGap", value.asInstanceOf[js.Any])
    
    inline def setBarCategoryGapUndefined: Self = StObject.set(x, "barCategoryGap", js.undefined)
    
    inline def setBarGap(value: Double | String): Self = StObject.set(x, "barGap", value.asInstanceOf[js.Any])
    
    inline def setBarGapUndefined: Self = StObject.set(x, "barGap", js.undefined)
    
    inline def setBarSize(value: Double | String): Self = StObject.set(x, "barSize", value.asInstanceOf[js.Any])
    
    inline def setBarSizeUndefined: Self = StObject.set(x, "barSize", js.undefined)
    
    inline def setBaseValue(value: BaseValueType): Self = StObject.set(x, "baseValue", value.asInstanceOf[js.Any])
    
    inline def setBaseValueUndefined: Self = StObject.set(x, "baseValue", js.undefined)
    
    inline def setChildren(value: Node | js.Array[Node]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Element | Empty | JsNumber | Node | String)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
    
    inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
    
    inline def setCx(value: Double | String): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
    
    inline def setCxUndefined: Self = StObject.set(x, "cx", js.undefined)
    
    inline def setCy(value: Double | String): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
    
    inline def setCyUndefined: Self = StObject.set(x, "cy", js.undefined)
    
    inline def setData(value: js.Array[js.Object]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: js.Object*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
    inline def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setInnerRadius(value: Double | String): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
    
    inline def setInnerRadiusUndefined: Self = StObject.set(x, "innerRadius", js.undefined)
    
    inline def setLayout(value: centric): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setMargin(value: PartialMargin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setMaxBarSize(value: Double): Self = StObject.set(x, "maxBarSize", value.asInstanceOf[js.Any])
    
    inline def setMaxBarSizeUndefined: Self = StObject.set(x, "maxBarSize", js.undefined)
    
    inline def setOuterRadius(value: Double | String): Self = StObject.set(x, "outerRadius", value.asInstanceOf[js.Any])
    
    inline def setOuterRadiusUndefined: Self = StObject.set(x, "outerRadius", js.undefined)
    
    inline def setReverseStackOrder(value: Boolean): Self = StObject.set(x, "reverseStackOrder", value.asInstanceOf[js.Any])
    
    inline def setReverseStackOrderUndefined: Self = StObject.set(x, "reverseStackOrder", js.undefined)
    
    inline def setStackOffset(value: StackOffsetType): Self = StObject.set(x, "stackOffset", value.asInstanceOf[js.Any])
    
    inline def setStackOffsetUndefined: Self = StObject.set(x, "stackOffset", js.undefined)
    
    inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    inline def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
    
    inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSyncId(value: String | Double): Self = StObject.set(x, "syncId", value.asInstanceOf[js.Any])
    
    inline def setSyncIdUndefined: Self = StObject.set(x, "syncId", js.undefined)
    
    inline def setThrottleDelay(value: Double): Self = StObject.set(x, "throttleDelay", value.asInstanceOf[js.Any])
    
    inline def setThrottleDelayUndefined: Self = StObject.set(x, "throttleDelay", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
