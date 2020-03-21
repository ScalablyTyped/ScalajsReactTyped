package typingsJapgolly.arangodb.Foxx

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.arangodb.AnonData
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeDefinition extends js.Object {
  var forClient: js.UndefOr[js.Function1[/* body */ js.Any, AnonData]] = js.undefined
  var fromClient: js.UndefOr[
    js.Function3[/* body */ String | Buffer, /* req */ Request, /* type */ MediaType, _]
  ] = js.undefined
}

object TypeDefinition {
  @scala.inline
  def apply(
    forClient: /* body */ js.Any => CallbackTo[AnonData] = null,
    fromClient: (/* body */ String | Buffer, /* req */ Request, /* type */ MediaType) => CallbackTo[js.Any] = null
  ): TypeDefinition = {
    val __obj = js.Dynamic.literal()
    if (forClient != null) __obj.updateDynamic("forClient")(js.Any.fromFunction1((t0: /* body */ js.Any) => forClient(t0).runNow()))
    if (fromClient != null) __obj.updateDynamic("fromClient")(js.Any.fromFunction3((t0: /* body */ java.lang.String | typingsJapgolly.node.Buffer, t1: /* req */ typingsJapgolly.arangodb.Foxx.Request, t2: /* type */ typingsJapgolly.arangodb.Foxx.MediaType) => fromClient(t0, t1, t2).runNow()))
    __obj.asInstanceOf[TypeDefinition]
  }
}

