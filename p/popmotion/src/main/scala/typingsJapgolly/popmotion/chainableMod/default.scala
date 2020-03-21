package typingsJapgolly.popmotion.chainableMod

import typingsJapgolly.popmotion.chainableTypesMod.Predicate
import typingsJapgolly.popmotion.chainableTypesMod.Props
import typingsJapgolly.popmotion.observerTypesMod.Middleware
import typingsJapgolly.popmotion.observerTypesMod.Update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion/lib/chainable", JSImport.Default)
@js.native
abstract class default[T] () extends Chainable[T] {
  def this(props: Props) = this()
  /* CompleteClass */
  override var props: Props = js.native
  /* CompleteClass */
  override def applyMiddleware(middleware: Middleware): T = js.native
  /* CompleteClass */
  override def create(props: Props): T = js.native
  /* CompleteClass */
  override def filter(predicate: Predicate): T = js.native
  /* CompleteClass */
  override def pipe(funcs: Update*): T = js.native
  /* CompleteClass */
  override def `while`(predicate: Predicate): T = js.native
}

