package typingsJapgolly.apolloServerCore.typesMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.apolloServerCore.AnonEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLService extends js.Object {
  def load(options: AnonEngine): js.Promise[GraphQLServiceConfig]
  def onSchemaChange(callback: SchemaChangeCallback): Unsubscriber
}

object GraphQLService {
  @scala.inline
  def apply(
    load: AnonEngine => CallbackTo[js.Promise[GraphQLServiceConfig]],
    onSchemaChange: SchemaChangeCallback => CallbackTo[Unsubscriber]
  ): GraphQLService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("load")(js.Any.fromFunction1((t0: typingsJapgolly.apolloServerCore.AnonEngine) => load(t0).runNow()))
    __obj.updateDynamic("onSchemaChange")(js.Any.fromFunction1((t0: typingsJapgolly.apolloServerCore.typesMod.SchemaChangeCallback) => onSchemaChange(t0).runNow()))
    __obj.asInstanceOf[GraphQLService]
  }
}

