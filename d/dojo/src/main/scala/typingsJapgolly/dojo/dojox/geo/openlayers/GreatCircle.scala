package typingsJapgolly.dojo.dojox.geo.openlayers

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/geo/openlayers/GreatCircle.html
  *
  *
  */
trait GreatCircle extends js.Object {
  /**
    *
    */
  var DEG2RAD: Double
  /**
    *
    */
  var RAD2DEG: Double
  /**
    *
    */
  var TOLERANCE: Double
  /**
    * Create a geodetic line as an array of dojox.geo.openlayers.GeometryFeature.
    * Create a geodetic line as a dojox.geo.openlayers.GeometryFeature between the point p1
    * ant the point p2. Result is a polyline approximation for which a new point is
    * calculated every increment degrees.
    *
    * @param p1 The first point of the geodetic line. x and y fields are longitude andlatitude in decimal degrees.
    * @param p2 The second point of the geodetic line. x and y fields are longitude andlatitude in decimal degrees.
    * @param increment The value at which a new point is computed.
    */
  def toGeometryFeature(p1: Point, p2: Point, increment: Double): js.Any
  /**
    * Create a geodetic line as an array of OpenLayers.Geometry.LineString.
    * Create a geodetic line as a OpenLayers.Geometry.LineString between the point p1
    * and the point p2. Result is a polyline approximation for which a new point is
    * calculated every increment degrees.
    *
    * @param p1 The first point of the geodetic line. x and y fields are longitude andlatitude in decimal degrees.
    * @param p2 The second point of the geodetic line. x and y fields are longitude andlatitude in decimal degrees.
    * @param increment The value at which a new point is computed.
    */
  def toLineString(p1: Point, p2: Point, increment: Double): js.Any
  /**
    * Create a geodetic line as an array of OpenLayers.Point.
    * Create a geodetic line as an array of OpenLayers.Point between the point p1
    * and the point p2. Result is a polyline approximation for which a new point is
    * calculated every increment degrees.
    *
    * @param p1 The first point of the geodetic line. x and y fields are longitude andlatitude in decimal degrees.
    * @param p2 The second point of the geodetic line. x and y fields are longitude andlatitude in decimal degrees.
    * @param increment The value at which a new point is computed.
    */
  def toPointArray(p1: Point, p2: Point, increment: Double): js.Array[_]
}

object GreatCircle {
  @scala.inline
  def apply(
    DEG2RAD: Double,
    RAD2DEG: Double,
    TOLERANCE: Double,
    toGeometryFeature: (Point, Point, Double) => CallbackTo[js.Any],
    toLineString: (Point, Point, Double) => CallbackTo[js.Any],
    toPointArray: (Point, Point, Double) => CallbackTo[js.Array[js.Any]]
  ): GreatCircle = {
    val __obj = js.Dynamic.literal(DEG2RAD = DEG2RAD.asInstanceOf[js.Any], RAD2DEG = RAD2DEG.asInstanceOf[js.Any], TOLERANCE = TOLERANCE.asInstanceOf[js.Any])
    __obj.updateDynamic("toGeometryFeature")(js.Any.fromFunction3((t0: typingsJapgolly.dojo.dojox.geo.openlayers.Point, t1: typingsJapgolly.dojo.dojox.geo.openlayers.Point, t2: scala.Double) => toGeometryFeature(t0, t1, t2).runNow()))
    __obj.updateDynamic("toLineString")(js.Any.fromFunction3((t0: typingsJapgolly.dojo.dojox.geo.openlayers.Point, t1: typingsJapgolly.dojo.dojox.geo.openlayers.Point, t2: scala.Double) => toLineString(t0, t1, t2).runNow()))
    __obj.updateDynamic("toPointArray")(js.Any.fromFunction3((t0: typingsJapgolly.dojo.dojox.geo.openlayers.Point, t1: typingsJapgolly.dojo.dojox.geo.openlayers.Point, t2: scala.Double) => toPointArray(t0, t1, t2).runNow()))
    __obj.asInstanceOf[GreatCircle]
  }
}

