package typingsJapgolly.extjs.Ext.grid.header

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.grid.column.IColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContainer
  extends typingsJapgolly.extjs.Ext.container.IContainer {
  /** [Config Option] (Number) */
  var defaultWidth: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Boolean) */
  var enableColumnHide: js.UndefOr[Boolean] = js.undefined
  /** [Method] Returns the number of grid columns descended from this HeaderContainer  */
  var getColumnCount: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Returns an array of menu CheckItems corresponding to all immediate children of the passed Container which have been c
  		* @param headerContainer Object
  		*/
  var getColumnMenu: js.UndefOr[js.Function1[/* headerContainer */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Gets the full width of all columns that are visible  */
  var getFullWidth: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Returns an array of all columns which appear in the grid s View
  		* @param inResult Object
  		* @param hiddenAncestor Object
  		* @returns Array
  		*/
  var getGridColumns: js.UndefOr[
    js.Function2[/* inResult */ js.UndefOr[js.Any], /* hiddenAncestor */ js.UndefOr[js.Any], Array]
  ] = js.undefined
  /** [Method] Get a leaf level header by index regardless of what the nesting structure is
  		* @param index Number The column index for which to retrieve the column.
  		*/
  var getHeaderAtIndex: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Returns the index of a leaf level header regardless of what the nesting structure is
  		* @param header Ext.grid.column.Column The header to find the index of
  		* @returns Number The index of the specified column header
  		*/
  var getHeaderIndex: js.UndefOr[js.Function1[/* header */ js.UndefOr[IColumn], Double]] = js.undefined
  /** [Method] Returns an array of menu items to be placed into the shared menu across all headers in this header container
  		* @returns Array menuItems
  		*/
  var getMenuItems: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns an array of the visible columns in the grid
  		* @returns Array
  		*/
  var getVisibleGridColumns: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] When passed a column index returns the closet visible column to that
  		* @param index Number Position at which to find the closest visible column.
  		*/
  var getVisibleHeaderClosestToIndex: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Property] (Boolean) */
  var isGroupHeader: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var `sealed`: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var sortable: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number) */
  var weight: js.UndefOr[Double] = js.undefined
}

object IContainer {
  @scala.inline
  def apply(
    IContainer: typingsJapgolly.extjs.Ext.container.IContainer = null,
    defaultWidth: Int | Double = null,
    enableColumnHide: js.UndefOr[Boolean] = js.undefined,
    getColumnCount: js.UndefOr[Callback] = js.undefined,
    getColumnMenu: /* headerContainer */ js.UndefOr[js.Any] => Callback = null,
    getFullWidth: js.UndefOr[Callback] = js.undefined,
    getGridColumns: (/* inResult */ js.UndefOr[js.Any], /* hiddenAncestor */ js.UndefOr[js.Any]) => CallbackTo[Array] = null,
    getHeaderAtIndex: /* index */ js.UndefOr[Double] => Callback = null,
    getHeaderIndex: /* header */ js.UndefOr[IColumn] => CallbackTo[Double] = null,
    getMenuItems: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getVisibleGridColumns: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getVisibleHeaderClosestToIndex: /* index */ js.UndefOr[Double] => Callback = null,
    isGroupHeader: js.UndefOr[Boolean] = js.undefined,
    `sealed`: js.UndefOr[Boolean] = js.undefined,
    sortable: js.UndefOr[Boolean] = js.undefined,
    weight: Int | Double = null
  ): IContainer = {
    val __obj = js.Dynamic.literal()
    if (IContainer != null) js.Dynamic.global.Object.assign(__obj, IContainer)
    if (defaultWidth != null) __obj.updateDynamic("defaultWidth")(defaultWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(enableColumnHide)) __obj.updateDynamic("enableColumnHide")(enableColumnHide.asInstanceOf[js.Any])
    getColumnCount.foreach(p => __obj.updateDynamic("getColumnCount")(p.toJsFn))
    if (getColumnMenu != null) __obj.updateDynamic("getColumnMenu")(js.Any.fromFunction1((t0: /* headerContainer */ js.UndefOr[js.Any]) => getColumnMenu(t0).runNow()))
    getFullWidth.foreach(p => __obj.updateDynamic("getFullWidth")(p.toJsFn))
    if (getGridColumns != null) __obj.updateDynamic("getGridColumns")(js.Any.fromFunction2((t0: /* inResult */ js.UndefOr[js.Any], t1: /* hiddenAncestor */ js.UndefOr[js.Any]) => getGridColumns(t0, t1).runNow()))
    if (getHeaderAtIndex != null) __obj.updateDynamic("getHeaderAtIndex")(js.Any.fromFunction1((t0: /* index */ js.UndefOr[scala.Double]) => getHeaderAtIndex(t0).runNow()))
    if (getHeaderIndex != null) __obj.updateDynamic("getHeaderIndex")(js.Any.fromFunction1((t0: /* header */ js.UndefOr[typingsJapgolly.extjs.Ext.grid.column.IColumn]) => getHeaderIndex(t0).runNow()))
    getMenuItems.foreach(p => __obj.updateDynamic("getMenuItems")(p.toJsFn))
    getVisibleGridColumns.foreach(p => __obj.updateDynamic("getVisibleGridColumns")(p.toJsFn))
    if (getVisibleHeaderClosestToIndex != null) __obj.updateDynamic("getVisibleHeaderClosestToIndex")(js.Any.fromFunction1((t0: /* index */ js.UndefOr[scala.Double]) => getVisibleHeaderClosestToIndex(t0).runNow()))
    if (!js.isUndefined(isGroupHeader)) __obj.updateDynamic("isGroupHeader")(isGroupHeader.asInstanceOf[js.Any])
    if (!js.isUndefined(`sealed`)) __obj.updateDynamic("sealed")(`sealed`.asInstanceOf[js.Any])
    if (!js.isUndefined(sortable)) __obj.updateDynamic("sortable")(sortable.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContainer]
  }
}

