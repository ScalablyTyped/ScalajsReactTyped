package typingsJapgolly.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.maplibreGl.mod.VectorSourceSpecification
  - typingsJapgolly.maplibreGl.mod.RasterSourceSpecification
  - typingsJapgolly.maplibreGl.mod.RasterDEMSourceSpecification
  - typingsJapgolly.maplibreGl.mod.GeoJSONSourceSpecification
  - typingsJapgolly.maplibreGl.mod.VideoSourceSpecification
  - typingsJapgolly.maplibreGl.mod.ImageSourceSpecification
*/
trait SourceSpecification extends StObject
object SourceSpecification {
  
  inline def GeoJSONSourceSpecification(): typingsJapgolly.maplibreGl.mod.GeoJSONSourceSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("geojson")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.mod.GeoJSONSourceSpecification]
  }
  
  inline def ImageSourceSpecification(
    coordinates: js.Tuple4[
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double]
    ],
    url: String
  ): typingsJapgolly.maplibreGl.mod.ImageSourceSpecification = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("image")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.mod.ImageSourceSpecification]
  }
  
  inline def RasterDEMSourceSpecification(): typingsJapgolly.maplibreGl.mod.RasterDEMSourceSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("raster-dem")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.mod.RasterDEMSourceSpecification]
  }
  
  inline def RasterSourceSpecification(): typingsJapgolly.maplibreGl.mod.RasterSourceSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("raster")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.mod.RasterSourceSpecification]
  }
  
  inline def VectorSourceSpecification(): typingsJapgolly.maplibreGl.mod.VectorSourceSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("vector")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.mod.VectorSourceSpecification]
  }
  
  inline def VideoSourceSpecification(
    coordinates: js.Tuple4[
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double]
    ],
    urls: js.Array[String]
  ): typingsJapgolly.maplibreGl.mod.VideoSourceSpecification = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("video")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.mod.VideoSourceSpecification]
  }
}
