package typingsJapgolly.three

import typingsJapgolly.three.bufferGeometryMod.BufferGeometry
import typingsJapgolly.three.geometryMod.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/PlaneGeometry", JSImport.Namespace)
@js.native
object planeGeometryMod extends js.Object {
  @js.native
  class PlaneBufferGeometry () extends BufferGeometry {
    def this(width: Double) = this()
    def this(width: Double, height: Double) = this()
    def this(width: Double, height: Double, widthSegments: Double) = this()
    def this(width: Double, height: Double, widthSegments: Double, heightSegments: Double) = this()
    var parameters: AnonWidth = js.native
  }
  
  @js.native
  class PlaneGeometry () extends Geometry {
    def this(width: Double) = this()
    def this(width: Double, height: Double) = this()
    def this(width: Double, height: Double, widthSegments: Double) = this()
    def this(width: Double, height: Double, widthSegments: Double, heightSegments: Double) = this()
    var parameters: AnonWidth = js.native
  }
  
}

