package typingsJapgolly.mapboxMapboxSdk.servicesDirectionsMod

import typingsJapgolly.geojson.mod.LineString
import typingsJapgolly.geojson.mod.MultiLineString
import typingsJapgolly.mapboxMapboxSdk.libClassesMapiRequestMod.MapiRequest
import typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.geojson
import typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.polyline
import typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.polyline6
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectionsService extends StObject {
  
  def getDirections(request: DirectionsRequest[polyline | polyline6]): MapiRequest[DirectionsResponse[Polyline]] = js.native
  @JSName("getDirections")
  def getDirections_geojson(request: DirectionsRequest[geojson]): MapiRequest[DirectionsResponse[MultiLineString | LineString]] = js.native
  @JSName("getDirections")
  def getDirections_polyline(request: DirectionsRequest[polyline]): MapiRequest[DirectionsResponse[Polyline]] = js.native
}
