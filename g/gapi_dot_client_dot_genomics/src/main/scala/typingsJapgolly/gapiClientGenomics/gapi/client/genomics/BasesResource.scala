package typingsJapgolly.gapiClientGenomics.gapi.client.genomics

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientGenomics.AnonPageSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasesResource extends js.Object {
  /**
    * Lists the bases in a reference, optionally restricted to a range.
    *
    * For the definitions of references and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * Implements
    * [GlobalAllianceApi.getReferenceBases](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/referencemethods.avdl#L221).
    */
  def list(request: AnonPageSize): Request_[ListBasesResponse]
}

object BasesResource {
  @scala.inline
  def apply(list: AnonPageSize => CallbackTo[Request_[ListBasesResponse]]): BasesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGenomics.AnonPageSize) => list(t0).runNow()))
    __obj.asInstanceOf[BasesResource]
  }
}

