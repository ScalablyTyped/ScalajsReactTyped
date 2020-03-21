package typingsJapgolly.three.geometriesMod

import typingsJapgolly.three.shapeMod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/Geometries", "ShapeGeometry")
@js.native
class ShapeGeometry protected ()
  extends typingsJapgolly.three.shapeGeometryMod.ShapeGeometry {
  def this(shapes: js.Array[Shape]) = this()
  def this(shapes: Shape) = this()
  def this(shapes: js.Array[Shape], curveSegments: Double) = this()
  def this(shapes: Shape, curveSegments: Double) = this()
}

