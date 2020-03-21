package typingsJapgolly.awsSdkEventstreamMarshaller

import typingsJapgolly.awsSdkTypes.utilMod.Decoder
import typingsJapgolly.awsSdkTypes.utilMod.Encoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/eventstream-marshaller", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class EventStreamMarshaller protected ()
    extends typingsJapgolly.awsSdkEventstreamMarshaller.eventStreamMarshallerMod.EventStreamMarshaller {
    def this(toUtf8: Encoder, fromUtf8: Decoder) = this()
  }
  
  @js.native
  class Int64 protected ()
    extends typingsJapgolly.awsSdkEventstreamMarshaller.int64Mod.Int64 {
    def this(bytes: scala.scalajs.js.typedarray.Uint8Array) = this()
  }
  
  /* static members */
  @js.native
  object Int64 extends js.Object {
    def fromNumber(number: Double): typingsJapgolly.awsSdkEventstreamMarshaller.int64Mod.Int64 = js.native
  }
  
}

