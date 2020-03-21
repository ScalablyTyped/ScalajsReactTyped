package typingsJapgolly.awsSdkProtocolQuery

import typingsJapgolly.awsSdkTypes.httpMod.HttpEndpoint
import typingsJapgolly.awsSdkTypes.httpMod.HttpRequest
import typingsJapgolly.awsSdkTypes.marshallerMod.BodySerializer
import typingsJapgolly.awsSdkTypes.marshallerMod.RequestSerializer
import typingsJapgolly.awsSdkTypes.protocolMod.OperationModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/protocol-query/build/QuerySerializer", JSImport.Namespace)
@js.native
object querySerializerMod extends js.Object {
  @js.native
  class QuerySerializer[StreamType] protected () extends RequestSerializer[StreamType] {
    def this(endpoint: HttpEndpoint, bodySerializer: BodySerializer[String]) = this()
    val bodySerializer: js.Any = js.native
    val endpoint: js.Any = js.native
    /**
      * Converts the provided `input` into an HTTP request
      *
      * @param operation The operation to be executed via the returned HTTP
      *                  request.
      * @param input     The user input to serialize.
      */
    /* CompleteClass */
    override def serialize(operation: OperationModel, input: js.Any): HttpRequest[StreamType] = js.native
  }
  
}

