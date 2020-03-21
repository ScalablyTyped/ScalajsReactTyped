package typingsJapgolly.awsSdkEventstreamMarshaller

import typingsJapgolly.awsSdkEventstreamMarshaller.messageMod.MessageHeaders
import typingsJapgolly.awsSdkTypes.utilMod.Decoder
import typingsJapgolly.awsSdkTypes.utilMod.Encoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/eventstream-marshaller/build/HeaderMarshaller", JSImport.Namespace)
@js.native
object headerMarshallerMod extends js.Object {
  @js.native
  class HeaderMarshaller protected () extends js.Object {
    def this(toUtf8: Encoder, fromUtf8: Decoder) = this()
    var formatHeaderValue: js.Any = js.native
    val fromUtf8: js.Any = js.native
    val toUtf8: js.Any = js.native
    def format(headers: MessageHeaders): scala.scalajs.js.typedarray.Uint8Array = js.native
    def parse(headers: scala.scalajs.js.typedarray.DataView): MessageHeaders = js.native
  }
  
}

