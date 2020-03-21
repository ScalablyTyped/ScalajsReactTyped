package typingsJapgolly.evaporate.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.experimental.ReadableStream
import org.scalajs.dom.raw.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<evaporate.evaporate.CreateConfig, evaporate.evaporate.AddOverrideOptionKeys> */
trait AddOverrideOptions extends js.Object {
  var abortCompletionThrottlingMs: js.UndefOr[Double] = js.undefined
  var aws_key: js.UndefOr[String] = js.undefined
  var aws_url: js.UndefOr[String] = js.undefined
  var bucket: String
  var customAuthMethod: js.UndefOr[
    js.Function5[
      /* signParams */ String, 
      /* signHeaders */ String, 
      /* stringToSign */ String, 
      /* signatureDateTime */ String, 
      /* canonicalRequest */ String, 
      js.Promise[String]
    ]
  ] = js.undefined
  var localTimeOffset: js.UndefOr[Double] = js.undefined
  var maxFileSize: js.UndefOr[Double] = js.undefined
  var maxRetryBackoffSecs: js.UndefOr[Double] = js.undefined
  var mockLocalStorage: js.UndefOr[Boolean] = js.undefined
  var partSize: js.UndefOr[Double] = js.undefined
  var progressIntervalMS: js.UndefOr[Double] = js.undefined
  var readableStreamPartMethod: js.UndefOr[
    js.Function3[/* file */ File, /* start */ Double, /* end */ Double, ReadableStream[_]]
  ] = js.undefined
  var readableStreams: js.UndefOr[Boolean] = js.undefined
  var retryBackoffPower: js.UndefOr[Double] = js.undefined
  var s3Acceleration: js.UndefOr[Boolean] = js.undefined
  var s3FileCacheHoursAgo: js.UndefOr[Double] = js.undefined
  var sendCanonicalRequestToSignerUrl: js.UndefOr[Boolean] = js.undefined
  var signHeaders: js.UndefOr[js.Object] = js.undefined
  var signParams: js.UndefOr[js.Object] = js.undefined
  var signResponseHandler: js.UndefOr[
    js.Function3[
      /* response */ js.Any, 
      /* stringToSign */ String, 
      /* signatureDateTime */ String, 
      js.Promise[String]
    ]
  ] = js.undefined
  var signerUrl: js.UndefOr[String] = js.undefined
  var xhrWithCredentials: js.UndefOr[Boolean] = js.undefined
}

object AddOverrideOptions {
  @scala.inline
  def apply(
    bucket: String,
    abortCompletionThrottlingMs: Int | Double = null,
    aws_key: String = null,
    aws_url: String = null,
    customAuthMethod: (/* signParams */ String, /* signHeaders */ String, /* stringToSign */ String, /* signatureDateTime */ String, /* canonicalRequest */ String) => CallbackTo[js.Promise[String]] = null,
    localTimeOffset: Int | Double = null,
    maxFileSize: Int | Double = null,
    maxRetryBackoffSecs: Int | Double = null,
    mockLocalStorage: js.UndefOr[Boolean] = js.undefined,
    partSize: Int | Double = null,
    progressIntervalMS: Int | Double = null,
    readableStreamPartMethod: (/* file */ File, /* start */ Double, /* end */ Double) => CallbackTo[ReadableStream[js.Any]] = null,
    readableStreams: js.UndefOr[Boolean] = js.undefined,
    retryBackoffPower: Int | Double = null,
    s3Acceleration: js.UndefOr[Boolean] = js.undefined,
    s3FileCacheHoursAgo: Int | Double = null,
    sendCanonicalRequestToSignerUrl: js.UndefOr[Boolean] = js.undefined,
    signHeaders: js.Object = null,
    signParams: js.Object = null,
    signResponseHandler: (/* response */ js.Any, /* stringToSign */ String, /* signatureDateTime */ String) => CallbackTo[js.Promise[String]] = null,
    signerUrl: String = null,
    xhrWithCredentials: js.UndefOr[Boolean] = js.undefined
  ): AddOverrideOptions = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    if (abortCompletionThrottlingMs != null) __obj.updateDynamic("abortCompletionThrottlingMs")(abortCompletionThrottlingMs.asInstanceOf[js.Any])
    if (aws_key != null) __obj.updateDynamic("aws_key")(aws_key.asInstanceOf[js.Any])
    if (aws_url != null) __obj.updateDynamic("aws_url")(aws_url.asInstanceOf[js.Any])
    if (customAuthMethod != null) __obj.updateDynamic("customAuthMethod")(js.Any.fromFunction5((t0: /* signParams */ java.lang.String, t1: /* signHeaders */ java.lang.String, t2: /* stringToSign */ java.lang.String, t3: /* signatureDateTime */ java.lang.String, t4: /* canonicalRequest */ java.lang.String) => customAuthMethod(t0, t1, t2, t3, t4).runNow()))
    if (localTimeOffset != null) __obj.updateDynamic("localTimeOffset")(localTimeOffset.asInstanceOf[js.Any])
    if (maxFileSize != null) __obj.updateDynamic("maxFileSize")(maxFileSize.asInstanceOf[js.Any])
    if (maxRetryBackoffSecs != null) __obj.updateDynamic("maxRetryBackoffSecs")(maxRetryBackoffSecs.asInstanceOf[js.Any])
    if (!js.isUndefined(mockLocalStorage)) __obj.updateDynamic("mockLocalStorage")(mockLocalStorage.asInstanceOf[js.Any])
    if (partSize != null) __obj.updateDynamic("partSize")(partSize.asInstanceOf[js.Any])
    if (progressIntervalMS != null) __obj.updateDynamic("progressIntervalMS")(progressIntervalMS.asInstanceOf[js.Any])
    if (readableStreamPartMethod != null) __obj.updateDynamic("readableStreamPartMethod")(js.Any.fromFunction3((t0: /* file */ org.scalajs.dom.raw.File, t1: /* start */ scala.Double, t2: /* end */ scala.Double) => readableStreamPartMethod(t0, t1, t2).runNow()))
    if (!js.isUndefined(readableStreams)) __obj.updateDynamic("readableStreams")(readableStreams.asInstanceOf[js.Any])
    if (retryBackoffPower != null) __obj.updateDynamic("retryBackoffPower")(retryBackoffPower.asInstanceOf[js.Any])
    if (!js.isUndefined(s3Acceleration)) __obj.updateDynamic("s3Acceleration")(s3Acceleration.asInstanceOf[js.Any])
    if (s3FileCacheHoursAgo != null) __obj.updateDynamic("s3FileCacheHoursAgo")(s3FileCacheHoursAgo.asInstanceOf[js.Any])
    if (!js.isUndefined(sendCanonicalRequestToSignerUrl)) __obj.updateDynamic("sendCanonicalRequestToSignerUrl")(sendCanonicalRequestToSignerUrl.asInstanceOf[js.Any])
    if (signHeaders != null) __obj.updateDynamic("signHeaders")(signHeaders.asInstanceOf[js.Any])
    if (signParams != null) __obj.updateDynamic("signParams")(signParams.asInstanceOf[js.Any])
    if (signResponseHandler != null) __obj.updateDynamic("signResponseHandler")(js.Any.fromFunction3((t0: /* response */ js.Any, t1: /* stringToSign */ java.lang.String, t2: /* signatureDateTime */ java.lang.String) => signResponseHandler(t0, t1, t2).runNow()))
    if (signerUrl != null) __obj.updateDynamic("signerUrl")(signerUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(xhrWithCredentials)) __obj.updateDynamic("xhrWithCredentials")(xhrWithCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddOverrideOptions]
  }
}

