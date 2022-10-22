package typingsJapgolly.maplibreGl.distStyleSpecMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.maplibreGl.distStyleSpecMod.FillLayerSpecification
  - typingsJapgolly.maplibreGl.distStyleSpecMod.LineLayerSpecification
  - typingsJapgolly.maplibreGl.distStyleSpecMod.SymbolLayerSpecification
  - typingsJapgolly.maplibreGl.distStyleSpecMod.CircleLayerSpecification
  - typingsJapgolly.maplibreGl.distStyleSpecMod.HeatmapLayerSpecification
  - typingsJapgolly.maplibreGl.distStyleSpecMod.FillExtrusionLayerSpecification
  - typingsJapgolly.maplibreGl.distStyleSpecMod.RasterLayerSpecification
  - typingsJapgolly.maplibreGl.distStyleSpecMod.HillshadeLayerSpecification
  - typingsJapgolly.maplibreGl.distStyleSpecMod.BackgroundLayerSpecification
*/
trait LayerSpecification extends StObject
object LayerSpecification {
  
  inline def BackgroundLayerSpecification(id: String): typingsJapgolly.maplibreGl.distStyleSpecMod.BackgroundLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("background")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.distStyleSpecMod.BackgroundLayerSpecification]
  }
  
  inline def CircleLayerSpecification(id: String, source: String): typingsJapgolly.maplibreGl.distStyleSpecMod.CircleLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("circle")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.distStyleSpecMod.CircleLayerSpecification]
  }
  
  inline def FillExtrusionLayerSpecification(id: String, source: String): typingsJapgolly.maplibreGl.distStyleSpecMod.FillExtrusionLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fill-extrusion")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.distStyleSpecMod.FillExtrusionLayerSpecification]
  }
  
  inline def FillLayerSpecification(id: String, source: String): typingsJapgolly.maplibreGl.distStyleSpecMod.FillLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fill")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.distStyleSpecMod.FillLayerSpecification]
  }
  
  inline def HeatmapLayerSpecification(id: String, source: String): typingsJapgolly.maplibreGl.distStyleSpecMod.HeatmapLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("heatmap")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.distStyleSpecMod.HeatmapLayerSpecification]
  }
  
  inline def HillshadeLayerSpecification(id: String, source: String): typingsJapgolly.maplibreGl.distStyleSpecMod.HillshadeLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("hillshade")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.distStyleSpecMod.HillshadeLayerSpecification]
  }
  
  inline def LineLayerSpecification(id: String, source: String): typingsJapgolly.maplibreGl.distStyleSpecMod.LineLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("line")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.distStyleSpecMod.LineLayerSpecification]
  }
  
  inline def RasterLayerSpecification(id: String, source: String): typingsJapgolly.maplibreGl.distStyleSpecMod.RasterLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("raster")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.distStyleSpecMod.RasterLayerSpecification]
  }
  
  inline def SymbolLayerSpecification(id: String, source: String): typingsJapgolly.maplibreGl.distStyleSpecMod.SymbolLayerSpecification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("symbol")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.distStyleSpecMod.SymbolLayerSpecification]
  }
}
