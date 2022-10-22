package typingsJapgolly.maplibreGl.mod

import typingsJapgolly.geojson.mod.GeoJsonProperties
import typingsJapgolly.geojson.mod.Geometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapLayerMouseEvent extends MapMouseEvent {
  
  var features: js.UndefOr[js.Array[typingsJapgolly.geojson.mod.Feature[Geometry, GeoJsonProperties]]] = js.native
}
