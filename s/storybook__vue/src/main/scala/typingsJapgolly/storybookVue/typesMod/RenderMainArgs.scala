package typingsJapgolly.storybookVue.typesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.storybookAddons.typesMod.StoryContext
import typingsJapgolly.storybookAddons.typesMod.StoryFn
import typingsJapgolly.vue.vueMod.Vue
import typingsJapgolly.vue.vueMod.VueConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderMainArgs extends js.Object {
  var forceRender: Boolean
  var selectedKind: String
  var selectedStory: String
  var storyFn: StoryFn[VueConstructor[Vue]]
  def showError(args: ShowErrorArgs): Unit
  def showException(args: js.Any*): Unit
  def showMain(): Unit
}

object RenderMainArgs {
  @scala.inline
  def apply(
    forceRender: Boolean,
    selectedKind: String,
    selectedStory: String,
    showError: ShowErrorArgs => Callback,
    showException: /* repeated */ js.Any => Callback,
    showMain: Callback,
    storyFn: /* p */ js.UndefOr[StoryContext] => CallbackTo[VueConstructor[Vue]]
  ): RenderMainArgs = {
    val __obj = js.Dynamic.literal(forceRender = forceRender.asInstanceOf[js.Any], selectedKind = selectedKind.asInstanceOf[js.Any], selectedStory = selectedStory.asInstanceOf[js.Any])
    __obj.updateDynamic("showError")(js.Any.fromFunction1((t0: typingsJapgolly.storybookVue.typesMod.ShowErrorArgs) => showError(t0).runNow()))
    __obj.updateDynamic("showException")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => showException(t0).runNow()))
    __obj.updateDynamic("showMain")(showMain.toJsFn)
    __obj.updateDynamic("storyFn")(js.Any.fromFunction1((t0: /* p */ js.UndefOr[typingsJapgolly.storybookAddons.typesMod.StoryContext]) => storyFn(t0).runNow()))
    __obj.asInstanceOf[RenderMainArgs]
  }
}

