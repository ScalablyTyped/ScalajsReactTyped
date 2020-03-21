package typingsJapgolly.reactBootstrapTable.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[TRow /* <: js.Object */] extends js.Object {
  /**
  	 * Assign a callback function which will be called after triggering column filtering.
  	 * This function takes two arguments: filterConds and result.
  	 *   `filterConds`: It's an array object which contain all column filter conditions.
  	 *   `result`: The results after filtering.
  	 *
  	 * This function only work when you enable columnFilter on <BootstrapTable> or define
  	 * a filter on <TableHeaderColumn>.
  	 */
  var afterColumnFilter: js.UndefOr[
    js.Function2[/* filterConds */ js.Array[FilterData[_]], /* result */ js.Array[TRow], Unit]
  ] = js.undefined
  /**
  	 * Assign a callback function which will be called after row delete.
  	 * This function takes two arguments:
  	 *   `rowKeys`: which means the row keys for the deleted rows
  	 *   `rows`: the array of row data that was deleted.
  	 */
  var afterDeleteRow: js.UndefOr[
    js.Function2[/* rowKeys */ js.Array[Double | String], /* rows */ js.Array[TRow], Unit]
  ] = js.undefined
  /**
  	 * Assign a callback function which will be called after inserting a row.
  	 * This function takes one argument: row, which means the whole row data you added.
  	 */
  var afterInsertRow: js.UndefOr[js.Function1[/* row */ TRow, Unit]] = js.undefined
  /**
  	 * Assign a callback function which will be called after triggering searching.
  	 * This function takes two argument: search and result.
  	 *   `search`: The search text from the user.
  	 *   `result`: The results after searching (array of rows that matched the search).
  	 */
  var afterSearch: js.UndefOr[js.Function2[/* search */ String, /* result */ js.Array[TRow], Unit]] = js.undefined
  /**
  	 * Assign a callback function that will be called after table updates.
  	 */
  var afterTableComplete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
  	 * Flag to indicate that the table should always show next/previous buttons even when there is not next/previous
  	 * page.
  	 */
  var alwaysShowAllBtns: js.UndefOr[Boolean] = js.undefined
  /**
  	 * You can do something before the toastr pop or even disable the toastr!!
  	 * Returning false or void will not trigger the toastr.
  	 * If you want the toastr popup, you should return true always.
  	 * Inputs match the EditValidatorObject.notification field types.
  	 */
  var beforeShowError: js.UndefOr[
    js.Function3[/* type */ EditValidatorType, /* msg */ String, /* title */ String, Boolean | Unit]
  ] = js.undefined
  /**
  	 * Button group which contain the insert, drop, show only select and export CSV buttons, these button all
  	 * grouped as btn-group class in bootstrap. This is a chance that you can custom this button group.
  	 * Give a btnGroup in options props and btnGroup only accept a function and a JSX returned value is necessary.
  	 * This lets you customize just the left-hand-side of the toolbar if desired.
  	 */
  var btnGroup: js.UndefOr[js.Function1[/* props */ ButtonGroupProps, Element]] = js.undefined
  /**
  	 * Only work on enable search. If true, there will be a button beside the search input field
  	 * that will empty the field when clicked.
  	 */
  var clearSearch: js.UndefOr[Boolean] = js.undefined
  /**
  	 * You can custom the clear button for search field by giving clearSearchBtn in options props.
  	 * clearSearchBtn only accept a function and a JSX returned value is necessary.
  	 *
  	 * The default `ClearSearchButton` component is also exported as a component, so that you can use it as the
  	 * base for your own custom component.
  	 */
  var clearSearchBtn: js.UndefOr[
    js.Function1[
      /* onClick */ js.Function1[/* e */ ReactMouseEventFrom[org.scalajs.dom.raw.Element], Unit], 
      Element
    ]
  ] = js.undefined
  /**
  	 * Customize the text on the close button in the insert modal.
  	 */
  var closeText: js.UndefOr[String] = js.undefined
  /**
  	 * Set the default search condition.
  	 */
  var defaultSearch: js.UndefOr[String] = js.undefined
  /**
  	 * Specify the default sort column.
  	 * Note: when using cleanSort(), this default sort column will be restored.
  	 */
  var defaultSortName: js.UndefOr[String] = js.undefined
  /**
  	 * Assign a default sort order.
  	 * Note: when using cleanSort(), this default sort order will be restored.
  	 */
  var defaultSortOrder: js.UndefOr[SortOrder] = js.undefined
  /**
  	 * It's available to customize delete button by configuring deleteBtn in options props, deleteBtn onl<y
  	 * accept a function and a JSX returned value is necessary. This function will take one argument: onClick.
  	 *
  	 * The default `DeleteButton` component is also exported as a component, so that you can use it as the base
  	 * for your custom component.
  	 */
  var deleteBtn: js.UndefOr[
    js.Function1[
      /* onClick */ js.Function1[/* e */ ReactMouseEventFrom[org.scalajs.dom.raw.Element], Unit], 
      Element
    ]
  ] = js.undefined
  /**
  	 * Customize the text on the delete button.
  	 */
  var deleteText: js.UndefOr[String] = js.undefined
  /**
  	 * Expand all rows
  	 */
  var expandAll: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Custom class to use for the expanded content section of an expanded row. This can either be a string, or a
  	 * function that returns a string and takes three arguments: row, rowIndex, isExpanding.
  	 *   `row`: the row expanding/collapsing.
  	 *   `rowIndex`: index number of the row.
  	 *   `isExpanding`: boolean flag specifying whether the field is expanding or collapsing.
  	 */
  var expandBodyClass: js.UndefOr[
    String | (js.Function3[/* row */ TRow, /* rowIndex */ Double, /* isExpanding */ Boolean, String])
  ] = js.undefined
  /**
  	 * Tell react-bootstrap-table how to trigger expanding by clicking on 'row' or 'column' level.
  	 * If the value is 'column', by default all the columns are expandable. If you want to specify some columns as
  	 * unexpandable, check expandable.
  	 * Default is 'row'.
  	 */
  var expandBy: js.UndefOr[ExpandBy] = js.undefined
  /**
  	 * Custom class to use for the row itself for an expanded row when it has been expanded. This can either be a
  	 * string, or a function that returns a string and takes two arguments: row and rowIndex.
  	 *   `row`: the expanded row.
  	 *   `rowIndex`: index number of the row.
  	 */
  var expandParentClass: js.UndefOr[String | (js.Function2[/* row */ TRow, /* rowIndex */ Double, String])] = js.undefined
  /**
  	 * Background color on expanded rows (css color value).
  	 */
  var expandRowBgColor: js.UndefOr[String] = js.undefined
  /**
  	 * Provide an array of expanded rows for the table.
  	 */
  var expanding: js.UndefOr[js.Array[Double | String]] = js.undefined
  /**
  	 * It's available to customize the export csv button by configuring exportCSVBtn in options props, exportCSVBtn only
  	 * accept a function and a JSX returned value is necessary. This function will take one argument: onClick.
  	 *
  	 * The default `ExportCSVButton` component is also exported as a component, so that you can use it as the base
  	 * for your custom component.
  	 */
  var exportCSVBtn: js.UndefOr[
    js.Function1[
      /* onClick */ js.Function1[/* e */ ReactMouseEventFrom[org.scalajs.dom.raw.Element], Unit], 
      Element
    ]
  ] = js.undefined
  /**
  	 * Customize the field separator in a CSV export file. Default is ','.
  	 */
  var exportCSVSeparator: js.UndefOr[String] = js.undefined
  /**
  	 * Customize the text on the export csv button
  	 */
  var exportCSVText: js.UndefOr[String] = js.undefined
  /**
  	 * Customize the text of first page button.
  	 * If using the default pagination panel, this should be a string to use for the button label.
  	 * If creating a custom pagination panel, this is passed to the panel and can be of any type desired.
  	 */
  var firstPage: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Customize the tooltip text shown when hovering over the firstPage button.
  	 */
  var firstPageTitle: js.UndefOr[String] = js.undefined
  /**
  	 * Assign a callback function which will be called when deleting a row.
  	 * It gives you a chance to customize your confirmation for row deletion.
  	 * This function takes two argument: next and rowKeys:
  	 *   `next`: If you confirm the delete, call next() to continue the process.
  	 *   `rowKeys` Is the row keys to be deleted, you can call the `next` function to apply this deletion.
  	 */
  var handleConfirmDeleteRow: js.UndefOr[
    js.Function2[/* next */ js.Function0[Unit], /* rowKeys */ js.Array[Double | String], Unit]
  ] = js.undefined
  /**
  	 * Default is false. If true, the pagination list will be hidden when there is only one page.
  	 */
  var hidePageListOnlyOnePage: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Hide the dropdown list for size per page, default is false.
  	 */
  var hideSizePerPage: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Default is false, if true means you want to ignore any editable columns when creating the insert form.
  	 */
  var ignoreEditable: js.UndefOr[Boolean] = js.undefined
  /**
  	 * It's available to customize the insert button by configuring insertBtn in options props, insertBtn only
  	 * accept a function and a JSX returned value is necessary. This function will take one argument: onClick.
  	 *
  	 * The default `InsertButton` component is also exported as a component, so that you can use it as the base
  	 * for your custom component.
  	 */
  var insertBtn: js.UndefOr[
    js.Function1[
      /* onClick */ js.Function1[/* e */ ReactMouseEventFrom[org.scalajs.dom.raw.Element], Unit], 
      Element
    ]
  ] = js.undefined
  /**
  	 * Custom message to show when the InsertModal save fails validation.
  	 * Default message is 'Form validate errors, please checking!'
  	 */
  var insertFailIndicator: js.UndefOr[String] = js.undefined
  /**
  	 * You can customize everything in the insert modal via options.insertModal and we give you the event
  	 * callback, props and some informations: onModalClose, onSave, columns, validateState, ignoreEditable
  	 * @see https://github.com/AllenFang/react-bootstrap-table/blob/master/examples/js/custom/insert-modal/custom-insert-modal.js
  	 */
  var insertModal: js.UndefOr[
    js.Function5[
      /* onModalClose */ js.Function0[Unit], 
      /* onSave */ js.Function1[/* row */ TRow, Unit], 
      /* columns */ js.Array[InsertModalColumnDescription[TRow]], 
      /* validateState */ StringDictionary[String], 
      /* ignoreEditable */ Boolean, 
      Element
    ]
  ] = js.undefined
  /**
  	 * You can customize the body of the insert modal via options.insertModalBody and we give you the following
  	 * arguments: columns, validateState {[fieldname]: errorMsg}, ignoreEditable
  	 *
  	 * Note: There is no exported Insert Modal Body component - if you are customising this, you need to create your
  	 * own body component. That component needs to implement a `getFieldValue` method that returns the new row data. It
  	 * will be called by react-bootstrap-table when the save button is clicked in the insert modal window.
  	 */
  var insertModalBody: js.UndefOr[
    js.Function3[
      /* columns */ js.Array[InsertModalColumnDescription[TRow]], 
      /* validateState */ StringDictionary[String], 
      /* ignoreEditable */ Boolean, 
      Element
    ]
  ] = js.undefined
  /**
  	 * It's available to custom the footer of insert modal by configuring options.insertModalFooter. It only accepts
  	 * a function and a JSX returned value is necessary. This function will take two arguments: closeModal and save.
  	 *   `closeModal`: callback function to trigger closing the modal window.
  	 *   `save`: callback function to trigger saving the new row data.
  	 *
  	 * The default `InsertModalFooter` component is also exported as a component, so that you can use it as the base
  	 * for your own custom component.
  	 */
  var insertModalFooter: js.UndefOr[
    js.Function2[/* closeModal */ js.Function0[Unit], /* save */ js.Function0[Unit], Element]
  ] = js.undefined
  /**
  	 * It's available to custom the header of insert modal by configuring options.insertModalHeader. It only accepts
  	 * a function and a JSX returned value is necessary. This function will take two arguments: closeModal and save.
  	 *   `closeModal`: callback function to trigger closing the modal window.
  	 *   `save`: callback function to trigger saving the new row data.
  	 *
  	 * The default `InsertModalHeader` component is also exported as a component, so that you can use it as the base
  	 * for your own custom component.
  	 */
  var insertModalHeader: js.UndefOr[
    js.Function2[/* closeModal */ js.Function0[Unit], /* save */ js.Function0[Unit], Element]
  ] = js.undefined
  /**
  	 * Customize the text on the insert button.
  	 */
  var insertText: js.UndefOr[String] = js.undefined
  /**
  	 * Function to verify that a key being generated in the Insert Modal is a valid key.
  	 * If the key fails validation, return a string error message.
  	 * If the key is ok, return void.
  	 */
  var isValidKey: js.UndefOr[js.Function1[/* key */ Double | String, String | Unit]] = js.undefined
  /**
  	 * Flag to indicate that the table should keep the SizePerPage dropdown open if the table rerenders without any
  	 * user interaction.
  	 */
  var keepSizePerPageState: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Customize the text of last page button.
  	 * If using the default pagination panel, this should be a string to use for the button label.
  	 * If creating a custom pagination panel, this is passed to the panel and can be of any type desired.
  	 */
  var lastPage: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Customize the tooltip text shown when hovering over the lastPage button.
  	 */
  var lastPageTitle: js.UndefOr[String] = js.undefined
  /**
  	 * Customize the text of next page button.
  	 * If using the default pagination panel, this should be a string to use for the button label.
  	 * If creating a custom pagination panel, this is passed to the panel and can be of any type desired.
  	 */
  var nextPage: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Customize the tooltip text shown when hovering over the nextPage button.
  	 */
  var nextPageTitle: js.UndefOr[String] = js.undefined
  /**
  	 * Ability to disable the BOM in the exported CSV file.
  	 * BOM = prepend BOM for UTF-8 XML and text/ * types(including HTML) when saving the file.
  	 */
  var noAutoBOM: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Change the text displayed on the table if data is empty.
  	 */
  var noDataText: js.UndefOr[String | Element] = js.undefined
  /**
  	 * Assign a callback function which will be called when a row is added. This function
  	 * takes three arguments:
  	 *   `row`: which represents the new row data
  	 *   `colInfos`: Array of Column Descriptions for the table.
  	 *   `errorCallback`: Function to call to provide an async error message if the Add fails.
  	 * The function should either return a string immediately, or return false and then return a string through the
  	 * error callback function later.
  	 */
  var onAddRow: js.UndefOr[
    js.Function3[
      /* row */ TRow, 
      /* colInfo */ js.Array[ColumnDescription[TRow]], 
      /* errorCallback */ js.Function1[/* message */ String, Unit], 
      String | Boolean
    ]
  ] = js.undefined
  /**
  	 * Callback when the value in a cell has been modified. It accepts a function that takes three arguments:
  	 *   `row`: row that is being edited.
  	 *   `fieldName`: column dataField for the cell being edited.
  	 *   `value`: new value for the cell.
  	 * The function allows you to make further modifications to the cell value prior to it being saved. You need to
  	 * return the final cell value to use.
  	 */
  var onCellEdit: js.UndefOr[
    js.Function3[
      /* row */ TRow, 
      /* fieldName */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: TRow[string & keyof TRow] */ /* value */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: TRow[string & keyof TRow] */ js.Any
    ]
  ] = js.undefined
  /**
  	 * Assign a callback function which will be called when a row been deleted.
  	 * This function takes two arguments:
  	 *   `rowKeys`: keys for the rows to be deleted.
  	 *   `rows`: row data for the rows to be deleted.
  	 */
  var onDeleteRow: js.UndefOr[
    js.Function2[/* rowKeys */ js.Array[Double | String], /* rows */ js.Array[TRow], Unit]
  ] = js.undefined
  /**
  	 * Set a function to be called when expanding or collapsing a row. This function takes three arguments:
  	 *   `rowKey`: dataField key for the row that is expanding or collapsing.
  	 *   `isExpand`: True if the row is expanding, false if it is collapsing.
  	 *   `event`: The click event.
  	 */
  var onExpand: js.UndefOr[
    js.Function3[
      /* rowKey */ Double | String, 
      /* isExpand */ Boolean, 
      /* event */ ReactMouseEventFrom[org.scalajs.dom.raw.Element], 
      Unit
    ]
  ] = js.undefined
  /**
  	 * Assign a callback function which will be called when the export csv button is clicked.
  	 * In this function, you need to return an array of rows to be exported.
  	 */
  var onExportToCSV: js.UndefOr[js.Function0[js.Array[TRow]]] = js.undefined
  /**
  	 * Assign a callback function which will be called when a filter condition changes.
  	 * This function takes one argument: filterObj which is an object which take dataField
  	 * as object key and the value is the filter condition.
  	 */
  var onFilterChange: js.UndefOr[js.Function1[/* filterObject */ FilterData[_], Unit]] = js.undefined
  /**
  	 * Assign a callback function which will be called when mouse enters the table.
  	 */
  var onMouseEnter: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
  	 * Assign a callback function which will be called when mouse leaves the table.
  	 */
  var onMouseLeave: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
  	 * Assign a callback function which will be called after page changed.
  	 * This function takes two argument: page and sizePerPage.
  	 *   `page`: New page number
  	 *   `sizePerPage`: The number of rows to display in one page.
  	 */
  var onPageChange: js.UndefOr[js.Function2[/* page */ Double, /* sizePerPage */ Double, Unit]] = js.undefined
  /**
  	 * Assign a callback function which will be called after a row click.
  	 * This function takes four arguments:
  	 *   `row`: which is the row data that was clicked on.
  	 *   `columnIndex`: index of the column that was clicked on.
  	 *   `rowIndex`: index of the row that was clicked on.
  	 *   `event`: the click event.
  	 */
  var onRowClick: js.UndefOr[
    js.Function4[
      /* row */ TRow, 
      /* columnIndex */ Double, 
      /* rowIndex */ Double, 
      /* event */ ReactMouseEventFrom[org.scalajs.dom.raw.Element], 
      Unit
    ]
  ] = js.undefined
  /**
  	 * Assign a callback function which will be called after a row double click.
  	 * This function takes two arguments:
  	 *   `row`: which is the row data that was double clicked on.
  	 *   `event`: the double click event.
  	 */
  var onRowDoubleClick: js.UndefOr[
    js.Function2[/* row */ TRow, /* event */ ReactMouseEventFrom[org.scalajs.dom.raw.Element], Unit]
  ] = js.undefined
  /**
  	 * Assign a callback function which will be called when mouse leaves a row in table.
  	 * This function takes two arguments:
  	 *   `row`: the row data the mouse entered
  	 *   `e`: the mouse event data
  	 */
  var onRowMouseOut: js.UndefOr[
    js.Function2[/* row */ TRow, /* e */ ReactMouseEventFrom[org.scalajs.dom.raw.Element], Unit]
  ] = js.undefined
  /**
  	 * Assign a callback function which will be called when the mouse enters a row in table.
  	 * This function takes two arguments:
  	 *   `row`: the row data the mouse entered
  	 *   `e`: the mouse event data
  	 */
  var onRowMouseOver: js.UndefOr[
    js.Function2[/* row */ TRow, /* e */ ReactMouseEventFrom[org.scalajs.dom.raw.Element], Unit]
  ] = js.undefined
  /**
  	 * Assign a callback function which will be called when search text changes. This function takes
  	 * three argument:
  	 *   `searchText`: the text from the search field.
  	 *   `colInfos`: Array of column settings (e.g. filterFormatted, etc).
  	 *   `multiColumnSearch`: True if multiple column search is enabled.
  	 * In most cases, you only need to use searchText. This function usually used for remote searching.
  	 */
  var onSearchChange: js.UndefOr[
    js.Function3[
      /* searchText */ String, 
      /* colInfos */ js.Array[ColumnDescription[TRow]], 
      /* multiColumnSearch */ Boolean, 
      Unit
    ]
  ] = js.undefined
  /**
  	 * Assign a callback function which will be called after the size per page (number of rows per page)
  	 * has been changed.
  	 * This function takes one argument: sizePerPage.
  	 *   `sizePerPage`: The new number of rows to display in one page.
  	 */
  var onSizePerPageList: js.UndefOr[js.Function1[/* sizePerPage */ Double, Unit]] = js.undefined
  /**
  	 * Assign a callback function which will be called after triggering sorting.
  	 * This function takes two argument: `sortName` and `sortOrder`.
  	 *   `sortName`: The sort column name, or array of column names if multi-column sort is active.
  	 *   `sortOrder`: The sort ordering, or array of ordering if multi-column sort is active.
  	 */
  var onSortChange: js.UndefOr[
    js.Function2[
      (/* sortName */ js.Array[String]) | (/* sortName */ String), 
      (/* sortOrder */ js.Array[SortOrder]) | (/* sortOrder */ SortOrder), 
      Unit
    ]
  ] = js.undefined
  /**
  	 * Specify that only one row should be able to be expanded at the same time.
  	 */
  var onlyOneExpanding: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Accept a number, which means the page you want to show as default.
  	 */
  var page: js.UndefOr[Double] = js.undefined
  /**
  	 * Allows you to modify where to start counting the pages, e.g. to set the first page number to 0.
  	 * Default is 1.
  	 */
  var pageStartIndex: js.UndefOr[Double] = js.undefined
  /**
  	 * Function to customize all of components for pagination, including the sizePerPage dropdown and the
  	 * pagination list.
  	 */
  var paginationPanel: js.UndefOr[js.Function1[/* props */ PaginationPanelProps, Element]] = js.undefined
  /**
  	 * Location for the pagination panel to be displayed. Options are 'top' (above the table), 'bottom'
  	 * (below the table) and 'both' (above and below the table).
  	 */
  var paginationPosition: js.UndefOr[PaginationPostion] = js.undefined
  /**
  	 * Display a short text showing the total number of rows and current lines displayed,
  	 * default is false. If you want to customize this short text, you can give a function
  	 * and this function take three arguments:
  	 *  `start`: Current start index
  	 *  `to`: Current end index
  	 *  `total`: The total data volume.
  	 */
  var paginationShowsTotal: js.UndefOr[
    Boolean | (js.Function3[/* start */ Double, /* to */ Double, /* total */ Double, String | Element])
  ] = js.undefined
  /**
  	 * Number of page buttons to show on the pagination bar, default is 5.
  	 * i.e. previous 2 pages + current page + next two pages = 5.
  	 */
  var paginationSize: js.UndefOr[Double] = js.undefined
  /**
  	 * Customize the text of previouse page button.
  	 * If using the default pagination panel, this should be a string to use for the button label.
  	 * If creating a custom pagination panel, this is passed to the panel and can be of any type desired.
  	 */
  var prePage: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Customize the tooltip text shown when hovering over the prePage button.
  	 */
  var prePageTitle: js.UndefOr[String] = js.undefined
  /**
  	 * Default is true. If false, during printing the toolbar is hidden.
  	 */
  var printToolBar: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Customize the text on the save button in the insert modal.
  	 */
  var saveText: js.UndefOr[String] = js.undefined
  /**
  	 * A delay for trigger search after a keyup (millisecond)
  	 */
  var searchDelayTime: js.UndefOr[Double] = js.undefined
  /**
  	 * You can custom the search input field only by searchField in options props. searchField only accept a
  	 * function and a JSX returned value is necessary.
  	 *
  	 * The default `SearchField` component is also exported as a component, so that you can use it as the base for
  	 * your custom component.
  	 */
  var searchField: js.UndefOr[js.Function1[/* props */ SearchFieldProps, Element]] = js.undefined
  /**
  	 * You can custom the whole search panel(right side) by searchPanel in options props. searchPanel only accept
  	 * a function and a JSX returned value is necessary. This function will take one argument: props, that contains:
  	 *   `searchField`: the default search field component
  	 *   `clearBtn`: the default clear button component
  	 *   `defaultValue`: the default text for the search field
  	 *   `placeholder`: the default placeholder text for the search field
  	 *   `clearBtnClick`: the callback function to use when the clear search button is clicked
  	 *   `search`: the callback function for triggering the search, which takes the search text as an input.
  	 */
  var searchPanel: js.UndefOr[js.Function1[/* props */ SearchPanelProps, Element]] = js.undefined
  /**
  	 * It's available to custom select only toggle button by configuring showSelectedOnlyBtn in options props.
  	 * showSelectedOnlyBtn only accept a function and a JSX returned value is necessary.
  	 * This function will take two argument: onClick and showSelected.
  	 *
  	 * The default `ShowSelectedOnlyButton` component is also exported as a component, so that you can use it as
  	 * the base for your custom component.
  	 */
  var showSelectedOnlyBtn: js.UndefOr[
    js.Function2[
      /* onClick */ js.Function1[/* e */ ReactMouseEventFrom[org.scalajs.dom.raw.Element], Unit], 
      /* showSelected */ Boolean, 
      Element
    ]
  ] = js.undefined
  /**
  	 * Current chosen size per page.
  	 */
  var sizePerPage: js.UndefOr[Double] = js.undefined
  /**
  	 * Function to customize the sizePerPage dropdown.
  	 */
  var sizePerPageDropDown: js.UndefOr[js.Function1[/* props */ SizePerPageFunctionProps, Element]] = js.undefined
  /**
  	 * You can change the dropdown list for size per page if you enable pagination.
  	 * Default is [10, 25, 30, 50].
  	 */
  var sizePerPageList: js.UndefOr[SizePerPageList] = js.undefined
  /**
  	 * Set to false to disable sort indicators on header columns, default is true.
  	 */
  var sortIndicator: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Provide the name of the column that should be sorted by.
  	 * If multi-column sort is active, this is an array of columns.
  	 * If there should be no active sort, both sortName and sortOrder should be undefined.
  	 */
  var sortName: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
  	 * Specify whether the sort should be ascending or descending.
  	 * If multi-column sort is active, this is an array of sortOrder items.
  	 * If there should be no active sort, both sortName and sortOrder should be undefined.
  	 */
  var sortOrder: js.UndefOr[SortOrder | js.Array[SortOrder]] = js.undefined
  /**
  	 * ToolBar is the area on the top of table, it contain the search panel, buttons for data manipulation.
  	 * After v3.0.0, you can custom all the components in the ToolBar also itself too.
  	 * Give a toolBar in options props and toolBar only accept a function and a JSX returned value is necessary.
  	 */
  var toolBar: js.UndefOr[js.Function1[/* props */ ToolBarProps, Element]] = js.undefined
  /**
  	 * Flag to indicate whether there should be buttons for First and Last page.
  	 */
  var withFirstAndLast: js.UndefOr[Boolean] = js.undefined
  /**
  	 * If true, this hides the noDataText on the table when the tableis empty. Default is false.
  	 */
  var withoutNoDataText: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply[TRow /* <: js.Object */](
    afterColumnFilter: (/* filterConds */ js.Array[FilterData[js.Any]], /* result */ js.Array[TRow]) => Callback = null,
    afterDeleteRow: (/* rowKeys */ js.Array[Double | String], /* rows */ js.Array[TRow]) => Callback = null,
    afterInsertRow: /* row */ TRow => Callback = null,
    afterSearch: (/* search */ String, /* result */ js.Array[TRow]) => Callback = null,
    afterTableComplete: js.UndefOr[Callback] = js.undefined,
    alwaysShowAllBtns: js.UndefOr[Boolean] = js.undefined,
    beforeShowError: (/* type */ EditValidatorType, /* msg */ String, /* title */ String) => CallbackTo[Boolean | Unit] = null,
    btnGroup: /* props */ ButtonGroupProps => CallbackTo[Element] = null,
    clearSearch: js.UndefOr[Boolean] = js.undefined,
    clearSearchBtn: /* onClick */ js.Function1[/* e */ ReactMouseEventFrom[org.scalajs.dom.raw.Element], Unit] => CallbackTo[Element] = null,
    closeText: String = null,
    defaultSearch: String = null,
    defaultSortName: String = null,
    defaultSortOrder: SortOrder = null,
    deleteBtn: /* onClick */ js.Function1[/* e */ ReactMouseEventFrom[org.scalajs.dom.raw.Element], Unit] => CallbackTo[Element] = null,
    deleteText: String = null,
    expandAll: js.UndefOr[Boolean] = js.undefined,
    expandBodyClass: String | (js.Function3[/* row */ TRow, /* rowIndex */ Double, /* isExpanding */ Boolean, String]) = null,
    expandBy: ExpandBy = null,
    expandParentClass: String | (js.Function2[/* row */ TRow, /* rowIndex */ Double, String]) = null,
    expandRowBgColor: String = null,
    expanding: js.Array[Double | String] = null,
    exportCSVBtn: /* onClick */ js.Function1[/* e */ ReactMouseEventFrom[org.scalajs.dom.raw.Element], Unit] => CallbackTo[Element] = null,
    exportCSVSeparator: String = null,
    exportCSVText: String = null,
    firstPage: js.Any = null,
    firstPageTitle: String = null,
    handleConfirmDeleteRow: (/* next */ js.Function0[Unit], /* rowKeys */ js.Array[Double | String]) => Callback = null,
    hidePageListOnlyOnePage: js.UndefOr[Boolean] = js.undefined,
    hideSizePerPage: js.UndefOr[Boolean] = js.undefined,
    ignoreEditable: js.UndefOr[Boolean] = js.undefined,
    insertBtn: /* onClick */ js.Function1[/* e */ ReactMouseEventFrom[org.scalajs.dom.raw.Element], Unit] => CallbackTo[Element] = null,
    insertFailIndicator: String = null,
    insertModal: (/* onModalClose */ js.Function0[Unit], /* onSave */ js.Function1[/* row */ TRow, Unit], /* columns */ js.Array[InsertModalColumnDescription[TRow]], /* validateState */ StringDictionary[String], /* ignoreEditable */ Boolean) => CallbackTo[Element] = null,
    insertModalBody: (/* columns */ js.Array[InsertModalColumnDescription[TRow]], /* validateState */ StringDictionary[String], /* ignoreEditable */ Boolean) => CallbackTo[Element] = null,
    insertModalFooter: (/* closeModal */ js.Function0[Unit], /* save */ js.Function0[Unit]) => CallbackTo[Element] = null,
    insertModalHeader: (/* closeModal */ js.Function0[Unit], /* save */ js.Function0[Unit]) => CallbackTo[Element] = null,
    insertText: String = null,
    isValidKey: /* key */ Double | String => CallbackTo[String | Unit] = null,
    keepSizePerPageState: js.UndefOr[Boolean] = js.undefined,
    lastPage: js.Any = null,
    lastPageTitle: String = null,
    nextPage: js.Any = null,
    nextPageTitle: String = null,
    noAutoBOM: js.UndefOr[Boolean] = js.undefined,
    noDataText: String | Element = null,
    onAddRow: (/* row */ TRow, /* colInfo */ js.Array[ColumnDescription[TRow]], /* errorCallback */ js.Function1[/* message */ String, Unit]) => CallbackTo[String | Boolean] = null,
    onCellEdit: (/* row */ TRow, /* fieldName */ String, /* import warning: importer.ImportType#apply Failed type conversion: TRow[string & keyof TRow] */ /* value */ js.Any) => CallbackTo[
      /* import warning: importer.ImportType#apply Failed type conversion: TRow[string & keyof TRow] */ js.Any
    ] = null,
    onDeleteRow: (/* rowKeys */ js.Array[Double | String], /* rows */ js.Array[TRow]) => Callback = null,
    onExpand: (/* rowKey */ Double | String, /* isExpand */ Boolean, /* event */ ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => Callback = null,
    onExportToCSV: js.UndefOr[CallbackTo[js.Array[TRow]]] = js.undefined,
    onFilterChange: /* filterObject */ FilterData[js.Any] => Callback = null,
    onMouseEnter: js.UndefOr[Callback] = js.undefined,
    onMouseLeave: js.UndefOr[Callback] = js.undefined,
    onPageChange: (/* page */ Double, /* sizePerPage */ Double) => Callback = null,
    onRowClick: (/* row */ TRow, /* columnIndex */ Double, /* rowIndex */ Double, /* event */ ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => Callback = null,
    onRowDoubleClick: (/* row */ TRow, /* event */ ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => Callback = null,
    onRowMouseOut: (/* row */ TRow, /* e */ ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => Callback = null,
    onRowMouseOver: (/* row */ TRow, /* e */ ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => Callback = null,
    onSearchChange: (/* searchText */ String, /* colInfos */ js.Array[ColumnDescription[TRow]], /* multiColumnSearch */ Boolean) => Callback = null,
    onSizePerPageList: /* sizePerPage */ Double => Callback = null,
    onSortChange: ((/* sortName */ js.Array[String]) | (/* sortName */ String), (/* sortOrder */ js.Array[SortOrder]) | (/* sortOrder */ SortOrder)) => Callback = null,
    onlyOneExpanding: js.UndefOr[Boolean] = js.undefined,
    page: Int | Double = null,
    pageStartIndex: Int | Double = null,
    paginationPanel: /* props */ PaginationPanelProps => CallbackTo[Element] = null,
    paginationPosition: PaginationPostion = null,
    paginationShowsTotal: Boolean | (js.Function3[/* start */ Double, /* to */ Double, /* total */ Double, String | Element]) = null,
    paginationSize: Int | Double = null,
    prePage: js.Any = null,
    prePageTitle: String = null,
    printToolBar: js.UndefOr[Boolean] = js.undefined,
    saveText: String = null,
    searchDelayTime: Int | Double = null,
    searchField: /* props */ SearchFieldProps => CallbackTo[Element] = null,
    searchPanel: /* props */ SearchPanelProps => CallbackTo[Element] = null,
    showSelectedOnlyBtn: (/* onClick */ js.Function1[/* e */ ReactMouseEventFrom[org.scalajs.dom.raw.Element], Unit], /* showSelected */ Boolean) => CallbackTo[Element] = null,
    sizePerPage: Int | Double = null,
    sizePerPageDropDown: /* props */ SizePerPageFunctionProps => CallbackTo[Element] = null,
    sizePerPageList: SizePerPageList = null,
    sortIndicator: js.UndefOr[Boolean] = js.undefined,
    sortName: String | js.Array[String] = null,
    sortOrder: SortOrder | js.Array[SortOrder] = null,
    toolBar: /* props */ ToolBarProps => CallbackTo[Element] = null,
    withFirstAndLast: js.UndefOr[Boolean] = js.undefined,
    withoutNoDataText: js.UndefOr[Boolean] = js.undefined
  ): Options[TRow] = {
    val __obj = js.Dynamic.literal()
    if (afterColumnFilter != null) __obj.updateDynamic("afterColumnFilter")(js.Any.fromFunction2((t0: /* filterConds */ js.Array[typingsJapgolly.reactBootstrapTable.mod.FilterData[js.Any]], t1: /* result */ js.Array[TRow]) => afterColumnFilter(t0, t1).runNow()))
    if (afterDeleteRow != null) __obj.updateDynamic("afterDeleteRow")(js.Any.fromFunction2((t0: /* rowKeys */ js.Array[scala.Double | java.lang.String], t1: /* rows */ js.Array[TRow]) => afterDeleteRow(t0, t1).runNow()))
    if (afterInsertRow != null) __obj.updateDynamic("afterInsertRow")(js.Any.fromFunction1((t0: /* row */ TRow) => afterInsertRow(t0).runNow()))
    if (afterSearch != null) __obj.updateDynamic("afterSearch")(js.Any.fromFunction2((t0: /* search */ java.lang.String, t1: /* result */ js.Array[TRow]) => afterSearch(t0, t1).runNow()))
    afterTableComplete.foreach(p => __obj.updateDynamic("afterTableComplete")(p.toJsFn))
    if (!js.isUndefined(alwaysShowAllBtns)) __obj.updateDynamic("alwaysShowAllBtns")(alwaysShowAllBtns.asInstanceOf[js.Any])
    if (beforeShowError != null) __obj.updateDynamic("beforeShowError")(js.Any.fromFunction3((t0: /* type */ typingsJapgolly.reactBootstrapTable.mod.EditValidatorType, t1: /* msg */ java.lang.String, t2: /* title */ java.lang.String) => beforeShowError(t0, t1, t2).runNow()))
    if (btnGroup != null) __obj.updateDynamic("btnGroup")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactBootstrapTable.mod.ButtonGroupProps) => btnGroup(t0).runNow()))
    if (!js.isUndefined(clearSearch)) __obj.updateDynamic("clearSearch")(clearSearch.asInstanceOf[js.Any])
    if (clearSearchBtn != null) __obj.updateDynamic("clearSearchBtn")(js.Any.fromFunction1((t0: /* onClick */ js.Function1[
  /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element], 
  scala.Unit]) => clearSearchBtn(t0).runNow()))
    if (closeText != null) __obj.updateDynamic("closeText")(closeText.asInstanceOf[js.Any])
    if (defaultSearch != null) __obj.updateDynamic("defaultSearch")(defaultSearch.asInstanceOf[js.Any])
    if (defaultSortName != null) __obj.updateDynamic("defaultSortName")(defaultSortName.asInstanceOf[js.Any])
    if (defaultSortOrder != null) __obj.updateDynamic("defaultSortOrder")(defaultSortOrder.asInstanceOf[js.Any])
    if (deleteBtn != null) __obj.updateDynamic("deleteBtn")(js.Any.fromFunction1((t0: /* onClick */ js.Function1[
  /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element], 
  scala.Unit]) => deleteBtn(t0).runNow()))
    if (deleteText != null) __obj.updateDynamic("deleteText")(deleteText.asInstanceOf[js.Any])
    if (!js.isUndefined(expandAll)) __obj.updateDynamic("expandAll")(expandAll.asInstanceOf[js.Any])
    if (expandBodyClass != null) __obj.updateDynamic("expandBodyClass")(expandBodyClass.asInstanceOf[js.Any])
    if (expandBy != null) __obj.updateDynamic("expandBy")(expandBy.asInstanceOf[js.Any])
    if (expandParentClass != null) __obj.updateDynamic("expandParentClass")(expandParentClass.asInstanceOf[js.Any])
    if (expandRowBgColor != null) __obj.updateDynamic("expandRowBgColor")(expandRowBgColor.asInstanceOf[js.Any])
    if (expanding != null) __obj.updateDynamic("expanding")(expanding.asInstanceOf[js.Any])
    if (exportCSVBtn != null) __obj.updateDynamic("exportCSVBtn")(js.Any.fromFunction1((t0: /* onClick */ js.Function1[
  /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element], 
  scala.Unit]) => exportCSVBtn(t0).runNow()))
    if (exportCSVSeparator != null) __obj.updateDynamic("exportCSVSeparator")(exportCSVSeparator.asInstanceOf[js.Any])
    if (exportCSVText != null) __obj.updateDynamic("exportCSVText")(exportCSVText.asInstanceOf[js.Any])
    if (firstPage != null) __obj.updateDynamic("firstPage")(firstPage.asInstanceOf[js.Any])
    if (firstPageTitle != null) __obj.updateDynamic("firstPageTitle")(firstPageTitle.asInstanceOf[js.Any])
    if (handleConfirmDeleteRow != null) __obj.updateDynamic("handleConfirmDeleteRow")(js.Any.fromFunction2((t0: /* next */ js.Function0[scala.Unit], t1: /* rowKeys */ js.Array[scala.Double | java.lang.String]) => handleConfirmDeleteRow(t0, t1).runNow()))
    if (!js.isUndefined(hidePageListOnlyOnePage)) __obj.updateDynamic("hidePageListOnlyOnePage")(hidePageListOnlyOnePage.asInstanceOf[js.Any])
    if (!js.isUndefined(hideSizePerPage)) __obj.updateDynamic("hideSizePerPage")(hideSizePerPage.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreEditable)) __obj.updateDynamic("ignoreEditable")(ignoreEditable.asInstanceOf[js.Any])
    if (insertBtn != null) __obj.updateDynamic("insertBtn")(js.Any.fromFunction1((t0: /* onClick */ js.Function1[
  /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element], 
  scala.Unit]) => insertBtn(t0).runNow()))
    if (insertFailIndicator != null) __obj.updateDynamic("insertFailIndicator")(insertFailIndicator.asInstanceOf[js.Any])
    if (insertModal != null) __obj.updateDynamic("insertModal")(js.Any.fromFunction5((t0: /* onModalClose */ js.Function0[scala.Unit], t1: /* onSave */ js.Function1[/* row */ TRow, scala.Unit], t2: /* columns */ js.Array[typingsJapgolly.reactBootstrapTable.mod.InsertModalColumnDescription[TRow]], t3: /* validateState */ org.scalablytyped.runtime.StringDictionary[java.lang.String], t4: /* ignoreEditable */ scala.Boolean) => insertModal(t0, t1, t2, t3, t4).runNow()))
    if (insertModalBody != null) __obj.updateDynamic("insertModalBody")(js.Any.fromFunction3((t0: /* columns */ js.Array[typingsJapgolly.reactBootstrapTable.mod.InsertModalColumnDescription[TRow]], t1: /* validateState */ org.scalablytyped.runtime.StringDictionary[java.lang.String], t2: /* ignoreEditable */ scala.Boolean) => insertModalBody(t0, t1, t2).runNow()))
    if (insertModalFooter != null) __obj.updateDynamic("insertModalFooter")(js.Any.fromFunction2((t0: /* closeModal */ js.Function0[scala.Unit], t1: /* save */ js.Function0[scala.Unit]) => insertModalFooter(t0, t1).runNow()))
    if (insertModalHeader != null) __obj.updateDynamic("insertModalHeader")(js.Any.fromFunction2((t0: /* closeModal */ js.Function0[scala.Unit], t1: /* save */ js.Function0[scala.Unit]) => insertModalHeader(t0, t1).runNow()))
    if (insertText != null) __obj.updateDynamic("insertText")(insertText.asInstanceOf[js.Any])
    if (isValidKey != null) __obj.updateDynamic("isValidKey")(js.Any.fromFunction1((t0: /* key */ scala.Double | java.lang.String) => isValidKey(t0).runNow()))
    if (!js.isUndefined(keepSizePerPageState)) __obj.updateDynamic("keepSizePerPageState")(keepSizePerPageState.asInstanceOf[js.Any])
    if (lastPage != null) __obj.updateDynamic("lastPage")(lastPage.asInstanceOf[js.Any])
    if (lastPageTitle != null) __obj.updateDynamic("lastPageTitle")(lastPageTitle.asInstanceOf[js.Any])
    if (nextPage != null) __obj.updateDynamic("nextPage")(nextPage.asInstanceOf[js.Any])
    if (nextPageTitle != null) __obj.updateDynamic("nextPageTitle")(nextPageTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(noAutoBOM)) __obj.updateDynamic("noAutoBOM")(noAutoBOM.asInstanceOf[js.Any])
    if (noDataText != null) __obj.updateDynamic("noDataText")(noDataText.asInstanceOf[js.Any])
    if (onAddRow != null) __obj.updateDynamic("onAddRow")(js.Any.fromFunction3((t0: /* row */ TRow, t1: /* colInfo */ js.Array[typingsJapgolly.reactBootstrapTable.mod.ColumnDescription[TRow]], t2: /* errorCallback */ js.Function1[/* message */ java.lang.String, scala.Unit]) => onAddRow(t0, t1, t2).runNow()))
    if (onCellEdit != null) __obj.updateDynamic("onCellEdit")(js.Any.fromFunction3((t0: /* row */ TRow, t1: /* fieldName */ java.lang.String, t2: /* import warning: importer.ImportType#apply Failed type conversion: TRow[string & keyof TRow] */ /* value */ js.Any) => onCellEdit(t0, t1, t2).runNow()))
    if (onDeleteRow != null) __obj.updateDynamic("onDeleteRow")(js.Any.fromFunction2((t0: /* rowKeys */ js.Array[scala.Double | java.lang.String], t1: /* rows */ js.Array[TRow]) => onDeleteRow(t0, t1).runNow()))
    if (onExpand != null) __obj.updateDynamic("onExpand")(js.Any.fromFunction3((t0: /* rowKey */ scala.Double | java.lang.String, t1: /* isExpand */ scala.Boolean, t2: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => onExpand(t0, t1, t2).runNow()))
    onExportToCSV.foreach(p => __obj.updateDynamic("onExportToCSV")(p.toJsFn))
    if (onFilterChange != null) __obj.updateDynamic("onFilterChange")(js.Any.fromFunction1((t0: /* filterObject */ typingsJapgolly.reactBootstrapTable.mod.FilterData[js.Any]) => onFilterChange(t0).runNow()))
    onMouseEnter.foreach(p => __obj.updateDynamic("onMouseEnter")(p.toJsFn))
    onMouseLeave.foreach(p => __obj.updateDynamic("onMouseLeave")(p.toJsFn))
    if (onPageChange != null) __obj.updateDynamic("onPageChange")(js.Any.fromFunction2((t0: /* page */ scala.Double, t1: /* sizePerPage */ scala.Double) => onPageChange(t0, t1).runNow()))
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(js.Any.fromFunction4((t0: /* row */ TRow, t1: /* columnIndex */ scala.Double, t2: /* rowIndex */ scala.Double, t3: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => onRowClick(t0, t1, t2, t3).runNow()))
    if (onRowDoubleClick != null) __obj.updateDynamic("onRowDoubleClick")(js.Any.fromFunction2((t0: /* row */ TRow, t1: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => onRowDoubleClick(t0, t1).runNow()))
    if (onRowMouseOut != null) __obj.updateDynamic("onRowMouseOut")(js.Any.fromFunction2((t0: /* row */ TRow, t1: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => onRowMouseOut(t0, t1).runNow()))
    if (onRowMouseOver != null) __obj.updateDynamic("onRowMouseOver")(js.Any.fromFunction2((t0: /* row */ TRow, t1: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => onRowMouseOver(t0, t1).runNow()))
    if (onSearchChange != null) __obj.updateDynamic("onSearchChange")(js.Any.fromFunction3((t0: /* searchText */ java.lang.String, t1: /* colInfos */ js.Array[typingsJapgolly.reactBootstrapTable.mod.ColumnDescription[TRow]], t2: /* multiColumnSearch */ scala.Boolean) => onSearchChange(t0, t1, t2).runNow()))
    if (onSizePerPageList != null) __obj.updateDynamic("onSizePerPageList")(js.Any.fromFunction1((t0: /* sizePerPage */ scala.Double) => onSizePerPageList(t0).runNow()))
    if (onSortChange != null) __obj.updateDynamic("onSortChange")(js.Any.fromFunction2((t0: (/* sortName */ js.Array[java.lang.String]) | (/* sortName */ java.lang.String), t1: (/* sortOrder */ js.Array[typingsJapgolly.reactBootstrapTable.mod.SortOrder]) | (/* sortOrder */ typingsJapgolly.reactBootstrapTable.mod.SortOrder)) => onSortChange(t0, t1).runNow()))
    if (!js.isUndefined(onlyOneExpanding)) __obj.updateDynamic("onlyOneExpanding")(onlyOneExpanding.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (pageStartIndex != null) __obj.updateDynamic("pageStartIndex")(pageStartIndex.asInstanceOf[js.Any])
    if (paginationPanel != null) __obj.updateDynamic("paginationPanel")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactBootstrapTable.mod.PaginationPanelProps) => paginationPanel(t0).runNow()))
    if (paginationPosition != null) __obj.updateDynamic("paginationPosition")(paginationPosition.asInstanceOf[js.Any])
    if (paginationShowsTotal != null) __obj.updateDynamic("paginationShowsTotal")(paginationShowsTotal.asInstanceOf[js.Any])
    if (paginationSize != null) __obj.updateDynamic("paginationSize")(paginationSize.asInstanceOf[js.Any])
    if (prePage != null) __obj.updateDynamic("prePage")(prePage.asInstanceOf[js.Any])
    if (prePageTitle != null) __obj.updateDynamic("prePageTitle")(prePageTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(printToolBar)) __obj.updateDynamic("printToolBar")(printToolBar.asInstanceOf[js.Any])
    if (saveText != null) __obj.updateDynamic("saveText")(saveText.asInstanceOf[js.Any])
    if (searchDelayTime != null) __obj.updateDynamic("searchDelayTime")(searchDelayTime.asInstanceOf[js.Any])
    if (searchField != null) __obj.updateDynamic("searchField")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactBootstrapTable.mod.SearchFieldProps) => searchField(t0).runNow()))
    if (searchPanel != null) __obj.updateDynamic("searchPanel")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactBootstrapTable.mod.SearchPanelProps) => searchPanel(t0).runNow()))
    if (showSelectedOnlyBtn != null) __obj.updateDynamic("showSelectedOnlyBtn")(js.Any.fromFunction2((t0: /* onClick */ js.Function1[
  /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element], 
  scala.Unit], t1: /* showSelected */ scala.Boolean) => showSelectedOnlyBtn(t0, t1).runNow()))
    if (sizePerPage != null) __obj.updateDynamic("sizePerPage")(sizePerPage.asInstanceOf[js.Any])
    if (sizePerPageDropDown != null) __obj.updateDynamic("sizePerPageDropDown")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactBootstrapTable.mod.SizePerPageFunctionProps) => sizePerPageDropDown(t0).runNow()))
    if (sizePerPageList != null) __obj.updateDynamic("sizePerPageList")(sizePerPageList.asInstanceOf[js.Any])
    if (!js.isUndefined(sortIndicator)) __obj.updateDynamic("sortIndicator")(sortIndicator.asInstanceOf[js.Any])
    if (sortName != null) __obj.updateDynamic("sortName")(sortName.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (toolBar != null) __obj.updateDynamic("toolBar")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactBootstrapTable.mod.ToolBarProps) => toolBar(t0).runNow()))
    if (!js.isUndefined(withFirstAndLast)) __obj.updateDynamic("withFirstAndLast")(withFirstAndLast.asInstanceOf[js.Any])
    if (!js.isUndefined(withoutNoDataText)) __obj.updateDynamic("withoutNoDataText")(withoutNoDataText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[TRow]]
  }
}

