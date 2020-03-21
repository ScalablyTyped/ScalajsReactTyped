package typingsJapgolly.gapiClientSlides.gapi.client.slides

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientSlides.AnonBearertoken
import typingsJapgolly.gapiClientSlides.AnonCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PresentationsResource extends js.Object {
  var pages: PagesResource
  /**
    * Applies one or more updates to the presentation.
    *
    * Each request is validated before
    * being applied. If any request is not valid, then the entire request will
    * fail and nothing will be applied.
    *
    * Some requests have replies to
    * give you some information about how they are applied. Other requests do
    * not need to return information; these each return an empty reply.
    * The order of replies matches that of the requests.
    *
    * For example, suppose you call batchUpdate with four updates, and only the
    * third one returns information. The response would have two empty replies:
    * the reply to the third request, and another empty reply, in that order.
    *
    * Because other users may be editing the presentation, the presentation
    * might not exactly reflect your changes: your changes may
    * be altered with respect to collaborator changes. If there are no
    * collaborators, the presentation should reflect your changes. In any case,
    * the updates in your request are guaranteed to be applied together
    * atomically.
    */
  def batchUpdate(request: AnonBearertoken): Request_[BatchUpdatePresentationResponse]
  /**
    * Creates a new presentation using the title given in the request. Other
    * fields in the request are ignored.
    * Returns the created presentation.
    */
  def create(request: AnonCallback): Request_[Presentation]
  /** Gets the latest version of the specified presentation. */
  def get(request: AnonBearertoken): Request_[Presentation]
}

object PresentationsResource {
  @scala.inline
  def apply(
    batchUpdate: AnonBearertoken => CallbackTo[Request_[BatchUpdatePresentationResponse]],
    create: AnonCallback => CallbackTo[Request_[Presentation]],
    get: AnonBearertoken => CallbackTo[Request_[Presentation]],
    pages: PagesResource
  ): PresentationsResource = {
    val __obj = js.Dynamic.literal(pages = pages.asInstanceOf[js.Any])
    __obj.updateDynamic("batchUpdate")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSlides.AnonBearertoken) => batchUpdate(t0).runNow()))
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSlides.AnonCallback) => create(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSlides.AnonBearertoken) => get(t0).runNow()))
    __obj.asInstanceOf[PresentationsResource]
  }
}

