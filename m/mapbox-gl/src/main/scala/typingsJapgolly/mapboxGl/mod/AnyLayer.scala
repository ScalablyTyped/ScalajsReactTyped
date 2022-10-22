package typingsJapgolly.mapboxGl.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mapboxGl.mod.BackgroundLayer
  - typingsJapgolly.mapboxGl.mod.CircleLayer
  - typingsJapgolly.mapboxGl.mod.FillExtrusionLayer
  - typingsJapgolly.mapboxGl.mod.FillLayer
  - typingsJapgolly.mapboxGl.mod.HeatmapLayer
  - typingsJapgolly.mapboxGl.mod.HillshadeLayer
  - typingsJapgolly.mapboxGl.mod.LineLayer
  - typingsJapgolly.mapboxGl.mod.RasterLayer
  - typingsJapgolly.mapboxGl.mod.SymbolLayer
  - typingsJapgolly.mapboxGl.mod.CustomLayerInterface
  - typingsJapgolly.mapboxGl.mod.SkyLayer
*/
trait AnyLayer extends StObject
object AnyLayer {
  
  inline def BackgroundLayer(id: String): typingsJapgolly.mapboxGl.mod.BackgroundLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("background")
    __obj.asInstanceOf[typingsJapgolly.mapboxGl.mod.BackgroundLayer]
  }
  
  inline def CircleLayer(id: String): typingsJapgolly.mapboxGl.mod.CircleLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("circle")
    __obj.asInstanceOf[typingsJapgolly.mapboxGl.mod.CircleLayer]
  }
  
  inline def CustomLayerInterface(id: String, render: (WebGLRenderingContext, js.Array[Double]) => Callback): typingsJapgolly.mapboxGl.mod.CustomLayerInterface = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], render = js.Any.fromFunction2((t0: WebGLRenderingContext, t1: js.Array[Double]) => (render(t0, t1)).runNow()))
    __obj.updateDynamic("type")("custom")
    __obj.asInstanceOf[typingsJapgolly.mapboxGl.mod.CustomLayerInterface]
  }
  
  inline def FillExtrusionLayer(id: String): typingsJapgolly.mapboxGl.mod.FillExtrusionLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fill-extrusion")
    __obj.asInstanceOf[typingsJapgolly.mapboxGl.mod.FillExtrusionLayer]
  }
  
  inline def FillLayer(id: String): typingsJapgolly.mapboxGl.mod.FillLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fill")
    __obj.asInstanceOf[typingsJapgolly.mapboxGl.mod.FillLayer]
  }
  
  inline def HeatmapLayer(id: String): typingsJapgolly.mapboxGl.mod.HeatmapLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("heatmap")
    __obj.asInstanceOf[typingsJapgolly.mapboxGl.mod.HeatmapLayer]
  }
  
  inline def HillshadeLayer(id: String): typingsJapgolly.mapboxGl.mod.HillshadeLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("hillshade")
    __obj.asInstanceOf[typingsJapgolly.mapboxGl.mod.HillshadeLayer]
  }
  
  inline def LineLayer(id: String): typingsJapgolly.mapboxGl.mod.LineLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("line")
    __obj.asInstanceOf[typingsJapgolly.mapboxGl.mod.LineLayer]
  }
  
  inline def RasterLayer(id: String): typingsJapgolly.mapboxGl.mod.RasterLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("raster")
    __obj.asInstanceOf[typingsJapgolly.mapboxGl.mod.RasterLayer]
  }
  
  inline def SkyLayer(id: String): typingsJapgolly.mapboxGl.mod.SkyLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("sky")
    __obj.asInstanceOf[typingsJapgolly.mapboxGl.mod.SkyLayer]
  }
  
  inline def SymbolLayer(id: String): typingsJapgolly.mapboxGl.mod.SymbolLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("symbol")
    __obj.asInstanceOf[typingsJapgolly.mapboxGl.mod.SymbolLayer]
  }
}
