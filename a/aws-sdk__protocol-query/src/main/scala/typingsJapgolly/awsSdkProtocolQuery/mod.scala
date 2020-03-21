package typingsJapgolly.awsSdkProtocolQuery

import typingsJapgolly.awsSdkTypes.httpMod.HttpEndpoint
import typingsJapgolly.awsSdkTypes.marshallerMod.BodySerializer
import typingsJapgolly.awsSdkTypes.unmarshallerMod.BodyParser
import typingsJapgolly.awsSdkTypes.unmarshallerMod.ServiceExceptionParser
import typingsJapgolly.awsSdkTypes.unmarshallerMod.StreamCollector
import typingsJapgolly.awsSdkTypes.utilMod.Encoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/protocol-query", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class QueryParser[StreamType] protected ()
    extends typingsJapgolly.awsSdkProtocolQuery.queryParserMod.QueryParser[StreamType] {
    def this(
      bodyParser: BodyParser[String],
      parseServiceException: ServiceExceptionParser,
      streamCollector: StreamCollector[StreamType],
      utf8Encoder: Encoder
    ) = this()
  }
  
  @js.native
  class QuerySerializer[StreamType] protected ()
    extends typingsJapgolly.awsSdkProtocolQuery.querySerializerMod.QuerySerializer[StreamType] {
    def this(endpoint: HttpEndpoint, bodySerializer: BodySerializer[String]) = this()
  }
  
}

