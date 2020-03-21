package typingsJapgolly.jpm.requestMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.jpm.FFAddonSDK.SDKURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait STRequest[ResponseType] extends BaseRequest {
  var response: STResponse[ResponseType]
}

object STRequest {
  @scala.inline
  def apply[ResponseType](
    content: String,
    contentType: String,
    delete: Callback,
    get: Callback,
    head: Callback,
    headers: js.Object,
    post: Callback,
    put: Callback,
    response: STResponse[ResponseType],
    url: String | SDKURL
  ): STRequest[ResponseType] = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("delete")(delete.toJsFn)
    __obj.updateDynamic("get")(get.toJsFn)
    __obj.updateDynamic("head")(head.toJsFn)
    __obj.updateDynamic("post")(post.toJsFn)
    __obj.updateDynamic("put")(put.toJsFn)
    __obj.asInstanceOf[STRequest[ResponseType]]
  }
}

