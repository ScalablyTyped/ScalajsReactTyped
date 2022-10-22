package typingsJapgolly.trimblemapsTrimblemapsJs.mod

import org.scalajs.dom.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.trimblemapsTrimblemapsJs.mod.GeoJSONSourceRaw
  - typingsJapgolly.trimblemapsTrimblemapsJs.mod.VideoSourceRaw
  - typingsJapgolly.trimblemapsTrimblemapsJs.mod.ImageSourceRaw
  - typingsJapgolly.trimblemapsTrimblemapsJs.mod.CanvasSourceRaw
  - typingsJapgolly.trimblemapsTrimblemapsJs.mod.VectorSource
  - typingsJapgolly.trimblemapsTrimblemapsJs.mod.RasterSource
  - typingsJapgolly.trimblemapsTrimblemapsJs.mod.RasterDemSource
*/
trait AnySourceData extends StObject
object AnySourceData {
  
  inline def CanvasSourceRaw(canvas: String | HTMLCanvasElement, coordinates: js.Array[js.Array[Double]]): typingsJapgolly.trimblemapsTrimblemapsJs.mod.CanvasSourceRaw = {
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any], coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("canvas")
    __obj.asInstanceOf[typingsJapgolly.trimblemapsTrimblemapsJs.mod.CanvasSourceRaw]
  }
  
  inline def GeoJSONSourceRaw(): typingsJapgolly.trimblemapsTrimblemapsJs.mod.GeoJSONSourceRaw = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("geojson")
    __obj.asInstanceOf[typingsJapgolly.trimblemapsTrimblemapsJs.mod.GeoJSONSourceRaw]
  }
  
  inline def ImageSourceRaw(): typingsJapgolly.trimblemapsTrimblemapsJs.mod.ImageSourceRaw = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("image")
    __obj.asInstanceOf[typingsJapgolly.trimblemapsTrimblemapsJs.mod.ImageSourceRaw]
  }
  
  inline def RasterDemSource(): typingsJapgolly.trimblemapsTrimblemapsJs.mod.RasterDemSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("raster-dem")
    __obj.asInstanceOf[typingsJapgolly.trimblemapsTrimblemapsJs.mod.RasterDemSource]
  }
  
  inline def RasterSource(): typingsJapgolly.trimblemapsTrimblemapsJs.mod.RasterSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("raster")
    __obj.asInstanceOf[typingsJapgolly.trimblemapsTrimblemapsJs.mod.RasterSource]
  }
  
  inline def VectorSource(): typingsJapgolly.trimblemapsTrimblemapsJs.mod.VectorSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("vector")
    __obj.asInstanceOf[typingsJapgolly.trimblemapsTrimblemapsJs.mod.VectorSource]
  }
  
  inline def VideoSourceRaw(): typingsJapgolly.trimblemapsTrimblemapsJs.mod.VideoSourceRaw = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("video")
    __obj.asInstanceOf[typingsJapgolly.trimblemapsTrimblemapsJs.mod.VideoSourceRaw]
  }
}
