package typingsJapgolly.jpm.FFAddonSDK

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SDKURL extends js.Object {
  var hash: String
  var host: String
  var hostname: String
  var href: String
  var origin: String
  var path: String
  var pathname: String
  var port: String
  var protocol: String
  var scheme: String
  var search: String
  var userPass: String
  def toJSON(): String
}

object SDKURL {
  @scala.inline
  def apply(
    hash: String,
    host: String,
    hostname: String,
    href: String,
    origin: String,
    path: String,
    pathname: String,
    port: String,
    protocol: String,
    scheme: String,
    search: String,
    toJSON: CallbackTo[String],
    userPass: String
  ): SDKURL = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], userPass = userPass.asInstanceOf[js.Any])
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.asInstanceOf[SDKURL]
  }
}

