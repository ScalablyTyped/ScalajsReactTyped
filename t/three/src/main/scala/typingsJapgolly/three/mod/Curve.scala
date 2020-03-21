package typingsJapgolly.three.mod

import typingsJapgolly.three.vector2Mod.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "Curve")
@js.native
class Curve[T /* <: Vector */] ()
  extends typingsJapgolly.three.curveMod.Curve[T]

/* static members */
@JSImport("three", "Curve")
@js.native
object Curve extends js.Object {
  /**
  	 * @deprecated since r84.
  	 */
  def create(constructorFunc: js.Function, getPointFunc: js.Function): js.Function = js.native
}

