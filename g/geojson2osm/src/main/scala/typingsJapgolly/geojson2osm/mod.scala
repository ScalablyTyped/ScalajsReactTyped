package typingsJapgolly.geojson2osm

import typingsJapgolly.geojson.mod.Feature
import typingsJapgolly.geojson.mod.FeatureCollection
import typingsJapgolly.geojson.mod.GeoJsonProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("geojson2osm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def geojson2osm(features: Feature[Any, GeoJsonProperties]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("geojson2osm")(features.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def geojson2osm(features: FeatureCollection[Any, GeoJsonProperties]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("geojson2osm")(features.asInstanceOf[js.Any]).asInstanceOf[Any]
}
