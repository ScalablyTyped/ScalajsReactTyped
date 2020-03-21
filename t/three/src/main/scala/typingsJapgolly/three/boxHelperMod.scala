package typingsJapgolly.three

import typingsJapgolly.three.colorMod.Color
import typingsJapgolly.three.lineSegmentsMod.LineSegments
import typingsJapgolly.three.object3DMod.Object3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/helpers/BoxHelper", JSImport.Namespace)
@js.native
object boxHelperMod extends js.Object {
  @js.native
  class BoxHelper protected () extends LineSegments {
    def this(`object`: Object3D) = this()
    def this(`object`: Object3D, color: Color) = this()
    def setFromObject(`object`: Object3D): this.type = js.native
    def update(): Unit = js.native
    def update(`object`: Object3D): Unit = js.native
  }
  
}

