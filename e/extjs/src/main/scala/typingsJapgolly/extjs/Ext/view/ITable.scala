package typingsJapgolly.extjs.Ext.view

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IComponent
import typingsJapgolly.extjs.Ext.data.IModel
import typingsJapgolly.extjs.Ext.data.IStore
import typingsJapgolly.extjs.Ext.grid.column.IColumn
import typingsJapgolly.extjs.Ext.grid.feature.IFeature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITable extends IView {
  /** [Method] Adds a CSS Class to a specific row
  		* @param rowInfo HTMLElement/String/Number/Ext.data.Model An HTMLElement, index or instance of a model representing this row
  		* @param cls String
  		*/
  var addRowCls: js.UndefOr[
    js.Function2[/* rowInfo */ js.UndefOr[js.Any], /* cls */ js.UndefOr[String], Unit]
  ] = js.undefined
  /** [Method] Sizes the passed header to fit the max content width
  		* @param header Ext.grid.column.Column/Number The header (or index of header) to auto size.
  		*/
  var autoSizeColumn: js.UndefOr[js.Function1[/* header */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Function which can be overridden which returns the data object passed to this DataView s template to render the whole
  		* @param records Object
  		* @param startIndex Object
  		* @returns Object[] An Array of data objects to be processed by a repeating XTemplate. May also contain named properties.
  		*/
  @JSName("collectData")
  var collectData_ITable: js.UndefOr[
    js.Function2[/* records */ js.UndefOr[js.Any], /* startIndex */ js.UndefOr[js.Any], Array]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var enableTextSelection: js.UndefOr[Boolean] = js.undefined
  /** [Method] Expands a particular header to fit the max content width
  		* @param header Object
  		*/
  var expandToFit: js.UndefOr[js.Function1[/* header */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (String) */
  var firstCls: js.UndefOr[String] = js.undefined
  /** [Method] Focuses a particular row and brings it into view
  		* @param row HTMLElement/String/Number/Ext.data.Model An HTMLElement template node, index of a template node, the id of a template node or the
  		* @param delay Boolean/Number Delay the focus this number of milliseconds (true for 10 milliseconds). record associated with the node.
  		*/
  var focusRow: js.UndefOr[js.Function2[/* row */ js.UndefOr[js.Any], /* delay */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Try to focus this component
  		* @param selectText Object
  		* @param delay Object
  		* @returns Ext.Component The focused Component. Usually this Component. Some Containers may delegate focus to a descendant Component (Windows can do this through their defaultFocus config option.
  		*/
  @JSName("focus")
  var focus_ITable: js.UndefOr[
    js.Function2[/* selectText */ js.UndefOr[js.Any], /* delay */ js.UndefOr[js.Any], IComponent]
  ] = js.undefined
  /** [Method] Returns a CSS selector which selects the outermost element s in this view  */
  var getBodySelector: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Returns a CSS selector which selects a particular column if the desired header is passed or a general cell selector
  		* @param header Ext.grid.column.Column The column for which to return the selector. If omitted, the general cell selector which matches ant cell will be returned.
  		*/
  var getCellSelector: js.UndefOr[js.Function1[/* header */ js.UndefOr[IColumn], Unit]] = js.undefined
  /** [Method] Returns a CSS selector which selects the element s which define the width of a column
  		* @param header Object
  		*/
  var getColumnSizerSelector: js.UndefOr[js.Function1[/* header */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Returns a CSS selector which selects a row which contains cells  */
  var getDataRowSelector: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Get a reference to a feature
  		* @param id String The id of the feature
  		* @returns Ext.grid.feature.Feature The feature. Undefined if not found
  		*/
  var getFeature: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], IFeature]] = js.undefined
  /** [Method] Returns a CSS selector which selects items of the view rendered by the rowTpl */
  var getItemSelector: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Returns a CSS selector which selects the element which contains record nodes  */
  var getNodeContainerSelector: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Returns the node given the passed Record or index or node
  		* @param nodeInfo HTMLElement/String/Number/Ext.data.Model The node or record
  		* @param dataRow Boolean true to return the data row (not the top level row if wrapped), false to return the top level row.
  		* @returns HTMLElement The node or null if it wasn't found
  		*/
  @JSName("getNode")
  var getNode_ITable: js.UndefOr[
    js.Function2[/* nodeInfo */ js.UndefOr[js.Any], /* dataRow */ js.UndefOr[Boolean], HTMLElement]
  ] = js.undefined
  /** [Method] Gets the current XY position of the component s underlying element
  		* @param record Object
  		* @param header Object
  		* @returns Number[] The XY position of the element (e.g., [100, 200])
  		*/
  @JSName("getPosition")
  var getPosition_ITable: js.UndefOr[
    js.Function2[/* record */ js.UndefOr[js.Any], /* header */ js.UndefOr[js.Any], Array]
  ] = js.undefined
  /** [Method] Override this function to apply custom CSS classes to rows during rendering
  		* @param record Ext.data.Model The record corresponding to the current row.
  		* @param index Number The row index.
  		* @param rowParams Object DEPRECATED. For row body use the getAdditionalData method of the rowbody feature.
  		* @param store Ext.data.Store The store this grid is bound to
  		* @returns String a CSS class name to add to the row.
  		*/
  var getRowClass: js.UndefOr[
    js.Function4[
      /* record */ js.UndefOr[IModel], 
      /* index */ js.UndefOr[Double], 
      /* rowParams */ js.UndefOr[js.Any], 
      /* store */ js.UndefOr[IStore], 
      String
    ]
  ] = js.undefined
  /** [Config Option] (String) */
  var lastCls: js.UndefOr[String] = js.undefined
  /** [Config Option] (Boolean) */
  var markDirty: js.UndefOr[Boolean] = js.undefined
  /** [Method] Removes a CSS Class from a specific row
  		* @param rowInfo HTMLElement/String/Number/Ext.data.Model An HTMLElement, index or instance of a model representing this row
  		* @param cls String
  		*/
  var removeRowCls: js.UndefOr[
    js.Function2[/* rowInfo */ js.UndefOr[js.Any], /* cls */ js.UndefOr[String], Unit]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var stripeRows: js.UndefOr[Boolean] = js.undefined
  /** [Method] Navigates from the passed record by the passed increment which may be ve or ve Skips hidden records
  		* @param startRec Ext.data.Model The Record to start from.
  		* @param distance Number The distance to move from the record. May be +ve or -ve.
  		*/
  var walkRecs: js.UndefOr[
    js.Function2[/* startRec */ js.UndefOr[IModel], /* distance */ js.UndefOr[Double], Unit]
  ] = js.undefined
  /** [Method] Increments the passed row index by the passed increment which may be ve or ve Skips hidden rows
  		* @param startRow Number The zero-based row index to start from.
  		* @param distance Number The distance to move the row by. May be +ve or -ve.
  		*/
  var walkRows: js.UndefOr[
    js.Function2[/* startRow */ js.UndefOr[Double], /* distance */ js.UndefOr[Double], Unit]
  ] = js.undefined
}

object ITable {
  @scala.inline
  def apply(
    IView: IView = null,
    addRowCls: (/* rowInfo */ js.UndefOr[js.Any], /* cls */ js.UndefOr[String]) => Callback = null,
    autoSizeColumn: /* header */ js.UndefOr[js.Any] => Callback = null,
    collectData: (/* records */ js.UndefOr[js.Any], /* startIndex */ js.UndefOr[js.Any]) => CallbackTo[Array] = null,
    enableTextSelection: js.UndefOr[Boolean] = js.undefined,
    expandToFit: /* header */ js.UndefOr[js.Any] => Callback = null,
    firstCls: String = null,
    focus: (/* selectText */ js.UndefOr[js.Any], /* delay */ js.UndefOr[js.Any]) => CallbackTo[IComponent] = null,
    focusRow: (/* row */ js.UndefOr[js.Any], /* delay */ js.UndefOr[js.Any]) => Callback = null,
    getBodySelector: js.UndefOr[Callback] = js.undefined,
    getCellSelector: /* header */ js.UndefOr[IColumn] => Callback = null,
    getColumnSizerSelector: /* header */ js.UndefOr[js.Any] => Callback = null,
    getDataRowSelector: js.UndefOr[Callback] = js.undefined,
    getFeature: /* id */ js.UndefOr[String] => CallbackTo[IFeature] = null,
    getItemSelector: js.UndefOr[Callback] = js.undefined,
    getNode: (/* nodeInfo */ js.UndefOr[js.Any], /* dataRow */ js.UndefOr[Boolean]) => CallbackTo[HTMLElement] = null,
    getNodeContainerSelector: js.UndefOr[Callback] = js.undefined,
    getPosition: (/* record */ js.UndefOr[js.Any], /* header */ js.UndefOr[js.Any]) => CallbackTo[Array] = null,
    getRowClass: (/* record */ js.UndefOr[IModel], /* index */ js.UndefOr[Double], /* rowParams */ js.UndefOr[js.Any], /* store */ js.UndefOr[IStore]) => CallbackTo[String] = null,
    lastCls: String = null,
    markDirty: js.UndefOr[Boolean] = js.undefined,
    removeRowCls: (/* rowInfo */ js.UndefOr[js.Any], /* cls */ js.UndefOr[String]) => Callback = null,
    stripeRows: js.UndefOr[Boolean] = js.undefined,
    walkRecs: (/* startRec */ js.UndefOr[IModel], /* distance */ js.UndefOr[Double]) => Callback = null,
    walkRows: (/* startRow */ js.UndefOr[Double], /* distance */ js.UndefOr[Double]) => Callback = null
  ): ITable = {
    val __obj = js.Dynamic.literal()
    if (IView != null) js.Dynamic.global.Object.assign(__obj, IView)
    if (addRowCls != null) __obj.updateDynamic("addRowCls")(js.Any.fromFunction2((t0: /* rowInfo */ js.UndefOr[js.Any], t1: /* cls */ js.UndefOr[java.lang.String]) => addRowCls(t0, t1).runNow()))
    if (autoSizeColumn != null) __obj.updateDynamic("autoSizeColumn")(js.Any.fromFunction1((t0: /* header */ js.UndefOr[js.Any]) => autoSizeColumn(t0).runNow()))
    if (collectData != null) __obj.updateDynamic("collectData")(js.Any.fromFunction2((t0: /* records */ js.UndefOr[js.Any], t1: /* startIndex */ js.UndefOr[js.Any]) => collectData(t0, t1).runNow()))
    if (!js.isUndefined(enableTextSelection)) __obj.updateDynamic("enableTextSelection")(enableTextSelection.asInstanceOf[js.Any])
    if (expandToFit != null) __obj.updateDynamic("expandToFit")(js.Any.fromFunction1((t0: /* header */ js.UndefOr[js.Any]) => expandToFit(t0).runNow()))
    if (firstCls != null) __obj.updateDynamic("firstCls")(firstCls.asInstanceOf[js.Any])
    if (focus != null) __obj.updateDynamic("focus")(js.Any.fromFunction2((t0: /* selectText */ js.UndefOr[js.Any], t1: /* delay */ js.UndefOr[js.Any]) => focus(t0, t1).runNow()))
    if (focusRow != null) __obj.updateDynamic("focusRow")(js.Any.fromFunction2((t0: /* row */ js.UndefOr[js.Any], t1: /* delay */ js.UndefOr[js.Any]) => focusRow(t0, t1).runNow()))
    getBodySelector.foreach(p => __obj.updateDynamic("getBodySelector")(p.toJsFn))
    if (getCellSelector != null) __obj.updateDynamic("getCellSelector")(js.Any.fromFunction1((t0: /* header */ js.UndefOr[typingsJapgolly.extjs.Ext.grid.column.IColumn]) => getCellSelector(t0).runNow()))
    if (getColumnSizerSelector != null) __obj.updateDynamic("getColumnSizerSelector")(js.Any.fromFunction1((t0: /* header */ js.UndefOr[js.Any]) => getColumnSizerSelector(t0).runNow()))
    getDataRowSelector.foreach(p => __obj.updateDynamic("getDataRowSelector")(p.toJsFn))
    if (getFeature != null) __obj.updateDynamic("getFeature")(js.Any.fromFunction1((t0: /* id */ js.UndefOr[java.lang.String]) => getFeature(t0).runNow()))
    getItemSelector.foreach(p => __obj.updateDynamic("getItemSelector")(p.toJsFn))
    if (getNode != null) __obj.updateDynamic("getNode")(js.Any.fromFunction2((t0: /* nodeInfo */ js.UndefOr[js.Any], t1: /* dataRow */ js.UndefOr[scala.Boolean]) => getNode(t0, t1).runNow()))
    getNodeContainerSelector.foreach(p => __obj.updateDynamic("getNodeContainerSelector")(p.toJsFn))
    if (getPosition != null) __obj.updateDynamic("getPosition")(js.Any.fromFunction2((t0: /* record */ js.UndefOr[js.Any], t1: /* header */ js.UndefOr[js.Any]) => getPosition(t0, t1).runNow()))
    if (getRowClass != null) __obj.updateDynamic("getRowClass")(js.Any.fromFunction4((t0: /* record */ js.UndefOr[typingsJapgolly.extjs.Ext.data.IModel], t1: /* index */ js.UndefOr[scala.Double], t2: /* rowParams */ js.UndefOr[js.Any], t3: /* store */ js.UndefOr[typingsJapgolly.extjs.Ext.data.IStore]) => getRowClass(t0, t1, t2, t3).runNow()))
    if (lastCls != null) __obj.updateDynamic("lastCls")(lastCls.asInstanceOf[js.Any])
    if (!js.isUndefined(markDirty)) __obj.updateDynamic("markDirty")(markDirty.asInstanceOf[js.Any])
    if (removeRowCls != null) __obj.updateDynamic("removeRowCls")(js.Any.fromFunction2((t0: /* rowInfo */ js.UndefOr[js.Any], t1: /* cls */ js.UndefOr[java.lang.String]) => removeRowCls(t0, t1).runNow()))
    if (!js.isUndefined(stripeRows)) __obj.updateDynamic("stripeRows")(stripeRows.asInstanceOf[js.Any])
    if (walkRecs != null) __obj.updateDynamic("walkRecs")(js.Any.fromFunction2((t0: /* startRec */ js.UndefOr[typingsJapgolly.extjs.Ext.data.IModel], t1: /* distance */ js.UndefOr[scala.Double]) => walkRecs(t0, t1).runNow()))
    if (walkRows != null) __obj.updateDynamic("walkRows")(js.Any.fromFunction2((t0: /* startRow */ js.UndefOr[scala.Double], t1: /* distance */ js.UndefOr[scala.Double]) => walkRows(t0, t1).runNow()))
    __obj.asInstanceOf[ITable]
  }
}

