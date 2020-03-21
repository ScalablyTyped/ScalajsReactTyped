package typingsJapgolly.raven.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.raven.mod.transports.Transport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstructorOptions extends js.Object {
  var autoBreadcrumbs: js.UndefOr[Boolean | StringDictionary[Boolean]] = js.undefined
  var captureUnhandledRejections: js.UndefOr[Boolean] = js.undefined
  var dataCallback: js.UndefOr[DataCallback] = js.undefined
  var environment: js.UndefOr[String] = js.undefined
  var extra: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var logger: js.UndefOr[String] = js.undefined
  var maxBreadcrumbs: js.UndefOr[Double] = js.undefined
  var maxReqQueueCount: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var parseUser: js.UndefOr[Boolean | js.Array[String] | parseUserCallback] = js.undefined
  var release: js.UndefOr[String] = js.undefined
  var sampleRate: js.UndefOr[Double] = js.undefined
  var sendTimeout: js.UndefOr[Double] = js.undefined
  var shouldSendCallback: js.UndefOr[ShouldSendCallback] = js.undefined
  var tags: js.UndefOr[StringDictionary[String]] = js.undefined
  var transport: js.UndefOr[Transport] = js.undefined
}

object ConstructorOptions {
  @scala.inline
  def apply(
    autoBreadcrumbs: Boolean | StringDictionary[Boolean] = null,
    captureUnhandledRejections: js.UndefOr[Boolean] = js.undefined,
    dataCallback: /* data */ StringDictionary[js.Any] => CallbackTo[js.Any] = null,
    environment: String = null,
    extra: StringDictionary[js.Any] = null,
    logger: String = null,
    maxBreadcrumbs: Int | Double = null,
    maxReqQueueCount: Int | Double = null,
    name: String = null,
    parseUser: Boolean | js.Array[String] | parseUserCallback = null,
    release: String = null,
    sampleRate: Int | Double = null,
    sendTimeout: Int | Double = null,
    shouldSendCallback: /* data */ StringDictionary[js.Any] => CallbackTo[Boolean] = null,
    tags: StringDictionary[String] = null,
    transport: Transport = null
  ): ConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (autoBreadcrumbs != null) __obj.updateDynamic("autoBreadcrumbs")(autoBreadcrumbs.asInstanceOf[js.Any])
    if (!js.isUndefined(captureUnhandledRejections)) __obj.updateDynamic("captureUnhandledRejections")(captureUnhandledRejections.asInstanceOf[js.Any])
    if (dataCallback != null) __obj.updateDynamic("dataCallback")(js.Any.fromFunction1((t0: /* data */ org.scalablytyped.runtime.StringDictionary[js.Any]) => dataCallback(t0).runNow()))
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (maxBreadcrumbs != null) __obj.updateDynamic("maxBreadcrumbs")(maxBreadcrumbs.asInstanceOf[js.Any])
    if (maxReqQueueCount != null) __obj.updateDynamic("maxReqQueueCount")(maxReqQueueCount.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parseUser != null) __obj.updateDynamic("parseUser")(parseUser.asInstanceOf[js.Any])
    if (release != null) __obj.updateDynamic("release")(release.asInstanceOf[js.Any])
    if (sampleRate != null) __obj.updateDynamic("sampleRate")(sampleRate.asInstanceOf[js.Any])
    if (sendTimeout != null) __obj.updateDynamic("sendTimeout")(sendTimeout.asInstanceOf[js.Any])
    if (shouldSendCallback != null) __obj.updateDynamic("shouldSendCallback")(js.Any.fromFunction1((t0: /* data */ org.scalablytyped.runtime.StringDictionary[js.Any]) => shouldSendCallback(t0).runNow()))
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (transport != null) __obj.updateDynamic("transport")(transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstructorOptions]
  }
}

