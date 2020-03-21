package typingsJapgolly.sharepoint.SP.Application.UI

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewInformationRequestor extends js.Object {
  def onViewInformationReturned(viewGroups: ViewSelectorGroups): Unit
}

object ViewInformationRequestor {
  @scala.inline
  def apply(onViewInformationReturned: ViewSelectorGroups => Callback): ViewInformationRequestor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onViewInformationReturned")(js.Any.fromFunction1((t0: typingsJapgolly.sharepoint.SP.Application.UI.ViewSelectorGroups) => onViewInformationReturned(t0).runNow()))
    __obj.asInstanceOf[ViewInformationRequestor]
  }
}

