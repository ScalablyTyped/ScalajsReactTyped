package typingsJapgolly.bodyParser.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsText extends Options {
  /**
    * Specify the default character set for the text content if the charset
    * is not specified in the Content-Type header of the request.
    * Defaults to `utf-8`.
    */
  var defaultCharset: js.UndefOr[String] = js.undefined
}

object OptionsText {
  @scala.inline
  def apply(
    defaultCharset: String = null,
    inflate: js.UndefOr[Boolean] = js.undefined,
    limit: Double | String = null,
    `type`: String | js.Array[String] | (js.Function1[/* req */ IncomingMessage, _]) = null,
    verify: (/* req */ IncomingMessage, /* res */ ServerResponse, /* buf */ Buffer, /* encoding */ String) => Callback = null
  ): OptionsText = {
    val __obj = js.Dynamic.literal()
    if (defaultCharset != null) __obj.updateDynamic("defaultCharset")(defaultCharset.asInstanceOf[js.Any])
    if (!js.isUndefined(inflate)) __obj.updateDynamic("inflate")(inflate.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (verify != null) __obj.updateDynamic("verify")(js.Any.fromFunction4((t0: /* req */ typingsJapgolly.node.httpMod.IncomingMessage, t1: /* res */ typingsJapgolly.node.httpMod.ServerResponse, t2: /* buf */ typingsJapgolly.node.Buffer, t3: /* encoding */ java.lang.String) => verify(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[OptionsText]
  }
}

