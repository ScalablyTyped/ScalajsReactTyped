package typingsJapgolly.cacheableRequest.mod

import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestErrorCls extends Error {
  @JSName("name")
  val name_RequestErrorCls: typingsJapgolly.cacheableRequest.cacheableRequestStrings.RequestError
}

object RequestErrorCls {
  @scala.inline
  def apply(
    message: String,
    name: typingsJapgolly.cacheableRequest.cacheableRequestStrings.RequestError,
    stack: String = null
  ): RequestErrorCls = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestErrorCls]
  }
}

