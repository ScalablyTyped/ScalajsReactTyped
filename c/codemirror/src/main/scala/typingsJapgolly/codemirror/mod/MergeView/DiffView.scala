package typingsJapgolly.codemirror.mod.MergeView

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiffView extends js.Object {
  /**
    * Forces the view to reload.
    */
  def forceUpdate(): js.Function1[/* mode */ String, Unit]
  /**
    * Sets whether or not the merge view should show the differences between the editor views.
    */
  def setShowDifferences(showDifferences: Boolean): Unit
}

object DiffView {
  @scala.inline
  def apply(
    forceUpdate: CallbackTo[js.Function1[/* mode */ String, Unit]],
    setShowDifferences: Boolean => Callback
  ): DiffView = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("forceUpdate")(forceUpdate.toJsFn)
    __obj.updateDynamic("setShowDifferences")(js.Any.fromFunction1((t0: scala.Boolean) => setShowDifferences(t0).runNow()))
    __obj.asInstanceOf[DiffView]
  }
}

