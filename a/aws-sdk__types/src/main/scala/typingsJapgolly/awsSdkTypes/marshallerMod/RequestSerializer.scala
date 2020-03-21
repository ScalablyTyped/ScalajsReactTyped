package typingsJapgolly.awsSdkTypes.marshallerMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.awsSdkTypes.httpMod.HttpRequest
import typingsJapgolly.awsSdkTypes.protocolMod.OperationModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestSerializer[StreamType] extends js.Object {
  /**
    * Converts the provided `input` into an HTTP request
    *
    * @param operation The operation to be executed via the returned HTTP
    *                  request.
    * @param input     The user input to serialize.
    */
  def serialize(operation: OperationModel, input: js.Any): HttpRequest[StreamType]
}

object RequestSerializer {
  @scala.inline
  def apply[StreamType](serialize: (OperationModel, js.Any) => CallbackTo[HttpRequest[StreamType]]): RequestSerializer[StreamType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("serialize")(js.Any.fromFunction2((t0: typingsJapgolly.awsSdkTypes.protocolMod.OperationModel, t1: js.Any) => serialize(t0, t1).runNow()))
    __obj.asInstanceOf[RequestSerializer[StreamType]]
  }
}

