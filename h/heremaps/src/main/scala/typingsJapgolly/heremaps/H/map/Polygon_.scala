package typingsJapgolly.heremaps.H.map

import typingsJapgolly.heremaps.H.geo.LineString
import typingsJapgolly.heremaps.H.geo.MultiPolygon
import typingsJapgolly.heremaps.H.map.Polygon.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class represents a polygon in geo-space. It is defined by a strip containing the vertices of a geo shape object (lat, lng, alt values) and a pen to use when rendering the polyline.
  * Polygon represents a closed plane defined by the list of verticies, projected on the map display. List of vericies which define the polygon are is a list of geo coordinates encapsulated
  * by the strip object H.geo.Strip
  */
@JSGlobal("H.map.Polygon")
@js.native
class Polygon_ protected () extends GeoShape {
  /**
    * Constructor
    * @param geometry {H.geo.LineString | H.geo.Polygon | H.geo.MultiPolygon}
    * The geometry that defines the surface of the polygon. H.geo.LineString is interpreted as an exterior ring of H.geo.Polygon object.
    * @param opt_options {H.map.Spatial.Options=} - optional initialization parameters
    */
  def this(geometry: LineString) = this()
  def this(geometry: MultiPolygon) = this()
  def this(geometry: typingsJapgolly.heremaps.H.geo.Polygon) = this()
  def this(geometry: LineString, opt_options: Options) = this()
  def this(geometry: MultiPolygon, opt_options: Options) = this()
  def this(geometry: typingsJapgolly.heremaps.H.geo.Polygon, opt_options: Options) = this()
  /**
    * To obtain the polygon's geometry. If you modify the obtained geometry, you must call setGeometry afterwards to not violate the integrity of the polygon.
    */
  def getGeometry(): typingsJapgolly.heremaps.H.geo.Polygon | MultiPolygon = js.native
  /**
    * See H.map.Polygon#setNorthPoleCovering
    * @returns {boolean}
    */
  def getNorthPoleCovering(): Boolean = js.native
  def setGeometry(geometry: MultiPolygon): Polygon = js.native
  /**
    * To set the polygon's geometry. If the given geometry is modified afterwards, it must be set via setGeometry again to not violate the integrity of the polygon.
    * @param geometry
    */
  def setGeometry(geometry: typingsJapgolly.heremaps.H.geo.Polygon): Polygon = js.native
  /**
    * To set the indicator whether this polygon covers the north pole. It's needed for Polygons whose strip is defined as lines arround the world on longitude axis (for example a circle whose
    * center is one of the poles). In this case a additional information is needed to know if the southern or northern part of the world should be covered by the poygon.
    * @param flag {boolean} - A value of true means it covers the north pole, false means south pole
    * @returns {H.map.Polygon} - the Polygon instance itself
    */
  def setNorthPoleCovering(flag: Boolean): Polygon = js.native
}

