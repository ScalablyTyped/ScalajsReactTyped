package typingsJapgolly.reactSparklines

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Element
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.react.mod.ReactSVGElement
import typingsJapgolly.reactSparklines.reactSparklinesStrings.avg
import typingsJapgolly.reactSparklines.reactSparklinesStrings.click
import typingsJapgolly.reactSparklines.reactSparklinesStrings.custom
import typingsJapgolly.reactSparklines.reactSparklinesStrings.enter
import typingsJapgolly.reactSparklines.reactSparklinesStrings.max
import typingsJapgolly.reactSparklines.reactSparklinesStrings.mean
import typingsJapgolly.reactSparklines.reactSparklinesStrings.median
import typingsJapgolly.reactSparklines.reactSparklinesStrings.min
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-sparklines", "Sparklines")
  @js.native
  open class Sparklines protected ()
    extends PureComponent[SparklinesProps, js.Object, Any] {
    def this(props: SparklinesProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SparklinesProps, context: Any) = this()
  }
  
  @JSImport("react-sparklines", "SparklinesBars")
  @js.native
  open class SparklinesBars protected ()
    extends Component[SparklinesBarsProps, js.Object, Any] {
    def this(props: SparklinesBarsProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SparklinesBarsProps, context: Any) = this()
  }
  
  @JSImport("react-sparklines", "SparklinesCurve")
  @js.native
  open class SparklinesCurve protected ()
    extends Component[SparklinesCurveProps, js.Object, Any] {
    def this(props: SparklinesCurveProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SparklinesCurveProps, context: Any) = this()
  }
  
  @JSImport("react-sparklines", "SparklinesLine")
  @js.native
  open class SparklinesLine protected ()
    extends Component[SparklinesLineProps, js.Object, Any] {
    def this(props: SparklinesLineProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SparklinesLineProps, context: Any) = this()
  }
  
  @JSImport("react-sparklines", "SparklinesNormalBand")
  @js.native
  open class SparklinesNormalBand protected ()
    extends Component[SparklinesNormalBandProps, js.Object, Any] {
    def this(props: SparklinesNormalBandProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SparklinesNormalBandProps, context: Any) = this()
  }
  
  @JSImport("react-sparklines", "SparklinesReferenceLine")
  @js.native
  open class SparklinesReferenceLine protected ()
    extends Component[SparklinesReferenceLineProps, js.Object, Any] {
    def this(props: SparklinesReferenceLineProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SparklinesReferenceLineProps, context: Any) = this()
  }
  
  @JSImport("react-sparklines", "SparklinesSpots")
  @js.native
  open class SparklinesSpots protected ()
    extends Component[SparklinesSpotsProps, js.Object, Any] {
    def this(props: SparklinesSpotsProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SparklinesSpotsProps, context: Any) = this()
  }
  
  @JSImport("react-sparklines", "SparklinesText")
  @js.native
  open class SparklinesText protected ()
    extends Component[SparklinesTextProps, js.Object, Any] {
    def this(props: SparklinesTextProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SparklinesTextProps, context: Any) = this()
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
  
  trait SparklinesBarsProps extends StObject {
    
    var barWidth: js.UndefOr[Double] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var margin: js.UndefOr[Double] = js.undefined
    
    var onMouseMove: js.UndefOr[
        js.Function2[/* p */ Point, /* event */ ReactMouseEventFrom[ReactSVGElement & Element], Unit]
      ] = js.undefined
    
    var points: js.UndefOr[js.Array[Point]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object SparklinesBarsProps {
    
    inline def apply(): SparklinesBarsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SparklinesBarsProps]
    }
    
    extension [Self <: SparklinesBarsProps](x: Self) {
      
      inline def setBarWidth(value: Double): Self = StObject.set(x, "barWidth", value.asInstanceOf[js.Any])
      
      inline def setBarWidthUndefined: Self = StObject.set(x, "barWidth", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setOnMouseMove(value: (/* p */ Point, /* event */ ReactMouseEventFrom[ReactSVGElement & Element]) => Callback): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction2((t0: /* p */ Point, t1: /* event */ ReactMouseEventFrom[ReactSVGElement & Element]) => (value(t0, t1)).runNow()))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setPoints(value: js.Array[Point]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
      
      inline def setPointsVarargs(value: Point*): Self = StObject.set(x, "points", js.Array(value*))
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait SparklinesCurveProps extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object SparklinesCurveProps {
    
    inline def apply(): SparklinesCurveProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SparklinesCurveProps]
    }
    
    extension [Self <: SparklinesCurveProps](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait SparklinesLineProps extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var onMouseMove: js.UndefOr[
        js.Function3[/* event */ enter | click, /* value */ Double, /* point */ Point, Unit]
      ] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object SparklinesLineProps {
    
    inline def apply(): SparklinesLineProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SparklinesLineProps]
    }
    
    extension [Self <: SparklinesLineProps](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setOnMouseMove(value: (/* event */ enter | click, /* value */ Double, /* point */ Point) => Callback): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction3((t0: /* event */ enter | click, t1: /* value */ Double, t2: /* point */ Point) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait SparklinesNormalBandProps extends StObject {
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object SparklinesNormalBandProps {
    
    inline def apply(): SparklinesNormalBandProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SparklinesNormalBandProps]
    }
    
    extension [Self <: SparklinesNormalBandProps](x: Self) {
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait SparklinesProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var data: js.UndefOr[js.Array[Double]] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var margin: js.UndefOr[Double] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var preserveAspectRatio: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var svgHeight: js.UndefOr[Double | String] = js.undefined
    
    var svgWidth: js.UndefOr[Double | String] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object SparklinesProps {
    
    inline def apply(): SparklinesProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SparklinesProps]
    }
    
    extension [Self <: SparklinesProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setData(value: js.Array[Double]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: Double*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setPreserveAspectRatio(value: String): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
      
      inline def setPreserveAspectRatioUndefined: Self = StObject.set(x, "preserveAspectRatio", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSvgHeight(value: Double | String): Self = StObject.set(x, "svgHeight", value.asInstanceOf[js.Any])
      
      inline def setSvgHeightUndefined: Self = StObject.set(x, "svgHeight", js.undefined)
      
      inline def setSvgWidth(value: Double | String): Self = StObject.set(x, "svgWidth", value.asInstanceOf[js.Any])
      
      inline def setSvgWidthUndefined: Self = StObject.set(x, "svgWidth", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait SparklinesReferenceLineProps extends StObject {
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var `type`: js.UndefOr[max | min | mean | avg | median | custom] = js.undefined
    
    var value: js.UndefOr[Double] = js.undefined
  }
  object SparklinesReferenceLineProps {
    
    inline def apply(): SparklinesReferenceLineProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SparklinesReferenceLineProps]
    }
    
    extension [Self <: SparklinesReferenceLineProps](x: Self) {
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setType(value: max | min | mean | avg | median | custom): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait SparklinesSpotsProps extends StObject {
    
    var size: js.UndefOr[Double] = js.undefined
    
    var spotColors: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object SparklinesSpotsProps {
    
    inline def apply(): SparklinesSpotsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SparklinesSpotsProps]
    }
    
    extension [Self <: SparklinesSpotsProps](x: Self) {
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSpotColors(value: StringDictionary[String]): Self = StObject.set(x, "spotColors", value.asInstanceOf[js.Any])
      
      inline def setSpotColorsUndefined: Self = StObject.set(x, "spotColors", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait SparklinesTextProps extends StObject {
    
    var fontFamily: js.UndefOr[String] = js.undefined
    
    var fontSize: js.UndefOr[Double] = js.undefined
    
    var point: js.UndefOr[Point] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
  }
  object SparklinesTextProps {
    
    inline def apply(): SparklinesTextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SparklinesTextProps]
    }
    
    extension [Self <: SparklinesTextProps](x: Self) {
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setPoint(value: Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
      
      inline def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
