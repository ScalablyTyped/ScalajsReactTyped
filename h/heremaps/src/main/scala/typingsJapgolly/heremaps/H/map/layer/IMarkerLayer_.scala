package typingsJapgolly.heremaps.H.map.layer

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.heremaps.H.geo.Rect
import typingsJapgolly.heremaps.H.map.layer.IMarkerLayer.Response
import typingsJapgolly.heremaps.H.map.layer.IMarkerLayer.TiledResponse
import typingsJapgolly.heremaps.H.math.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface describes a layer which provides marker objects to the renderer.
  */
trait IMarkerLayer_ extends js.Object {
  /**
    * This method requests dom marker objects for provided bounding rectangle.
    * @param boundingRect {H.geo.Rect} - the bounding rectangle for which marker are to be returned
    * @param zoomLevel {number} - The zoom level for which the objects are requested
    * @param cacheOnly {boolean} - Indicates whether only cached objects are to be considered
    * @param prioCenter {H.math.Point} - The priority center as an offset in screen pixel relative to the center
    * @returns {(H.map.layer.IMarkerLayer.Response | H.map.layer.IMarkerLayer.TiledResponse)} - a response object containing the number of markers and the markers themselves
    */
  def requestDomMarkers(boundingRect: Rect, zoomLevel: Double, cacheOnly: Boolean, prioCenter: Point): Response | TiledResponse
  /**
    * This method requests marker objects for provided bounding rectangle.
    * @param boundingRect {H.geo.Rect} - the bounding rectangle for which marker are to be returned
    * @param zoomLevel {number} - The zoom level for which the objects are requested
    * @param cacheOnly {boolean} - Indicates whether only cached objects are to be considered
    * @param prioCenter {H.math.Point} - The priority center as an offset in screen pixel relative to the center
    * @returns {(H.map.layer.IMarkerLayer.Response | H.map.layer.IMarkerLayer.TiledResponse)} - a response object containing the number of markers and the markers themselves
    */
  def requestMarkers(boundingRect: Rect, zoomLevel: Double, cacheOnly: Boolean, prioCenter: Point): Response | TiledResponse
}

object IMarkerLayer_ {
  @scala.inline
  def apply(
    requestDomMarkers: (Rect, Double, Boolean, Point) => CallbackTo[Response | TiledResponse],
    requestMarkers: (Rect, Double, Boolean, Point) => CallbackTo[Response | TiledResponse]
  ): IMarkerLayer_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("requestDomMarkers")(js.Any.fromFunction4((t0: typingsJapgolly.heremaps.H.geo.Rect, t1: scala.Double, t2: scala.Boolean, t3: typingsJapgolly.heremaps.H.math.Point) => requestDomMarkers(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("requestMarkers")(js.Any.fromFunction4((t0: typingsJapgolly.heremaps.H.geo.Rect, t1: scala.Double, t2: scala.Boolean, t3: typingsJapgolly.heremaps.H.math.Point) => requestMarkers(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[IMarkerLayer_]
  }
}

