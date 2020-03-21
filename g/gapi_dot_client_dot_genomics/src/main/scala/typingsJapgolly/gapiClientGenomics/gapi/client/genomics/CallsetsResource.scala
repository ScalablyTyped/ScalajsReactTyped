package typingsJapgolly.gapiClientGenomics.gapi.client.genomics

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientGenomics.AnonAccesstoken
import typingsJapgolly.gapiClientGenomics.AnonCallSetId
import typingsJapgolly.gapiClientGenomics.AnonCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallsetsResource extends js.Object {
  /**
    * Creates a new call set.
    *
    * For the definitions of call sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def create(request: AnonAccesstoken): Request_[CallSet]
  /**
    * Deletes a call set.
    *
    * For the definitions of call sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def delete(request: AnonCallSetId): Request_[js.Object]
  /**
    * Gets a call set by ID.
    *
    * For the definitions of call sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def get(request: AnonCallSetId): Request_[CallSet]
  /**
    * Updates a call set.
    *
    * For the definitions of call sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * This method supports patch semantics.
    */
  def patch(request: AnonCallback): Request_[CallSet]
  /**
    * Gets a list of call sets matching the criteria.
    *
    * For the definitions of call sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * Implements
    * [GlobalAllianceApi.searchCallSets](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/variantmethods.avdl#L178).
    */
  def search(request: AnonAccesstoken): Request_[SearchCallSetsResponse]
}

object CallsetsResource {
  @scala.inline
  def apply(
    create: AnonAccesstoken => CallbackTo[Request_[CallSet]],
    delete: AnonCallSetId => CallbackTo[Request_[js.Object]],
    get: AnonCallSetId => CallbackTo[Request_[CallSet]],
    patch: AnonCallback => CallbackTo[Request_[CallSet]],
    search: AnonAccesstoken => CallbackTo[Request_[SearchCallSetsResponse]]
  ): CallsetsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGenomics.AnonAccesstoken) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGenomics.AnonCallSetId) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGenomics.AnonCallSetId) => get(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGenomics.AnonCallback) => patch(t0).runNow()))
    __obj.updateDynamic("search")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGenomics.AnonAccesstoken) => search(t0).runNow()))
    __obj.asInstanceOf[CallsetsResource]
  }
}

