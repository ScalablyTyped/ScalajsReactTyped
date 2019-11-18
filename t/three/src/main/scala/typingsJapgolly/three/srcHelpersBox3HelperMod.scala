package typingsJapgolly.three

import typingsJapgolly.three.srcMathBox3Mod.Box3
import typingsJapgolly.three.srcMathColorMod.Color
import typingsJapgolly.three.srcObjectsLineSegmentsMod.LineSegments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/helpers/Box3Helper", JSImport.Namespace)
@js.native
object srcHelpersBox3HelperMod extends js.Object {
  @js.native
  class Box3Helper protected () extends LineSegments {
    def this(box: Box3) = this()
    def this(box: Box3, color: Color) = this()
    var box: Box3 = js.native
  }
  
}

