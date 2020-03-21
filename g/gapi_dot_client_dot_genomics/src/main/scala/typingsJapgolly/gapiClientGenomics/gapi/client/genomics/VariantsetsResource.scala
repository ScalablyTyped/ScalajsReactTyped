package typingsJapgolly.gapiClientGenomics.gapi.client.genomics

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientGenomics.AnonAccesstoken
import typingsJapgolly.gapiClientGenomics.AnonUploadprotocol
import typingsJapgolly.gapiClientGenomics.AnonVariantSetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariantsetsResource extends js.Object {
  /**
    * Creates a new variant set.
    *
    * For the definitions of variant sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * The provided variant set must have a valid `datasetId` set - all other
    * fields are optional. Note that the `id` field will be ignored, as this is
    * assigned by the server.
    */
  def create(request: AnonAccesstoken): Request_[VariantSet]
  /**
    * Deletes a variant set including all variants, call sets, and calls within.
    * This is not reversible.
    *
    * For the definitions of variant sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def delete(request: AnonUploadprotocol): Request_[js.Object]
  /**
    * Exports variant set data to an external destination.
    *
    * For the definitions of variant sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def export(request: AnonUploadprotocol): Request_[Operation]
  /**
    * Gets a variant set by ID.
    *
    * For the definitions of variant sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def get(request: AnonUploadprotocol): Request_[VariantSet]
  /**
    * Updates a variant set using patch semantics.
    *
    * For the definitions of variant sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def patch(request: AnonVariantSetId): Request_[VariantSet]
  /**
    * Returns a list of all variant sets matching search criteria.
    *
    * For the definitions of variant sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * Implements
    * [GlobalAllianceApi.searchVariantSets](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/variantmethods.avdl#L49).
    */
  def search(request: AnonAccesstoken): Request_[SearchVariantSetsResponse]
}

object VariantsetsResource {
  @scala.inline
  def apply(
    create: AnonAccesstoken => CallbackTo[Request_[VariantSet]],
    delete: AnonUploadprotocol => CallbackTo[Request_[js.Object]],
    export: AnonUploadprotocol => CallbackTo[Request_[Operation]],
    get: AnonUploadprotocol => CallbackTo[Request_[VariantSet]],
    patch: AnonVariantSetId => CallbackTo[Request_[VariantSet]],
    search: AnonAccesstoken => CallbackTo[Request_[SearchVariantSetsResponse]]
  ): VariantsetsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGenomics.AnonAccesstoken) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGenomics.AnonUploadprotocol) => delete(t0).runNow()))
    __obj.updateDynamic("export")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGenomics.AnonUploadprotocol) => export(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGenomics.AnonUploadprotocol) => get(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGenomics.AnonVariantSetId) => patch(t0).runNow()))
    __obj.updateDynamic("search")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGenomics.AnonAccesstoken) => search(t0).runNow()))
    __obj.asInstanceOf[VariantsetsResource]
  }
}

