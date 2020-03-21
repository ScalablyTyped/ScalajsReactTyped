package typingsJapgolly.stardustUiReactComponentEventListener.typesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.RefHandle
import org.scalajs.dom.raw.Node
import typingsJapgolly.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventListenerOptions[T /* <: EventTypes */] extends js.Object {
  /** Indicating that events of this type will be dispatched to the registered listener before being dispatched to any EventTarget beneath it in the DOM tree. */
  var capture: js.UndefOr[Boolean] = js.undefined
  /** A function which receives a notification when an event of the specified type occurs. */
  var listener: EventHandler[T]
  /** A ref object with a target node. */
  var targetRef: RefHandle[Node | Window_]
  /** A case-sensitive string representing the event type to listen for. */
  var `type`: T
}

object EventListenerOptions {
  @scala.inline
  def apply[T /* <: EventTypes */](
    listener: /* import warning: importer.ImportType#apply Failed type conversion: std.DocumentEventMap[T] */ /* e */ js.Any => Callback,
    targetRef: RefHandle[Node | Window_],
    `type`: T,
    capture: js.UndefOr[Boolean] = js.undefined
  ): EventListenerOptions[T] = {
    val __obj = js.Dynamic.literal(targetRef = targetRef.asInstanceOf[js.Any])
    __obj.updateDynamic("listener")(js.Any.fromFunction1((t0: /* import warning: importer.ImportType#apply Failed type conversion: std.DocumentEventMap[T] */ /* e */ js.Any) => listener(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(capture)) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventListenerOptions[T]]
  }
}

