package typingsJapgolly.reactNativeSvgCharts.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.CanvasRenderingContext2D
import typingsJapgolly.d3Path.mod.Path_
import typingsJapgolly.d3Scale.mod.ScaleBand_
import typingsJapgolly.d3Shape.mod.CurveFactory
import typingsJapgolly.d3Shape.mod.CurveGenerator
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeSvgCharts.anon.Bottom
import typingsJapgolly.reactNativeSvgCharts.anon.PartialPathProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartProps[T] extends StObject {
  
  var animate: js.UndefOr[Boolean] = js.undefined
  
  var animationDuration: js.UndefOr[Double] = js.undefined
  
  var children: js.UndefOr[Node] = js.undefined
  
  var contentInset: js.UndefOr[Bottom] = js.undefined
  
  var curve: js.UndefOr[CurveFactory] = js.undefined
  
  var data: js.Array[T]
  
  var gridMax: js.UndefOr[Double] = js.undefined
  
  var gridMin: js.UndefOr[Double] = js.undefined
  
  var gridProps: js.UndefOr[GridProps[Any]] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var numberOfTicks: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var svg: js.UndefOr[PartialPathProps] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var xAccessor: js.UndefOr[AccessorFunction[T, Double]] = js.undefined
  
  var xMax: js.UndefOr[Double] = js.undefined
  
  var xMin: js.UndefOr[Double] = js.undefined
  
  var xScale: js.UndefOr[ScaleFunction] = js.undefined
  
  var yAccessor: js.UndefOr[AccessorFunction[T, Double]] = js.undefined
  
  var yMax: js.UndefOr[Double] = js.undefined
  
  var yMin: js.UndefOr[Double] = js.undefined
  
  var yScale: js.UndefOr[ScaleFunction] = js.undefined
}
object ChartProps {
  
  inline def apply[T](data: js.Array[T]): ChartProps[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartProps[T]]
  }
  
  extension [Self <: ChartProps[?], T](x: Self & ChartProps[T]) {
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setContentInset(value: Bottom): Self = StObject.set(x, "contentInset", value.asInstanceOf[js.Any])
    
    inline def setContentInsetUndefined: Self = StObject.set(x, "contentInset", js.undefined)
    
    inline def setCurve(value: /* context */ CanvasRenderingContext2D | Path_ => CurveGenerator): Self = StObject.set(x, "curve", js.Any.fromFunction1(value))
    
    inline def setCurveUndefined: Self = StObject.set(x, "curve", js.undefined)
    
    inline def setData(value: js.Array[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: T*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setGridMax(value: Double): Self = StObject.set(x, "gridMax", value.asInstanceOf[js.Any])
    
    inline def setGridMaxUndefined: Self = StObject.set(x, "gridMax", js.undefined)
    
    inline def setGridMin(value: Double): Self = StObject.set(x, "gridMin", value.asInstanceOf[js.Any])
    
    inline def setGridMinUndefined: Self = StObject.set(x, "gridMin", js.undefined)
    
    inline def setGridProps(value: GridProps[Any]): Self = StObject.set(x, "gridProps", value.asInstanceOf[js.Any])
    
    inline def setGridPropsUndefined: Self = StObject.set(x, "gridProps", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setNumberOfTicks(value: Double): Self = StObject.set(x, "numberOfTicks", value.asInstanceOf[js.Any])
    
    inline def setNumberOfTicksUndefined: Self = StObject.set(x, "numberOfTicks", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSvg(value: PartialPathProps): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
    
    inline def setSvgUndefined: Self = StObject.set(x, "svg", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setXAccessor(value: /* props */ AccessorFunctionProps[T] => Double): Self = StObject.set(x, "xAccessor", js.Any.fromFunction1(value))
    
    inline def setXAccessorUndefined: Self = StObject.set(x, "xAccessor", js.undefined)
    
    inline def setXMax(value: Double): Self = StObject.set(x, "xMax", value.asInstanceOf[js.Any])
    
    inline def setXMaxUndefined: Self = StObject.set(x, "xMax", js.undefined)
    
    inline def setXMin(value: Double): Self = StObject.set(x, "xMin", value.asInstanceOf[js.Any])
    
    inline def setXMinUndefined: Self = StObject.set(x, "xMin", js.undefined)
    
    inline def setXScale(value: CallbackTo[(ScaleType[Any, Any]) | ScaleBand_[Any]]): Self = StObject.set(x, "xScale", value.toJsFn)
    
    inline def setXScaleUndefined: Self = StObject.set(x, "xScale", js.undefined)
    
    inline def setYAccessor(value: /* props */ AccessorFunctionProps[T] => Double): Self = StObject.set(x, "yAccessor", js.Any.fromFunction1(value))
    
    inline def setYAccessorUndefined: Self = StObject.set(x, "yAccessor", js.undefined)
    
    inline def setYMax(value: Double): Self = StObject.set(x, "yMax", value.asInstanceOf[js.Any])
    
    inline def setYMaxUndefined: Self = StObject.set(x, "yMax", js.undefined)
    
    inline def setYMin(value: Double): Self = StObject.set(x, "yMin", value.asInstanceOf[js.Any])
    
    inline def setYMinUndefined: Self = StObject.set(x, "yMin", js.undefined)
    
    inline def setYScale(value: CallbackTo[(ScaleType[Any, Any]) | ScaleBand_[Any]]): Self = StObject.set(x, "yScale", value.toJsFn)
    
    inline def setYScaleUndefined: Self = StObject.set(x, "yScale", js.undefined)
  }
}
