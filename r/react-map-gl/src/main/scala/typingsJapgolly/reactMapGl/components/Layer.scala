package typingsJapgolly.reactMapGl.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.mapboxGl.mod.AnyLayout
import typingsJapgolly.mapboxGl.mod.BackgroundPaint
import typingsJapgolly.mapboxGl.mod.CirclePaint
import typingsJapgolly.mapboxGl.mod.FillExtrusionPaint
import typingsJapgolly.mapboxGl.mod.FillPaint
import typingsJapgolly.mapboxGl.mod.HeatmapPaint
import typingsJapgolly.mapboxGl.mod.HillshadePaint
import typingsJapgolly.mapboxGl.mod.LinePaint
import typingsJapgolly.mapboxGl.mod.RasterPaint
import typingsJapgolly.mapboxGl.mod.SymbolPaint
import typingsJapgolly.reactMapGl.mod.LayerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Layer {
  
  inline def apply(
    paint: BackgroundPaint | FillPaint | FillExtrusionPaint | LinePaint | SymbolPaint | RasterPaint | CirclePaint | HeatmapPaint | HillshadePaint,
    `type`: String
  ): Builder = {
    val __props = js.Dynamic.literal(paint = paint.asInstanceOf[js.Any])
    __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[LayerProps]))
  }
  
  @JSImport("react-map-gl", "Layer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactMapGl.mod.Layer] {
    
    inline def beforeId(value: String): this.type = set("beforeId", value.asInstanceOf[js.Any])
    
    inline def filter(value: js.Array[Any]): this.type = set("filter", value.asInstanceOf[js.Any])
    
    inline def filterVarargs(value: Any*): this.type = set("filter", js.Array(value*))
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def layout(value: AnyLayout): this.type = set("layout", value.asInstanceOf[js.Any])
    
    inline def maxzoom(value: Double): this.type = set("maxzoom", value.asInstanceOf[js.Any])
    
    inline def minzoom(value: Double): this.type = set("minzoom", value.asInstanceOf[js.Any])
    
    inline def source(value: String): this.type = set("source", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LayerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
