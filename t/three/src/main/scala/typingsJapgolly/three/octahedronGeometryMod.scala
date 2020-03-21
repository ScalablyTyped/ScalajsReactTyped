package typingsJapgolly.three

import typingsJapgolly.three.polyhedronGeometryMod.PolyhedronBufferGeometry
import typingsJapgolly.three.polyhedronGeometryMod.PolyhedronGeometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/OctahedronGeometry", JSImport.Namespace)
@js.native
object octahedronGeometryMod extends js.Object {
  @js.native
  class OctahedronBufferGeometry () extends PolyhedronBufferGeometry {
    def this(radius: Double) = this()
    def this(radius: Double, detail: Double) = this()
  }
  
  @js.native
  class OctahedronGeometry () extends PolyhedronGeometry {
    def this(radius: Double) = this()
    def this(radius: Double, detail: Double) = this()
  }
  
}

