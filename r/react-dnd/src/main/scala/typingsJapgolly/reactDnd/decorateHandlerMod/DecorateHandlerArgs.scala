package typingsJapgolly.reactDnd.decorateHandlerMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.RefHandle
import typingsJapgolly.dndCore.interfacesMod.DragDropManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecorateHandlerArgs[Props, ItemIdType] extends js.Object {
  var DecoratedComponent: js.Any
  var collect: js.Any
  var containerDisplayName: String
  var createConnector: js.Any
  var options: js.Any
  var registerHandler: js.Any
  def createHandler(monitor: HandlerReceiver, ref: RefHandle[_]): Handler[Props]
  def createMonitor(manager: DragDropManager): HandlerReceiver
  def getType(props: Props): ItemIdType
}

object DecorateHandlerArgs {
  @scala.inline
  def apply[Props, ItemIdType](
    DecoratedComponent: js.Any,
    collect: js.Any,
    containerDisplayName: String,
    createConnector: js.Any,
    createHandler: (HandlerReceiver, RefHandle[js.Any]) => CallbackTo[Handler[Props]],
    createMonitor: DragDropManager => CallbackTo[HandlerReceiver],
    getType: Props => CallbackTo[ItemIdType],
    options: js.Any,
    registerHandler: js.Any
  ): DecorateHandlerArgs[Props, ItemIdType] = {
    val __obj = js.Dynamic.literal(DecoratedComponent = DecoratedComponent.asInstanceOf[js.Any], collect = collect.asInstanceOf[js.Any], containerDisplayName = containerDisplayName.asInstanceOf[js.Any], createConnector = createConnector.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], registerHandler = registerHandler.asInstanceOf[js.Any])
    __obj.updateDynamic("createHandler")(js.Any.fromFunction2((t0: typingsJapgolly.reactDnd.decorateHandlerMod.HandlerReceiver, t1: japgolly.scalajs.react.raw.React.RefHandle[js.Any]) => createHandler(t0, t1).runNow()))
    __obj.updateDynamic("createMonitor")(js.Any.fromFunction1((t0: typingsJapgolly.dndCore.interfacesMod.DragDropManager) => createMonitor(t0).runNow()))
    __obj.updateDynamic("getType")(js.Any.fromFunction1((t0: Props) => getType(t0).runNow()))
    __obj.asInstanceOf[DecorateHandlerArgs[Props, ItemIdType]]
  }
}

