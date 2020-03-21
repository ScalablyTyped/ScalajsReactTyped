package typingsJapgolly.storybookReact.previewMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.node.NodeModule
import typingsJapgolly.storybookAddons.typesMod.ClientStoryApi
import typingsJapgolly.storybookAddons.typesMod.DecoratorFunction
import typingsJapgolly.storybookAddons.typesMod.Loadable
import typingsJapgolly.storybookAddons.typesMod.Parameters
import typingsJapgolly.storybookAddons.typesMod.StoryApi
import typingsJapgolly.storybookReact.typesMod.IStorybookSection
import typingsJapgolly.storybookReact.typesMod.StoryFnReactReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientApi extends ClientStoryApi[StoryFnReactReturnType] {
  def clearDecorators(): Unit
  def configure(loader: Loadable, module: NodeModule): Unit
  def forceReRender(): Unit
  def getStorybook(): js.Array[IStorybookSection]
  def raw(): js.Any
  def setAddon(addon: js.Any): Unit
}

object ClientApi {
  @scala.inline
  def apply(
    addDecorator: DecoratorFunction[Element] => CallbackTo[StoryApi[Element]],
    addParameters: Parameters => CallbackTo[StoryApi[Element]],
    clearDecorators: Callback,
    configure: (Loadable, NodeModule) => Callback,
    forceReRender: Callback,
    getStorybook: CallbackTo[js.Array[IStorybookSection]],
    raw: CallbackTo[js.Any],
    setAddon: js.Any => Callback,
    storiesOf: (String, NodeModule) => CallbackTo[StoryApi[Element]]
  ): ClientApi = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addDecorator")(js.Any.fromFunction1((t0: typingsJapgolly.storybookAddons.typesMod.DecoratorFunction[japgolly.scalajs.react.raw.React.Element]) => addDecorator(t0).runNow()))
    __obj.updateDynamic("addParameters")(js.Any.fromFunction1((t0: typingsJapgolly.storybookAddons.typesMod.Parameters) => addParameters(t0).runNow()))
    __obj.updateDynamic("clearDecorators")(clearDecorators.toJsFn)
    __obj.updateDynamic("configure")(js.Any.fromFunction2((t0: typingsJapgolly.storybookAddons.typesMod.Loadable, t1: typingsJapgolly.node.NodeModule) => configure(t0, t1).runNow()))
    __obj.updateDynamic("forceReRender")(forceReRender.toJsFn)
    __obj.updateDynamic("getStorybook")(getStorybook.toJsFn)
    __obj.updateDynamic("raw")(raw.toJsFn)
    __obj.updateDynamic("setAddon")(js.Any.fromFunction1((t0: js.Any) => setAddon(t0).runNow()))
    __obj.updateDynamic("storiesOf")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.node.NodeModule) => storiesOf(t0, t1).runNow()))
    __obj.asInstanceOf[ClientApi]
  }
}

