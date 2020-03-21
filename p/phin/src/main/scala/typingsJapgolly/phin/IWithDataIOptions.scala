package typingsJapgolly.phin

import typingsJapgolly.node.httpMod.ClientRequestArgs
import typingsJapgolly.phin.phinStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined phin.phin.IWithData<phin.phin.IOptions> */
trait IWithDataIOptions extends js.Object {
  var compression: js.UndefOr[Boolean] = js.undefined
  var core: js.UndefOr[ClientRequestArgs] = js.undefined
  var data: AnonToString
  var followRedirects: js.UndefOr[Boolean] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var hostname: js.UndefOr[String] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var parse: js.UndefOr[none] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var stream: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var url: String
}

object IWithDataIOptions {
  @scala.inline
  def apply(
    data: AnonToString,
    url: String,
    compression: js.UndefOr[Boolean] = js.undefined,
    core: ClientRequestArgs = null,
    followRedirects: js.UndefOr[Boolean] = js.undefined,
    headers: js.Object = null,
    hostname: String = null,
    method: String = null,
    parse: none = null,
    path: String = null,
    port: Int | Double = null,
    stream: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null
  ): IWithDataIOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(compression)) __obj.updateDynamic("compression")(compression.asInstanceOf[js.Any])
    if (core != null) __obj.updateDynamic("core")(core.asInstanceOf[js.Any])
    if (!js.isUndefined(followRedirects)) __obj.updateDynamic("followRedirects")(followRedirects.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (parse != null) __obj.updateDynamic("parse")(parse.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(stream)) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWithDataIOptions]
  }
}

