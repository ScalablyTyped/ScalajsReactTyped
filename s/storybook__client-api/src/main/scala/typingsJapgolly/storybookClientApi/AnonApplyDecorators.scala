package typingsJapgolly.storybookClientApi

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.storybookAddons.typesMod.DecoratorFunction
import typingsJapgolly.storybookAddons.typesMod.StoryFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApplyDecorators extends js.Object {
  def applyDecorators(fn: StoryFn[_], decorators: js.Array[DecoratorFunction[_]]): js.Any
  def getDecorators(): js.Array[DecoratorFunction[_]]
}

object AnonApplyDecorators {
  @scala.inline
  def apply(
    applyDecorators: (StoryFn[js.Any], js.Array[DecoratorFunction[js.Any]]) => CallbackTo[js.Any],
    getDecorators: CallbackTo[js.Array[DecoratorFunction[js.Any]]]
  ): AnonApplyDecorators = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("applyDecorators")(js.Any.fromFunction2((t0: typingsJapgolly.storybookAddons.typesMod.StoryFn[js.Any], t1: js.Array[typingsJapgolly.storybookAddons.typesMod.DecoratorFunction[js.Any]]) => applyDecorators(t0, t1).runNow()))
    __obj.updateDynamic("getDecorators")(getDecorators.toJsFn)
    __obj.asInstanceOf[AnonApplyDecorators]
  }
}

