package typingsJapgolly.bugsnagJs.clientMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlugin extends js.Object {
  var configSchema: js.UndefOr[StringDictionary[IConfigSchemaEntry]] = js.undefined
  var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
  def init(client: Client): js.Any
}

object IPlugin {
  @scala.inline
  def apply(
    init: Client => CallbackTo[js.Any],
    configSchema: StringDictionary[IConfigSchemaEntry] = null,
    destroy: js.UndefOr[Callback] = js.undefined
  ): IPlugin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("init")(js.Any.fromFunction1((t0: typingsJapgolly.bugsnagJs.clientMod.Client) => init(t0).runNow()))
    if (configSchema != null) __obj.updateDynamic("configSchema")(configSchema.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    __obj.asInstanceOf[IPlugin]
  }
}

