package typingsJapgolly.swaggerStats.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Record
import typingsJapgolly.swaggerStats.AnonDeprecated
import typingsJapgolly.swaggerStats.AnonHostname
import typingsJapgolly.swaggerStats.AnonRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestResponseRecord
  extends /* field */ StringDictionary[js.Any] {
  var `@timestamp`: String
  var api: AnonDeprecated
  var attrs: js.UndefOr[Record[String, String]] = js.undefined
  var attrsint: js.UndefOr[Record[String, Double]] = js.undefined
  var endts: Double
  var http: AnonRequest
  var ip: String
  var method: String
  var node: AnonHostname
  var path: String
  var port: String
  var query: String
  var real_ip: String
  var responsetime: Double
  var startts: Double
}

object RequestResponseRecord {
  @scala.inline
  def apply(
    `@timestamp`: String,
    api: AnonDeprecated,
    endts: Double,
    http: AnonRequest,
    ip: String,
    method: String,
    node: AnonHostname,
    path: String,
    port: String,
    query: String,
    real_ip: String,
    responsetime: Double,
    startts: Double,
    StringDictionary: /* field */ StringDictionary[js.Any] = null,
    attrs: Record[String, String] = null,
    attrsint: Record[String, Double] = null
  ): RequestResponseRecord = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], endts = endts.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], real_ip = real_ip.asInstanceOf[js.Any], responsetime = responsetime.asInstanceOf[js.Any], startts = startts.asInstanceOf[js.Any])
    __obj.updateDynamic("@timestamp")(`@timestamp`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (attrs != null) __obj.updateDynamic("attrs")(attrs.asInstanceOf[js.Any])
    if (attrsint != null) __obj.updateDynamic("attrsint")(attrsint.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestResponseRecord]
  }
}

