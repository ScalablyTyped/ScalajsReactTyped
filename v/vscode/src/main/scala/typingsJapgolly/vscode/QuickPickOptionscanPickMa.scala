package typingsJapgolly.vscode

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vscode.mod.QuickPickItem
import typingsJapgolly.vscode.vscodeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined vscode.vscode.QuickPickOptions & {  canPickMany  :true} */
trait QuickPickOptionscanPickMa extends js.Object {
  /**
  		 * An optional flag to make the picker accept multiple selections, if true the result is an array of picks.
  		 */
  var canPickMany: js.UndefOr[Boolean with `true`] = js.undefined
  /**
  		 * Set to `true` to keep the picker open when focus moves to another part of the editor or to another window.
  		 */
  var ignoreFocusOut: js.UndefOr[Boolean] = js.undefined
  /**
  		 * An optional flag to include the description when filtering the picks.
  		 */
  var matchOnDescription: js.UndefOr[Boolean] = js.undefined
  /**
  		 * An optional flag to include the detail when filtering the picks.
  		 */
  var matchOnDetail: js.UndefOr[Boolean] = js.undefined
  /**
  		 * An optional function that is invoked whenever an item is selected.
  		 */
  var onDidSelectItem: js.UndefOr[js.Function1[/* item */ QuickPickItem | String, _]] = js.undefined
  /**
  		 * An optional string to show as placeholder in the input box to guide the user what to pick on.
  		 */
  var placeHolder: js.UndefOr[String] = js.undefined
}

object QuickPickOptionscanPickMa {
  @scala.inline
  def apply(
    canPickMany: js.UndefOr[Boolean with `true`] = js.undefined,
    ignoreFocusOut: js.UndefOr[Boolean] = js.undefined,
    matchOnDescription: js.UndefOr[Boolean] = js.undefined,
    matchOnDetail: js.UndefOr[Boolean] = js.undefined,
    onDidSelectItem: /* item */ QuickPickItem | String => CallbackTo[js.Any] = null,
    placeHolder: String = null
  ): QuickPickOptionscanPickMa = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canPickMany)) __obj.updateDynamic("canPickMany")(canPickMany.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreFocusOut)) __obj.updateDynamic("ignoreFocusOut")(ignoreFocusOut.asInstanceOf[js.Any])
    if (!js.isUndefined(matchOnDescription)) __obj.updateDynamic("matchOnDescription")(matchOnDescription.asInstanceOf[js.Any])
    if (!js.isUndefined(matchOnDetail)) __obj.updateDynamic("matchOnDetail")(matchOnDetail.asInstanceOf[js.Any])
    if (onDidSelectItem != null) __obj.updateDynamic("onDidSelectItem")(js.Any.fromFunction1((t0: /* item */ typingsJapgolly.vscode.mod.QuickPickItem | java.lang.String) => onDidSelectItem(t0).runNow()))
    if (placeHolder != null) __obj.updateDynamic("placeHolder")(placeHolder.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuickPickOptionscanPickMa]
  }
}

