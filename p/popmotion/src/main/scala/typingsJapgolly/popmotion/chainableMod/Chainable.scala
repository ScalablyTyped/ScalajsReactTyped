package typingsJapgolly.popmotion.chainableMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.popmotion.chainableTypesMod.Predicate
import typingsJapgolly.popmotion.chainableTypesMod.Props
import typingsJapgolly.popmotion.observerTypesMod.Middleware
import typingsJapgolly.popmotion.observerTypesMod.Update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chainable[T] extends js.Object {
  var props: Props
  def applyMiddleware(middleware: Middleware): T
  def create(props: Props): T
  def filter(predicate: Predicate): T
  def pipe(funcs: Update*): T
  def `while`(predicate: Predicate): T
}

object Chainable {
  @scala.inline
  def apply[T](
    applyMiddleware: Middleware => CallbackTo[T],
    create: Props => CallbackTo[T],
    filter: Predicate => CallbackTo[T],
    pipe: /* repeated */ Update => CallbackTo[T],
    props: Props,
    `while`: Predicate => CallbackTo[T]
  ): Chainable[T] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("applyMiddleware")(js.Any.fromFunction1((t0: typingsJapgolly.popmotion.observerTypesMod.Middleware) => applyMiddleware(t0).runNow()))
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.popmotion.chainableTypesMod.Props) => create(t0).runNow()))
    __obj.updateDynamic("filter")(js.Any.fromFunction1((t0: typingsJapgolly.popmotion.chainableTypesMod.Predicate) => filter(t0).runNow()))
    __obj.updateDynamic("pipe")(js.Any.fromFunction1((t0: /* repeated */ typingsJapgolly.popmotion.observerTypesMod.Update) => pipe(t0).runNow()))
    __obj.updateDynamic("while")(js.Any.fromFunction1((t0: typingsJapgolly.popmotion.chainableTypesMod.Predicate) => `while`(t0).runNow()))
    __obj.asInstanceOf[Chainable[T]]
  }
}

