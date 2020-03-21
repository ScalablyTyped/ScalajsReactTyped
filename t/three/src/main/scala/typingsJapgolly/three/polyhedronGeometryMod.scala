package typingsJapgolly.three

import typingsJapgolly.three.bufferGeometryMod.BufferGeometry
import typingsJapgolly.three.geometryMod.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/PolyhedronGeometry", JSImport.Namespace)
@js.native
object polyhedronGeometryMod extends js.Object {
  @js.native
  class PolyhedronBufferGeometry protected () extends BufferGeometry {
    def this(vertices: js.Array[Double], indices: js.Array[Double]) = this()
    def this(vertices: js.Array[Double], indices: js.Array[Double], radius: Double) = this()
    def this(vertices: js.Array[Double], indices: js.Array[Double], radius: Double, detail: Double) = this()
    var parameters: AnonIndices = js.native
  }
  
  @js.native
  class PolyhedronGeometry protected () extends Geometry {
    def this(vertices: js.Array[Double], indices: js.Array[Double]) = this()
    def this(vertices: js.Array[Double], indices: js.Array[Double], radius: Double) = this()
    def this(vertices: js.Array[Double], indices: js.Array[Double], radius: Double, detail: Double) = this()
    var parameters: AnonIndices = js.native
  }
  
}

