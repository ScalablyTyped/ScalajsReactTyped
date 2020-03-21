package typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A builder for UpdateDraftActionResponse objects.
  */
trait UpdateDraftActionResponseBuilder extends js.Object {
  def build(): UpdateDraftActionResponse
  def setUpdateDraftBodyAction(updateDraftBodyAction: UpdateDraftBodyAction): UpdateDraftActionResponseBuilder
}

object UpdateDraftActionResponseBuilder {
  @scala.inline
  def apply(
    build: CallbackTo[UpdateDraftActionResponse],
    setUpdateDraftBodyAction: UpdateDraftBodyAction => CallbackTo[UpdateDraftActionResponseBuilder]
  ): UpdateDraftActionResponseBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("setUpdateDraftBodyAction")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.UpdateDraftBodyAction) => setUpdateDraftBodyAction(t0).runNow()))
    __obj.asInstanceOf[UpdateDraftActionResponseBuilder]
  }
}

