package typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an action that updates the email draft body.
  */
trait UpdateDraftBodyAction extends js.Object {
  def addUpdateContent(content: String, contentType: ContentType): UpdateDraftBodyAction
  def setUpdateType(updateType: UpdateDraftBodyType): UpdateDraftBodyAction
}

object UpdateDraftBodyAction {
  @scala.inline
  def apply(
    addUpdateContent: (String, ContentType) => CallbackTo[UpdateDraftBodyAction],
    setUpdateType: UpdateDraftBodyType => CallbackTo[UpdateDraftBodyAction]
  ): UpdateDraftBodyAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addUpdateContent")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.ContentType) => addUpdateContent(t0, t1).runNow()))
    __obj.updateDynamic("setUpdateType")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.UpdateDraftBodyType) => setUpdateType(t0).runNow()))
    __obj.asInstanceOf[UpdateDraftBodyAction]
  }
}

