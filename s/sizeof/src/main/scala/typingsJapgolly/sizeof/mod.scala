package typingsJapgolly.sizeof

import typingsJapgolly.sizeof.sizeofBooleans.`false`
import typingsJapgolly.sizeof.sizeofBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sizeof", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def format(bytes: Double): String = js.native
  def sizeof(`object`: js.Any): Double = js.native
  @JSName("sizeof")
  def sizeof_false(`object`: js.Any, pretty: `false`): Double = js.native
  @JSName("sizeof")
  def sizeof_true(`object`: js.Any, pretty: `true`): String = js.native
}

