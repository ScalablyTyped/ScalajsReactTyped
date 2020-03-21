package typingsJapgolly.sharepoint.SP.Application.UI

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultFormsInformationRequestor extends js.Object {
  def onDefaultFormsInformationRetrieveFailure(): Unit
  def onDefaultFormsInformationRetrieveSuccess(defaultForms: DefaultFormsInformation): Unit
}

object DefaultFormsInformationRequestor {
  @scala.inline
  def apply(
    onDefaultFormsInformationRetrieveFailure: Callback,
    onDefaultFormsInformationRetrieveSuccess: DefaultFormsInformation => Callback
  ): DefaultFormsInformationRequestor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onDefaultFormsInformationRetrieveFailure")(onDefaultFormsInformationRetrieveFailure.toJsFn)
    __obj.updateDynamic("onDefaultFormsInformationRetrieveSuccess")(js.Any.fromFunction1((t0: typingsJapgolly.sharepoint.SP.Application.UI.DefaultFormsInformation) => onDefaultFormsInformationRetrieveSuccess(t0).runNow()))
    __obj.asInstanceOf[DefaultFormsInformationRequestor]
  }
}

