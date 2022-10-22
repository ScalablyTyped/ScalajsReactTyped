package typingsJapgolly.nivoAxes

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.SVGGElement
import typingsJapgolly.nivoAxes.nivoAxesStrings.after
import typingsJapgolly.nivoAxes.nivoAxesStrings.before
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleValue
import typingsJapgolly.nivoScales.distTypesTypesMod.TicksSpec
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.nivoAxes.nivoAxesStrings.start
    - typingsJapgolly.nivoAxes.nivoAxesStrings.middle
    - typingsJapgolly.nivoAxes.nivoAxesStrings.end
  */
  trait AxisLegendPosition extends StObject
  object AxisLegendPosition {
    
    inline def end: typingsJapgolly.nivoAxes.nivoAxesStrings.end = "end".asInstanceOf[typingsJapgolly.nivoAxes.nivoAxesStrings.end]
    
    inline def middle: typingsJapgolly.nivoAxes.nivoAxesStrings.middle = "middle".asInstanceOf[typingsJapgolly.nivoAxes.nivoAxesStrings.middle]
    
    inline def start: typingsJapgolly.nivoAxes.nivoAxesStrings.start = "start".asInstanceOf[typingsJapgolly.nivoAxes.nivoAxesStrings.start]
  }
  
  trait AxisProps[Value /* <: ScaleValue */] extends StObject {
    
    var ariaHidden: js.UndefOr[Boolean] = js.undefined
    
    var format: js.UndefOr[String | ValueFormatter[Value]] = js.undefined
    
    var legend: js.UndefOr[Node] = js.undefined
    
    var legendOffset: js.UndefOr[Double] = js.undefined
    
    var legendPosition: js.UndefOr[AxisLegendPosition] = js.undefined
    
    var renderTick: js.UndefOr[js.Function1[/* props */ AxisTickProps[Value], Element]] = js.undefined
    
    var tickPadding: js.UndefOr[Double] = js.undefined
    
    var tickRotation: js.UndefOr[Double] = js.undefined
    
    var tickSize: js.UndefOr[Double] = js.undefined
    
    var tickValues: js.UndefOr[TicksSpec[Value]] = js.undefined
    
    var ticksPosition: js.UndefOr[before | after] = js.undefined
  }
  object AxisProps {
    
    inline def apply[Value /* <: ScaleValue */](): AxisProps[Value] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxisProps[Value]]
    }
    
    extension [Self <: AxisProps[?], Value /* <: ScaleValue */](x: Self & AxisProps[Value]) {
      
      inline def setAriaHidden(value: Boolean): Self = StObject.set(x, "ariaHidden", value.asInstanceOf[js.Any])
      
      inline def setAriaHiddenUndefined: Self = StObject.set(x, "ariaHidden", js.undefined)
      
      inline def setFormat(value: String | ValueFormatter[Value]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatFunction1(value: Value => Value | String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setLegend(value: VdomNode): Self = StObject.set(x, "legend", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLegendNull: Self = StObject.set(x, "legend", null)
      
      inline def setLegendOffset(value: Double): Self = StObject.set(x, "legendOffset", value.asInstanceOf[js.Any])
      
      inline def setLegendOffsetUndefined: Self = StObject.set(x, "legendOffset", js.undefined)
      
      inline def setLegendPosition(value: AxisLegendPosition): Self = StObject.set(x, "legendPosition", value.asInstanceOf[js.Any])
      
      inline def setLegendPositionUndefined: Self = StObject.set(x, "legendPosition", js.undefined)
      
      inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      inline def setLegendVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "legend", js.Array(value*))
      
      inline def setLegendVdomElement(value: VdomElement): Self = StObject.set(x, "legend", value.rawElement.asInstanceOf[js.Any])
      
      inline def setRenderTick(value: /* props */ AxisTickProps[Value] => Element): Self = StObject.set(x, "renderTick", js.Any.fromFunction1(value))
      
      inline def setRenderTickUndefined: Self = StObject.set(x, "renderTick", js.undefined)
      
      inline def setTickPadding(value: Double): Self = StObject.set(x, "tickPadding", value.asInstanceOf[js.Any])
      
      inline def setTickPaddingUndefined: Self = StObject.set(x, "tickPadding", js.undefined)
      
      inline def setTickRotation(value: Double): Self = StObject.set(x, "tickRotation", value.asInstanceOf[js.Any])
      
      inline def setTickRotationUndefined: Self = StObject.set(x, "tickRotation", js.undefined)
      
      inline def setTickSize(value: Double): Self = StObject.set(x, "tickSize", value.asInstanceOf[js.Any])
      
      inline def setTickSizeUndefined: Self = StObject.set(x, "tickSize", js.undefined)
      
      inline def setTickValues(value: TicksSpec[Value]): Self = StObject.set(x, "tickValues", value.asInstanceOf[js.Any])
      
      inline def setTickValuesUndefined: Self = StObject.set(x, "tickValues", js.undefined)
      
      inline def setTickValuesVarargs(value: Value*): Self = StObject.set(x, "tickValues", js.Array(value*))
      
      inline def setTicksPosition(value: before | after): Self = StObject.set(x, "ticksPosition", value.asInstanceOf[js.Any])
      
      inline def setTicksPositionUndefined: Self = StObject.set(x, "ticksPosition", js.undefined)
    }
  }
  
  trait AxisTickProps[Value /* <: ScaleValue */] extends StObject {
    
    var animatedProps: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValues<{  opacity :number,   textTransform :string,   transform :string}> */ Any
    
    var format: js.UndefOr[ValueFormatter[Value]] = js.undefined
    
    var lineX: Double
    
    var lineY: Double
    
    var onClick: js.UndefOr[
        js.Function2[/* event */ ReactMouseEventFrom[SVGGElement], /* value */ Value | String, Unit]
      ] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var rotate: js.UndefOr[Double] = js.undefined
    
    var textAnchor: String
    
    var textBaseline: String
    
    var textX: Double
    
    var textY: Double
    
    var tickIndex: Double
    
    var value: Value
    
    var x: Double
    
    var y: Double
  }
  object AxisTickProps {
    
    inline def apply[Value /* <: ScaleValue */](
      animatedProps: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValues<{  opacity :number,   textTransform :string,   transform :string}> */ Any,
      lineX: Double,
      lineY: Double,
      textAnchor: String,
      textBaseline: String,
      textX: Double,
      textY: Double,
      tickIndex: Double,
      value: Value,
      x: Double,
      y: Double
    ): AxisTickProps[Value] = {
      val __obj = js.Dynamic.literal(animatedProps = animatedProps.asInstanceOf[js.Any], lineX = lineX.asInstanceOf[js.Any], lineY = lineY.asInstanceOf[js.Any], textAnchor = textAnchor.asInstanceOf[js.Any], textBaseline = textBaseline.asInstanceOf[js.Any], textX = textX.asInstanceOf[js.Any], textY = textY.asInstanceOf[js.Any], tickIndex = tickIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[AxisTickProps[Value]]
    }
    
    extension [Self <: AxisTickProps[?], Value /* <: ScaleValue */](x: Self & AxisTickProps[Value]) {
      
      inline def setAnimatedProps(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValues<{  opacity :number,   textTransform :string,   transform :string}> */ Any
      ): Self = StObject.set(x, "animatedProps", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: Value => Value | String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setLineX(value: Double): Self = StObject.set(x, "lineX", value.asInstanceOf[js.Any])
      
      inline def setLineY(value: Double): Self = StObject.set(x, "lineY", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: (/* event */ ReactMouseEventFrom[SVGGElement], /* value */ Value | String) => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[SVGGElement], t1: /* value */ Value | String) => (value(t0, t1)).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setTextAnchor(value: String): Self = StObject.set(x, "textAnchor", value.asInstanceOf[js.Any])
      
      inline def setTextBaseline(value: String): Self = StObject.set(x, "textBaseline", value.asInstanceOf[js.Any])
      
      inline def setTextX(value: Double): Self = StObject.set(x, "textX", value.asInstanceOf[js.Any])
      
      inline def setTextY(value: Double): Self = StObject.set(x, "textY", value.asInstanceOf[js.Any])
      
      inline def setTickIndex(value: Double): Self = StObject.set(x, "tickIndex", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Omit<@nivo/axes.@nivo/axes/dist/types/types.AxisProps<Value>, 'legend'> */
  trait CanvasAxisProps[Value /* <: ScaleValue */] extends StObject {
    
    var ariaHidden: js.UndefOr[Boolean] = js.undefined
    
    var format: js.UndefOr[String | ValueFormatter[Value]] = js.undefined
    
    var legend: js.UndefOr[String] = js.undefined
    
    var legendOffset: js.UndefOr[Double] = js.undefined
    
    var legendPosition: js.UndefOr[AxisLegendPosition] = js.undefined
    
    var renderTick: js.UndefOr[js.Function1[/* props */ AxisTickProps[Value], Element]] = js.undefined
    
    var tickPadding: js.UndefOr[Double] = js.undefined
    
    var tickRotation: js.UndefOr[Double] = js.undefined
    
    var tickSize: js.UndefOr[Double] = js.undefined
    
    var tickValues: js.UndefOr[TicksSpec[Value]] = js.undefined
    
    var ticksPosition: js.UndefOr[before | after] = js.undefined
  }
  object CanvasAxisProps {
    
    inline def apply[Value /* <: ScaleValue */](): CanvasAxisProps[Value] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CanvasAxisProps[Value]]
    }
    
    extension [Self <: CanvasAxisProps[?], Value /* <: ScaleValue */](x: Self & CanvasAxisProps[Value]) {
      
      inline def setAriaHidden(value: Boolean): Self = StObject.set(x, "ariaHidden", value.asInstanceOf[js.Any])
      
      inline def setAriaHiddenUndefined: Self = StObject.set(x, "ariaHidden", js.undefined)
      
      inline def setFormat(value: String | ValueFormatter[Value]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatFunction1(value: Value => Value | String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setLegend(value: String): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      inline def setLegendOffset(value: Double): Self = StObject.set(x, "legendOffset", value.asInstanceOf[js.Any])
      
      inline def setLegendOffsetUndefined: Self = StObject.set(x, "legendOffset", js.undefined)
      
      inline def setLegendPosition(value: AxisLegendPosition): Self = StObject.set(x, "legendPosition", value.asInstanceOf[js.Any])
      
      inline def setLegendPositionUndefined: Self = StObject.set(x, "legendPosition", js.undefined)
      
      inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      inline def setRenderTick(value: /* props */ AxisTickProps[Value] => Element): Self = StObject.set(x, "renderTick", js.Any.fromFunction1(value))
      
      inline def setRenderTickUndefined: Self = StObject.set(x, "renderTick", js.undefined)
      
      inline def setTickPadding(value: Double): Self = StObject.set(x, "tickPadding", value.asInstanceOf[js.Any])
      
      inline def setTickPaddingUndefined: Self = StObject.set(x, "tickPadding", js.undefined)
      
      inline def setTickRotation(value: Double): Self = StObject.set(x, "tickRotation", value.asInstanceOf[js.Any])
      
      inline def setTickRotationUndefined: Self = StObject.set(x, "tickRotation", js.undefined)
      
      inline def setTickSize(value: Double): Self = StObject.set(x, "tickSize", value.asInstanceOf[js.Any])
      
      inline def setTickSizeUndefined: Self = StObject.set(x, "tickSize", js.undefined)
      
      inline def setTickValues(value: TicksSpec[Value]): Self = StObject.set(x, "tickValues", value.asInstanceOf[js.Any])
      
      inline def setTickValuesUndefined: Self = StObject.set(x, "tickValues", js.undefined)
      
      inline def setTickValuesVarargs(value: Value*): Self = StObject.set(x, "tickValues", js.Array(value*))
      
      inline def setTicksPosition(value: before | after): Self = StObject.set(x, "ticksPosition", value.asInstanceOf[js.Any])
      
      inline def setTicksPositionUndefined: Self = StObject.set(x, "ticksPosition", js.undefined)
    }
  }
  
  type GridValues[T /* <: ScaleValue */] = Double | GridValuesBuilder[T]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends number ? std.Array<number> : T extends string ? std.Array<string> : T extends std.Date ? std.Array<std.Date> : never
    }}}
    */
  @js.native
  trait GridValuesBuilder[T] extends StObject
  
  trait Line extends StObject {
    
    var key: String
    
    var x1: Double
    
    var x2: Double
    
    var y1: Double
    
    var y2: Double
  }
  object Line {
    
    inline def apply(key: String, x1: Double, x2: Double, y1: Double, y2: Double): Line = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
      __obj.asInstanceOf[Line]
    }
    
    extension [Self <: Line](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      inline def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      inline def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      inline def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    }
  }
  
  trait Point extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object Point {
    
    inline def apply(x: Double, y: Double): Point = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point]
    }
    
    extension [Self <: Point](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  type ValueFormatter[Value /* <: ScaleValue */] = js.Function1[/* value */ Value, Value | String]
}
