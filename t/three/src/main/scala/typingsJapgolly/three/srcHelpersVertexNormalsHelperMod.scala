package typingsJapgolly.three

import typingsJapgolly.three.srcCoreObject3DMod.Object3D
import typingsJapgolly.three.srcObjectsLineSegmentsMod.LineSegments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/helpers/VertexNormalsHelper", JSImport.Namespace)
@js.native
object srcHelpersVertexNormalsHelperMod extends js.Object {
  @js.native
  class VertexNormalsHelper protected () extends LineSegments {
    def this(`object`: Object3D) = this()
    def this(`object`: Object3D, size: Double) = this()
    def this(`object`: Object3D, size: Double, hex: Double) = this()
    def this(`object`: Object3D, size: Double, hex: Double, linewidth: Double) = this()
    var `object`: Object3D = js.native
    var size: Double = js.native
    def update(): Unit = js.native
    def update(`object`: Object3D): Unit = js.native
  }
  
}

