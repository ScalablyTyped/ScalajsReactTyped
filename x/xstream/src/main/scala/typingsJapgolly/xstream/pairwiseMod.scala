package typingsJapgolly.xstream

import typingsJapgolly.xstream.mod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstream/extra/pairwise", JSImport.Namespace)
@js.native
object pairwiseMod extends js.Object {
  def default[T](ins: Stream[T]): Stream[js.Tuple2[T, T]] = js.native
}

