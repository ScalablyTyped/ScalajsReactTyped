package typingsJapgolly.gapiClientGenomics.gapi.client.genomics

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientGenomics.AnonAccesstoken
import typingsJapgolly.gapiClientGenomics.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferencesResource extends js.Object {
  var bases: BasesResource
  /**
    * Gets a reference.
    *
    * For the definitions of references and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * Implements
    * [GlobalAllianceApi.getReference](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/referencemethods.avdl#L158).
    */
  def get(request: AnonQuotaUser): Request_[Reference]
  /**
    * Searches for references which match the given criteria.
    *
    * For the definitions of references and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * Implements
    * [GlobalAllianceApi.searchReferences](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/referencemethods.avdl#L146).
    */
  def search(request: AnonAccesstoken): Request_[SearchReferencesResponse]
}

object ReferencesResource {
  @scala.inline
  def apply(
    bases: BasesResource,
    get: AnonQuotaUser => CallbackTo[Request_[Reference]],
    search: AnonAccesstoken => CallbackTo[Request_[SearchReferencesResponse]]
  ): ReferencesResource = {
    val __obj = js.Dynamic.literal(bases = bases.asInstanceOf[js.Any])
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGenomics.AnonQuotaUser) => get(t0).runNow()))
    __obj.updateDynamic("search")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGenomics.AnonAccesstoken) => search(t0).runNow()))
    __obj.asInstanceOf[ReferencesResource]
  }
}

