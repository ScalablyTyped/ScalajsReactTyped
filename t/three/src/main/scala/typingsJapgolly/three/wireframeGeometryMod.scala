package typingsJapgolly.three

import typingsJapgolly.three.bufferGeometryMod.BufferGeometry
import typingsJapgolly.three.geometryMod.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/WireframeGeometry", JSImport.Namespace)
@js.native
object wireframeGeometryMod extends js.Object {
  @js.native
  class WireframeGeometry protected () extends BufferGeometry {
    def this(geometry: BufferGeometry) = this()
    def this(geometry: Geometry) = this()
  }
  
}

