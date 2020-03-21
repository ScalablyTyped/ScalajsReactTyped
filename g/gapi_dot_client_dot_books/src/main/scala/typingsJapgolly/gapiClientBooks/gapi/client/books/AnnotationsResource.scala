package typingsJapgolly.gapiClientBooks.gapi.client.books

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientBooks.AnonAltAnnotationId
import typingsJapgolly.gapiClientBooks.AnonFieldsKey
import typingsJapgolly.gapiClientBooks.AnonLayerIds
import typingsJapgolly.gapiClientBooks.AnonShowOnlySummaryInResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsResource extends js.Object {
  /** Deletes an annotation. */
  def delete(request: AnonAltAnnotationId): Request_[Unit]
  /** Inserts a new annotation. */
  def insert(request: AnonShowOnlySummaryInResponse): Request_[Annotation]
  /** Retrieves a list of annotations, possibly filtered. */
  def list(request: AnonLayerIds): Request_[Annotations]
  /** Gets the summary of specified layers. */
  def summary(request: AnonFieldsKey): Request_[AnnotationsSummary]
  /** Updates an existing annotation. */
  def update(request: AnonAltAnnotationId): Request_[Annotation]
}

object AnnotationsResource {
  @scala.inline
  def apply(
    delete: AnonAltAnnotationId => CallbackTo[Request_[Unit]],
    insert: AnonShowOnlySummaryInResponse => CallbackTo[Request_[Annotation]],
    list: AnonLayerIds => CallbackTo[Request_[Annotations]],
    summary: AnonFieldsKey => CallbackTo[Request_[AnnotationsSummary]],
    update: AnonAltAnnotationId => CallbackTo[Request_[Annotation]]
  ): AnnotationsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBooks.AnonAltAnnotationId) => delete(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBooks.AnonShowOnlySummaryInResponse) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBooks.AnonLayerIds) => list(t0).runNow()))
    __obj.updateDynamic("summary")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBooks.AnonFieldsKey) => summary(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBooks.AnonAltAnnotationId) => update(t0).runNow()))
    __obj.asInstanceOf[AnnotationsResource]
  }
}

