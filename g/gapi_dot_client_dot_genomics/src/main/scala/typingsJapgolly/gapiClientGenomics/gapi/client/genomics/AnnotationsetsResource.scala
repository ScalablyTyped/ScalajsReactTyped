package typingsJapgolly.gapiClientGenomics.gapi.client.genomics

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientGenomics.AnonAccesstoken
import typingsJapgolly.gapiClientGenomics.AnonAnnotationSetId
import typingsJapgolly.gapiClientGenomics.AnonBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsetsResource extends js.Object {
  /**
    * Creates a new annotation set. Caller must have WRITE permission for the
    * associated dataset.
    *
    * The following fields are required:
    *
    * &#42; datasetId
    * &#42; referenceSetId
    *
    * All other fields may be optionally specified, unless documented as being
    * server-generated (for example, the `id` field).
    */
  def create(request: AnonAccesstoken): Request_[AnnotationSet]
  /**
    * Deletes an annotation set. Caller must have WRITE permission
    * for the associated annotation set.
    */
  def delete(request: AnonAnnotationSetId): Request_[js.Object]
  /**
    * Gets an annotation set. Caller must have READ permission for
    * the associated dataset.
    */
  def get(request: AnonAnnotationSetId): Request_[AnnotationSet]
  /**
    * Searches for annotation sets that match the given criteria. Annotation sets
    * are returned in an unspecified order. This order is consistent, such that
    * two queries for the same content (regardless of page size) yield annotation
    * sets in the same order across their respective streams of paginated
    * responses. Caller must have READ permission for the queried datasets.
    */
  def search(request: AnonAccesstoken): Request_[SearchAnnotationSetsResponse]
  /**
    * Updates an annotation set. The update must respect all mutability
    * restrictions and other invariants described on the annotation set resource.
    * Caller must have WRITE permission for the associated dataset.
    */
  def update(request: AnonBearertoken): Request_[AnnotationSet]
}

object AnnotationsetsResource {
  @scala.inline
  def apply(
    create: AnonAccesstoken => CallbackTo[Request_[AnnotationSet]],
    delete: AnonAnnotationSetId => CallbackTo[Request_[js.Object]],
    get: AnonAnnotationSetId => CallbackTo[Request_[AnnotationSet]],
    search: AnonAccesstoken => CallbackTo[Request_[SearchAnnotationSetsResponse]],
    update: AnonBearertoken => CallbackTo[Request_[AnnotationSet]]
  ): AnnotationsetsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGenomics.AnonAccesstoken) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGenomics.AnonAnnotationSetId) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGenomics.AnonAnnotationSetId) => get(t0).runNow()))
    __obj.updateDynamic("search")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGenomics.AnonAccesstoken) => search(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGenomics.AnonBearertoken) => update(t0).runNow()))
    __obj.asInstanceOf[AnnotationsetsResource]
  }
}

