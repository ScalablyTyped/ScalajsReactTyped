package typingsJapgolly.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "traverse")
@js.native
object traverse extends js.Object {
  def apply[T](n: Node, h: TraversalHandler[T]): Unit = js.native
  def apply[T](n: Node, h: TraversalHandlers[T]): Unit = js.native
  def apply[T](n: Node, h: TraversalHandlers[T], state: T): Unit = js.native
  def apply[T](n: Node, h: TraversalHandler[T], state: T): Unit = js.native
}

