package typingsJapgolly.three

import typingsJapgolly.three.bufferGeometryMod.BufferGeometry
import typingsJapgolly.three.geometryMod.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/TorusGeometry", JSImport.Namespace)
@js.native
object torusGeometryMod extends js.Object {
  @js.native
  class TorusBufferGeometry () extends BufferGeometry {
    def this(radius: Double) = this()
    def this(radius: Double, tube: Double) = this()
    def this(radius: Double, tube: Double, radialSegments: Double) = this()
    def this(radius: Double, tube: Double, radialSegments: Double, tubularSegments: Double) = this()
    def this(radius: Double, tube: Double, radialSegments: Double, tubularSegments: Double, arc: Double) = this()
    var parameters: AnonArc = js.native
  }
  
  @js.native
  class TorusGeometry () extends Geometry {
    def this(radius: Double) = this()
    def this(radius: Double, tube: Double) = this()
    def this(radius: Double, tube: Double, radialSegments: Double) = this()
    def this(radius: Double, tube: Double, radialSegments: Double, tubularSegments: Double) = this()
    def this(radius: Double, tube: Double, radialSegments: Double, tubularSegments: Double, arc: Double) = this()
    var parameters: AnonArc = js.native
  }
  
}

