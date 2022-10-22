package typingsJapgolly.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.maplibreGl.mod.FillLayerSpecification
  - typingsJapgolly.maplibreGl.mod.LineLayerSpecification
  - typingsJapgolly.maplibreGl.mod.SymbolLayerSpecification
  - typingsJapgolly.maplibreGl.mod.CircleLayerSpecification
  - typingsJapgolly.maplibreGl.mod.HeatmapLayerSpecification
  - typingsJapgolly.maplibreGl.mod.FillExtrusionLayerSpecification
  - typingsJapgolly.maplibreGl.mod.RasterLayerSpecification
  - typingsJapgolly.maplibreGl.mod.HillshadeLayerSpecification
  - typingsJapgolly.maplibreGl.mod.BackgroundLayerSpecification
*/
trait LayerSpecification extends StObject
object LayerSpecification {
  
  inline def BackgroundLayerSpecification(id: String): typingsJapgolly.maplibreGl.mod.BackgroundLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("background")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.mod.BackgroundLayerSpecification]
  }
  
  inline def CircleLayerSpecification(id: String, source: String): typingsJapgolly.maplibreGl.mod.CircleLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("circle")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.mod.CircleLayerSpecification]
  }
  
  inline def FillExtrusionLayerSpecification(id: String, source: String): typingsJapgolly.maplibreGl.mod.FillExtrusionLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fill-extrusion")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.mod.FillExtrusionLayerSpecification]
  }
  
  inline def FillLayerSpecification(id: String, source: String): typingsJapgolly.maplibreGl.mod.FillLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fill")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.mod.FillLayerSpecification]
  }
  
  inline def HeatmapLayerSpecification(id: String, source: String): typingsJapgolly.maplibreGl.mod.HeatmapLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("heatmap")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.mod.HeatmapLayerSpecification]
  }
  
  inline def HillshadeLayerSpecification(id: String, source: String): typingsJapgolly.maplibreGl.mod.HillshadeLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("hillshade")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.mod.HillshadeLayerSpecification]
  }
  
  inline def LineLayerSpecification(id: String, source: String): typingsJapgolly.maplibreGl.mod.LineLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("line")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.mod.LineLayerSpecification]
  }
  
  inline def RasterLayerSpecification(id: String, source: String): typingsJapgolly.maplibreGl.mod.RasterLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("raster")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.mod.RasterLayerSpecification]
  }
  
  inline def SymbolLayerSpecification(id: String, source: String): typingsJapgolly.maplibreGl.mod.SymbolLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("symbol")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.mod.SymbolLayerSpecification]
  }
}
