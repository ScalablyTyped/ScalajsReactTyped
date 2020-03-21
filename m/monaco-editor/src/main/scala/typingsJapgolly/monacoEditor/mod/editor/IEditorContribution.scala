package typingsJapgolly.monacoEditor.mod.editor

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEditorContribution extends js.Object {
  /**
    * Restore view state.
    */
  var restoreViewState: js.UndefOr[js.Function1[/* state */ js.Any, Unit]] = js.undefined
  /**
    * Store view state.
    */
  var saveViewState: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * Dispose this contribution.
    */
  def dispose(): Unit
  /**
    * Get a unique identifier for this contribution.
    */
  def getId(): String
}

object IEditorContribution {
  @scala.inline
  def apply(
    dispose: Callback,
    getId: CallbackTo[String],
    restoreViewState: /* state */ js.Any => Callback = null,
    saveViewState: js.UndefOr[CallbackTo[js.Any]] = js.undefined
  ): IEditorContribution = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.updateDynamic("getId")(getId.toJsFn)
    if (restoreViewState != null) __obj.updateDynamic("restoreViewState")(js.Any.fromFunction1((t0: /* state */ js.Any) => restoreViewState(t0).runNow()))
    saveViewState.foreach(p => __obj.updateDynamic("saveViewState")(p.toJsFn))
    __obj.asInstanceOf[IEditorContribution]
  }
}

