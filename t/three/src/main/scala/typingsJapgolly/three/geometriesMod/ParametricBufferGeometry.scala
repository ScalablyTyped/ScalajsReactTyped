package typingsJapgolly.three.geometriesMod

import typingsJapgolly.three.vector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/Geometries", "ParametricBufferGeometry")
@js.native
class ParametricBufferGeometry protected ()
  extends typingsJapgolly.three.parametricGeometryMod.ParametricBufferGeometry {
  def this(
    func: js.Function3[/* u */ Double, /* v */ Double, /* dest */ Vector3, Unit],
    slices: Double,
    stacks: Double
  ) = this()
}

