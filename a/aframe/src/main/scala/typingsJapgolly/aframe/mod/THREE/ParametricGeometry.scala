package typingsJapgolly.aframe.mod.THREE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aframe", "THREE.ParametricGeometry")
@js.native
class ParametricGeometry protected ()
  extends typingsJapgolly.three.mod.ParametricGeometry {
  def this(
    func: js.Function3[
        /* u */ Double, 
        /* v */ Double, 
        /* dest */ typingsJapgolly.three.vector3Mod.Vector3, 
        Unit
      ],
    slices: Double,
    stacks: Double
  ) = this()
}

