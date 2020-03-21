package typingsJapgolly.storybookClientApi.clientApiMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.NodeModule
import typingsJapgolly.storybookAddons.typesMod.DecoratorFunction
import typingsJapgolly.storybookAddons.typesMod.Parameters
import typingsJapgolly.storybookAddons.typesMod.StoryApi
import typingsJapgolly.storybookClientApi.AnonFileName
import typingsJapgolly.storybookClientApi.AnonHierarchyRootSeparator
import typingsJapgolly.storybookClientApi.AnonHierarchySeparator
import typingsJapgolly.storybookClientApi.typesMod.StoreItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientApi extends js.Object {
  var _addons: js.Any
  var _decorateStory: js.Any
  var _storyStore: js.Any
  def addDecorator(decorator: DecoratorFunction[_]): Unit
  def addParameters(parameters: Parameters): Unit
  def clearDecorators(): Unit
  def clearParameters(): Unit
  def getSeparators(): AnonHierarchyRootSeparator | AnonHierarchySeparator
  def getStorybook(): js.Array[AnonFileName]
  def raw(): js.Array[StoreItem]
  def setAddon(addon: js.Any): Unit
  def store(): typingsJapgolly.storybookClientApi.storyStoreMod.default
  def storiesOf[StoryFnReturnType](kind: String, m: NodeModule): StoryApi[StoryFnReturnType]
}

object ClientApi {
  @scala.inline
  def apply(
    _addons: js.Any,
    _decorateStory: js.Any,
    _storyStore: js.Any,
    addDecorator: DecoratorFunction[js.Any] => Callback,
    addParameters: Parameters => Callback,
    clearDecorators: Callback,
    clearParameters: Callback,
    getSeparators: CallbackTo[AnonHierarchyRootSeparator | AnonHierarchySeparator],
    getStorybook: CallbackTo[js.Array[AnonFileName]],
    raw: CallbackTo[js.Array[StoreItem]],
    setAddon: js.Any => Callback,
    store: CallbackTo[typingsJapgolly.storybookClientApi.storyStoreMod.default],
    storiesOf: (String, NodeModule) => CallbackTo[StoryApi[js.Any]]
  ): ClientApi = {
    val __obj = js.Dynamic.literal(_addons = _addons.asInstanceOf[js.Any], _decorateStory = _decorateStory.asInstanceOf[js.Any], _storyStore = _storyStore.asInstanceOf[js.Any])
    __obj.updateDynamic("addDecorator")(js.Any.fromFunction1((t0: typingsJapgolly.storybookAddons.typesMod.DecoratorFunction[js.Any]) => addDecorator(t0).runNow()))
    __obj.updateDynamic("addParameters")(js.Any.fromFunction1((t0: typingsJapgolly.storybookAddons.typesMod.Parameters) => addParameters(t0).runNow()))
    __obj.updateDynamic("clearDecorators")(clearDecorators.toJsFn)
    __obj.updateDynamic("clearParameters")(clearParameters.toJsFn)
    __obj.updateDynamic("getSeparators")(getSeparators.toJsFn)
    __obj.updateDynamic("getStorybook")(getStorybook.toJsFn)
    __obj.updateDynamic("raw")(raw.toJsFn)
    __obj.updateDynamic("setAddon")(js.Any.fromFunction1((t0: js.Any) => setAddon(t0).runNow()))
    __obj.updateDynamic("store")(store.toJsFn)
    __obj.updateDynamic("storiesOf")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.node.NodeModule) => storiesOf(t0, t1).runNow()))
    __obj.asInstanceOf[ClientApi]
  }
}

