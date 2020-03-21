package typingsJapgolly.awsSdkTypes.unmarshallerMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.awsSdkTypes.httpMod.HttpResponse
import typingsJapgolly.awsSdkTypes.protocolMod.OperationModel
import typingsJapgolly.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseParser[StreamType] extends js.Object {
  /**
    * Converts the output of an operation into JavaScript types.
    *
    * @param operation The operation model describing the structure of the HTTP
    *                  response received
    * @param input     The HTTP response received from the service
    */
  def parse[OutputType /* <: MetadataBearer */](operation: OperationModel, input: HttpResponse[StreamType]): js.Promise[OutputType]
}

object ResponseParser {
  @scala.inline
  def apply[StreamType](parse: (OperationModel, HttpResponse[StreamType]) => CallbackTo[js.Promise[js.Any]]): ResponseParser[StreamType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parse")(js.Any.fromFunction2((t0: typingsJapgolly.awsSdkTypes.protocolMod.OperationModel, t1: typingsJapgolly.awsSdkTypes.httpMod.HttpResponse[StreamType]) => parse(t0, t1).runNow()))
    __obj.asInstanceOf[ResponseParser[StreamType]]
  }
}

