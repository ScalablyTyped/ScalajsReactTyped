package typingsJapgolly.awsSdkClientS3Node.s3ConfigurationMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.awsSdkClientS3Node.AnonInstantiable
import typingsJapgolly.awsSdkTypes.credentialsMod.Credentials
import typingsJapgolly.awsSdkTypes.cryptoMod.HashConstructor
import typingsJapgolly.awsSdkTypes.cryptoMod.StreamHasher
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

trait S3Configuration extends js.Object {
  /**
    * The function that will be used to convert a base64-encoded string to a byte array
    */
  var base64Decoder: js.UndefOr[Decoder] = js.undefined
  /**
    * The function that will be used to convert binary data to a base64-encoded string
    */
  var base64Encoder: js.UndefOr[Encoder] = js.undefined
  /**
    * Whether the provided endpoint addresses an individual bucket.
    */
  var bucketEndpoint: js.UndefOr[Boolean] = js.undefined
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
    * Whether body signing should be disabled. Body signing can only be disabled when using HTTPS
    */
  var disableBodySigning: js.UndefOr[Boolean] = js.undefined
  /**
    * The fully qualified endpoint of the webservice. This is only required when using a custom endpoint (for example, when using a local version of S3).
    */
  var endpoint: js.UndefOr[String | HttpEndpoint | Provider[HttpEndpoint]] = js.undefined
  /**
    * The endpoint provider to call if no endpoint is provided
    */
  var endpointProvider: js.UndefOr[js.Any] = js.undefined
  /**
    * Whether to force path style URLs for S3 objects (e.g., https://s3.amazonaws.com/<bucketName>/<key> instead of https://<bucketName>.s3.amazonaws.com/<key>
    */
  var forcePathStyle: js.UndefOr[Boolean] = js.undefined
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
    * A constructor for a class implementing the @aws-sdk/types.Hash interface that computes the MD5 checksum of a string or binary buffer
    */
  var md5: js.UndefOr[AnonInstantiable] = js.undefined
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
    * A function that, given a hash constructor and a stream, calculates the hash of the streamed value
    */
  var streamHasher: js.UndefOr[StreamHasher[Readable]] = js.undefined
  /**
    * The function that will be used to convert strings into HTTP endpoints
    */
  var urlParser: js.UndefOr[UrlParser] = js.undefined
  /**
    * Whether to use the S3 Transfer Acceleration endpoint by default
    */
  var useAccelerateEndpoint: js.UndefOr[Boolean] = js.undefined
  /**
    * Enables IPv6/IPv4 dualstack endpoint. When a DNS lookup is performed on an endpoint of this type, it returns an “A” record with an IPv4 address and an “AAAA” record with an IPv6 address. In most cases the network stack in the client environment will automatically prefer the AAAA record and make a connection using the IPv6 address. Note, however, that currently on Windows, the IPv4 address will be preferred.
    */
  var useDualstackEndpoint: js.UndefOr[Boolean] = js.undefined
  /**
    * The function that will be used to convert a UTF8-encoded string to a byte array
    */
  var utf8Decoder: js.UndefOr[Decoder] = js.undefined
  /**
    * The function that will be used to convert binary data to a UTF-8 encoded string
    */
  var utf8Encoder: js.UndefOr[Encoder] = js.undefined
}

