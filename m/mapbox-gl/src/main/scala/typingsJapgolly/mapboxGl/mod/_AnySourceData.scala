package typingsJapgolly.mapboxGl.mod

import org.scalajs.dom.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _AnySourceData extends StObject
object _AnySourceData {
  
  inline def CanvasSourceRaw(canvas: String | HTMLCanvasElement, coordinates: js.Array[js.Array[Double]]): typingsJapgolly.mapboxGl.mod.CanvasSourceRaw = {
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any], coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("canvas")
    __obj.asInstanceOf[typingsJapgolly.mapboxGl.mod.CanvasSourceRaw]
  }
  
  inline def GeoJSONSourceRaw(): typingsJapgolly.mapboxGl.mod.GeoJSONSourceRaw = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("geojson")
    __obj.asInstanceOf[typingsJapgolly.mapboxGl.mod.GeoJSONSourceRaw]
  }
  
  inline def ImageSourceRaw(): typingsJapgolly.mapboxGl.mod.ImageSourceRaw = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("image")
    __obj.asInstanceOf[typingsJapgolly.mapboxGl.mod.ImageSourceRaw]
  }
  
  inline def RasterDemSource(): typingsJapgolly.mapboxGl.mod.RasterDemSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("raster-dem")
    __obj.asInstanceOf[typingsJapgolly.mapboxGl.mod.RasterDemSource]
  }
  
  inline def RasterSource(): typingsJapgolly.mapboxGl.mod.RasterSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("raster")
    __obj.asInstanceOf[typingsJapgolly.mapboxGl.mod.RasterSource]
  }
  
  inline def VectorSource(): typingsJapgolly.mapboxGl.mod.VectorSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("vector")
    __obj.asInstanceOf[typingsJapgolly.mapboxGl.mod.VectorSource]
  }
  
  inline def VideoSourceRaw(): typingsJapgolly.mapboxGl.mod.VideoSourceRaw = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("video")
    __obj.asInstanceOf[typingsJapgolly.mapboxGl.mod.VideoSourceRaw]
  }
}
