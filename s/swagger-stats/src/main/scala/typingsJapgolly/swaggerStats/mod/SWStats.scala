package typingsJapgolly.swaggerStats.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  hostname  :string,   name  :string,   version  :string,   ip  :string,   swaggerSpec  :std.Record<any, any>,   uriPath  :string,   timelineBucketDuration  :number,   durationBuckets  :std.Array<number>,   requestSizeBuckets  :std.Array<number>,   responseSizeBuckets  :std.Array<number>,   apdexThreshold  :number, onResponseFinish (req : node.http.IncomingMessage, res : node.http.ServerResponse, rrr : swagger-stats.swagger-stats.RequestResponseRecord): void,   authentication  :boolean, onAuthenticate (req : node.http.IncomingMessage, username : string, password : string): boolean,   sessionMaxAge  :number,   elasticsearch  :string,   elasticsearchIndexPrefix  :string,   elasticsearchUsername  :string,   elasticsearchPassword  :string,   swaggerOnly  :boolean,   metricsPrefix  :string,   enableEgress  :boolean}> */
trait SWStats extends js.Object {
  var apdexThreshold: js.UndefOr[Double] = js.undefined
  var authentication: js.UndefOr[Boolean] = js.undefined
  var durationBuckets: js.UndefOr[js.Array[Double]] = js.undefined
  var elasticsearch: js.UndefOr[String] = js.undefined
  var elasticsearchIndexPrefix: js.UndefOr[String] = js.undefined
  var elasticsearchPassword: js.UndefOr[String] = js.undefined
  var elasticsearchUsername: js.UndefOr[String] = js.undefined
  var enableEgress: js.UndefOr[Boolean] = js.undefined
  var hostname: js.UndefOr[String] = js.undefined
  var ip: js.UndefOr[String] = js.undefined
  var metricsPrefix: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onAuthenticate: js.UndefOr[
    js.Function3[/* req */ IncomingMessage, /* username */ String, /* password */ String, Boolean]
  ] = js.undefined
  var onResponseFinish: js.UndefOr[
    js.Function3[
      /* req */ IncomingMessage, 
      /* res */ ServerResponse, 
      /* rrr */ RequestResponseRecord, 
      Unit
    ]
  ] = js.undefined
  var requestSizeBuckets: js.UndefOr[js.Array[Double]] = js.undefined
  var responseSizeBuckets: js.UndefOr[js.Array[Double]] = js.undefined
  var sessionMaxAge: js.UndefOr[Double] = js.undefined
  var swaggerOnly: js.UndefOr[Boolean] = js.undefined
  var swaggerSpec: js.UndefOr[Record[_, _]] = js.undefined
  var timelineBucketDuration: js.UndefOr[Double] = js.undefined
  var uriPath: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object SWStats {
  @scala.inline
  def apply(
    apdexThreshold: Int | Double = null,
    authentication: js.UndefOr[Boolean] = js.undefined,
    durationBuckets: js.Array[Double] = null,
    elasticsearch: String = null,
    elasticsearchIndexPrefix: String = null,
    elasticsearchPassword: String = null,
    elasticsearchUsername: String = null,
    enableEgress: js.UndefOr[Boolean] = js.undefined,
    hostname: String = null,
    ip: String = null,
    metricsPrefix: String = null,
    name: String = null,
    onAuthenticate: (/* req */ IncomingMessage, /* username */ String, /* password */ String) => CallbackTo[Boolean] = null,
    onResponseFinish: (/* req */ IncomingMessage, /* res */ ServerResponse, /* rrr */ RequestResponseRecord) => Callback = null,
    requestSizeBuckets: js.Array[Double] = null,
    responseSizeBuckets: js.Array[Double] = null,
    sessionMaxAge: Int | Double = null,
    swaggerOnly: js.UndefOr[Boolean] = js.undefined,
    swaggerSpec: Record[_, _] = null,
    timelineBucketDuration: Int | Double = null,
    uriPath: String = null,
    version: String = null
  ): SWStats = {
    val __obj = js.Dynamic.literal()
    if (apdexThreshold != null) __obj.updateDynamic("apdexThreshold")(apdexThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(authentication)) __obj.updateDynamic("authentication")(authentication.asInstanceOf[js.Any])
    if (durationBuckets != null) __obj.updateDynamic("durationBuckets")(durationBuckets.asInstanceOf[js.Any])
    if (elasticsearch != null) __obj.updateDynamic("elasticsearch")(elasticsearch.asInstanceOf[js.Any])
    if (elasticsearchIndexPrefix != null) __obj.updateDynamic("elasticsearchIndexPrefix")(elasticsearchIndexPrefix.asInstanceOf[js.Any])
    if (elasticsearchPassword != null) __obj.updateDynamic("elasticsearchPassword")(elasticsearchPassword.asInstanceOf[js.Any])
    if (elasticsearchUsername != null) __obj.updateDynamic("elasticsearchUsername")(elasticsearchUsername.asInstanceOf[js.Any])
    if (!js.isUndefined(enableEgress)) __obj.updateDynamic("enableEgress")(enableEgress.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (ip != null) __obj.updateDynamic("ip")(ip.asInstanceOf[js.Any])
    if (metricsPrefix != null) __obj.updateDynamic("metricsPrefix")(metricsPrefix.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onAuthenticate != null) __obj.updateDynamic("onAuthenticate")(js.Any.fromFunction3((t0: /* req */ typingsJapgolly.node.httpMod.IncomingMessage, t1: /* username */ java.lang.String, t2: /* password */ java.lang.String) => onAuthenticate(t0, t1, t2).runNow()))
    if (onResponseFinish != null) __obj.updateDynamic("onResponseFinish")(js.Any.fromFunction3((t0: /* req */ typingsJapgolly.node.httpMod.IncomingMessage, t1: /* res */ typingsJapgolly.node.httpMod.ServerResponse, t2: /* rrr */ typingsJapgolly.swaggerStats.mod.RequestResponseRecord) => onResponseFinish(t0, t1, t2).runNow()))
    if (requestSizeBuckets != null) __obj.updateDynamic("requestSizeBuckets")(requestSizeBuckets.asInstanceOf[js.Any])
    if (responseSizeBuckets != null) __obj.updateDynamic("responseSizeBuckets")(responseSizeBuckets.asInstanceOf[js.Any])
    if (sessionMaxAge != null) __obj.updateDynamic("sessionMaxAge")(sessionMaxAge.asInstanceOf[js.Any])
    if (!js.isUndefined(swaggerOnly)) __obj.updateDynamic("swaggerOnly")(swaggerOnly.asInstanceOf[js.Any])
    if (swaggerSpec != null) __obj.updateDynamic("swaggerSpec")(swaggerSpec.asInstanceOf[js.Any])
    if (timelineBucketDuration != null) __obj.updateDynamic("timelineBucketDuration")(timelineBucketDuration.asInstanceOf[js.Any])
    if (uriPath != null) __obj.updateDynamic("uriPath")(uriPath.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SWStats]
  }
}

