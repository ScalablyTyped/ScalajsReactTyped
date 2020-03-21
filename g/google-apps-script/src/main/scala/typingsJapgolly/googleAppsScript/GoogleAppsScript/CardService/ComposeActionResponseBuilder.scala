package typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.GmailDraft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A builder for ComposeActionResponse objects.
  *
  * Note: This object isn't related to compose actions that are
  * used to extend the compose UI. Rather,
  * this builder creates responses to an Action that composes draft messages when a specific
  * UI element is selected.
  */
trait ComposeActionResponseBuilder extends js.Object {
  def build(): ComposeActionResponse
  def setGmailDraft(draft: GmailDraft): ComposeActionResponseBuilder
}

object ComposeActionResponseBuilder {
  @scala.inline
  def apply(
    build: CallbackTo[ComposeActionResponse],
    setGmailDraft: GmailDraft => CallbackTo[ComposeActionResponseBuilder]
  ): ComposeActionResponseBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("setGmailDraft")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.GmailDraft) => setGmailDraft(t0).runNow()))
    __obj.asInstanceOf[ComposeActionResponseBuilder]
  }
}

