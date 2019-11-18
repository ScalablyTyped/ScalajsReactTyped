package typingsJapgolly.three.threeMod

import typingsJapgolly.three.srcGeometriesExtrudeGeometryMod.ExtrudeGeometryOptions
import typingsJapgolly.three.srcGeometriesExtrudeGeometryMod.UVGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "ExtrudeGeometry")
@js.native
class ExtrudeGeometry protected ()
  extends typingsJapgolly.three.srcGeometriesGeometriesMod.ExtrudeGeometry {
  def this(shapes: js.Array[typingsJapgolly.three.srcExtrasCoreShapeMod.Shape]) = this()
  def this(shapes: typingsJapgolly.three.srcExtrasCoreShapeMod.Shape) = this()
  def this(
    shapes: js.Array[typingsJapgolly.three.srcExtrasCoreShapeMod.Shape],
    options: ExtrudeGeometryOptions
  ) = this()
  def this(shapes: typingsJapgolly.three.srcExtrasCoreShapeMod.Shape, options: ExtrudeGeometryOptions) = this()
}

/* static members */
@JSImport("three", "ExtrudeGeometry")
@js.native
object ExtrudeGeometry extends js.Object {
  var WorldUVGenerator: UVGenerator = js.native
}

