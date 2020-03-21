package typingsJapgolly.typescriptEventHandler

import typingsJapgolly.typescriptEventHandler.funcMod.Action
import typingsJapgolly.typescriptEventHandler.funcMod.AsyncAction
import typingsJapgolly.typescriptEventHandler.funcMod.AsyncPredicate
import typingsJapgolly.typescriptEventHandler.funcMod.Predicate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-event-handler/dist/event-handler", JSImport.Namespace)
@js.native
object eventHandlerMod extends js.Object {
  @js.native
  class EventHandler[TInput] () extends js.Object {
    val handlers: js.Any = js.native
    def handleAsync(value: TInput): js.Promise[Unit] = js.native
    def register(pred: Predicate[TInput], handler: Action[TInput]): Unit = js.native
    def registerAsync(pred: AsyncPredicate[TInput], handler: AsyncAction[TInput]): Unit = js.native
  }
  
}

