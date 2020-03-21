package typingsJapgolly.awsSdkTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object unmarshallerMod {
  type ServiceExceptionParser = js.Function3[
    /* operation */ typingsJapgolly.awsSdkTypes.protocolMod.OperationModel, 
    /* response */ typingsJapgolly.awsSdkTypes.httpMod.ResolvedHttpResponse, 
    /* errorBodyParser */ typingsJapgolly.awsSdkTypes.unmarshallerMod.BodyParser[java.lang.String], 
    typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException[js.Any]
  ]
  type StreamCollector[StreamType] = js.Function1[/* stream */ StreamType, js.Promise[scala.scalajs.js.typedarray.Uint8Array]]
}
