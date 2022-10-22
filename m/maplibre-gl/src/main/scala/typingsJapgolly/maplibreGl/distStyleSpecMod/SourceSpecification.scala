package typingsJapgolly.maplibreGl.distStyleSpecMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.maplibreGl.distStyleSpecMod.VectorSourceSpecification
  - typingsJapgolly.maplibreGl.distStyleSpecMod.RasterSourceSpecification
  - typingsJapgolly.maplibreGl.distStyleSpecMod.RasterDEMSourceSpecification
  - typingsJapgolly.maplibreGl.distStyleSpecMod.GeoJSONSourceSpecification
  - typingsJapgolly.maplibreGl.distStyleSpecMod.VideoSourceSpecification
  - typingsJapgolly.maplibreGl.distStyleSpecMod.ImageSourceSpecification
*/
trait SourceSpecification extends StObject
object SourceSpecification {
  
  inline def GeoJSONSourceSpecification(): typingsJapgolly.maplibreGl.distStyleSpecMod.GeoJSONSourceSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("geojson")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.distStyleSpecMod.GeoJSONSourceSpecification]
  }
  
  inline def ImageSourceSpecification(
    coordinates: js.Tuple4[
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double]
    ],
    url: String
  ): typingsJapgolly.maplibreGl.distStyleSpecMod.ImageSourceSpecification = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("image")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.distStyleSpecMod.ImageSourceSpecification]
  }
  
  inline def RasterDEMSourceSpecification(): typingsJapgolly.maplibreGl.distStyleSpecMod.RasterDEMSourceSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("raster-dem")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.distStyleSpecMod.RasterDEMSourceSpecification]
  }
  
  inline def RasterSourceSpecification(): typingsJapgolly.maplibreGl.distStyleSpecMod.RasterSourceSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("raster")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.distStyleSpecMod.RasterSourceSpecification]
  }
  
  inline def VectorSourceSpecification(): typingsJapgolly.maplibreGl.distStyleSpecMod.VectorSourceSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("vector")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.distStyleSpecMod.VectorSourceSpecification]
  }
  
  inline def VideoSourceSpecification(
    coordinates: js.Tuple4[
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double]
    ],
    urls: js.Array[String]
  ): typingsJapgolly.maplibreGl.distStyleSpecMod.VideoSourceSpecification = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("video")
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.distStyleSpecMod.VideoSourceSpecification]
  }
}
