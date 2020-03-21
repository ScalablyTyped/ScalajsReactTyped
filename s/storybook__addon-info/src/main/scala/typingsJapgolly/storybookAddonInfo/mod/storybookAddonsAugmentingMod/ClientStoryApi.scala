package typingsJapgolly.storybookAddonInfo.mod.storybookAddonsAugmentingMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.NodeModule
import typingsJapgolly.storybookAddonInfo.ParametersinfoOptions
import typingsJapgolly.storybookAddons.typesMod.DecoratorFunction
import typingsJapgolly.storybookAddons.typesMod.StoryApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientStoryApi[StoryFnReturnType] extends js.Object {
  def addDecorator(decorator: DecoratorFunction[StoryFnReturnType]): StoryApi[StoryFnReturnType]
  def addParameters(parameter: ParametersinfoOptions): StoryApi[StoryFnReturnType]
  def storiesOf(kind: String, module: NodeModule): StoryApi[StoryFnReturnType]
}

object ClientStoryApi {
  @scala.inline
  def apply[StoryFnReturnType](
    addDecorator: DecoratorFunction[StoryFnReturnType] => CallbackTo[StoryApi[StoryFnReturnType]],
    addParameters: ParametersinfoOptions => CallbackTo[StoryApi[StoryFnReturnType]],
    storiesOf: (String, NodeModule) => CallbackTo[StoryApi[StoryFnReturnType]]
  ): ClientStoryApi[StoryFnReturnType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addDecorator")(js.Any.fromFunction1((t0: typingsJapgolly.storybookAddons.typesMod.DecoratorFunction[StoryFnReturnType]) => addDecorator(t0).runNow()))
    __obj.updateDynamic("addParameters")(js.Any.fromFunction1((t0: typingsJapgolly.storybookAddonInfo.ParametersinfoOptions) => addParameters(t0).runNow()))
    __obj.updateDynamic("storiesOf")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.node.NodeModule) => storiesOf(t0, t1).runNow()))
    __obj.asInstanceOf[ClientStoryApi[StoryFnReturnType]]
  }
}

