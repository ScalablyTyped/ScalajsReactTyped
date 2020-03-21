package typingsJapgolly.storybookAddonInfo.mod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.std.ReturnType
import typingsJapgolly.storybookAddons.typesMod.DecoratorFunction
import typingsJapgolly.storybookAddons.typesMod.StoryContext
import typingsJapgolly.storybookAddons.typesMod.StoryFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-info", "withInfo")
@js.native
object withInfo extends js.Object {
  def apply(): js.Function1[
    /* storyFn */ StoryFn[_], 
    js.Function1[/* context */ js.UndefOr[js.Object], Element]
  ] = js.native
  def apply(textOrOptions: String): js.Function1[
    /* storyFn */ StoryFn[_], 
    js.Function1[/* context */ js.UndefOr[js.Object], Element]
  ] = js.native
  def apply(textOrOptions: Options): js.Function1[
    /* storyFn */ StoryFn[_], 
    js.Function1[/* context */ js.UndefOr[js.Object], Element]
  ] = js.native
  def apply[A](story: StoryFn[A], context: StoryContext): ReturnType[DecoratorFunction[A]] = js.native
}

