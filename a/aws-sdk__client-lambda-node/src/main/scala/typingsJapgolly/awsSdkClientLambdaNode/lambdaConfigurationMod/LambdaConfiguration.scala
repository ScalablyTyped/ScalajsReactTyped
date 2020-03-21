package typingsJapgolly.awsSdkClientLambdaNode.lambdaConfigurationMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.awsSdkTypes.credentialsMod.Credentials
import typingsJapgolly.awsSdkTypes.cryptoMod.HashConstructor
import typingsJapgolly.awsSdkTypes.httpMod.HttpEndpoint
import typingsJapgolly.awsSdkTypes.httpMod.HttpHandler
import typingsJapgolly.awsSdkTypes.httpMod.HttpOptions
import typingsJapgolly.awsSdkTypes.middlewareMod.FinalizeHandler
import typingsJapgolly.awsSdkTypes.middlewareMod.HandlerExecutionContext
import typingsJapgolly.awsSdkTypes.middlewareMod.Terminalware
import typingsJapgolly.awsSdkTypes.signatureMod.RequestSigner
import typingsJapgolly.awsSdkTypes.unmarshallerMod.StreamCollector
import typingsJapgolly.awsSdkTypes.utilMod.Decoder
import typingsJapgolly.awsSdkTypes.utilMod.DelayDecider
import typingsJapgolly.awsSdkTypes.utilMod.Encoder
import typingsJapgolly.awsSdkTypes.utilMod.Provider
import typingsJapgolly.awsSdkTypes.utilMod.RetryDecider
import typingsJapgolly.awsSdkTypes.utilMod.SdkError
import typingsJapgolly.awsSdkTypes.utilMod.UrlParser
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LambdaConfiguration extends js.Object {
  /**
    * The function that will be used to convert a base64-encoded string to a byte array
    */
  var base64Decoder: js.UndefOr[Decoder] = js.undefined
  /**
    * The function that will be used to convert binary data to a base64-encoded string
    */
  var base64Encoder: js.UndefOr[Encoder] = js.undefined
  /**
    * The credentials used to sign requests.
    *
    * If no static credentials are supplied, the SDK will attempt to credentials from known environment variables, from shared configuration and credentials files, and from the EC2 Instance Metadata Service, in that order.
    */
  var credentials: js.UndefOr[Credentials | Provider[Credentials]] = js.undefined
  /**
    * A function that determines how long (in milliseconds) the SDK should wait before retrying a request
    */
  var delayDecider: js.UndefOr[DelayDecider] = js.undefined
  /**
    * The fully qualified endpoint of the webservice. This is only required when using a custom endpoint (for example, when using a local version of S3).
    */
  var endpoint: js.UndefOr[String | HttpEndpoint | Provider[HttpEndpoint]] = js.undefined
  /**
    * The endpoint provider to call if no endpoint is provided
    */
  var endpointProvider: js.UndefOr[js.Any] = js.undefined
  /**
    * The handler to use as the core of the client's middleware stack
    */
  var handler: js.UndefOr[Terminalware[_, Readable]] = js.undefined
  /**
    * The HTTP handler to use
    */
  var httpHandler: js.UndefOr[HttpHandler[Readable, HttpOptions]] = js.undefined
  /**
    * The maximum number of redirects to follow for a service request. Set to `0` to disable retries.
    */
  var maxRedirects: js.UndefOr[Double] = js.undefined
  /**
    * The maximum number of times requests that encounter potentially transient failures should be retried
    */
  var maxRetries: js.UndefOr[Double] = js.undefined
  /**
    * The configuration profile to use.
    */
  var profile: js.UndefOr[String] = js.undefined
  /**
    * The AWS region to which this client will send requests
    */
  var region: js.UndefOr[String | Provider[String]] = js.undefined
  /**
    * A function that determines whether an error is retryable
    */
  var retryDecider: js.UndefOr[RetryDecider] = js.undefined
  /**
    * A constructor for a class implementing the @aws-sdk/types.Hash interface that computes the SHA-256 HMAC or checksum of a string or binary buffer
    */
  var sha256: js.UndefOr[HashConstructor] = js.undefined
  /**
    * The signer to use when signing requests.
    */
  var signer: js.UndefOr[RequestSigner] = js.undefined
  /**
    * The service name with which to sign requests.
    */
  var signingName: js.UndefOr[String] = js.undefined
  /**
    * Whether SSL is enabled for requests.
    */
  var sslEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * A function that converts a stream into an array of bytes.
    */
  var streamCollector: js.UndefOr[StreamCollector[Readable]] = js.undefined
  /**
    * The function that will be used to convert strings into HTTP endpoints
    */
  var urlParser: js.UndefOr[UrlParser] = js.undefined
  /**
    * The function that will be used to convert a UTF8-encoded string to a byte array
    */
  var utf8Decoder: js.UndefOr[Decoder] = js.undefined
  /**
    * The function that will be used to convert binary data to a UTF-8 encoded string
    */
  var utf8Encoder: js.UndefOr[Encoder] = js.undefined
}

