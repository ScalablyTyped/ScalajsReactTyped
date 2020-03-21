package typingsJapgolly.three.mod

import typingsJapgolly.three.extrudeGeometryMod.ExtrudeGeometryOptions
import typingsJapgolly.three.extrudeGeometryMod.UVGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "ExtrudeBufferGeometry")
@js.native
class ExtrudeBufferGeometry protected ()
  extends typingsJapgolly.three.geometriesMod.ExtrudeBufferGeometry {
  def this(shapes: js.Array[typingsJapgolly.three.shapeMod.Shape]) = this()
  def this(shapes: typingsJapgolly.three.shapeMod.Shape) = this()
  def this(shapes: js.Array[typingsJapgolly.three.shapeMod.Shape], options: ExtrudeGeometryOptions) = this()
  def this(shapes: typingsJapgolly.three.shapeMod.Shape, options: ExtrudeGeometryOptions) = this()
}

/* static members */
@JSImport("three", "ExtrudeBufferGeometry")
@js.native
object ExtrudeBufferGeometry extends js.Object {
  var WorldUVGenerator: UVGenerator = js.native
}

