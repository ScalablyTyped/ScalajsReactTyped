package typingsJapgolly.randomJs

import typingsJapgolly.randomJs.typesMod.Engine
import typingsJapgolly.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("random-js/dist/distribution/sample", JSImport.Namespace)
@js.native
object sampleMod extends js.Object {
  def sample[T](engine: Engine, population: ArrayLike[T], sampleSize: Double): js.Array[T] = js.native
}

