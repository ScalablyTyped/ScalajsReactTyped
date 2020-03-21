package typingsJapgolly.storybookReact.typesMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderMainArgs extends js.Object {
  var forceRender: Boolean
  var selectedKind: String
  var selectedStory: String
  var storyFn: FunctionComponent[_]
  def showError(args: ShowErrorArgs): Unit
  def showException(err: js.Error): Unit
  def showMain(): Unit
}

object RenderMainArgs {
  @scala.inline
  def apply(
    forceRender: Boolean,
    selectedKind: String,
    selectedStory: String,
    showError: ShowErrorArgs => Callback,
    showException: js.Error => Callback,
    showMain: Callback,
    storyFn: FunctionComponent[_]
  ): RenderMainArgs = {
    val __obj = js.Dynamic.literal(forceRender = forceRender.asInstanceOf[js.Any], selectedKind = selectedKind.asInstanceOf[js.Any], selectedStory = selectedStory.asInstanceOf[js.Any], storyFn = storyFn.asInstanceOf[js.Any])
    __obj.updateDynamic("showError")(js.Any.fromFunction1((t0: typingsJapgolly.storybookReact.typesMod.ShowErrorArgs) => showError(t0).runNow()))
    __obj.updateDynamic("showException")(js.Any.fromFunction1((t0: js.Error) => showException(t0).runNow()))
    __obj.updateDynamic("showMain")(showMain.toJsFn)
    __obj.asInstanceOf[RenderMainArgs]
  }
}

