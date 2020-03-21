package typingsJapgolly.awsSdkSsecMiddleware

import typingsJapgolly.awsSdkTypes.middlewareMod.Middleware
import typingsJapgolly.awsSdkTypes.utilMod.Decoder
import typingsJapgolly.awsSdkTypes.utilMod.Encoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/ssec-middleware", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait SsecMiddlewareConfiguration[Input /* <: js.Object */] extends js.Object {
    @JSName("base64Encoder")
    var base64Encoder_Original: Encoder = js.native
    var hashConstructor: AnonInstantiable = js.native
    var ssecProperties: SsecPropertiesConfiguration[Input] = js.native
    @JSName("utf8Decoder")
    var utf8Decoder_Original: Decoder = js.native
    def base64Encoder(input: scala.scalajs.js.typedarray.Uint8Array): String = js.native
    def utf8Decoder(input: String): scala.scalajs.js.typedarray.Uint8Array = js.native
  }
  
  def ssecMiddleware[Input /* <: js.Object */](hasUtf8DecoderBase64EncoderHashConstructorSsecProperties: SsecMiddlewareConfiguration[Input]): Middleware[Input, _] = js.native
  type SsecPropertiesConfiguration[Input /* <: js.Object */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ sourceProperty in keyof Input ]:? {  targetProperty  :string,   hashTargetProperty  :string}}
    */ typingsJapgolly.awsSdkSsecMiddleware.awsSdkSsecMiddlewareStrings.SsecPropertiesConfiguration with js.Any
}