object LambdaConfiguration {
  @scala.inline
  def apply(
    base64Decoder: /* input */ String => CallbackTo[scala.scalajs.js.typedarray.Uint8Array] = null,
    base64Encoder: /* input */ scala.scalajs.js.typedarray.Uint8Array => CallbackTo[String] = null,
    credentials: Credentials | Provider[Credentials] = null,
    delayDecider: (/* delayBase */ Double, /* attempts */ Double) => CallbackTo[Double] = null,
    endpoint: String | HttpEndpoint | Provider[HttpEndpoint] = null,
    endpointProvider: js.Any = null,
    handler: /* context */ HandlerExecutionContext => CallbackTo[FinalizeHandler[js.Object, js.Any, Readable]] = null,
    httpHandler: HttpHandler[Readable, HttpOptions] = null,
    maxRedirects: Int | Double = null,
    maxRetries: Int | Double = null,
    profile: String = null,
    region: String | Provider[String] = null,
    retryDecider: /* error */ SdkError => CallbackTo[Boolean] = null,
    sha256: HashConstructor = null,
    signer: RequestSigner = null,
    signingName: String = null,
    sslEnabled: js.UndefOr[Boolean] = js.undefined,
    streamCollector: Readable => CallbackTo[js.Promise[scala.scalajs.js.typedarray.Uint8Array]] = null,
    urlParser: /* url */ String => CallbackTo[HttpEndpoint] = null,
    utf8Decoder: /* input */ String => CallbackTo[scala.scalajs.js.typedarray.Uint8Array] = null,
    utf8Encoder: /* input */ scala.scalajs.js.typedarray.Uint8Array => CallbackTo[String] = null
  ): LambdaConfiguration = {
    val __obj = js.Dynamic.literal()
    if (base64Decoder != null) __obj.updateDynamic("base64Decoder")(js.Any.fromFunction1((t0: /* input */ java.lang.String) => base64Decoder(t0).runNow()))
    if (base64Encoder != null) __obj.updateDynamic("base64Encoder")(js.Any.fromFunction1((t0: /* input */ scala.scalajs.js.typedarray.Uint8Array) => base64Encoder(t0).runNow()))
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (delayDecider != null) __obj.updateDynamic("delayDecider")(js.Any.fromFunction2((t0: /* delayBase */ scala.Double, t1: /* attempts */ scala.Double) => delayDecider(t0, t1).runNow()))
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (endpointProvider != null) __obj.updateDynamic("endpointProvider")(endpointProvider.asInstanceOf[js.Any])
    if (handler != null) __obj.updateDynamic("handler")(js.Any.fromFunction1((t0: /* context */ typingsJapgolly.awsSdkTypes.middlewareMod.HandlerExecutionContext) => handler(t0).runNow()))
    if (httpHandler != null) __obj.updateDynamic("httpHandler")(httpHandler.asInstanceOf[js.Any])
    if (maxRedirects != null) __obj.updateDynamic("maxRedirects")(maxRedirects.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (retryDecider != null) __obj.updateDynamic("retryDecider")(js.Any.fromFunction1((t0: /* error */ typingsJapgolly.awsSdkTypes.utilMod.SdkError) => retryDecider(t0).runNow()))
    if (sha256 != null) __obj.updateDynamic("sha256")(sha256.asInstanceOf[js.Any])
    if (signer != null) __obj.updateDynamic("signer")(signer.asInstanceOf[js.Any])
    if (signingName != null) __obj.updateDynamic("signingName")(signingName.asInstanceOf[js.Any])
    if (!js.isUndefined(sslEnabled)) __obj.updateDynamic("sslEnabled")(sslEnabled.asInstanceOf[js.Any])
    if (streamCollector != null) __obj.updateDynamic("streamCollector")(js.Any.fromFunction1((t0: typingsJapgolly.node.streamMod.Readable) => streamCollector(t0).runNow()))
    if (urlParser != null) __obj.updateDynamic("urlParser")(js.Any.fromFunction1((t0: /* url */ java.lang.String) => urlParser(t0).runNow()))
    if (utf8Decoder != null) __obj.updateDynamic("utf8Decoder")(js.Any.fromFunction1((t0: /* input */ java.lang.String) => utf8Decoder(t0).runNow()))
    if (utf8Encoder != null) __obj.updateDynamic("utf8Encoder")(js.Any.fromFunction1((t0: /* input */ scala.scalajs.js.typedarray.Uint8Array) => utf8Encoder(t0).runNow()))
    __obj.asInstanceOf[LambdaConfiguration]
  }
}

