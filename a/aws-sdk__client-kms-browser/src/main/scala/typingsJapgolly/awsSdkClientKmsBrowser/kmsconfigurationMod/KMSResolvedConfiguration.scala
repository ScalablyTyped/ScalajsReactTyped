package typingsJapgolly.awsSdkClientKmsBrowser.kmsconfigurationMod

import org.scalajs.dom.raw.Blob
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KMSResolvedConfiguration extends KMSConfiguration {
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
  var handler_Original: Terminalware[_, Blob] = js.native
  @JSName("httpHandler")
  var httpHandler_KMSResolvedConfiguration: HttpHandler[Blob, HttpOptions] = js.native
  @JSName("maxRedirects")
  var maxRedirects_KMSResolvedConfiguration: Double = js.native
  @JSName("maxRetries")
  var maxRetries_KMSResolvedConfiguration: Double = js.native
  var parser: ResponseParser[Blob] = js.native
  @JSName("region")
  var region_Original: Provider[String] = js.native
  @JSName("serializer")
  var serializer_Original: Provider[RequestSerializer[Blob]] = js.native
  @JSName("sha256")
  var sha256_KMSResolvedConfiguration: HashConstructor = js.native
  @JSName("signer")
  var signer_KMSResolvedConfiguration: RequestSigner = js.native
  @JSName("signingName")
  var signingName_KMSResolvedConfiguration: String = js.native
  @JSName("sslEnabled")
  var sslEnabled_KMSResolvedConfiguration: Boolean = js.native
  @JSName("streamCollector")
  var streamCollector_Original: StreamCollector[Blob] = js.native
  @JSName("urlParser")
  var urlParser_Original: UrlParser = js.native
  @JSName("utf8Decoder")
  var utf8Decoder_Original: Decoder = js.native
  @JSName("utf8Encoder")
  var utf8Encoder_Original: Encoder = js.native
  @JSName("base64Decoder")
  def base64Decoder_MKMSResolvedConfiguration(input: String): scala.scalajs.js.typedarray.Uint8Array = js.native
  @JSName("base64Encoder")
  def base64Encoder_MKMSResolvedConfiguration(input: scala.scalajs.js.typedarray.Uint8Array): String = js.native
  def bodyLengthChecker(body: js.Any): js.UndefOr[Double] = js.native
  @JSName("credentials")
  def credentials_MKMSResolvedConfiguration(): js.Promise[Credentials] = js.native
  @JSName("endpoint")
  def endpoint_MKMSResolvedConfiguration(): js.Promise[HttpEndpoint] = js.native
  @JSName("handler")
  def handler_MKMSResolvedConfiguration[Input /* <: js.Object */, Output /* <: js.Any */](context: HandlerExecutionContext): FinalizeHandler[Input, Output, Blob] = js.native
  @JSName("region")
  def region_MKMSResolvedConfiguration(): js.Promise[String] = js.native
  def serializer(): js.Promise[RequestSerializer[Blob]] = js.native
  @JSName("streamCollector")
  def streamCollector_MKMSResolvedConfiguration(stream: Blob): js.Promise[scala.scalajs.js.typedarray.Uint8Array] = js.native
  @JSName("urlParser")
  def urlParser_MKMSResolvedConfiguration(url: String): HttpEndpoint = js.native
  @JSName("utf8Decoder")
  def utf8Decoder_MKMSResolvedConfiguration(input: String): scala.scalajs.js.typedarray.Uint8Array = js.native
  @JSName("utf8Encoder")
  def utf8Encoder_MKMSResolvedConfiguration(input: scala.scalajs.js.typedarray.Uint8Array): String = js.native
}