object S3Configuration {
  @scala.inline
  def apply(
    base64Decoder: /* input */ String => CallbackTo[scala.scalajs.js.typedarray.Uint8Array] = null,
    base64Encoder: /* input */ scala.scalajs.js.typedarray.Uint8Array => CallbackTo[String] = null,
    bucketEndpoint: js.UndefOr[Boolean] = js.undefined,
    credentials: Credentials | Provider[Credentials] = null,
    delayDecider: (/* delayBase */ Double, /* attempts */ Double) => CallbackTo[Double] = null,
    disableBodySigning: js.UndefOr[Boolean] = js.undefined,
    endpoint: String | HttpEndpoint | Provider[HttpEndpoint] = null,
    endpointProvider: js.Any = null,
    forcePathStyle: js.UndefOr[Boolean] = js.undefined,
    handler: /* context */ HandlerExecutionContext => CallbackTo[FinalizeHandler[js.Object, js.Any, Readable]] = null,
    httpHandler: HttpHandler[Readable, HttpOptions] = null,
    maxRedirects: Int | Double = null,
    maxRetries: Int | Double = null,
    md5: AnonInstantiable = null,
    profile: String = null,
    region: String | Provider[String] = null,
    retryDecider: /* error */ SdkError => CallbackTo[Boolean] = null,
    sha256: HashConstructor = null,
    signer: RequestSigner = null,
    signingName: String = null,
    sslEnabled: js.UndefOr[Boolean] = js.undefined,
    streamCollector: Readable => CallbackTo[js.Promise[scala.scalajs.js.typedarray.Uint8Array]] = null,
    streamHasher: (/* hashCtor */ typingsJapgolly.awsSdkTypes.AnonInstantiable, Readable) => CallbackTo[js.Promise[scala.scalajs.js.typedarray.Uint8Array]] = null,
    urlParser: /* url */ String => CallbackTo[HttpEndpoint] = null,
    useAccelerateEndpoint: js.UndefOr[Boolean] = js.undefined,
    useDualstackEndpoint: js.UndefOr[Boolean] = js.undefined,
    utf8Decoder: /* input */ String => CallbackTo[scala.scalajs.js.typedarray.Uint8Array] = null,
    utf8Encoder: /* input */ scala.scalajs.js.typedarray.Uint8Array => CallbackTo[String] = null
  ): S3Configuration = {
    val __obj = js.Dynamic.literal()
    if (base64Decoder != null) __obj.updateDynamic("base64Decoder")(js.Any.fromFunction1((t0: /* input */ java.lang.String) => base64Decoder(t0).runNow()))
    if (base64Encoder != null) __obj.updateDynamic("base64Encoder")(js.Any.fromFunction1((t0: /* input */ scala.scalajs.js.typedarray.Uint8Array) => base64Encoder(t0).runNow()))
    if (!js.isUndefined(bucketEndpoint)) __obj.updateDynamic("bucketEndpoint")(bucketEndpoint.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (delayDecider != null) __obj.updateDynamic("delayDecider")(js.Any.fromFunction2((t0: /* delayBase */ scala.Double, t1: /* attempts */ scala.Double) => delayDecider(t0, t1).runNow()))
    if (!js.isUndefined(disableBodySigning)) __obj.updateDynamic("disableBodySigning")(disableBodySigning.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (endpointProvider != null) __obj.updateDynamic("endpointProvider")(endpointProvider.asInstanceOf[js.Any])
    if (!js.isUndefined(forcePathStyle)) __obj.updateDynamic("forcePathStyle")(forcePathStyle.asInstanceOf[js.Any])
    if (handler != null) __obj.updateDynamic("handler")(js.Any.fromFunction1((t0: /* context */ typingsJapgolly.awsSdkTypes.middlewareMod.HandlerExecutionContext) => handler(t0).runNow()))
    if (httpHandler != null) __obj.updateDynamic("httpHandler")(httpHandler.asInstanceOf[js.Any])
    if (maxRedirects != null) __obj.updateDynamic("maxRedirects")(maxRedirects.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (md5 != null) __obj.updateDynamic("md5")(md5.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (retryDecider != null) __obj.updateDynamic("retryDecider")(js.Any.fromFunction1((t0: /* error */ typingsJapgolly.awsSdkTypes.utilMod.SdkError) => retryDecider(t0).runNow()))
    if (sha256 != null) __obj.updateDynamic("sha256")(sha256.asInstanceOf[js.Any])
    if (signer != null) __obj.updateDynamic("signer")(signer.asInstanceOf[js.Any])
    if (signingName != null) __obj.updateDynamic("signingName")(signingName.asInstanceOf[js.Any])
    if (!js.isUndefined(sslEnabled)) __obj.updateDynamic("sslEnabled")(sslEnabled.asInstanceOf[js.Any])
    if (streamCollector != null) __obj.updateDynamic("streamCollector")(js.Any.fromFunction1((t0: typingsJapgolly.node.streamMod.Readable) => streamCollector(t0).runNow()))
    if (streamHasher != null) __obj.updateDynamic("streamHasher")(js.Any.fromFunction2((t0: /* hashCtor */ typingsJapgolly.awsSdkTypes.AnonInstantiable, t1: typingsJapgolly.node.streamMod.Readable) => streamHasher(t0, t1).runNow()))
    if (urlParser != null) __obj.updateDynamic("urlParser")(js.Any.fromFunction1((t0: /* url */ java.lang.String) => urlParser(t0).runNow()))
    if (!js.isUndefined(useAccelerateEndpoint)) __obj.updateDynamic("useAccelerateEndpoint")(useAccelerateEndpoint.asInstanceOf[js.Any])
    if (!js.isUndefined(useDualstackEndpoint)) __obj.updateDynamic("useDualstackEndpoint")(useDualstackEndpoint.asInstanceOf[js.Any])
    if (utf8Decoder != null) __obj.updateDynamic("utf8Decoder")(js.Any.fromFunction1((t0: /* input */ java.lang.String) => utf8Decoder(t0).runNow()))
    if (utf8Encoder != null) __obj.updateDynamic("utf8Encoder")(js.Any.fromFunction1((t0: /* input */ scala.scalajs.js.typedarray.Uint8Array) => utf8Encoder(t0).runNow()))
    __obj.asInstanceOf[S3Configuration]
  }
}

