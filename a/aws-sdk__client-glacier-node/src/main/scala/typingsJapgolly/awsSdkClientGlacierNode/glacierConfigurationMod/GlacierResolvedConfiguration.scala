package typingsJapgolly.awsSdkClientGlacierNode.glacierConfigurationMod

import typingsJapgolly.awsSdkTypes.credentialsMod.Credentials
import typingsJapgolly.awsSdkTypes.cryptoMod.HashConstructor
import typingsJapgolly.awsSdkTypes.httpMod.HttpEndpoint
import typingsJapgolly.awsSdkTypes.httpMod.HttpHandler
import typingsJapgolly.awsSdkTypes.httpMod.HttpOptions
import typingsJapgolly.awsSdkTypes.marshallerMod.RequestSerializer
import typingsJapgolly.awsSdkTypes.middlewareMod.FinalizeHandler
import typingsJapgolly.awsSdkTypes.middlewareMod.HandlerExecutionContext
import typingsJapgolly.awsSdkTypes.middlewareMod.Terminalware
import typingsJapgolly.awsSdkTypes.signatureMod.RequestSigner
import typingsJapgolly.awsSdkTypes.unmarshallerMod.ResponseParser
import typingsJapgolly.awsSdkTypes.unmarshallerMod.StreamCollector
import typingsJapgolly.awsSdkTypes.utilMod.Decoder
import typingsJapgolly.awsSdkTypes.utilMod.Encoder
import typingsJapgolly.awsSdkTypes.utilMod.Provider
import typingsJapgolly.awsSdkTypes.utilMod.UrlParser
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlacierResolvedConfiguration extends GlacierConfiguration {
  var _user_injected_http_handler: Boolean = js.native
  @JSName("base64Decoder")
  var base64Decoder_Original: Decoder = js.native
  @JSName("base64Encoder")
  var base64Encoder_Original: Encoder = js.native
  @JSName("credentials")
  var credentials_Original: Provider[Credentials] = js.native
  @JSName("endpoint")
  var endpoint_Original: Provider[HttpEndpoint] = js.native
  @JSName("handler")
  var handler_Original: Terminalware[_, Readable] = js.native
  @JSName("httpHandler")
  var httpHandler_GlacierResolvedConfiguration: HttpHandler[Readable, HttpOptions] = js.native
  @JSName("maxRedirects")
  var maxRedirects_GlacierResolvedConfiguration: Double = js.native
  @JSName("maxRetries")
  var maxRetries_GlacierResolvedConfiguration: Double = js.native
  var parser: ResponseParser[Readable] = js.native
  @JSName("region")
  var region_Original: Provider[String] = js.native
  @JSName("serializer")
  var serializer_Original: Provider[RequestSerializer[Readable]] = js.native
  @JSName("sha256")
  var sha256_GlacierResolvedConfiguration: HashConstructor = js.native
  @JSName("signer")
  var signer_GlacierResolvedConfiguration: RequestSigner = js.native
  @JSName("signingName")
  var signingName_GlacierResolvedConfiguration: String = js.native
  @JSName("sslEnabled")
  var sslEnabled_GlacierResolvedConfiguration: Boolean = js.native
  @JSName("streamCollector")
  var streamCollector_Original: StreamCollector[Readable] = js.native
  @JSName("urlParser")
  var urlParser_Original: UrlParser = js.native
  @JSName("utf8Decoder")
  var utf8Decoder_Original: Decoder = js.native
  @JSName("utf8Encoder")
  var utf8Encoder_Original: Encoder = js.native
  @JSName("base64Decoder")
  def base64Decoder_MGlacierResolvedConfiguration(input: String): scala.scalajs.js.typedarray.Uint8Array = js.native
  @JSName("base64Encoder")
  def base64Encoder_MGlacierResolvedConfiguration(input: scala.scalajs.js.typedarray.Uint8Array): String = js.native
  def bodyLengthChecker(body: js.Any): js.UndefOr[Double] = js.native
  @JSName("credentials")
  def credentials_MGlacierResolvedConfiguration(): js.Promise[Credentials] = js.native
  @JSName("endpoint")
  def endpoint_MGlacierResolvedConfiguration(): js.Promise[HttpEndpoint] = js.native
  @JSName("handler")
  def handler_MGlacierResolvedConfiguration[Input /* <: js.Object */, Output /* <: js.Any */](context: HandlerExecutionContext): FinalizeHandler[Input, Output, Readable] = js.native
  @JSName("region")
  def region_MGlacierResolvedConfiguration(): js.Promise[String] = js.native
  def serializer(): js.Promise[RequestSerializer[Readable]] = js.native
  @JSName("streamCollector")
  def streamCollector_MGlacierResolvedConfiguration(stream: Readable): js.Promise[scala.scalajs.js.typedarray.Uint8Array] = js.native
  @JSName("urlParser")
  def urlParser_MGlacierResolvedConfiguration(url: String): HttpEndpoint = js.native
  @JSName("utf8Decoder")
  def utf8Decoder_MGlacierResolvedConfiguration(input: String): scala.scalajs.js.typedarray.Uint8Array = js.native
  @JSName("utf8Encoder")
  def utf8Encoder_MGlacierResolvedConfiguration(input: scala.scalajs.js.typedarray.Uint8Array): String = js.native
}

