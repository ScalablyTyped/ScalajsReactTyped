package typingsJapgolly.reactNativeMaps.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.geojson.mod.FeatureCollection
import typingsJapgolly.geojson.mod.GeoJsonProperties
import typingsJapgolly.geojson.mod.Geometry
import typingsJapgolly.reactNative.mod.ImageRequireSource
import typingsJapgolly.reactNative.mod.ImageURISource
import typingsJapgolly.reactNativeMaps.libGeojsonMod.GeojsonProps
import typingsJapgolly.reactNativeMaps.libGeojsonMod.OverlayPressEvent
import typingsJapgolly.reactNativeMaps.libSharedTypesMod.LineCapType
import typingsJapgolly.reactNativeMaps.libSharedTypesMod.LineJoinType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Geojson {
  
  inline def apply(geojson: FeatureCollection[Geometry, GeoJsonProperties]): Builder = {
    val __props = js.Dynamic.literal(geojson = geojson.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[GeojsonProps]))
  }
  
  @JSImport("react-native-maps/lib", "Geojson")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def fillColor(value: String): this.type = set("fillColor", value.asInstanceOf[js.Any])
    
    inline def image(value: ImageURISource | ImageRequireSource): this.type = set("image", value.asInstanceOf[js.Any])
    
    inline def lineCap(value: LineCapType): this.type = set("lineCap", value.asInstanceOf[js.Any])
    
    inline def lineDashPattern(value: js.Array[Double]): this.type = set("lineDashPattern", value.asInstanceOf[js.Any])
    
    inline def lineDashPatternVarargs(value: Double*): this.type = set("lineDashPattern", js.Array(value*))
    
    inline def lineDashPhase(value: Double): this.type = set("lineDashPhase", value.asInstanceOf[js.Any])
    
    inline def lineJoin(value: LineJoinType): this.type = set("lineJoin", value.asInstanceOf[js.Any])
    
    inline def markerComponent(value: VdomNode): this.type = set("markerComponent", value.rawNode.asInstanceOf[js.Any])
    
    inline def markerComponentNull: this.type = set("markerComponent", null)
    
    inline def markerComponentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("markerComponent", js.Array(value*))
    
    inline def markerComponentVdomElement(value: VdomElement): this.type = set("markerComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def miterLimit(value: Double): this.type = set("miterLimit", value.asInstanceOf[js.Any])
    
    inline def onPress(value: /* event */ OverlayPressEvent => Callback): this.type = set("onPress", js.Any.fromFunction1((t0: /* event */ OverlayPressEvent) => value(t0).runNow()))
    
    inline def strokeColor(value: String): this.type = set("strokeColor", value.asInstanceOf[js.Any])
    
    inline def strokeWidth(value: Double): this.type = set("strokeWidth", value.asInstanceOf[js.Any])
    
    inline def tappable(value: Boolean): this.type = set("tappable", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def tracksViewChanges(value: Boolean): this.type = set("tracksViewChanges", value.asInstanceOf[js.Any])
    
    inline def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: GeojsonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
