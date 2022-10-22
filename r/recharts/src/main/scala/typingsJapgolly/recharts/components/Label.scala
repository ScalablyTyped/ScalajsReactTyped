package typingsJapgolly.recharts.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.recharts.mod.ContentRenderer
import typingsJapgolly.recharts.mod.LabelProps
import typingsJapgolly.recharts.mod.PolarViewBox
import typingsJapgolly.recharts.mod.PositionType
import typingsJapgolly.recharts.mod.ViewBox
import typingsJapgolly.recharts.rechartsInts.`100`
import typingsJapgolly.recharts.rechartsInts.`200`
import typingsJapgolly.recharts.rechartsInts.`300`
import typingsJapgolly.recharts.rechartsInts.`400`
import typingsJapgolly.recharts.rechartsInts.`500`
import typingsJapgolly.recharts.rechartsInts.`600`
import typingsJapgolly.recharts.rechartsInts.`700`
import typingsJapgolly.recharts.rechartsInts.`800`
import typingsJapgolly.recharts.rechartsInts.`900`
import typingsJapgolly.recharts.rechartsStrings.auto
import typingsJapgolly.recharts.rechartsStrings.bold
import typingsJapgolly.recharts.rechartsStrings.bolder
import typingsJapgolly.recharts.rechartsStrings.crispEdges
import typingsJapgolly.recharts.rechartsStrings.geometricPrecision
import typingsJapgolly.recharts.rechartsStrings.inherit
import typingsJapgolly.recharts.rechartsStrings.lighter
import typingsJapgolly.recharts.rechartsStrings.normal
import typingsJapgolly.recharts.rechartsStrings.optimizeLegibility
import typingsJapgolly.recharts.rechartsStrings.optimizeQuality
import typingsJapgolly.recharts.rechartsStrings.optimizeSpeed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Label {
  
  @JSImport("recharts", "Label")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.recharts.mod.Label] {
    
    inline def alignmentBaseline(value: String): this.type = set("alignmentBaseline", value.asInstanceOf[js.Any])
    
    inline def angle(value: Double): this.type = set("angle", value.asInstanceOf[js.Any])
    
    inline def baselineShift(value: String): this.type = set("baselineShift", value.asInstanceOf[js.Any])
    
    inline def children(value: js.Array[Node] | Node): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenNull: this.type = set("children", null)
    
    inline def childrenVarargs(value: (Element | Empty | JsNumber | Node | String)*): this.type = set("children", js.Array(value*))
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def clip(value: String): this.type = set("clip", value.asInstanceOf[js.Any])
    
    inline def clipPath(value: String): this.type = set("clipPath", value.asInstanceOf[js.Any])
    
    inline def clipRule(value: String): this.type = set("clipRule", value.asInstanceOf[js.Any])
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def colorInterpolation(value: String): this.type = set("colorInterpolation", value.asInstanceOf[js.Any])
    
    inline def colorInterpolationFilters(value: String): this.type = set("colorInterpolationFilters", value.asInstanceOf[js.Any])
    
    inline def colorProfile(value: String): this.type = set("colorProfile", value.asInstanceOf[js.Any])
    
    inline def colorRendering(value: String): this.type = set("colorRendering", value.asInstanceOf[js.Any])
    
    inline def content(value: Element | ContentRenderer[Any]): this.type = set("content", value.asInstanceOf[js.Any])
    
    inline def contentFunction1(value: Any => Node): this.type = set("content", js.Any.fromFunction1(value))
    
    inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
    
    inline def cursor(value: String): this.type = set("cursor", value.asInstanceOf[js.Any])
    
    inline def direction(value: String): this.type = set("direction", value.asInstanceOf[js.Any])
    
    inline def display(value: String): this.type = set("display", value.asInstanceOf[js.Any])
    
    inline def dominantBaseline(value: String): this.type = set("dominantBaseline", value.asInstanceOf[js.Any])
    
    inline def dx(value: Double): this.type = set("dx", value.asInstanceOf[js.Any])
    
    inline def dy(value: Double): this.type = set("dy", value.asInstanceOf[js.Any])
    
    inline def fill(value: String): this.type = set("fill", value.asInstanceOf[js.Any])
    
    inline def fillOpacity(value: Double | String): this.type = set("fillOpacity", value.asInstanceOf[js.Any])
    
    inline def fillRule(value: String): this.type = set("fillRule", value.asInstanceOf[js.Any])
    
    inline def filter(value: String): this.type = set("filter", value.asInstanceOf[js.Any])
    
    inline def floodColor(value: String): this.type = set("floodColor", value.asInstanceOf[js.Any])
    
    inline def floodOpacity(value: String): this.type = set("floodOpacity", value.asInstanceOf[js.Any])
    
    inline def font(value: String): this.type = set("font", value.asInstanceOf[js.Any])
    
    inline def fontFamily(value: String): this.type = set("fontFamily", value.asInstanceOf[js.Any])
    
    inline def fontSize(value: Double | String): this.type = set("fontSize", value.asInstanceOf[js.Any])
    
    inline def fontSizeAdjust(value: Double | String): this.type = set("fontSizeAdjust", value.asInstanceOf[js.Any])
    
    inline def fontStretch(value: String): this.type = set("fontStretch", value.asInstanceOf[js.Any])
    
    inline def fontStyle(value: String): this.type = set("fontStyle", value.asInstanceOf[js.Any])
    
    inline def fontVariant(value: String): this.type = set("fontVariant", value.asInstanceOf[js.Any])
    
    inline def fontWeight(
      value: normal | bold | bolder | lighter | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900` | inherit
    ): this.type = set("fontWeight", value.asInstanceOf[js.Any])
    
    inline def formatter(value: /* label */ String | Double => Node): this.type = set("formatter", js.Any.fromFunction1(value))
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def imageRendering(value: auto | optimizeSpeed | optimizeQuality | inherit): this.type = set("imageRendering", value.asInstanceOf[js.Any])
    
    inline def kerning(value: Double | String): this.type = set("kerning", value.asInstanceOf[js.Any])
    
    inline def letterSpacing(value: String): this.type = set("letterSpacing", value.asInstanceOf[js.Any])
    
    inline def lightingColor(value: String): this.type = set("lightingColor", value.asInstanceOf[js.Any])
    
    inline def markerEnd(value: String): this.type = set("markerEnd", value.asInstanceOf[js.Any])
    
    inline def markerMid(value: String): this.type = set("markerMid", value.asInstanceOf[js.Any])
    
    inline def markerStart(value: String): this.type = set("markerStart", value.asInstanceOf[js.Any])
    
    inline def mask(value: String): this.type = set("mask", value.asInstanceOf[js.Any])
    
    inline def offset(value: Double): this.type = set("offset", value.asInstanceOf[js.Any])
    
    inline def opacity(value: Double | String): this.type = set("opacity", value.asInstanceOf[js.Any])
    
    inline def overflow(value: String): this.type = set("overflow", value.asInstanceOf[js.Any])
    
    inline def pointerEvents(value: String): this.type = set("pointerEvents", value.asInstanceOf[js.Any])
    
    inline def position(value: PositionType): this.type = set("position", value.asInstanceOf[js.Any])
    
    inline def r(value: Double): this.type = set("r", value.asInstanceOf[js.Any])
    
    inline def shapeRendering(value: auto | optimizeSpeed | crispEdges | geometricPrecision | inherit): this.type = set("shapeRendering", value.asInstanceOf[js.Any])
    
    inline def stopColor(value: String): this.type = set("stopColor", value.asInstanceOf[js.Any])
    
    inline def stopOpacity(value: Double | String): this.type = set("stopOpacity", value.asInstanceOf[js.Any])
    
    inline def stroke(value: Double | String): this.type = set("stroke", value.asInstanceOf[js.Any])
    
    inline def strokeDasharray(value: String): this.type = set("strokeDasharray", value.asInstanceOf[js.Any])
    
    inline def strokeDashoffset(value: Double | String): this.type = set("strokeDashoffset", value.asInstanceOf[js.Any])
    
    inline def strokeLinecap(value: String): this.type = set("strokeLinecap", value.asInstanceOf[js.Any])
    
    inline def strokeLinejoin(value: String): this.type = set("strokeLinejoin", value.asInstanceOf[js.Any])
    
    inline def strokeMiterlimit(value: Double | String): this.type = set("strokeMiterlimit", value.asInstanceOf[js.Any])
    
    inline def strokeOpacity(value: Double | String): this.type = set("strokeOpacity", value.asInstanceOf[js.Any])
    
    inline def strokeWidth(value: Double | String): this.type = set("strokeWidth", value.asInstanceOf[js.Any])
    
    inline def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def textAnchor(value: String): this.type = set("textAnchor", value.asInstanceOf[js.Any])
    
    inline def textDecoration(value: String): this.type = set("textDecoration", value.asInstanceOf[js.Any])
    
    inline def textRendering(value: auto | optimizeSpeed | optimizeLegibility | geometricPrecision | inherit): this.type = set("textRendering", value.asInstanceOf[js.Any])
    
    inline def transform(value: String): this.type = set("transform", value.asInstanceOf[js.Any])
    
    inline def unicodeBidi(value: String): this.type = set("unicodeBidi", value.asInstanceOf[js.Any])
    
    inline def value(value: Double | String): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def viewBox(value: ViewBox | PolarViewBox): this.type = set("viewBox", value.asInstanceOf[js.Any])
    
    inline def visibility(value: String): this.type = set("visibility", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    
    inline def wordSpacing(value: Double | String): this.type = set("wordSpacing", value.asInstanceOf[js.Any])
    
    inline def writingMode(value: String): this.type = set("writingMode", value.asInstanceOf[js.Any])
    
    inline def x(value: Double): this.type = set("x", value.asInstanceOf[js.Any])
    
    inline def y(value: Double): this.type = set("y", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Label.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: LabelProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
