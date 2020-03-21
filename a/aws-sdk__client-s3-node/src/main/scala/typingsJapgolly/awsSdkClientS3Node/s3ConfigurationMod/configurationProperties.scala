package typingsJapgolly.awsSdkClientS3Node.s3ConfigurationMod

import typingsJapgolly.awsSdkClientS3Node.AnonInstantiable
import typingsJapgolly.awsSdkTypes.clientMod.ConfigurationPropertyDefinition
import typingsJapgolly.awsSdkTypes.credentialsMod.Credentials
import typingsJapgolly.awsSdkTypes.cryptoMod.HashConstructor
import typingsJapgolly.awsSdkTypes.cryptoMod.StreamHasher
import typingsJapgolly.awsSdkTypes.httpMod.HttpEndpoint
import typingsJapgolly.awsSdkTypes.httpMod.HttpHandler
import typingsJapgolly.awsSdkTypes.httpMod.HttpOptions
import typingsJapgolly.awsSdkTypes.marshallerMod.RequestSerializer
import typingsJapgolly.awsSdkTypes.middlewareMod.Terminalware
import typingsJapgolly.awsSdkTypes.signatureMod.RequestSigner
import typingsJapgolly.awsSdkTypes.unmarshallerMod.ResponseParser
import typingsJapgolly.awsSdkTypes.unmarshallerMod.StreamCollector
import typingsJapgolly.awsSdkTypes.utilMod.Decoder
import typingsJapgolly.awsSdkTypes.utilMod.DelayDecider
import typingsJapgolly.awsSdkTypes.utilMod.Encoder
import typingsJapgolly.awsSdkTypes.utilMod.Provider
import typingsJapgolly.awsSdkTypes.utilMod.RetryDecider
import typingsJapgolly.awsSdkTypes.utilMod.UrlParser
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/S3Configuration", "configurationProperties")
@js.native
object configurationProperties extends js.Object {
  val _user_injected_http_handler: ConfigurationPropertyDefinition[_, _, S3ResolvableConfiguration, S3ResolvedConfiguration] = js.native
  val base64Decoder: ConfigurationPropertyDefinition[js.UndefOr[Decoder], _, S3ResolvableConfiguration, S3ResolvedConfiguration] = js.native
  val base64Encoder: ConfigurationPropertyDefinition[js.UndefOr[Encoder], _, S3ResolvableConfiguration, S3ResolvedConfiguration] = js.native
  val bodyLengthChecker: ConfigurationPropertyDefinition[
    js.Function1[/* body */ _, js.UndefOr[Double]], 
    _, 
    S3ResolvableConfiguration, 
    S3ResolvedConfiguration
  ] = js.native
  val bucketEndpoint: ConfigurationPropertyDefinition[js.UndefOr[Boolean], _, S3ResolvableConfiguration, S3ResolvedConfiguration] = js.native
  val credentials: ConfigurationPropertyDefinition[
    js.UndefOr[Credentials | Provider[Credentials]], 
    _, 
    S3ResolvableConfiguration, 
    S3ResolvedConfiguration
  ] = js.native
  val delayDecider: ConfigurationPropertyDefinition[js.UndefOr[DelayDecider], _, S3ResolvableConfiguration, S3ResolvedConfiguration] = js.native
  val disableBodySigning: ConfigurationPropertyDefinition[js.UndefOr[Boolean], _, S3ResolvableConfiguration, S3ResolvedConfiguration] = js.native
  val endpoint: ConfigurationPropertyDefinition[
    js.UndefOr[String | HttpEndpoint | Provider[HttpEndpoint]], 
    _, 
    S3ResolvableConfiguration, 
    S3ResolvedConfiguration
  ] = js.native
  val endpointProvider: ConfigurationPropertyDefinition[js.UndefOr[_], _, S3ResolvableConfiguration, S3ResolvedConfiguration] = js.native
  val forcePathStyle: ConfigurationPropertyDefinition[js.UndefOr[Boolean], _, S3ResolvableConfiguration, S3ResolvedConfiguration] = js.native
  val handler: ConfigurationPropertyDefinition[
    js.UndefOr[Terminalware[_, Readable]], 
    _, 
    S3ResolvableConfiguration, 
    S3ResolvedConfiguration
  ] = js.native
  val httpHandler: ConfigurationPropertyDefinition[
    js.UndefOr[HttpHandler[Readable, HttpOptions]], 
    _, 
    S3ResolvableConfiguration, 
    S3ResolvedConfiguration
  ] = js.native
  val maxRedirects: ConfigurationPropertyDefinition[js.UndefOr[Double], _, S3ResolvableConfiguration, S3ResolvedConfiguration] = js.native
  val maxRetries: ConfigurationPropertyDefinition[js.UndefOr[Double], _, S3ResolvableConfiguration, S3ResolvedConfiguration] = js.native
  val md5: ConfigurationPropertyDefinition[js.UndefOr[AnonInstantiable], _, S3ResolvableConfiguration, S3ResolvedConfiguration] = js.native
  val parser: ConfigurationPropertyDefinition[ResponseParser[Readable], _, S3ResolvableConfiguration, S3ResolvedConfiguration] = js.native
  val profile: ConfigurationPropertyDefinition[js.UndefOr[String], _, S3ResolvableConfiguration, S3ResolvedConfiguration] = js.native
  val region: ConfigurationPropertyDefinition[
    js.UndefOr[String | Provider[String]], 
    _, 
    S3ResolvableConfiguration, 
    S3ResolvedConfiguration
  ] = js.native
  val retryDecider: ConfigurationPropertyDefinition[js.UndefOr[RetryDecider], _, S3ResolvableConfiguration, S3ResolvedConfiguration] = js.native
  val serializer: ConfigurationPropertyDefinition[
    Provider[RequestSerializer[Readable]], 
    _, 
    S3ResolvableConfiguration, 
    S3ResolvedConfiguration
  ] = js.native
  val sha256: ConfigurationPropertyDefinition[js.UndefOr[HashConstructor], _, S3ResolvableConfiguration, S3ResolvedConfiguration] = js.native
  val signer: ConfigurationPropertyDefinition[js.UndefOr[RequestSigner], _, S3ResolvableConfiguration, S3ResolvedConfiguration] = js.native
  val signingName: ConfigurationPropertyDefinition[js.UndefOr[String], _, S3ResolvableConfiguration, S3ResolvedConfiguration] = js.native
  val sslEnabled: ConfigurationPropertyDefinition[js.UndefOr[Boolean], _, S3ResolvableConfiguration, S3ResolvedConfiguration] = js.native
  val streamCollector: ConfigurationPropertyDefinition[
    js.UndefOr[StreamCollector[Readable]], 
    _, 
    S3ResolvableConfiguration, 
    S3ResolvedConfiguration
  ] = js.native
  val streamHasher: ConfigurationPropertyDefinition[
    js.UndefOr[StreamHasher[Readable]], 
    _, 
    S3ResolvableConfiguration, 
    S3ResolvedConfiguration
  ] = js.native
  val urlParser: ConfigurationPropertyDefinition[js.UndefOr[UrlParser], _, S3ResolvableConfiguration, S3ResolvedConfiguration] = js.native
  val useAccelerateEndpoint: ConfigurationPropertyDefinition[js.UndefOr[Boolean], _, S3ResolvableConfiguration, S3ResolvedConfiguration] = js.native
  val useDualstackEndpoint: ConfigurationPropertyDefinition[js.UndefOr[Boolean], _, S3ResolvableConfiguration, S3ResolvedConfiguration] = js.native
  val utf8Decoder: ConfigurationPropertyDefinition[js.UndefOr[Decoder], _, S3ResolvableConfiguration, S3ResolvedConfiguration] = js.native
  val utf8Encoder: ConfigurationPropertyDefinition[js.UndefOr[Encoder], _, S3ResolvableConfiguration, S3ResolvedConfiguration] = js.native
}

