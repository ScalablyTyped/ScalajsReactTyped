package typingsJapgolly.three

import typingsJapgolly.three.bufferGeometryMod.BufferGeometry
import typingsJapgolly.three.geometryMod.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/CircleGeometry", JSImport.Namespace)
@js.native
object circleGeometryMod extends js.Object {
  @js.native
  class CircleBufferGeometry () extends BufferGeometry {
    def this(radius: Double) = this()
    def this(radius: Double, segments: Double) = this()
    def this(radius: Double, segments: Double, thetaStart: Double) = this()
    def this(radius: Double, segments: Double, thetaStart: Double, thetaLength: Double) = this()
    var parameters: AnonRadius = js.native
  }
  
  @js.native
  class CircleGeometry () extends Geometry {
    def this(radius: Double) = this()
    def this(radius: Double, segments: Double) = this()
    def this(radius: Double, segments: Double, thetaStart: Double) = this()
    def this(radius: Double, segments: Double, thetaStart: Double, thetaLength: Double) = this()
    var parameters: AnonRadius = js.native
  }
  
}

