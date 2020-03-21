package typingsJapgolly.gapiClientGenomics.gapi.client.genomics

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientGenomics.AnonAccesstoken
import typingsJapgolly.gapiClientGenomics.AnonUpdateMask
import typingsJapgolly.gapiClientGenomics.AnonUploadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariantsResource extends js.Object {
  /**
    * Creates a new variant.
    *
    * For the definitions of variants and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def create(request: AnonAccesstoken): Request_[Variant]
  /**
    * Deletes a variant.
    *
    * For the definitions of variants and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def delete(request: AnonUploadType): Request_[js.Object]
  /**
    * Gets a variant by ID.
    *
    * For the definitions of variants and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def get(request: AnonUploadType): Request_[Variant]
  /**
    * Creates variant data by asynchronously importing the provided information.
    *
    * For the definitions of variant sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * The variants for import will be merged with any existing variant that
    * matches its reference sequence, start, end, reference bases, and
    * alternative bases. If no such variant exists, a new one will be created.
    *
    * When variants are merged, the call information from the new variant
    * is added to the existing variant, and Variant info fields are merged
    * as specified in
    * infoMergeConfig.
    * As a special case, for single-sample VCF files, QUAL and FILTER fields will
    * be moved to the call level; these are sometimes interpreted in a
    * call-specific context.
    * Imported VCF headers are appended to the metadata already in a variant set.
    */
  def `import`(request: AnonAccesstoken): Request_[Operation]
  /**
    * Merges the given variants with existing variants.
    *
    * For the definitions of variants and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * Each variant will be
    * merged with an existing variant that matches its reference sequence,
    * start, end, reference bases, and alternative bases. If no such variant
    * exists, a new one will be created.
    *
    * When variants are merged, the call information from the new variant
    * is added to the existing variant. Variant info fields are merged as
    * specified in the
    * infoMergeConfig
    * field of the MergeVariantsRequest.
    *
    * Please exercise caution when using this method!  It is easy to introduce
    * mistakes in existing variants and difficult to back out of them.  For
    * example,
    * suppose you were trying to merge a new variant with an existing one and
    * both
    * variants contain calls that belong to callsets with the same callset ID.
    *
    * // Existing variant - irrelevant fields trimmed for clarity
    * {
    * "variantSetId": "10473108253681171589",
    * "referenceName": "1",
    * "start": "10582",
    * "referenceBases": "G",
    * "alternateBases": [
    * "A"
    * ],
    * "calls": [
    * {
    * "callSetId": "10473108253681171589-0",
    * "callSetName": "CALLSET0",
    * "genotype": [
    * 0,
    * 1
    * ],
    * }
    * ]
    * }
    *
    * // New variant with conflicting call information
    * {
    * "variantSetId": "10473108253681171589",
    * "referenceName": "1",
    * "start": "10582",
    * "referenceBases": "G",
    * "alternateBases": [
    * "A"
    * ],
    * "calls": [
    * {
    * "callSetId": "10473108253681171589-0",
    * "callSetName": "CALLSET0",
    * "genotype": [
    * 1,
    * 1
    * ],
    * }
    * ]
    * }
    *
    * The resulting merged variant would overwrite the existing calls with those
    * from the new variant:
    *
    * {
    * "variantSetId": "10473108253681171589",
    * "referenceName": "1",
    * "start": "10582",
    * "referenceBases": "G",
    * "alternateBases": [
    * "A"
    * ],
    * "calls": [
    * {
    * "callSetId": "10473108253681171589-0",
    * "callSetName": "CALLSET0",
    * "genotype": [
    * 1,
    * 1
    * ],
    * }
    * ]
    * }
    *
    * This may be the desired outcome, but it is up to the user to determine if
    * if that is indeed the case.
    */
  def merge(request: AnonAccesstoken): Request_[js.Object]
  /**
    * Updates a variant.
    *
    * For the definitions of variants and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * This method supports patch semantics. Returns the modified variant without
    * its calls.
    */
  def patch(request: AnonUpdateMask): Request_[Variant]
  /**
    * Gets a list of variants matching the criteria.
    *
    * For the definitions of variants and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * Implements
    * [GlobalAllianceApi.searchVariants](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/variantmethods.avdl#L126).
    */
  def search(request: AnonAccesstoken): Request_[SearchVariantsResponse]
}

object VariantsResource {
  @scala.inline
  def apply(
    create: AnonAccesstoken => CallbackTo[Request_[Variant]],
    delete: AnonUploadType => CallbackTo[Request_[js.Object]],
    get: AnonUploadType => CallbackTo[Request_[Variant]],
    `import`: AnonAccesstoken => CallbackTo[Request_[Operation]],
    merge: AnonAccesstoken => CallbackTo[Request_[js.Object]],
    patch: AnonUpdateMask => CallbackTo[Request_[Variant]],
    search: AnonAccesstoken => CallbackTo[Request_[SearchVariantsResponse]]
  ): VariantsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGenomics.AnonAccesstoken) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGenomics.AnonUploadType) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGenomics.AnonUploadType) => get(t0).runNow()))
    __obj.updateDynamic("import")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGenomics.AnonAccesstoken) => `import`(t0).runNow()))
    __obj.updateDynamic("merge")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGenomics.AnonAccesstoken) => merge(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGenomics.AnonUpdateMask) => patch(t0).runNow()))
    __obj.updateDynamic("search")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGenomics.AnonAccesstoken) => search(t0).runNow()))
    __obj.asInstanceOf[VariantsResource]
  }
}

