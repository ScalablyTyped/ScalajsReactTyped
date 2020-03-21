package typingsJapgolly.d3Geo.mod

import typingsJapgolly.d3Geo.AnonStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoTransformPrototype extends js.Object {
  /**
    * Indicates the end of a line or ring. Within a polygon, indicates the end of a ring.
    * Unlike GeoJSON, the redundant closing coordinate of a ring is not indicated via point, and instead is implied via lineEnd within a polygon.
    */
  var lineEnd: js.UndefOr[js.ThisFunction0[/* this */ this.type with AnonStream, Unit]] = js.undefined
  /**
    * Indicates the start of a line or ring. Within a polygon, indicates the start of a ring. The first ring of a polygon is the exterior ring, and is typically clockwise.
    * Any subsequent rings indicate holes in the polygon, and are typically counterclockwise.
    */
  var lineStart: js.UndefOr[js.ThisFunction0[/* this */ this.type with AnonStream, Unit]] = js.undefined
  /**
    * Indicates a point with the specified coordinates x and y (and optionally z). The coordinate system is unspecified and implementation-dependent;
    * for example, projection streams require spherical coordinates in degrees as input. Outside the context of a polygon or line,
    * a point indicates a point geometry object (Point or MultiPoint). Within a line or polygon ring, the point indicates a control point.
    *
    * @param x x-coordinate of point.
    * @param y y-coordinate of point.
    * @param z Optional z-coordinate of point.
    */
  var point: js.UndefOr[
    js.ThisFunction3[
      /* this */ this.type with AnonStream, 
      /* x */ Double, 
      /* y */ Double, 
      /* z */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  /**
    * Indicates the end of a polygon.
    */
  var polygonEnd: js.UndefOr[js.ThisFunction0[/* this */ this.type with AnonStream, Unit]] = js.undefined
  /**
    * Indicates the start of a polygon. The first line of a polygon indicates the exterior ring, and any subsequent lines indicate interior holes.
    */
  var polygonStart: js.UndefOr[js.ThisFunction0[/* this */ this.type with AnonStream, Unit]] = js.undefined
  /**
    * Indicates the sphere (the globe; the unit sphere centered at ⟨0,0,0⟩).
    */
  var sphere: js.UndefOr[js.ThisFunction0[/* this */ this.type with AnonStream, Unit]] = js.undefined
}

object GeoTransformPrototype {
  @scala.inline
  def apply(
    lineEnd: js.ThisFunction0[/* this */ GeoTransformPrototype with AnonStream, Unit] = null,
    lineStart: js.ThisFunction0[/* this */ GeoTransformPrototype with AnonStream, Unit] = null,
    point: js.ThisFunction3[
      /* this */ GeoTransformPrototype with AnonStream, 
      /* x */ Double, 
      /* y */ Double, 
      /* z */ js.UndefOr[Double], 
      Unit
    ] = null,
    polygonEnd: js.ThisFunction0[/* this */ GeoTransformPrototype with AnonStream, Unit] = null,
    polygonStart: js.ThisFunction0[/* this */ GeoTransformPrototype with AnonStream, Unit] = null,
    sphere: js.ThisFunction0[/* this */ GeoTransformPrototype with AnonStream, Unit] = null
  ): GeoTransformPrototype = {
    val __obj = js.Dynamic.literal()
    if (lineEnd != null) __obj.updateDynamic("lineEnd")(lineEnd.asInstanceOf[js.Any])
    if (lineStart != null) __obj.updateDynamic("lineStart")(lineStart.asInstanceOf[js.Any])
    if (point != null) __obj.updateDynamic("point")(point.asInstanceOf[js.Any])
    if (polygonEnd != null) __obj.updateDynamic("polygonEnd")(polygonEnd.asInstanceOf[js.Any])
    if (polygonStart != null) __obj.updateDynamic("polygonStart")(polygonStart.asInstanceOf[js.Any])
    if (sphere != null) __obj.updateDynamic("sphere")(sphere.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoTransformPrototype]
  }
}

