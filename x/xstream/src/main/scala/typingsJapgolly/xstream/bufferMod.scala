package typingsJapgolly.xstream

import typingsJapgolly.xstream.mod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstream/extra/buffer", JSImport.Namespace)
@js.native
object bufferMod extends js.Object {
  def default[T](s: Stream[_]): js.Function1[/* ins */ Stream[T], Stream[js.Array[T]]] = js.native
}

