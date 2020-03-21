package typingsJapgolly.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object drawMod {
  type GeometryFunction = js.Function2[
    /* p0 */ typingsJapgolly.ol.drawMod.SketchCoordType, 
    /* p1 */ js.UndefOr[typingsJapgolly.ol.simpleGeometryMod.default], 
    typingsJapgolly.ol.simpleGeometryMod.default
  ]
  type LineCoordType = js.Array[typingsJapgolly.ol.coordinateMod.Coordinate]
  type PointCoordType = typingsJapgolly.ol.coordinateMod.Coordinate
  type PolyCoordType = js.Array[js.Array[typingsJapgolly.ol.coordinateMod.Coordinate]]
  type SketchCoordType = typingsJapgolly.ol.drawMod.PointCoordType | typingsJapgolly.ol.drawMod.LineCoordType | typingsJapgolly.ol.drawMod.PolyCoordType
}
