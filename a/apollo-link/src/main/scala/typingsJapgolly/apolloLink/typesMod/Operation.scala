package typingsJapgolly.apolloLink.typesMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.graphql.astMod.DocumentNode
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Operation extends js.Object {
  var extensions: Record[String, _]
  var operationName: String
  var query: DocumentNode
  var variables: Record[String, _]
  def getContext(): Record[String, _]
  def setContext(context: Record[String, _]): Record[String, _]
  def toKey(): String
}

object Operation {
  @scala.inline
  def apply(
    extensions: Record[String, _],
    getContext: CallbackTo[Record[String, js.Any]],
    operationName: String,
    query: DocumentNode,
    setContext: Record[String, js.Any] => CallbackTo[Record[String, js.Any]],
    toKey: CallbackTo[String],
    variables: Record[String, _]
  ): Operation = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], operationName = operationName.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("getContext")(getContext.toJsFn)
    __obj.updateDynamic("setContext")(js.Any.fromFunction1((t0: typingsJapgolly.std.Record[java.lang.String, js.Any]) => setContext(t0).runNow()))
    __obj.updateDynamic("toKey")(toKey.toJsFn)
    __obj.asInstanceOf[Operation]
  }
}

