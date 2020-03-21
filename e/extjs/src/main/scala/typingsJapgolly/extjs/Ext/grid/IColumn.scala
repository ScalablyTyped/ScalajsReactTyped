package typingsJapgolly.extjs.Ext.grid

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IComponent
import typingsJapgolly.extjs.Ext.IElement
import typingsJapgolly.extjs.Ext.grid.header.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColumn extends IContainer {
  /** [Method] private Inform the header container about the resize
  		* @param width Object
  		* @param height Object
  		* @param oldWidth Object
  		* @param oldHeight Object
  		*/
  @JSName("afterComponentLayout")
  var afterComponentLayout_IColumn: js.UndefOr[
    js.Function4[
      /* width */ js.UndefOr[js.Any], 
      /* height */ js.UndefOr[js.Any], 
      /* oldWidth */ js.UndefOr[js.Any], 
      /* oldHeight */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Config Option] (String) */
  var align: js.UndefOr[String] = js.undefined
  /** [Method] Sizes this Column to fit the max content width
  		* @param The Ext.grid.column.Column/Number header (or index of header) to auto size.
  		*/
  var autoSize: js.UndefOr[js.Function1[/* The */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Object[]) */
  var columns: js.UndefOr[Array] = js.undefined
  /** [Config Option] (String) */
  var dataIndex: js.UndefOr[String] = js.undefined
  /** [Method] When defined this will take precedence over the renderer config  */
  var defaultRenderer: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Function) */
  var editRenderer: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object/String) */
  var editor: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var emptyCellText: js.UndefOr[String] = js.undefined
  /** [Config Option] (Object/String) */
  var field: js.UndefOr[js.Any] = js.undefined
  /** [Method] Retrieves the editing field for editing associated with this header
  		* @param record Object The Model instance being edited.
  		* @param defaultField Object An object representing a default field to be created
  		* @returns any field
  		*/
  var getEditor: js.UndefOr[
    js.Function2[/* record */ js.UndefOr[js.Any], /* defaultField */ js.UndefOr[js.Any], _]
  ] = js.undefined
  /** [Method] Returns the index of this column only if this column is a base level Column
  		* @returns Number
  		*/
  var getIndex: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the parameter to sort upon when sorting this header
  		* @returns String
  		*/
  var getSortParam: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the index of this column in the list of visible columns only if this column is a base level Column
  		* @returns Number
  		*/
  var getVisibleIndex: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Config Option] (Boolean) */
  var groupable: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var header: js.UndefOr[String] = js.undefined
  /** [Method] Hides this Component setting it to invisible using the configured hideMode
  		* @param fromOwner Object
  		* @returns Ext.Component this
  		*/
  @JSName("hide")
  var hide_IColumn: js.UndefOr[js.Function1[/* fromOwner */ js.UndefOr[js.Any], IComponent]] = js.undefined
  /** [Config Option] (Boolean) */
  var hideable: js.UndefOr[Boolean] = js.undefined
  /** [Method] Initialized the renderData to be used when rendering the renderTpl
  		* @returns Object Object with keys and values that are going to be applied to the renderTpl
  		*/
  @JSName("initRenderData")
  var initRenderData_IColumn: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Property] (Boolean) */
  var isColumn: js.UndefOr[Boolean] = js.undefined
  /** [Property] (Boolean) */
  var isHeader: js.UndefOr[Boolean] = js.undefined
  /** [Method] Determines whether the UI should be allowed to offer an option to hide this column  */
  var isHideable: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Determines whether the UI should be allowed to offer an option to lock or unlock this column  */
  var isLockable: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var lockable: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var locked: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var menuDisabled: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var menuText: js.UndefOr[String] = js.undefined
  /** [Config Option] (Function/String) */
  var renderer: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  @JSName("resizable")
  var resizable_IColumn: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the form field to be used for editing
  		* @param field Object An object representing a field to be created. If no xtype is specified a 'textfield' is assumed.
  		*/
  var setEditor: js.UndefOr[js.Function1[/* field */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the header text for this Column
  		* @param text String The header to display on this Column.
  		*/
  var setText: js.UndefOr[js.Function1[/* text */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Shows this Component rendering it first if autoRender or floating are true
  		* @param fromOwner Object
  		* @param fromChild Object
  		* @returns Ext.Component this
  		*/
  @JSName("show")
  var show_IColumn: js.UndefOr[
    js.Function2[/* fromOwner */ js.UndefOr[js.Any], /* fromChild */ js.UndefOr[js.Any], IComponent]
  ] = js.undefined
  /** [Config Option] (String) */
  var tdCls: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var text: js.UndefOr[String] = js.undefined
  /** [Property] (Ext.Element) */
  var textEl: js.UndefOr[IElement] = js.undefined
  /** [Config Option] (String) */
  var tooltip: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var tooltipType: js.UndefOr[String] = js.undefined
  /** [Property] (Ext.Element) */
  var triggerEl: js.UndefOr[IElement] = js.undefined
}

object IColumn {
  @scala.inline
  def apply(
    IContainer: IContainer = null,
    afterComponentLayout: (/* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any], /* oldWidth */ js.UndefOr[js.Any], /* oldHeight */ js.UndefOr[js.Any]) => Callback = null,
    align: String = null,
    autoSize: /* The */ js.UndefOr[js.Any] => Callback = null,
    columns: Array = null,
    dataIndex: String = null,
    defaultRenderer: js.UndefOr[Callback] = js.undefined,
    editRenderer: js.Any = null,
    editor: js.Any = null,
    emptyCellText: String = null,
    field: js.Any = null,
    getEditor: (/* record */ js.UndefOr[js.Any], /* defaultField */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    getIndex: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getSortParam: js.UndefOr[CallbackTo[String]] = js.undefined,
    getVisibleIndex: js.UndefOr[CallbackTo[Double]] = js.undefined,
    groupable: js.UndefOr[Boolean] = js.undefined,
    header: String = null,
    hide: /* fromOwner */ js.UndefOr[js.Any] => CallbackTo[IComponent] = null,
    hideable: js.UndefOr[Boolean] = js.undefined,
    initRenderData: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    isColumn: js.UndefOr[Boolean] = js.undefined,
    isHeader: js.UndefOr[Boolean] = js.undefined,
    isHideable: js.UndefOr[Callback] = js.undefined,
    isLockable: js.UndefOr[Callback] = js.undefined,
    lockable: js.UndefOr[Boolean] = js.undefined,
    locked: js.UndefOr[Boolean] = js.undefined,
    menuDisabled: js.UndefOr[Boolean] = js.undefined,
    menuText: String = null,
    renderer: js.Any = null,
    resizable: js.UndefOr[Boolean] = js.undefined,
    scope: js.Any = null,
    setEditor: /* field */ js.UndefOr[js.Any] => Callback = null,
    setText: /* text */ js.UndefOr[String] => Callback = null,
    show: (/* fromOwner */ js.UndefOr[js.Any], /* fromChild */ js.UndefOr[js.Any]) => CallbackTo[IComponent] = null,
    tdCls: String = null,
    text: String = null,
    textEl: IElement = null,
    tooltip: String = null,
    tooltipType: String = null,
    triggerEl: IElement = null
  ): IColumn = {
    val __obj = js.Dynamic.literal()
    if (IContainer != null) js.Dynamic.global.Object.assign(__obj, IContainer)
    if (afterComponentLayout != null) __obj.updateDynamic("afterComponentLayout")(js.Any.fromFunction4((t0: /* width */ js.UndefOr[js.Any], t1: /* height */ js.UndefOr[js.Any], t2: /* oldWidth */ js.UndefOr[js.Any], t3: /* oldHeight */ js.UndefOr[js.Any]) => afterComponentLayout(t0, t1, t2, t3).runNow()))
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (autoSize != null) __obj.updateDynamic("autoSize")(js.Any.fromFunction1((t0: /* The */ js.UndefOr[js.Any]) => autoSize(t0).runNow()))
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (dataIndex != null) __obj.updateDynamic("dataIndex")(dataIndex.asInstanceOf[js.Any])
    defaultRenderer.foreach(p => __obj.updateDynamic("defaultRenderer")(p.toJsFn))
    if (editRenderer != null) __obj.updateDynamic("editRenderer")(editRenderer.asInstanceOf[js.Any])
    if (editor != null) __obj.updateDynamic("editor")(editor.asInstanceOf[js.Any])
    if (emptyCellText != null) __obj.updateDynamic("emptyCellText")(emptyCellText.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (getEditor != null) __obj.updateDynamic("getEditor")(js.Any.fromFunction2((t0: /* record */ js.UndefOr[js.Any], t1: /* defaultField */ js.UndefOr[js.Any]) => getEditor(t0, t1).runNow()))
    getIndex.foreach(p => __obj.updateDynamic("getIndex")(p.toJsFn))
    getSortParam.foreach(p => __obj.updateDynamic("getSortParam")(p.toJsFn))
    getVisibleIndex.foreach(p => __obj.updateDynamic("getVisibleIndex")(p.toJsFn))
    if (!js.isUndefined(groupable)) __obj.updateDynamic("groupable")(groupable.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction1((t0: /* fromOwner */ js.UndefOr[js.Any]) => hide(t0).runNow()))
    if (!js.isUndefined(hideable)) __obj.updateDynamic("hideable")(hideable.asInstanceOf[js.Any])
    initRenderData.foreach(p => __obj.updateDynamic("initRenderData")(p.toJsFn))
    if (!js.isUndefined(isColumn)) __obj.updateDynamic("isColumn")(isColumn.asInstanceOf[js.Any])
    if (!js.isUndefined(isHeader)) __obj.updateDynamic("isHeader")(isHeader.asInstanceOf[js.Any])
    isHideable.foreach(p => __obj.updateDynamic("isHideable")(p.toJsFn))
    isLockable.foreach(p => __obj.updateDynamic("isLockable")(p.toJsFn))
    if (!js.isUndefined(lockable)) __obj.updateDynamic("lockable")(lockable.asInstanceOf[js.Any])
    if (!js.isUndefined(locked)) __obj.updateDynamic("locked")(locked.asInstanceOf[js.Any])
    if (!js.isUndefined(menuDisabled)) __obj.updateDynamic("menuDisabled")(menuDisabled.asInstanceOf[js.Any])
    if (menuText != null) __obj.updateDynamic("menuText")(menuText.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (setEditor != null) __obj.updateDynamic("setEditor")(js.Any.fromFunction1((t0: /* field */ js.UndefOr[js.Any]) => setEditor(t0).runNow()))
    if (setText != null) __obj.updateDynamic("setText")(js.Any.fromFunction1((t0: /* text */ js.UndefOr[java.lang.String]) => setText(t0).runNow()))
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction2((t0: /* fromOwner */ js.UndefOr[js.Any], t1: /* fromChild */ js.UndefOr[js.Any]) => show(t0, t1).runNow()))
    if (tdCls != null) __obj.updateDynamic("tdCls")(tdCls.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textEl != null) __obj.updateDynamic("textEl")(textEl.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipType != null) __obj.updateDynamic("tooltipType")(tooltipType.asInstanceOf[js.Any])
    if (triggerEl != null) __obj.updateDynamic("triggerEl")(triggerEl.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumn]
  }
}

