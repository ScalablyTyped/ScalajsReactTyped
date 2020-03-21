package typingsJapgolly.awsSdkProtocolJsonRpc

import typingsJapgolly.awsSdkTypes.httpMod.HttpEndpoint
import typingsJapgolly.awsSdkTypes.marshallerMod.BodySerializer
import typingsJapgolly.awsSdkTypes.unmarshallerMod.BodyParser
import typingsJapgolly.awsSdkTypes.unmarshallerMod.ServiceExceptionParser
import typingsJapgolly.awsSdkTypes.unmarshallerMod.StreamCollector
import typingsJapgolly.awsSdkTypes.utilMod.Encoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/protocol-json-rpc", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class JsonRpcParser[StreamType] protected ()
    extends typingsJapgolly.awsSdkProtocolJsonRpc.jsonRpcParserMod.JsonRpcParser[StreamType] {
    def this(
      bodyParser: BodyParser[String],
      parseServiceException: ServiceExceptionParser,
      bodyCollector: StreamCollector[StreamType],
      utf8Encoder: Encoder
    ) = this()
  }
  
  @js.native
  class JsonRpcSerializer[StreamType] protected ()
    extends typingsJapgolly.awsSdkProtocolJsonRpc.jsonRpcSerializerMod.JsonRpcSerializer[StreamType] {
    def this(endpoint: HttpEndpoint, bodySerializer: BodySerializer[String]) = this()
  }
  
}

