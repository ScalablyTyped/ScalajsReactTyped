package typingsJapgolly.three

import typingsJapgolly.three.bufferGeometryMod.BufferGeometry
import typingsJapgolly.three.geometryMod.Geometry
import typingsJapgolly.three.vector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/ParametricGeometry", JSImport.Namespace)
@js.native
object parametricGeometryMod extends js.Object {
  @js.native
  class ParametricBufferGeometry protected () extends BufferGeometry {
    def this(
      func: js.Function3[/* u */ Double, /* v */ Double, /* dest */ Vector3, Unit],
      slices: Double,
      stacks: Double
    ) = this()
    var parameters: AnonFunc = js.native
  }
  
  @js.native
  class ParametricGeometry protected () extends Geometry {
    def this(
      func: js.Function3[/* u */ Double, /* v */ Double, /* dest */ Vector3, Unit],
      slices: Double,
      stacks: Double
    ) = this()
    var parameters: AnonFunc = js.native
  }
  
}

