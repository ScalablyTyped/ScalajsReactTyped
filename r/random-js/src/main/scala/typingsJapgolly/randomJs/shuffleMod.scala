package typingsJapgolly.randomJs

import typingsJapgolly.randomJs.typesMod.Engine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("random-js/dist/distribution/shuffle", JSImport.Namespace)
@js.native
object shuffleMod extends js.Object {
  def shuffle[T](engine: Engine, array: js.Array[T]): js.Array[T] = js.native
  def shuffle[T](engine: Engine, array: js.Array[T], downTo: Double): js.Array[T] = js.native
}

