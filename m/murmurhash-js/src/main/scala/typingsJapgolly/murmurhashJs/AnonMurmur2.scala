package typingsJapgolly.murmurhashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMurmur2 extends js.Object {
  @JSName("murmur2")
  var murmur2_Original: js.Function2[/* str */ String, /* seed */ js.UndefOr[Double], Double] = js.native
  @JSName("murmur3")
  var murmur3_Original: js.Function2[/* str */ String, /* seed */ js.UndefOr[Double], Double] = js.native
  def murmur2(str: String): Double = js.native
  def murmur2(str: String, seed: Double): Double = js.native
  def murmur3(str: String): Double = js.native
  def murmur3(str: String, seed: Double): Double = js.native
}

