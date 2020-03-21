package typingsJapgolly.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchCreateAnnotationsRequest extends js.Object {
  /**
    * The annotations to be created. At most 4096 can be specified in a single
    * request.
    */
  var annotations: js.UndefOr[js.Array[Annotation]] = js.undefined
  /**
    * A unique request ID which enables the server to detect duplicated requests.
    * If provided, duplicated requests will result in the same response; if not
    * provided, duplicated requests may result in duplicated data. For a given
    * annotation set, callers should not reuse `request_id`s when writing
    * different batches of annotations - behavior in this case is undefined.
    * A common approach is to use a UUID. For batch jobs where worker crashes are
    * a possibility, consider using some unique variant of a worker or run ID.
    */
  var requestId: js.UndefOr[String] = js.undefined
}

object BatchCreateAnnotationsRequest {
  @scala.inline
  def apply(annotations: js.Array[Annotation] = null, requestId: String = null): BatchCreateAnnotationsRequest = {
    val __obj = js.Dynamic.literal()
    if (annotations != null) __obj.updateDynamic("annotations")(annotations.asInstanceOf[js.Any])
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchCreateAnnotationsRequest]
  }
}

