package typingsJapgolly.openlayers.mod.geom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The geometry type. One of `'Point'`, `'LineString'`, `'LinearRing'`,
  * `'Polygon'`, `'MultiPoint'`, `'MultiLineString'`, `'MultiPolygon'`,
  * `'GeometryCollection'`, `'Circle'`.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.openlayers.openlayersStrings.Point
  - typingsJapgolly.openlayers.openlayersStrings.LineString
  - typingsJapgolly.openlayers.openlayersStrings.LinearRing
  - typingsJapgolly.openlayers.openlayersStrings.Polygon
  - typingsJapgolly.openlayers.openlayersStrings.MultiPoint
  - typingsJapgolly.openlayers.openlayersStrings.MultiLineString
  - typingsJapgolly.openlayers.openlayersStrings.MultiPolygon
  - typingsJapgolly.openlayers.openlayersStrings.GeometryCollection
  - typingsJapgolly.openlayers.openlayersStrings.Circle
*/
trait GeometryType extends js.Object

object GeometryType {
  @scala.inline
  def Circle: typingsJapgolly.openlayers.openlayersStrings.Circle = this.cast("Circle")
  @scala.inline
  def GeometryCollection: typingsJapgolly.openlayers.openlayersStrings.GeometryCollection = this.cast("GeometryCollection")
  @scala.inline
  def LineString: typingsJapgolly.openlayers.openlayersStrings.LineString = this.cast("LineString")
  @scala.inline
  def LinearRing: typingsJapgolly.openlayers.openlayersStrings.LinearRing = this.cast("LinearRing")
  @scala.inline
  def MultiLineString: typingsJapgolly.openlayers.openlayersStrings.MultiLineString = this.cast("MultiLineString")
  @scala.inline
  def MultiPoint: typingsJapgolly.openlayers.openlayersStrings.MultiPoint = this.cast("MultiPoint")
  @scala.inline
  def MultiPolygon: typingsJapgolly.openlayers.openlayersStrings.MultiPolygon = this.cast("MultiPolygon")
  @scala.inline
  def Point: typingsJapgolly.openlayers.openlayersStrings.Point = this.cast("Point")
  @scala.inline
  def Polygon: typingsJapgolly.openlayers.openlayersStrings.Polygon = this.cast("Polygon")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

