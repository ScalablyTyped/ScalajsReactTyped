package typingsJapgolly.storybookPreact.typesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.NodeModule
import typingsJapgolly.storybookAddons.typesMod.ClientStoryApi
import typingsJapgolly.storybookAddons.typesMod.DecoratorFunction
import typingsJapgolly.storybookAddons.typesMod.Loadable
import typingsJapgolly.storybookAddons.typesMod.Parameters
import typingsJapgolly.storybookAddons.typesMod.StoryApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientApi extends ClientStoryApi[StoryFnPreactReturnType] {
  def clearDecorators(): Unit
  def configure(loader: Loadable, module: NodeModule): Unit
  def forceReRender(): Unit
  def getStorybook(): js.Array[IStorybookSection]
  def load(args: js.Any*): Unit
  def raw(): js.Any
  def setAddon(addon: js.Any): Unit
}

object ClientApi {
  @scala.inline
  def apply(
    addDecorator: DecoratorFunction[StoryFnPreactReturnType] => CallbackTo[StoryApi[StoryFnPreactReturnType]],
    addParameters: Parameters => CallbackTo[StoryApi[StoryFnPreactReturnType]],
    clearDecorators: Callback,
    configure: (Loadable, NodeModule) => Callback,
    forceReRender: Callback,
    getStorybook: CallbackTo[js.Array[IStorybookSection]],
    load: /* repeated */ js.Any => Callback,
    raw: CallbackTo[js.Any],
    setAddon: js.Any => Callback,
    storiesOf: (String, NodeModule) => CallbackTo[StoryApi[StoryFnPreactReturnType]]
  ): ClientApi = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addDecorator")(js.Any.fromFunction1((t0: typingsJapgolly.storybookAddons.typesMod.DecoratorFunction[typingsJapgolly.storybookPreact.typesMod.StoryFnPreactReturnType]) => addDecorator(t0).runNow()))
    __obj.updateDynamic("addParameters")(js.Any.fromFunction1((t0: typingsJapgolly.storybookAddons.typesMod.Parameters) => addParameters(t0).runNow()))
    __obj.updateDynamic("clearDecorators")(clearDecorators.toJsFn)
    __obj.updateDynamic("configure")(js.Any.fromFunction2((t0: typingsJapgolly.storybookAddons.typesMod.Loadable, t1: typingsJapgolly.node.NodeModule) => configure(t0, t1).runNow()))
    __obj.updateDynamic("forceReRender")(forceReRender.toJsFn)
    __obj.updateDynamic("getStorybook")(getStorybook.toJsFn)
    __obj.updateDynamic("load")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => load(t0).runNow()))
    __obj.updateDynamic("raw")(raw.toJsFn)
    __obj.updateDynamic("setAddon")(js.Any.fromFunction1((t0: js.Any) => setAddon(t0).runNow()))
    __obj.updateDynamic("storiesOf")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.node.NodeModule) => storiesOf(t0, t1).runNow()))
    __obj.asInstanceOf[ClientApi]
  }
}

