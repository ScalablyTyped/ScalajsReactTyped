package typingsJapgolly.three

import typingsJapgolly.three.box3Mod.Box3
import typingsJapgolly.three.colorMod.Color
import typingsJapgolly.three.lineSegmentsMod.LineSegments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/helpers/Box3Helper", JSImport.Namespace)
@js.native
object box3HelperMod extends js.Object {
  @js.native
  class Box3Helper protected () extends LineSegments {
    def this(box: Box3) = this()
    def this(box: Box3, color: Color) = this()
    var box: Box3 = js.native
  }
  
}

