package typingsJapgolly.three

import typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry
import typingsJapgolly.three.srcCoreGeometryMod.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/PolyhedronGeometry", JSImport.Namespace)
@js.native
object srcGeometriesPolyhedronGeometryMod extends js.Object {
  @js.native
  class PolyhedronBufferGeometry protected () extends BufferGeometry {
    def this(vertices: js.Array[Double], indices: js.Array[Double]) = this()
    def this(vertices: js.Array[Double], indices: js.Array[Double], radius: Double) = this()
    def this(vertices: js.Array[Double], indices: js.Array[Double], radius: Double, detail: Double) = this()
    var parameters: Anon_DetailIndices = js.native
  }
  
  @js.native
  class PolyhedronGeometry protected () extends Geometry {
    def this(vertices: js.Array[Double], indices: js.Array[Double]) = this()
    def this(vertices: js.Array[Double], indices: js.Array[Double], radius: Double) = this()
    def this(vertices: js.Array[Double], indices: js.Array[Double], radius: Double, detail: Double) = this()
    var parameters: Anon_DetailIndices = js.native
  }
  
}

