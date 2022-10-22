package typingsJapgolly.arcgisToGeojsonUtils

import typingsJapgolly.arcgisRestApi.mod.Geometry
import typingsJapgolly.geojson.mod.GeometryObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("arcgis-to-geojson-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def arcgisToGeoJSON[T /* <: Geometry */](arcgis: T): GeometryObject = ^.asInstanceOf[js.Dynamic].applyDynamic("arcgisToGeoJSON")(arcgis.asInstanceOf[js.Any]).asInstanceOf[GeometryObject]
  
  inline def geojsonToArcGIS(geojson: GeometryObject): Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("geojsonToArcGIS")(geojson.asInstanceOf[js.Any]).asInstanceOf[Geometry]
}
