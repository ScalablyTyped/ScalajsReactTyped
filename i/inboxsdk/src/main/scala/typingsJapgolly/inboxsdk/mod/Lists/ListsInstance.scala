package typingsJapgolly.inboxsdk.mod.Lists

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListsInstance extends js.Object {
  def getSelectedThreadRowViews(): js.Array[ThreadRowView]
  def registerThreadRowViewHandler(handler: js.Function1[/* threadRowView */ ThreadRowView, _]): js.Function0[Unit]
  def registerThreadRowViewSelectionHandler(handler: js.Function0[_]): js.Function0[Unit]
}

object ListsInstance {
  @scala.inline
  def apply(
    getSelectedThreadRowViews: CallbackTo[js.Array[ThreadRowView]],
    registerThreadRowViewHandler: js.Function1[/* threadRowView */ ThreadRowView, js.Any] => CallbackTo[js.Function0[Unit]],
    registerThreadRowViewSelectionHandler: js.Function0[js.Any] => CallbackTo[js.Function0[Unit]]
  ): ListsInstance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getSelectedThreadRowViews")(getSelectedThreadRowViews.toJsFn)
    __obj.updateDynamic("registerThreadRowViewHandler")(js.Any.fromFunction1((t0: js.Function1[/* threadRowView */ typingsJapgolly.inboxsdk.mod.Lists.ThreadRowView, js.Any]) => registerThreadRowViewHandler(t0).runNow()))
    __obj.updateDynamic("registerThreadRowViewSelectionHandler")(js.Any.fromFunction1((t0: js.Function0[js.Any]) => registerThreadRowViewSelectionHandler(t0).runNow()))
    __obj.asInstanceOf[ListsInstance]
  }
}

