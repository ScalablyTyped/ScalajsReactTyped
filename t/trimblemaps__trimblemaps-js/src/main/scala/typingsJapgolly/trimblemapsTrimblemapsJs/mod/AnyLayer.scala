package typingsJapgolly.trimblemapsTrimblemapsJs.mod

import org.scalajs.dom.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.trimblemapsTrimblemapsJs.mod.BackgroundLayer
  - typingsJapgolly.trimblemapsTrimblemapsJs.mod.CircleLayer
  - typingsJapgolly.trimblemapsTrimblemapsJs.mod.FillExtrusionLayer
  - typingsJapgolly.trimblemapsTrimblemapsJs.mod.FillLayer
  - typingsJapgolly.trimblemapsTrimblemapsJs.mod.HeatmapLayer
  - typingsJapgolly.trimblemapsTrimblemapsJs.mod.HillshadeLayer
  - typingsJapgolly.trimblemapsTrimblemapsJs.mod.LineLayer
  - typingsJapgolly.trimblemapsTrimblemapsJs.mod.RasterLayer
  - typingsJapgolly.trimblemapsTrimblemapsJs.mod.SymbolLayer
  - typingsJapgolly.trimblemapsTrimblemapsJs.mod.CustomLayerInterface
*/
trait AnyLayer extends StObject
object AnyLayer {
  
  inline def BackgroundLayer(id: String): typingsJapgolly.trimblemapsTrimblemapsJs.mod.BackgroundLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("background")
    __obj.asInstanceOf[typingsJapgolly.trimblemapsTrimblemapsJs.mod.BackgroundLayer]
  }
  
  inline def CircleLayer(id: String): typingsJapgolly.trimblemapsTrimblemapsJs.mod.CircleLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("circle")
    __obj.asInstanceOf[typingsJapgolly.trimblemapsTrimblemapsJs.mod.CircleLayer]
  }
  
  inline def CustomLayerInterface(id: String, render: (WebGLRenderingContext, js.Array[Double]) => japgolly.scalajs.react.Callback): typingsJapgolly.trimblemapsTrimblemapsJs.mod.CustomLayerInterface = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], render = js.Any.fromFunction2((t0: WebGLRenderingContext, t1: js.Array[Double]) => (render(t0, t1)).runNow()))
    __obj.updateDynamic("type")("custom")
    __obj.asInstanceOf[typingsJapgolly.trimblemapsTrimblemapsJs.mod.CustomLayerInterface]
  }
  
  inline def FillExtrusionLayer(id: String): typingsJapgolly.trimblemapsTrimblemapsJs.mod.FillExtrusionLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fill-extrusion")
    __obj.asInstanceOf[typingsJapgolly.trimblemapsTrimblemapsJs.mod.FillExtrusionLayer]
  }
  
  inline def FillLayer(id: String): typingsJapgolly.trimblemapsTrimblemapsJs.mod.FillLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fill")
    __obj.asInstanceOf[typingsJapgolly.trimblemapsTrimblemapsJs.mod.FillLayer]
  }
  
  inline def HeatmapLayer(id: String): typingsJapgolly.trimblemapsTrimblemapsJs.mod.HeatmapLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("heatmap")
    __obj.asInstanceOf[typingsJapgolly.trimblemapsTrimblemapsJs.mod.HeatmapLayer]
  }
  
  inline def HillshadeLayer(id: String): typingsJapgolly.trimblemapsTrimblemapsJs.mod.HillshadeLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("hillshade")
    __obj.asInstanceOf[typingsJapgolly.trimblemapsTrimblemapsJs.mod.HillshadeLayer]
  }
  
  inline def LineLayer(id: String): typingsJapgolly.trimblemapsTrimblemapsJs.mod.LineLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("line")
    __obj.asInstanceOf[typingsJapgolly.trimblemapsTrimblemapsJs.mod.LineLayer]
  }
  
  inline def RasterLayer(id: String): typingsJapgolly.trimblemapsTrimblemapsJs.mod.RasterLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("raster")
    __obj.asInstanceOf[typingsJapgolly.trimblemapsTrimblemapsJs.mod.RasterLayer]
  }
  
  inline def SymbolLayer(id: String): typingsJapgolly.trimblemapsTrimblemapsJs.mod.SymbolLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("symbol")
    __obj.asInstanceOf[typingsJapgolly.trimblemapsTrimblemapsJs.mod.SymbolLayer]
  }
}
