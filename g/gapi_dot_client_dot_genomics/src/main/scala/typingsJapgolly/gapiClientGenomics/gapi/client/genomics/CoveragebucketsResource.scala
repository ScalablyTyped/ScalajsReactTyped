package typingsJapgolly.gapiClientGenomics.gapi.client.genomics

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientGenomics.AnonEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoveragebucketsResource extends js.Object {
  /**
    * Lists fixed width coverage buckets for a read group set, each of which
    * correspond to a range of a reference sequence. Each bucket summarizes
    * coverage information across its corresponding genomic range.
    *
    * For the definitions of read group sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * Coverage is defined as the number of reads which are aligned to a given
    * base in the reference sequence. Coverage buckets are available at several
    * precomputed bucket widths, enabling retrieval of various coverage 'zoom
    * levels'. The caller must have READ permissions for the target read group
    * set.
    */
  def list(request: AnonEnd): Request_[ListCoverageBucketsResponse]
}

object CoveragebucketsResource {
  @scala.inline
  def apply(list: AnonEnd => CallbackTo[Request_[ListCoverageBucketsResponse]]): CoveragebucketsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGenomics.AnonEnd) => list(t0).runNow()))
    __obj.asInstanceOf[CoveragebucketsResource]
  }
}

