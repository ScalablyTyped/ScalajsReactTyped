package typingsJapgolly.awsSdkProtocolRest

import typingsJapgolly.awsSdkTypes.httpMod.HttpResponse
import typingsJapgolly.awsSdkTypes.protocolMod.OperationModel
import typingsJapgolly.awsSdkTypes.responseMod.MetadataBearer
import typingsJapgolly.awsSdkTypes.unmarshallerMod.BodyParser
import typingsJapgolly.awsSdkTypes.unmarshallerMod.ResponseParser
import typingsJapgolly.awsSdkTypes.unmarshallerMod.ServiceExceptionParser
import typingsJapgolly.awsSdkTypes.unmarshallerMod.StreamCollector
import typingsJapgolly.awsSdkTypes.utilMod.Decoder
import typingsJapgolly.awsSdkTypes.utilMod.Encoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/protocol-rest/build/RestParser", JSImport.Namespace)
@js.native
object restParserMod extends js.Object {
  @js.native
  class RestParser[StreamType] protected () extends ResponseParser[StreamType] {
    def this(
      bodyParser: BodyParser[String],
      bodyCollector: StreamCollector[StreamType],
      parseServiceException: ServiceExceptionParser,
      utf8Encoder: Encoder,
      base64Decoder: Decoder
    ) = this()
    val base64Decoder: js.Any = js.native
    val bodyCollector: js.Any = js.native
    val bodyParser: js.Any = js.native
    var parseBody: js.Any = js.native
    var parseHeaders: js.Any = js.native
    var parseScalarBody: js.Any = js.native
    var parseScalarHeader: js.Any = js.native
    val parseServiceException: js.Any = js.native
    var parseStatusCode: js.Any = js.native
    var resolveBody: js.Any = js.native
    var resolveBodyString: js.Any = js.native
    var responseIsSuccessful: js.Any = js.native
    val utf8Encoder: js.Any = js.native
    /**
      * Converts the output of an operation into JavaScript types.
      *
      * @param operation The operation model describing the structure of the HTTP
      *                  response received
      * @param input     The HTTP response received from the service
      */
    /* CompleteClass */
    override def parse[OutputType /* <: MetadataBearer */](operation: OperationModel, input: HttpResponse[StreamType]): js.Promise[OutputType] = js.native
  }
  
}

