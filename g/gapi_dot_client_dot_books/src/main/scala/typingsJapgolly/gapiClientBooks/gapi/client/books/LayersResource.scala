package typingsJapgolly.gapiClientBooks.gapi.client.books

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientBooks.AnonMaxResults
import typingsJapgolly.gapiClientBooks.AnonSummaryId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayersResource extends js.Object {
  var annotationData: AnnotationDataResource
  var volumeAnnotations: VolumeAnnotationsResource
  /** Gets the layer summary for a volume. */
  def get(request: AnonSummaryId): Request_[Layersummary]
  /** List the layer summaries for a volume. */
  def list(request: AnonMaxResults): Request_[Layersummaries]
}

object LayersResource {
  @scala.inline
  def apply(
    annotationData: AnnotationDataResource,
    get: AnonSummaryId => CallbackTo[Request_[Layersummary]],
    list: AnonMaxResults => CallbackTo[Request_[Layersummaries]],
    volumeAnnotations: VolumeAnnotationsResource
  ): LayersResource = {
    val __obj = js.Dynamic.literal(annotationData = annotationData.asInstanceOf[js.Any], volumeAnnotations = volumeAnnotations.asInstanceOf[js.Any])
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBooks.AnonSummaryId) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBooks.AnonMaxResults) => list(t0).runNow()))
    __obj.asInstanceOf[LayersResource]
  }
}

