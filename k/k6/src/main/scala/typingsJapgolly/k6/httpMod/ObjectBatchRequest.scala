package typingsJapgolly.k6.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectBatchRequest extends js.Object {
  /** Request body. */
  var body: js.UndefOr[RequestBody | Null] = js.undefined
  /** Request method. */
  var method: String
  /** Requset parameters. */
  var params: js.UndefOr[Params | Null] = js.undefined
  /** Request URL. */
  var url: String
}

object ObjectBatchRequest {
  @scala.inline
  def apply(method: String, url: String, body: RequestBody = null, params: Params = null): ObjectBatchRequest = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectBatchRequest]
  }
}

