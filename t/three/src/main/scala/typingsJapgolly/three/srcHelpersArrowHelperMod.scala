package typingsJapgolly.three

import typingsJapgolly.three.srcCoreObject3DMod.Object3D
import typingsJapgolly.three.srcMathColorMod.Color
import typingsJapgolly.three.srcMathVector3Mod.Vector3
import typingsJapgolly.three.srcObjectsLineMod.Line
import typingsJapgolly.three.srcObjectsMeshMod.Mesh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/helpers/ArrowHelper", JSImport.Namespace)
@js.native
object srcHelpersArrowHelperMod extends js.Object {
  @js.native
  class ArrowHelper protected () extends Object3D {
    def this(dir: Vector3) = this()
    def this(dir: Vector3, origin: Vector3) = this()
    def this(dir: Vector3, origin: Vector3, length: Double) = this()
    def this(dir: Vector3, origin: Vector3, length: Double, hex: Double) = this()
    def this(dir: Vector3, origin: Vector3, length: Double, hex: Double, headLength: Double) = this()
    def this(dir: Vector3, origin: Vector3, length: Double, hex: Double, headLength: Double, headWidth: Double) = this()
    var cone: Mesh = js.native
    var line: Line = js.native
    def setColor(color: String): Unit = js.native
    def setColor(color: Double): Unit = js.native
    def setColor(color: Color): Unit = js.native
    def setDirection(dir: Vector3): Unit = js.native
    def setLength(length: Double): Unit = js.native
    def setLength(length: Double, headLength: Double): Unit = js.native
    def setLength(length: Double, headLength: Double, headWidth: Double): Unit = js.native
  }
  
}

