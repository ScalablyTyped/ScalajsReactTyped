package typingsJapgolly.arangodb.Foxx

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.arangodb.arangodbBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentationRouterOptions extends js.Object {
  var indexFile: String
  var mount: String
  var swaggerRoot: String
  def before(req: Request, res: Response): Unit | `false`
}

object DocumentationRouterOptions {
  @scala.inline
  def apply(
    before: (Request, Response) => CallbackTo[Unit | `false`],
    indexFile: String,
    mount: String,
    swaggerRoot: String
  ): DocumentationRouterOptions = {
    val __obj = js.Dynamic.literal(indexFile = indexFile.asInstanceOf[js.Any], mount = mount.asInstanceOf[js.Any], swaggerRoot = swaggerRoot.asInstanceOf[js.Any])
    __obj.updateDynamic("before")(js.Any.fromFunction2((t0: typingsJapgolly.arangodb.Foxx.Request, t1: typingsJapgolly.arangodb.Foxx.Response) => before(t0, t1).runNow()))
    __obj.asInstanceOf[DocumentationRouterOptions]
  }
}

