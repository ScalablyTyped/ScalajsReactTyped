package typingsJapgolly.gapiClientBooks.gapi.client.books

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientBooks.AnonAllowWebDefinitions
import typingsJapgolly.gapiClientBooks.AnonAnnotationDataId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationDataResource extends js.Object {
  /** Gets the annotation data. */
  def get(request: AnonAllowWebDefinitions): Request_[Annotationdata]
  /** Gets the annotation data for a volume and layer. */
  def list(request: AnonAnnotationDataId): Request_[Annotationsdata]
}

object AnnotationDataResource {
  @scala.inline
  def apply(
    get: AnonAllowWebDefinitions => CallbackTo[Request_[Annotationdata]],
    list: AnonAnnotationDataId => CallbackTo[Request_[Annotationsdata]]
  ): AnnotationDataResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBooks.AnonAllowWebDefinitions) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBooks.AnonAnnotationDataId) => list(t0).runNow()))
    __obj.asInstanceOf[AnnotationDataResource]
  }
}

