package typingsJapgolly.remotedevSerialize

import typingsJapgolly.immutable.Immutable.Stack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofStack extends js.Object {
  def apply(): Stack[_] = js.native
  def apply[T](collection: js.Iterable[T]): Stack[T] = js.native
  /**
    * True if the provided value is a Stack
    */
  def isStack(maybeStack: js.Any): /* is immutable.Immutable.Stack<any> */ Boolean = js.native
  /**
    * Creates a new Stack containing `values`.
    */
  def of[T](values: T*): Stack[T] = js.native
}

