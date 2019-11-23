package typingsJapgolly.atStorybookAddons.distMakeDashDecoratorMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.atStorybookAddons.distTypesMod.StoryContext
import typingsJapgolly.atStorybookAddons.distTypesMod.StoryGetter
import typingsJapgolly.atStorybookAddons.distTypesMod.StoryWrapper
import typingsJapgolly.atStorybookAddons.distTypesMod.WrapperSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MakeDecoratorOptions extends js.Object {
  var allowDeprecatedUsage: js.UndefOr[Boolean] = js.undefined
  var name: String
  var parameterName: String
  var skipIfNoParametersOrOptions: js.UndefOr[Boolean] = js.undefined
  var wrapper: StoryWrapper
}

object MakeDecoratorOptions {
  @scala.inline
  def apply(
    name: String,
    parameterName: String,
    wrapper: (/* getStory */ StoryGetter, /* context */ StoryContext, /* settings */ WrapperSettings) => CallbackTo[js.Any],
    allowDeprecatedUsage: js.UndefOr[Boolean] = js.undefined,
    skipIfNoParametersOrOptions: js.UndefOr[Boolean] = js.undefined
  ): MakeDecoratorOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parameterName = parameterName.asInstanceOf[js.Any])
    __obj.updateDynamic("wrapper")(js.Any.fromFunction3((t0: /* getStory */ typingsJapgolly.atStorybookAddons.distTypesMod.StoryGetter, t1: /* context */ typingsJapgolly.atStorybookAddons.distTypesMod.StoryContext, t2: /* settings */ typingsJapgolly.atStorybookAddons.distTypesMod.WrapperSettings) => wrapper(t0, t1, t2).runNow()))
    if (!js.isUndefined(allowDeprecatedUsage)) __obj.updateDynamic("allowDeprecatedUsage")(allowDeprecatedUsage.asInstanceOf[js.Any])
    if (!js.isUndefined(skipIfNoParametersOrOptions)) __obj.updateDynamic("skipIfNoParametersOrOptions")(skipIfNoParametersOrOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[MakeDecoratorOptions]
  }
}

