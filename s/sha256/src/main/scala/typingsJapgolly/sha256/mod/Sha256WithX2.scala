package typingsJapgolly.sha256.mod

import typingsJapgolly.sha256.AnonAsBytes
import typingsJapgolly.sha256.AnonAsString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sha256WithX2 extends Sha256 {
  @JSName("x2")
  var x2_Original: Sha256 = js.native
  def x2(message: Message): String = js.native
  def x2(message: Message, options: AnonAsBytes): js.Array[Double] = js.native
  def x2(message: Message, options: AnonAsString): String = js.native
}

