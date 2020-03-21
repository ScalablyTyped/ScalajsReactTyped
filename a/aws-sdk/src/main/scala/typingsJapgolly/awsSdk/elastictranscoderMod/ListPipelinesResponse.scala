package typingsJapgolly.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPipelinesResponse extends js.Object {
  /**
    * A value that you use to access the second and subsequent pages of results, if any. When the pipelines fit on one page or when you've reached the last page of results, the value of NextPageToken is null.
    */
  var NextPageToken: js.UndefOr[Id] = js.native
  /**
    * An array of Pipeline objects.
    */
  var Pipelines: js.UndefOr[typingsJapgolly.awsSdk.elastictranscoderMod.Pipelines] = js.native
}

object ListPipelinesResponse {
  @scala.inline
  def apply(NextPageToken: Id = null, Pipelines: Pipelines = null): ListPipelinesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken.asInstanceOf[js.Any])
    if (Pipelines != null) __obj.updateDynamic("Pipelines")(Pipelines.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPipelinesResponse]
  }
}

