package typingsJapgolly.uiGrid.mod.cellNav

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridOptions extends js.Object {
  /**
    * Enable multiple cell selection only when using the ctrlKey or shiftKey.
    * Defaults to false
    * @default false
    */
  var modifierKeysToMultiSelectCells: js.UndefOr[Boolean] = js.undefined
}

object IGridOptions {
  @scala.inline
  def apply(modifierKeysToMultiSelectCells: js.UndefOr[Boolean] = js.undefined): IGridOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(modifierKeysToMultiSelectCells)) __obj.updateDynamic("modifierKeysToMultiSelectCells")(modifierKeysToMultiSelectCells.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridOptions]
  }
}

