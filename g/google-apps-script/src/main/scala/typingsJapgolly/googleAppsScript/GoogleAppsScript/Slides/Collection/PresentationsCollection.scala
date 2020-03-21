package typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Collection

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Collection.Presentations.PagesCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.BatchUpdatePresentationRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.BatchUpdatePresentationResponse
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Presentation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PresentationsCollection extends js.Object {
  var Pages: js.UndefOr[PagesCollection] = js.undefined
  // Applies one or more updates to the presentation.
  // Each request is validated before
  // being applied. If any request is not valid, then the entire request will
  // fail and nothing will be applied.
  // Some requests have replies to
  // give you some information about how they are applied. Other requests do
  // not need to return information; these each return an empty reply.
  // The order of replies matches that of the requests.
  // For example, suppose you call batchUpdate with four updates, and only the
  // third one returns information. The response would have two empty replies:
  // the reply to the third request, and another empty reply, in that order.
  // Because other users may be editing the presentation, the presentation
  // might not exactly reflect your changes: your changes may
  // be altered with respect to collaborator changes. If there are no
  // collaborators, the presentation should reflect your changes. In any case,
  // the updates in your request are guaranteed to be applied together
  // atomically.
  def batchUpdate(resource: BatchUpdatePresentationRequest, presentationId: String): BatchUpdatePresentationResponse
  // Creates a blank presentation using the title given in the request. If a
  // `presentationId` is provided, it is used as the ID of the new presentation.
  // Otherwise, a new ID is generated. Other fields in the request, including
  // any provided content, are ignored.
  // Returns the created presentation.
  def create(resource: Presentation): Presentation
  // Gets the latest version of the specified presentation.
  def get(presentationId: String): Presentation
}

object PresentationsCollection {
  @scala.inline
  def apply(
    batchUpdate: (BatchUpdatePresentationRequest, String) => CallbackTo[BatchUpdatePresentationResponse],
    create: Presentation => CallbackTo[Presentation],
    get: String => CallbackTo[Presentation],
    Pages: PagesCollection = null
  ): PresentationsCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("batchUpdate")(js.Any.fromFunction2((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.BatchUpdatePresentationRequest, t1: java.lang.String) => batchUpdate(t0, t1).runNow()))
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.Schema.Presentation) => create(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    if (Pages != null) __obj.updateDynamic("Pages")(Pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[PresentationsCollection]
  }
}

