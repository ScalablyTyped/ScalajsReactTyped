package typingsJapgolly.slickgrid.Slick

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Column[T /* <: SlickData */] extends js.Object {
  /**
  		* This accepts a function of the form function(cellNode, row, dataContext, colDef) and is used to post-process the cell's DOM node / nodes
  		* @param cellNode
  		* @param row
  		* @param dataContext
  		* @param colDef
  		* @return
  		**/
  var asyncPostRender: js.UndefOr[
    js.Function4[
      /* cellNode */ js.Any, 
      /* row */ js.Any, 
      /* dataContext */ js.Any, 
      /* colDef */ js.Any, 
      Unit
    ]
  ] = js.undefined
  /**
  		* Used by the the slick.rowMoveManager.js plugin for moving rows. Has no effect without the plugin installed.
  		**/
  var behavior: js.UndefOr[js.Any] = js.undefined
  /**
  		* In the "Add New" row, determines whether clicking cells in this column can trigger row addition. If true, clicking on the cell in this column in the "Add New" row will not trigger row addition.
  		**/
  var cannotTriggerInsert: js.UndefOr[Boolean] = js.undefined
  /**
  		* Accepts a string as a class name, applies that class to every row cell in the column.
  		**/
  var cssClass: js.UndefOr[String] = js.undefined
  /**
  		* When set to true, the first user click on the header will do a descending sort. When set to false, the first user click on the header will do an ascending sort.
  		**/
  var defaultSortAsc: js.UndefOr[Boolean] = js.undefined
  /**
  		* The editor for cell edits {TextEditor, IntegerEditor, DateEditor...} See slick.editors.js
  		**/
  var editor: js.UndefOr[js.Any] = js.undefined
   // typeof Editors.Editor<T>;
  /**
  		* The property name in the data object to pull content from. (This is assumed to be on the root of the data object.)
  		**/
  var field: js.UndefOr[String] = js.undefined
  /**
  		* When set to false, clicking on a cell in this column will not select the row for that cell. The cells in this column will also be skipped during tab navigation.
  		**/
  var focusable: js.UndefOr[Boolean] = js.undefined
  /**
  		* This accepts a function of the form function(row, cell, value, columnDef, dataContext) and returns a formatted version of the data in each cell of this column. For example, setting formatter to function(r, c, v, cd, dc) { return "Hello!"; } would overwrite every value in the column with "Hello!" See defaultFormatter in slick.grid.js for an example formatter.
  		* @param row
  		* @param cell
  		* @param value
  		* @param columnDef
  		* @param dataContext
  		* @return
  		**/
  var formatter: js.UndefOr[Formatter[T]] = js.undefined
  var header: js.UndefOr[Header] = js.undefined
  /**
  		* Accepts a string as a class name, applies that class to the cell for the column header.
  		**/
  var headerCssClass: js.UndefOr[String] = js.undefined
  /**
  		* A unique identifier for the column within the grid.
  		**/
  var id: js.UndefOr[String] = js.undefined
  /**
  		* Set the maximum allowable width of this column, in pixels.
  		**/
  var maxWidth: js.UndefOr[Double] = js.undefined
  /**
  		*  Set the minimum allowable width of this column, in pixels.
  		**/
  var minWidth: js.UndefOr[Double] = js.undefined
  /**
  		* The text to display on the column heading.
  		**/
  var name: js.UndefOr[String] = js.undefined
  /**
  		* If set to true, whenever this column is resized, the entire table view will rerender.
  		**/
  var rerenderOnResize: js.UndefOr[Boolean] = js.undefined
  /**
  		* If false, column can no longer be resized.
  		**/
  var resizable: js.UndefOr[Boolean] = js.undefined
  /**
  		* If false, when a row is selected, the CSS class for selected cells ("selected" by default) is not applied to the cell in this column.
  		**/
  var selectable: js.UndefOr[Boolean] = js.undefined
  /**
  		* If true, the column will be sortable by clicking on the header.
  		**/
  var sortable: js.UndefOr[Boolean] = js.undefined
  /**
  		* If set to a non-empty string, a tooltip will appear on hover containing the string.
  		**/
  var toolTip: js.UndefOr[String] = js.undefined
  /**
  		* Width of the column in pixels. (May often be overridden by things like minWidth, maxWidth, forceFitColumns, etc.)
  		**/
  var width: js.UndefOr[Double] = js.undefined
}

object Column {
  @scala.inline
  def apply[T /* <: SlickData */](
    asyncPostRender: (/* cellNode */ js.Any, /* row */ js.Any, /* dataContext */ js.Any, /* colDef */ js.Any) => Callback = null,
    behavior: js.Any = null,
    cannotTriggerInsert: js.UndefOr[Boolean] = js.undefined,
    cssClass: String = null,
    defaultSortAsc: js.UndefOr[Boolean] = js.undefined,
    editor: js.Any = null,
    field: String = null,
    focusable: js.UndefOr[Boolean] = js.undefined,
    formatter: (/* row */ Double, /* cell */ Double, /* value */ js.Any, /* columnDef */ Column[T], /* dataContext */ SlickData) => CallbackTo[String] = null,
    header: Header = null,
    headerCssClass: String = null,
    id: String = null,
    maxWidth: Int | Double = null,
    minWidth: Int | Double = null,
    name: String = null,
    rerenderOnResize: js.UndefOr[Boolean] = js.undefined,
    resizable: js.UndefOr[Boolean] = js.undefined,
    selectable: js.UndefOr[Boolean] = js.undefined,
    sortable: js.UndefOr[Boolean] = js.undefined,
    toolTip: String = null,
    width: Int | Double = null
  ): Column[T] = {
    val __obj = js.Dynamic.literal()
    if (asyncPostRender != null) __obj.updateDynamic("asyncPostRender")(js.Any.fromFunction4((t0: /* cellNode */ js.Any, t1: /* row */ js.Any, t2: /* dataContext */ js.Any, t3: /* colDef */ js.Any) => asyncPostRender(t0, t1, t2, t3).runNow()))
    if (behavior != null) __obj.updateDynamic("behavior")(behavior.asInstanceOf[js.Any])
    if (!js.isUndefined(cannotTriggerInsert)) __obj.updateDynamic("cannotTriggerInsert")(cannotTriggerInsert.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultSortAsc)) __obj.updateDynamic("defaultSortAsc")(defaultSortAsc.asInstanceOf[js.Any])
    if (editor != null) __obj.updateDynamic("editor")(editor.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (!js.isUndefined(focusable)) __obj.updateDynamic("focusable")(focusable.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction5((t0: /* row */ scala.Double, t1: /* cell */ scala.Double, t2: /* value */ js.Any, t3: /* columnDef */ typingsJapgolly.slickgrid.Slick.Column[T], t4: /* dataContext */ typingsJapgolly.slickgrid.Slick.SlickData) => formatter(t0, t1, t2, t3, t4).runNow()))
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (headerCssClass != null) __obj.updateDynamic("headerCssClass")(headerCssClass.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(rerenderOnResize)) __obj.updateDynamic("rerenderOnResize")(rerenderOnResize.asInstanceOf[js.Any])
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (!js.isUndefined(sortable)) __obj.updateDynamic("sortable")(sortable.asInstanceOf[js.Any])
    if (toolTip != null) __obj.updateDynamic("toolTip")(toolTip.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column[T]]
  }
}

