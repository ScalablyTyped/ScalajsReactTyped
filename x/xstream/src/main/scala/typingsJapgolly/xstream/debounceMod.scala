package typingsJapgolly.xstream

import typingsJapgolly.xstream.mod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstream/extra/debounce", JSImport.Namespace)
@js.native
object debounceMod extends js.Object {
  def default[T](period: Double): js.Function1[/* ins */ Stream[T], Stream[T]] = js.native
}

