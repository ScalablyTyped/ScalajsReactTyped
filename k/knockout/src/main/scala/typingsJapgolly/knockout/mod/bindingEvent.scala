package typingsJapgolly.knockout.mod

import org.scalajs.dom.Element
import org.scalajs.dom.Node
import typingsJapgolly.knockout.knockoutStrings.childrenComplete
import typingsJapgolly.knockout.knockoutStrings.descendantsComplete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bindingEvent {
  
  @JSImport("knockout", "bindingEvent")
  @js.native
  val ^ : js.Any = js.native
  
  inline def startPossiblyAsyncContentBinding(node: Element, bindingContext: BindingContext[Any]): BindingContext[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("startPossiblyAsyncContentBinding")(node.asInstanceOf[js.Any], bindingContext.asInstanceOf[js.Any])).asInstanceOf[BindingContext[Any]]
  
  inline def subscribe(
    node: Node,
    event: childrenComplete | descendantsComplete,
    callback: js.Function1[/* node */ Node, Unit]
  ): Subscription = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(node.asInstanceOf[js.Any], event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Subscription]
  inline def subscribe(
    node: Node,
    event: childrenComplete | descendantsComplete,
    callback: js.Function1[/* node */ Node, Unit],
    callbackContext: Any
  ): Subscription = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(node.asInstanceOf[js.Any], event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], callbackContext.asInstanceOf[js.Any])).asInstanceOf[Subscription]
}
