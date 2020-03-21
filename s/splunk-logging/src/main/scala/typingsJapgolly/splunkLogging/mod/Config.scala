package typingsJapgolly.splunkLogging.mod

import typingsJapgolly.splunkLogging.splunkLoggingStrings.http
import typingsJapgolly.splunkLogging.splunkLoggingStrings.https
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var batchInterval: js.UndefOr[Double] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var level: js.UndefOr[String] = js.undefined
  var maxBatchCount: js.UndefOr[Double] = js.undefined
  var maxBatchSize: js.UndefOr[Double] = js.undefined
  var maxRetries: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var protocol: js.UndefOr[http | https] = js.undefined
  var token: String
  var url: js.UndefOr[String] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    token: String,
    batchInterval: Int | Double = null,
    host: String = null,
    level: String = null,
    maxBatchCount: Int | Double = null,
    maxBatchSize: Int | Double = null,
    maxRetries: Int | Double = null,
    name: String = null,
    path: String = null,
    port: Int | Double = null,
    protocol: http | https = null,
    url: String = null
  ): Config = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    if (batchInterval != null) __obj.updateDynamic("batchInterval")(batchInterval.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (maxBatchCount != null) __obj.updateDynamic("maxBatchCount")(maxBatchCount.asInstanceOf[js.Any])
    if (maxBatchSize != null) __obj.updateDynamic("maxBatchSize")(maxBatchSize.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

