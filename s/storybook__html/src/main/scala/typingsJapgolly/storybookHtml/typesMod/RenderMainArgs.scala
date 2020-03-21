package typingsJapgolly.storybookHtml.typesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.storybookAddons.typesMod.StoryFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderMainArgs extends js.Object {
  var forceRender: Boolean
  var selectedKind: String
  var selectedStory: String
  def showError(args: ShowErrorArgs): Unit
  def showMain(): Unit
  def storyFn(): StoryFn[StoryFnHtmlReturnType]
}

object RenderMainArgs {
  @scala.inline
  def apply(
    forceRender: Boolean,
    selectedKind: String,
    selectedStory: String,
    showError: ShowErrorArgs => Callback,
    showMain: Callback,
    storyFn: CallbackTo[StoryFn[StoryFnHtmlReturnType]]
  ): RenderMainArgs = {
    val __obj = js.Dynamic.literal(forceRender = forceRender.asInstanceOf[js.Any], selectedKind = selectedKind.asInstanceOf[js.Any], selectedStory = selectedStory.asInstanceOf[js.Any])
    __obj.updateDynamic("showError")(js.Any.fromFunction1((t0: typingsJapgolly.storybookHtml.typesMod.ShowErrorArgs) => showError(t0).runNow()))
    __obj.updateDynamic("showMain")(showMain.toJsFn)
    __obj.updateDynamic("storyFn")(storyFn.toJsFn)
    __obj.asInstanceOf[RenderMainArgs]
  }
}

