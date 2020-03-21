package typingsJapgolly.pullStream

import typingsJapgolly.pullStream.mod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pull-stream/sources/once", JSImport.Namespace)
@js.native
object onceMod extends js.Object {
  /**
    * Create a stream with a single value.
    */
  def apply[T](): Source[T] = js.native
  def apply[T](value: T): Source[T] = js.native
  def apply[T](value: T, onAbort: js.Function1[/* err */ js.UndefOr[js.Error | Null], _]): Source[T] = js.native
}

