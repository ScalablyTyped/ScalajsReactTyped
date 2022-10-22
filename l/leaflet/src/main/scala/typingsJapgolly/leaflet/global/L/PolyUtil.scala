package typingsJapgolly.leaflet.global.L

import typingsJapgolly.leaflet.mod.BoundsExpression
import typingsJapgolly.leaflet.mod.LatLngExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PolyUtil {
  
  @JSGlobal("L.PolyUtil")
  @js.native
  val ^ : js.Any = js.native
  
  inline def clipPolygon(points: js.Array[typingsJapgolly.leaflet.mod.Point_], bounds: BoundsExpression): js.Array[typingsJapgolly.leaflet.mod.Point_] = (^.asInstanceOf[js.Dynamic].applyDynamic("clipPolygon")(points.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.leaflet.mod.Point_]]
  inline def clipPolygon(points: js.Array[typingsJapgolly.leaflet.mod.Point_], bounds: BoundsExpression, round: Boolean): js.Array[typingsJapgolly.leaflet.mod.Point_] = (^.asInstanceOf[js.Dynamic].applyDynamic("clipPolygon")(points.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], round.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.leaflet.mod.Point_]]
  
  inline def polygonCenter(latlngs: js.Array[LatLngExpression], crs: typingsJapgolly.leaflet.mod.CRS): typingsJapgolly.leaflet.mod.LatLng_ = (^.asInstanceOf[js.Dynamic].applyDynamic("polygonCenter")(latlngs.asInstanceOf[js.Any], crs.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.leaflet.mod.LatLng_]
}
