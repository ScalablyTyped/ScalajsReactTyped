package typingsJapgolly.atStorybookAddons.distHooksMod

import typingsJapgolly.atStorybookAddons.distTypesMod.StoryContext
import typingsJapgolly.atStorybookAddons.distTypesMod.StoryGetter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addons/dist/hooks", "applyHooks")
@js.native
object applyHooks extends js.Object {
  def apply(
    applyDecorators: js.Function2[/* getStory */ StoryGetter, /* decorators */ js.Array[Decorator], StoryGetter]
  ): js.Function2[
    /* getStory */ StoryGetter, 
    /* decorators */ js.Array[Decorator], 
    js.Function1[/* context */ StoryContext, _]
  ] = js.native
}

