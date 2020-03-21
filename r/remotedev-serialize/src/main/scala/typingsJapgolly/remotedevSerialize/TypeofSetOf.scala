package typingsJapgolly.remotedevSerialize

import typingsJapgolly.immutable.Immutable.Seq.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofSetOf extends js.Object {
  def apply(): Set[_] = js.native
  def apply[T](collection: js.Iterable[T]): Set[T] = js.native
  /**
    * Returns a Seq.Set of the provided values
    */
  def of[T](values: T*): Set[T] = js.native
}

