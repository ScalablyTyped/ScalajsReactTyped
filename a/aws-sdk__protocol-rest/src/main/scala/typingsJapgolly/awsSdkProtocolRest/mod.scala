package typingsJapgolly.awsSdkProtocolRest

import typingsJapgolly.awsSdkTypes.httpMod.HttpEndpoint
import typingsJapgolly.awsSdkTypes.marshallerMod.BodySerializer
import typingsJapgolly.awsSdkTypes.unmarshallerMod.BodyParser
import typingsJapgolly.awsSdkTypes.unmarshallerMod.ServiceExceptionParser
import typingsJapgolly.awsSdkTypes.unmarshallerMod.StreamCollector
import typingsJapgolly.awsSdkTypes.utilMod.Decoder
import typingsJapgolly.awsSdkTypes.utilMod.Encoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/protocol-rest", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class RestParser[StreamType] protected ()
    extends typingsJapgolly.awsSdkProtocolRest.restParserMod.RestParser[StreamType] {
    def this(
      bodyParser: BodyParser[String],
      bodyCollector: StreamCollector[StreamType],
      parseServiceException: ServiceExceptionParser,
      utf8Encoder: Encoder,
      base64Decoder: Decoder
    ) = this()
  }
  
  @js.native
  class RestSerializer[StreamType] protected ()
    extends typingsJapgolly.awsSdkProtocolRest.restSerializerMod.RestSerializer[StreamType] {
    def this(
      endpoint: HttpEndpoint,
      bodySerializer: BodySerializer[String],
      base64Encoder: Encoder,
      utf8Decoder: Decoder
    ) = this()
  }
  
}

