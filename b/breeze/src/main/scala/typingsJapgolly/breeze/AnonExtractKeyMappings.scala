package typingsJapgolly.breeze

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.breeze.breeze.KeyMapping
import typingsJapgolly.breeze.breeze.NodeContext
import typingsJapgolly.breeze.breeze.QueryContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExtractKeyMappings extends js.Object {
  var extractKeyMappings: js.UndefOr[js.Function1[/* data */ js.Object, js.Array[KeyMapping]]] = js.undefined
  var extractResults: js.UndefOr[js.Function1[/* data */ js.Object, js.Object]] = js.undefined
  var extractSaveResults: js.UndefOr[js.Function1[/* data */ js.Object, js.Array[_]]] = js.undefined
  var name: String
  def visitNode(node: js.Object, queryContext: QueryContext, nodeContext: NodeContext): AnonEntityType
}

object AnonExtractKeyMappings {
  @scala.inline
  def apply(
    name: String,
    visitNode: (js.Object, QueryContext, NodeContext) => CallbackTo[AnonEntityType],
    extractKeyMappings: /* data */ js.Object => CallbackTo[js.Array[KeyMapping]] = null,
    extractResults: /* data */ js.Object => CallbackTo[js.Object] = null,
    extractSaveResults: /* data */ js.Object => CallbackTo[js.Array[js.Any]] = null
  ): AnonExtractKeyMappings = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("visitNode")(js.Any.fromFunction3((t0: js.Object, t1: typingsJapgolly.breeze.breeze.QueryContext, t2: typingsJapgolly.breeze.breeze.NodeContext) => visitNode(t0, t1, t2).runNow()))
    if (extractKeyMappings != null) __obj.updateDynamic("extractKeyMappings")(js.Any.fromFunction1((t0: /* data */ js.Object) => extractKeyMappings(t0).runNow()))
    if (extractResults != null) __obj.updateDynamic("extractResults")(js.Any.fromFunction1((t0: /* data */ js.Object) => extractResults(t0).runNow()))
    if (extractSaveResults != null) __obj.updateDynamic("extractSaveResults")(js.Any.fromFunction1((t0: /* data */ js.Object) => extractSaveResults(t0).runNow()))
    __obj.asInstanceOf[AnonExtractKeyMappings]
  }
}

