package typingsJapgolly.jpm.requestMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.jpm.FFAddonSDK.SDKURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseRequest extends js.Object {
  var content: String
  var contentType: String
  var headers: js.Object
  var url: String | SDKURL
  def delete(): Unit
  def get(): Unit
  def head(): Unit
  def post(): Unit
  def put(): Unit
}

object BaseRequest {
  @scala.inline
  def apply(
    content: String,
    contentType: String,
    delete: Callback,
    get: Callback,
    head: Callback,
    headers: js.Object,
    post: Callback,
    put: Callback,
    url: String | SDKURL
  ): BaseRequest = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("delete")(delete.toJsFn)
    __obj.updateDynamic("get")(get.toJsFn)
    __obj.updateDynamic("head")(head.toJsFn)
    __obj.updateDynamic("post")(post.toJsFn)
    __obj.updateDynamic("put")(put.toJsFn)
    __obj.asInstanceOf[BaseRequest]
  }
}

