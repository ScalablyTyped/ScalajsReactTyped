package typingsJapgolly.grommet

import typingsJapgolly.grommet.anon.Color
import typingsJapgolly.grommet.anon.Height
import typingsJapgolly.grommet.anon.Label
import typingsJapgolly.grommet.anon.Opacity
import typingsJapgolly.grommet.anon.Vertical
import typingsJapgolly.grommet.es6UtilsMod.A11yTitleType
import typingsJapgolly.grommet.es6UtilsMod.AlignSelfType
import typingsJapgolly.grommet.es6UtilsMod.ColorType
import typingsJapgolly.grommet.es6UtilsMod.EdgeSizeType
import typingsJapgolly.grommet.es6UtilsMod.GapType
import typingsJapgolly.grommet.es6UtilsMod.GridAreaType
import typingsJapgolly.grommet.es6UtilsMod.MarginType
import typingsJapgolly.grommet.es6UtilsMod.ThicknessType
import typingsJapgolly.grommet.grommetStrings.area
import typingsJapgolly.grommet.grommetStrings.bar
import typingsJapgolly.grommet.grommetStrings.circle
import typingsJapgolly.grommet.grommetStrings.circles
import typingsJapgolly.grommet.grommetStrings.diamond
import typingsJapgolly.grommet.grommetStrings.fill
import typingsJapgolly.grommet.grommetStrings.full
import typingsJapgolly.grommet.grommetStrings.large
import typingsJapgolly.grommet.grommetStrings.line
import typingsJapgolly.grommet.grommetStrings.medium
import typingsJapgolly.grommet.grommetStrings.point
import typingsJapgolly.grommet.grommetStrings.small
import typingsJapgolly.grommet.grommetStrings.square
import typingsJapgolly.grommet.grommetStrings.squares
import typingsJapgolly.grommet.grommetStrings.star
import typingsJapgolly.grommet.grommetStrings.stripesDiagonalDown
import typingsJapgolly.grommet.grommetStrings.stripesDiagonalUp
import typingsJapgolly.grommet.grommetStrings.stripesHorizontal
import typingsJapgolly.grommet.grommetStrings.stripesVertical
import typingsJapgolly.grommet.grommetStrings.strong
import typingsJapgolly.grommet.grommetStrings.triangle
import typingsJapgolly.grommet.grommetStrings.triangleDown
import typingsJapgolly.grommet.grommetStrings.weak
import typingsJapgolly.grommet.grommetStrings.xlarge
import typingsJapgolly.grommet.grommetStrings.xsmall
import typingsJapgolly.grommet.grommetStrings.xxsmall
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es6ComponentsChartMod {
  
  @JSImport("grommet/es6/components/Chart", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("grommet/es6/components/Chart", "Chart")
  @js.native
  val Chart: FC[ChartExtendedProps] = js.native
  
  inline def calcs(values: js.Array[js.Array[Double] | Double]): CalcsResult = ^.asInstanceOf[js.Dynamic].applyDynamic("calcs")(values.asInstanceOf[js.Any]).asInstanceOf[CalcsResult]
  inline def calcs(values: js.Array[js.Array[Double] | Double], options: CalcsOptions): CalcsResult = (^.asInstanceOf[js.Dynamic].applyDynamic("calcs")(values.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CalcsResult]
  
  type Bounds = js.Tuple2[
    js.Array[Any] | (js.Tuple2[Double, Double]), 
    js.Array[Any] | (js.Tuple2[Double, Double])
  ]
  
  trait CalcsOptions extends StObject {
    
    var bounds: js.UndefOr[Bounds] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var thickness: js.UndefOr[String] = js.undefined
  }
  object CalcsOptions {
    
    inline def apply(): CalcsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CalcsOptions]
    }
    
    extension [Self <: CalcsOptions](x: Self) {
      
      inline def setBounds(value: Bounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setThickness(value: String): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
      
      inline def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
    }
  }
  
  trait CalcsResult extends StObject {
    
    var axis: js.Tuple2[js.Array[Double], js.Array[Double]]
    
    var bounds: Bounds
    
    var dimensions: js.Tuple2[Double, Double]
    
    var pad: String
    
    var thickness: String
  }
  object CalcsResult {
    
    inline def apply(
      axis: js.Tuple2[js.Array[Double], js.Array[Double]],
      bounds: Bounds,
      dimensions: js.Tuple2[Double, Double],
      pad: String,
      thickness: String
    ): CalcsResult = {
      val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any])
      __obj.asInstanceOf[CalcsResult]
    }
    
    extension [Self <: CalcsResult](x: Self) {
      
      inline def setAxis(value: js.Tuple2[js.Array[Double], js.Array[Double]]): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setBounds(value: Bounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setDimensions(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
      
      inline def setPad(value: String): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
      
      inline def setThickness(value: String): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof react.react.SVGProps<std.SVGSVGElement>, 'a11yTitle' | 'alignSelf' | 'animate' | 'gridArea' | 'margin' | 'bounds' | 'color' | 'dash' | 'gap' | 'onClick' | 'onHover' | 'opacity' | 'overflow' | 'pad' | 'pattern' | 'point' | 'round' | 'size' | 'thickness' | 'type' | 'values'> ]: react.react.SVGProps<std.SVGSVGElement>[P]} */ trait ChartExtendedProps
    extends StObject
       with ChartProps
  object ChartExtendedProps {
    
    inline def apply(values: js.Array[Double | js.Array[Double] | Label]): ChartExtendedProps = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChartExtendedProps]
    }
  }
  
  trait ChartProps extends StObject {
    
    var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
    
    var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
    
    var animate: js.UndefOr[Boolean] = js.undefined
    
    var bounds: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
    
    var color: js.UndefOr[ColorType | js.Array[Color] | Opacity] = js.undefined
    
    var dash: js.UndefOr[Boolean] = js.undefined
    
    var gap: js.UndefOr[GapType] = js.undefined
    
    var gridArea: js.UndefOr[GridAreaType] = js.undefined
    
    var margin: js.UndefOr[MarginType] = js.undefined
    
    var onClick: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    var onHover: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    var opacity: js.UndefOr[weak | medium | strong | Boolean | Double] = js.undefined
    
    var overflow: js.UndefOr[Boolean] = js.undefined
    
    var pad: js.UndefOr[EdgeSizeType | Vertical] = js.undefined
    
    var pattern: js.UndefOr[
        squares | circles | stripesHorizontal | stripesVertical | stripesDiagonalDown | stripesDiagonalUp
      ] = js.undefined
    
    var point: js.UndefOr[circle | diamond | square | star | triangle | triangleDown] = js.undefined
    
    var round: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[
        xxsmall | xsmall | small | medium | large | xlarge | fill | full | Height | String
      ] = js.undefined
    
    var thickness: js.UndefOr[ThicknessType] = js.undefined
    
    var `type`: js.UndefOr[bar | line | area | point] = js.undefined
    
    var values: js.Array[Double | js.Array[Double] | Label]
  }
  object ChartProps {
    
    inline def apply(values: js.Array[Double | js.Array[Double] | Label]): ChartProps = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChartProps]
    }
    
    extension [Self <: ChartProps](x: Self) {
      
      inline def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
      
      inline def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
      
      inline def setAlignSelf(value: AlignSelfType): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setBounds(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      inline def setBoundsVarargs(value: js.Array[Double]*): Self = StObject.set(x, "bounds", js.Array(value*))
      
      inline def setColor(value: ColorType | js.Array[Color] | Opacity): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColorVarargs(value: Color*): Self = StObject.set(x, "color", js.Array(value*))
      
      inline def setDash(value: Boolean): Self = StObject.set(x, "dash", value.asInstanceOf[js.Any])
      
      inline def setDashUndefined: Self = StObject.set(x, "dash", js.undefined)
      
      inline def setGap(value: GapType): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      inline def setGridArea(value: GridAreaType): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
      
      inline def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
      
      inline def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setOnClick(value: /* repeated */ Any => Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnHover(value: /* repeated */ Any => Any): Self = StObject.set(x, "onHover", js.Any.fromFunction1(value))
      
      inline def setOnHoverUndefined: Self = StObject.set(x, "onHover", js.undefined)
      
      inline def setOpacity(value: weak | medium | strong | Boolean | Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setOverflow(value: Boolean): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      inline def setPad(value: EdgeSizeType | Vertical): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
      
      inline def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
      
      inline def setPattern(
        value: squares | circles | stripesHorizontal | stripesVertical | stripesDiagonalDown | stripesDiagonalUp
      ): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setPoint(value: circle | diamond | square | star | triangle | triangleDown): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
      
      inline def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
      
      inline def setRound(value: Boolean): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      inline def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
      
      inline def setSize(value: xxsmall | xsmall | small | medium | large | xlarge | fill | full | Height | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setThickness(value: ThicknessType): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
      
      inline def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
      
      inline def setType(value: bar | line | area | point): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValues(value: js.Array[Double | js.Array[Double] | Label]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: (Double | js.Array[Double] | Label)*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
}
