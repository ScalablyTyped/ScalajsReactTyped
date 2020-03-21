package typingsJapgolly.xstream

import typingsJapgolly.xstream.mod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstream/extra/throttle", JSImport.Namespace)
@js.native
object throttleMod extends js.Object {
  def default[T](period: Double): js.Function1[/* ins */ Stream[T], Stream[T]] = js.native
}

