package typingsJapgolly.atStorybookReact.distClientPreviewTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderMainArgs extends js.Object {
  var forceRender: Boolean
  var selectedKind: String
  var selectedStory: String
  def showError(args: ShowErrorArgs): Unit
  def showException(err: js.Error): Unit
  def showMain(): Unit
  def storyFn(): js.UndefOr[Element]
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
    storyFn: CallbackTo[js.UndefOr[Element]]
  ): RenderMainArgs = {
    val __obj = js.Dynamic.literal(forceRender = forceRender.asInstanceOf[js.Any], selectedKind = selectedKind.asInstanceOf[js.Any], selectedStory = selectedStory.asInstanceOf[js.Any])
    __obj.updateDynamic("showError")(js.Any.fromFunction1((t0: typingsJapgolly.atStorybookReact.distClientPreviewTypesMod.ShowErrorArgs) => showError(t0).runNow()))
    __obj.updateDynamic("showException")(js.Any.fromFunction1((t0: js.Error) => showException(t0).runNow()))
    __obj.updateDynamic("showMain")(showMain.toJsFn)
    __obj.updateDynamic("storyFn")(storyFn.toJsFn)
    __obj.asInstanceOf[RenderMainArgs]
  }
}

