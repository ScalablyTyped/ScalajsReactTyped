package typingsJapgolly.wonderJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015", "Matrix4")
@js.native
class Matrix4 ()
  extends typingsJapgolly.wonderJs.matrix4Mod.Matrix4 {
  def this(mat: scala.scalajs.js.typedarray.Float32Array) = this()
}

/* static members */
@JSImport("wonder.js/dist/es2015", "Matrix4")
@js.native
object Matrix4 extends js.Object {
  def create(): typingsJapgolly.wonderJs.matrix4Mod.Matrix4 = js.native
  def create(mat: scala.scalajs.js.typedarray.Float32Array): typingsJapgolly.wonderJs.matrix4Mod.Matrix4 = js.native
}

