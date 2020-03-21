package typingsJapgolly.awsSdkClientGlacierNode.mod

import typingsJapgolly.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvableConfiguration
import typingsJapgolly.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsJapgolly.awsSdkTypes.clientMod.ConfigurationPropertyDefinition
import typingsJapgolly.awsSdkTypes.credentialsMod.Credentials
import typingsJapgolly.awsSdkTypes.cryptoMod.HashConstructor
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

@JSImport("@aws-sdk/client-glacier-node", "configurationProperties")
@js.native
object configurationProperties extends js.Object {
  val _user_injected_http_handler: ConfigurationPropertyDefinition[_, Boolean, GlacierResolvableConfiguration, GlacierResolvedConfiguration] = js.native
  val base64Decoder: ConfigurationPropertyDefinition[
    js.UndefOr[Decoder], 
    Decoder, 
    GlacierResolvableConfiguration, 
    GlacierResolvedConfiguration
  ] = js.native
  val base64Encoder: ConfigurationPropertyDefinition[
    js.UndefOr[Encoder], 
    Encoder, 
    GlacierResolvableConfiguration, 
    GlacierResolvedConfiguration
  ] = js.native
  val bodyLengthChecker: ConfigurationPropertyDefinition[
    js.Function1[/* body */ _, js.UndefOr[Double]], 
    js.Function1[/* body */ _, js.UndefOr[Double]], 
    GlacierResolvableConfiguration, 
    GlacierResolvedConfiguration
  ] = js.native
  val credentials: ConfigurationPropertyDefinition[
    js.UndefOr[Credentials | Provider[Credentials]], 
    Provider[Credentials], 
    GlacierResolvableConfiguration, 
    GlacierResolvedConfiguration
  ] = js.native
  val delayDecider: ConfigurationPropertyDefinition[
    js.UndefOr[DelayDecider], 
    js.UndefOr[DelayDecider], 
    GlacierResolvableConfiguration, 
    GlacierResolvedConfiguration
  ] = js.native
  val endpoint: ConfigurationPropertyDefinition[
    js.UndefOr[String | HttpEndpoint | Provider[HttpEndpoint]], 
    Provider[HttpEndpoint], 
    GlacierResolvableConfiguration, 
    GlacierResolvedConfiguration
  ] = js.native
  val endpointProvider: ConfigurationPropertyDefinition[js.UndefOr[_], _, GlacierResolvableConfiguration, GlacierResolvedConfiguration] = js.native
  val handler: ConfigurationPropertyDefinition[
    js.UndefOr[Terminalware[_, Readable]], 
    Terminalware[_, Readable], 
    GlacierResolvableConfiguration, 
    GlacierResolvedConfiguration
  ] = js.native
  val httpHandler: ConfigurationPropertyDefinition[
    js.UndefOr[HttpHandler[Readable, HttpOptions]], 
    HttpHandler[Readable, HttpOptions], 
    GlacierResolvableConfiguration, 
    GlacierResolvedConfiguration
  ] = js.native
  val maxRedirects: ConfigurationPropertyDefinition[
    js.UndefOr[Double], 
    Double, 
    GlacierResolvableConfiguration, 
    GlacierResolvedConfiguration
  ] = js.native
  val maxRetries: ConfigurationPropertyDefinition[
    js.UndefOr[Double], 
    Double, 
    GlacierResolvableConfiguration, 
    GlacierResolvedConfiguration
  ] = js.native
  val parser: ConfigurationPropertyDefinition[
    ResponseParser[Readable], 
    ResponseParser[Readable], 
    GlacierResolvableConfiguration, 
    GlacierResolvedConfiguration
  ] = js.native
  val profile: ConfigurationPropertyDefinition[
    js.UndefOr[String], 
    js.UndefOr[String], 
    GlacierResolvableConfiguration, 
    GlacierResolvedConfiguration
  ] = js.native
  val region: ConfigurationPropertyDefinition[
    js.UndefOr[String | Provider[String]], 
    Provider[String], 
    GlacierResolvableConfiguration, 
    GlacierResolvedConfiguration
  ] = js.native
  val retryDecider: ConfigurationPropertyDefinition[
    js.UndefOr[RetryDecider], 
    js.UndefOr[RetryDecider], 
    GlacierResolvableConfiguration, 
    GlacierResolvedConfiguration
  ] = js.native
  val serializer: ConfigurationPropertyDefinition[
    Provider[RequestSerializer[Readable]], 
    Provider[RequestSerializer[Readable]], 
    GlacierResolvableConfiguration, 
    GlacierResolvedConfiguration
  ] = js.native
  val sha256: ConfigurationPropertyDefinition[
    js.UndefOr[HashConstructor], 
    HashConstructor, 
    GlacierResolvableConfiguration, 
    GlacierResolvedConfiguration
  ] = js.native
  val signer: ConfigurationPropertyDefinition[
    js.UndefOr[RequestSigner], 
    RequestSigner, 
    GlacierResolvableConfiguration, 
    GlacierResolvedConfiguration
  ] = js.native
  val signingName: ConfigurationPropertyDefinition[
    js.UndefOr[String], 
    String, 
    GlacierResolvableConfiguration, 
    GlacierResolvedConfiguration
  ] = js.native
  val sslEnabled: ConfigurationPropertyDefinition[
    js.UndefOr[Boolean], 
    Boolean, 
    GlacierResolvableConfiguration, 
    GlacierResolvedConfiguration
  ] = js.native
  val streamCollector: ConfigurationPropertyDefinition[
    js.UndefOr[StreamCollector[Readable]], 
    StreamCollector[Readable], 
    GlacierResolvableConfiguration, 
    GlacierResolvedConfiguration
  ] = js.native
  val urlParser: ConfigurationPropertyDefinition[
    js.UndefOr[UrlParser], 
    UrlParser, 
    GlacierResolvableConfiguration, 
    GlacierResolvedConfiguration
  ] = js.native
  val utf8Decoder: ConfigurationPropertyDefinition[
    js.UndefOr[Decoder], 
    Decoder, 
    GlacierResolvableConfiguration, 
    GlacierResolvedConfiguration
  ] = js.native
  val utf8Encoder: ConfigurationPropertyDefinition[
    js.UndefOr[Encoder], 
    Encoder, 
    GlacierResolvableConfiguration, 
    GlacierResolvedConfiguration
  ] = js.native
}

