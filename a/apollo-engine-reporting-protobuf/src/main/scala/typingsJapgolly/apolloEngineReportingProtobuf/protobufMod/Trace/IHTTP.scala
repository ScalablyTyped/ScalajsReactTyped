package typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.Trace

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP.IValues
import typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP.Method
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a HTTP. */
trait IHTTP extends js.Object {
  /** HTTP host */
  var host: js.UndefOr[String | Null] = js.undefined
  /** HTTP method */
  var method: js.UndefOr[Method | Null] = js.undefined
  /** HTTP path */
  var path: js.UndefOr[String | Null] = js.undefined
  /** HTTP protocol */
  var protocol: js.UndefOr[String | Null] = js.undefined
  /** HTTP requestHeaders */
  var requestHeaders: js.UndefOr[StringDictionary[IValues] | Null] = js.undefined
  /** HTTP responseHeaders */
  var responseHeaders: js.UndefOr[StringDictionary[IValues] | Null] = js.undefined
  /** HTTP secure */
  var secure: js.UndefOr[Boolean | Null] = js.undefined
  /** HTTP statusCode */
  var statusCode: js.UndefOr[Double | Null] = js.undefined
}

object IHTTP {
  @scala.inline
  def apply(
    host: String = null,
    method: Method = null,
    path: String = null,
    protocol: String = null,
    requestHeaders: StringDictionary[IValues] = null,
    responseHeaders: StringDictionary[IValues] = null,
    secure: js.UndefOr[Boolean] = js.undefined,
    statusCode: Int | Double = null
  ): IHTTP = {
    val __obj = js.Dynamic.literal()
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (requestHeaders != null) __obj.updateDynamic("requestHeaders")(requestHeaders.asInstanceOf[js.Any])
    if (responseHeaders != null) __obj.updateDynamic("responseHeaders")(responseHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTTP]
  }
}

