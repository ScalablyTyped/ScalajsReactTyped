package typingsJapgolly.reactBootstrapTable.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpandColumnOptions extends js.Object {
  /**
  	 * set the width of indicator column.
  	 */
  var columnWidth: js.UndefOr[Double | String] = js.undefined
  /**
  	 * If both an indicator column and a selection column are displaying, this specifies whether the indicator column
  	 * should be shown first. Default is true, false will move the expand indicator column after selection column.
  	 */
  var expandColumnBeforeSelectColumn: js.UndefOr[Boolean] = js.undefined
  /**
  	 * a callback function to customize the appearance of the indicator column.
  	 */
  var expandColumnComponent: js.UndefOr[js.Function1[/* props */ ExpandColumnComponentProps, String | Element]] = js.undefined
  /**
  	 * Will enable an indicator column at first column if true. Default is false.
  	 */
  var expandColumnVisible: js.UndefOr[Boolean] = js.undefined
  /**
  	 * a callback function to customise the header column
  	 */
  var expandedColumnHeaderComponent: js.UndefOr[js.Function1[/* props */ ExpandedColumnHeaderProps, String | Element]] = js.undefined
}

object ExpandColumnOptions {
  @scala.inline
  def apply(
    columnWidth: Double | String = null,
    expandColumnBeforeSelectColumn: js.UndefOr[Boolean] = js.undefined,
    expandColumnComponent: /* props */ ExpandColumnComponentProps => CallbackTo[String | Element] = null,
    expandColumnVisible: js.UndefOr[Boolean] = js.undefined,
    expandedColumnHeaderComponent: /* props */ ExpandedColumnHeaderProps => CallbackTo[String | Element] = null
  ): ExpandColumnOptions = {
    val __obj = js.Dynamic.literal()
    if (columnWidth != null) __obj.updateDynamic("columnWidth")(columnWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(expandColumnBeforeSelectColumn)) __obj.updateDynamic("expandColumnBeforeSelectColumn")(expandColumnBeforeSelectColumn.asInstanceOf[js.Any])
    if (expandColumnComponent != null) __obj.updateDynamic("expandColumnComponent")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactBootstrapTable.mod.ExpandColumnComponentProps) => expandColumnComponent(t0).runNow()))
    if (!js.isUndefined(expandColumnVisible)) __obj.updateDynamic("expandColumnVisible")(expandColumnVisible.asInstanceOf[js.Any])
    if (expandedColumnHeaderComponent != null) __obj.updateDynamic("expandedColumnHeaderComponent")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactBootstrapTable.mod.ExpandedColumnHeaderProps) => expandedColumnHeaderComponent(t0).runNow()))
    __obj.asInstanceOf[ExpandColumnOptions]
  }
}

