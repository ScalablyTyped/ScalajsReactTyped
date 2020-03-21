package typingsJapgolly.jupyterlabMainmenu.viewMod.IViewMenu

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typingsJapgolly.jupyterlabMainmenu.labmenuMod.IMenuExtender
import typingsJapgolly.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a text editor viewer to register
  * itself with the text editor extension points.
  */
trait IEditorViewer[T /* <: Widget */] extends IMenuExtender[T] {
  /**
    * Whether line numbers are toggled.
    */
  var lineNumbersToggled: js.UndefOr[js.Function1[/* widget */ T, Boolean]] = js.undefined
  /**
    * Whether match brackets is toggled.
    */
  var matchBracketsToggled: js.UndefOr[js.Function1[/* widget */ T, Boolean]] = js.undefined
  /**
    * Whether to show line numbers in the editor.
    */
  var toggleLineNumbers: js.UndefOr[js.Function1[/* widget */ T, Unit]] = js.undefined
  /**
    * Whether to match brackets in the editor.
    */
  var toggleMatchBrackets: js.UndefOr[js.Function1[/* widget */ T, Unit]] = js.undefined
  /**
    * Whether to word-wrap the editor.
    */
  var toggleWordWrap: js.UndefOr[js.Function1[/* widget */ T, Unit]] = js.undefined
  /**
    * Whether word wrap is toggled.
    */
  var wordWrapToggled: js.UndefOr[js.Function1[/* widget */ T, Boolean]] = js.undefined
}

object IEditorViewer {
  @scala.inline
  def apply[T /* <: Widget */](
    tracker: IWidgetTracker[T],
    isEnabled: T => CallbackTo[Boolean] = null,
    lineNumbersToggled: /* widget */ T => CallbackTo[Boolean] = null,
    matchBracketsToggled: /* widget */ T => CallbackTo[Boolean] = null,
    toggleLineNumbers: /* widget */ T => Callback = null,
    toggleMatchBrackets: /* widget */ T => Callback = null,
    toggleWordWrap: /* widget */ T => Callback = null,
    wordWrapToggled: /* widget */ T => CallbackTo[Boolean] = null
  ): IEditorViewer[T] = {
    val __obj = js.Dynamic.literal(tracker = tracker.asInstanceOf[js.Any])
    if (isEnabled != null) __obj.updateDynamic("isEnabled")(js.Any.fromFunction1((t0: T) => isEnabled(t0).runNow()))
    if (lineNumbersToggled != null) __obj.updateDynamic("lineNumbersToggled")(js.Any.fromFunction1((t0: /* widget */ T) => lineNumbersToggled(t0).runNow()))
    if (matchBracketsToggled != null) __obj.updateDynamic("matchBracketsToggled")(js.Any.fromFunction1((t0: /* widget */ T) => matchBracketsToggled(t0).runNow()))
    if (toggleLineNumbers != null) __obj.updateDynamic("toggleLineNumbers")(js.Any.fromFunction1((t0: /* widget */ T) => toggleLineNumbers(t0).runNow()))
    if (toggleMatchBrackets != null) __obj.updateDynamic("toggleMatchBrackets")(js.Any.fromFunction1((t0: /* widget */ T) => toggleMatchBrackets(t0).runNow()))
    if (toggleWordWrap != null) __obj.updateDynamic("toggleWordWrap")(js.Any.fromFunction1((t0: /* widget */ T) => toggleWordWrap(t0).runNow()))
    if (wordWrapToggled != null) __obj.updateDynamic("wordWrapToggled")(js.Any.fromFunction1((t0: /* widget */ T) => wordWrapToggled(t0).runNow()))
    __obj.asInstanceOf[IEditorViewer[T]]
  }
}

