package typingsJapgolly.got.mod

import typingsJapgolly.got.gotStrings.connect
import typingsJapgolly.got.gotStrings.lookup
import typingsJapgolly.got.gotStrings.request
import typingsJapgolly.got.gotStrings.response
import typingsJapgolly.got.gotStrings.secureConnect
import typingsJapgolly.got.gotStrings.send
import typingsJapgolly.got.gotStrings.socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeoutError
  extends StdError
     with GotError {
  var event: lookup | connect | secureConnect | socket | response | send | request
  @JSName("name")
  var name_TimeoutError: typingsJapgolly.got.gotStrings.TimeoutError
}

object TimeoutError {
  @scala.inline
  def apply(
    event: lookup | connect | secureConnect | socket | response | send | request,
    message: String,
    name: typingsJapgolly.got.gotStrings.TimeoutError,
    code: String = null,
    host: String = null,
    hostname: String = null,
    method: String = null,
    path: String = null,
    protocol: String = null,
    response: js.Any = null,
    stack: String = null,
    url: String = null
  ): TimeoutError = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeoutError]
  }
}

