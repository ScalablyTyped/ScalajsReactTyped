package typingsJapgolly.reactBootstrapTable.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactBootstrapTable.AnonGetElement
import typingsJapgolly.reactBootstrapTable.mod.CSVFieldType
import typingsJapgolly.reactBootstrapTable.mod.CustomAttrs
import typingsJapgolly.reactBootstrapTable.mod.CustomEditor
import typingsJapgolly.reactBootstrapTable.mod.DataAlignType
import typingsJapgolly.reactBootstrapTable.mod.EditValidatorObject
import typingsJapgolly.reactBootstrapTable.mod.Editable
import typingsJapgolly.reactBootstrapTable.mod.Filter
import typingsJapgolly.reactBootstrapTable.mod.SortOrder
import typingsJapgolly.reactBootstrapTable.mod.TableHeaderColumnProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableHeaderColumn {
  def apply(
    autoValue: Boolean | js.Function0[_] = null,
    caretRender: (/* direction */ SortOrder | Null, /* fieldName */ String) => CallbackTo[String | Element] = null,
    className: String | (js.Function4[
      /* cell */ js.Any, 
      /* row */ js.Any, 
      /* rowIndex */ Double, 
      /* columnIndex */ Double, 
      String
    ]) = null,
    colSpan: Int | Double = null,
    columnClassName: String | (js.Function4[
      /* cell */ js.Any, 
      /* row */ js.Any, 
      /* rowIndex */ Double, 
      /* columnIndex */ Double, 
      String
    ]) = null,
    columnTitle: Boolean | String | (js.Function4[
      /* cell */ js.Any, 
      /* row */ js.Any, 
      /* rowIndex */ Double, 
      /* colIndex */ Double, 
      String
    ]) = null,
    csvFieldType: CSVFieldType = null,
    csvFormat: (/* cell */ js.Any, /* row */ js.Any) => CallbackTo[String] = null,
    csvFormatExtraData: js.Any = null,
    csvHeader: String = null,
    customEditor: CustomEditor[_, _] = null,
    customInsertEditor: AnonGetElement = null,
    dataAlign: DataAlignType = null,
    dataField: String = null,
    dataFormat: (/* cell */ js.Any, /* row */ js.Any, /* formatExtraData */ js.Any, /* rowIndex */ Double) => CallbackTo[String | Element] = null,
    dataSort: js.UndefOr[Boolean] = js.undefined,
    defaultASC: js.UndefOr[Boolean] = js.undefined,
    editColumnClassName: String | (js.Function2[/* cell */ js.Any, /* row */ js.Any, String]) = null,
    editTdAttr: CustomAttrs = null,
    editable: Boolean | (Editable[_, _]) | (js.Function4[
      /* cell */ js.Any, 
      /* row */ js.Any, 
      /* rowIndex */ Double, 
      /* columnIndex */ Double, 
      Boolean | String | EditValidatorObject
    ]) = null,
    expandable: js.UndefOr[Boolean] = js.undefined,
    export: js.UndefOr[Boolean] = js.undefined,
    filter: Filter = null,
    filterFormatted: js.UndefOr[Boolean] = js.undefined,
    filterValue: (/* cell */ js.Any, /* row */ js.Any) => CallbackTo[js.Any] = null,
    formatExtraData: js.Any = null,
    headerAlign: DataAlignType = null,
    headerText: String = null,
    headerTitle: js.UndefOr[Boolean] = js.undefined,
    hidden: js.UndefOr[Boolean] = js.undefined,
    hiddenOnInsert: js.UndefOr[Boolean] = js.undefined,
    invalidEditColumnClassName: String | (js.Function2[/* cell */ js.Any, /* row */ js.Any, String]) = null,
    isKey: js.UndefOr[Boolean] = js.undefined,
    row: Int | Double = null,
    rowSpan: Int | Double = null,
    searchable: js.UndefOr[Boolean] = js.undefined,
    sortFunc: (/* a */ js.Object, /* b */ js.Object, /* order */ SortOrder, /* sortField */ String, /* extraData */ js.Any) => CallbackTo[Double] = null,
    sortFuncExtraData: js.Any = null,
    sortHeaderColumnClassName: String | (js.Function2[/* order */ SortOrder, /* dataField */ String, String]) = null,
    tdAttr: CustomAttrs = null,
    tdStyle: CSSProperties | (js.Function4[
      /* cell */ js.Any, 
      /* row */ js.Any, 
      /* rowIndex */ Double, 
      /* columnIndex */ Double, 
      CSSProperties
    ]) = null,
    thStyle: CSSProperties = null,
    width: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    TableHeaderColumnProps, 
    typingsJapgolly.reactBootstrapTable.mod.TableHeaderColumn, 
    Unit, 
    TableHeaderColumnProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (autoValue != null) __obj.updateDynamic("autoValue")(autoValue.asInstanceOf[js.Any])
    if (caretRender != null) __obj.updateDynamic("caretRender")(js.Any.fromFunction2((t0: /* direction */ typingsJapgolly.reactBootstrapTable.mod.SortOrder | scala.Null, t1: /* fieldName */ java.lang.String) => caretRender(t0, t1).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (colSpan != null) __obj.updateDynamic("colSpan")(colSpan.asInstanceOf[js.Any])
    if (columnClassName != null) __obj.updateDynamic("columnClassName")(columnClassName.asInstanceOf[js.Any])
    if (columnTitle != null) __obj.updateDynamic("columnTitle")(columnTitle.asInstanceOf[js.Any])
    if (csvFieldType != null) __obj.updateDynamic("csvFieldType")(csvFieldType.asInstanceOf[js.Any])
    if (csvFormat != null) __obj.updateDynamic("csvFormat")(js.Any.fromFunction2((t0: /* cell */ js.Any, t1: /* row */ js.Any) => csvFormat(t0, t1).runNow()))
    if (csvFormatExtraData != null) __obj.updateDynamic("csvFormatExtraData")(csvFormatExtraData.asInstanceOf[js.Any])
    if (csvHeader != null) __obj.updateDynamic("csvHeader")(csvHeader.asInstanceOf[js.Any])
    if (customEditor != null) __obj.updateDynamic("customEditor")(customEditor.asInstanceOf[js.Any])
    if (customInsertEditor != null) __obj.updateDynamic("customInsertEditor")(customInsertEditor.asInstanceOf[js.Any])
    if (dataAlign != null) __obj.updateDynamic("dataAlign")(dataAlign.asInstanceOf[js.Any])
    if (dataField != null) __obj.updateDynamic("dataField")(dataField.asInstanceOf[js.Any])
    if (dataFormat != null) __obj.updateDynamic("dataFormat")(js.Any.fromFunction4((t0: /* cell */ js.Any, t1: /* row */ js.Any, t2: /* formatExtraData */ js.Any, t3: /* rowIndex */ scala.Double) => dataFormat(t0, t1, t2, t3).runNow()))
    if (!js.isUndefined(dataSort)) __obj.updateDynamic("dataSort")(dataSort.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultASC)) __obj.updateDynamic("defaultASC")(defaultASC.asInstanceOf[js.Any])
    if (editColumnClassName != null) __obj.updateDynamic("editColumnClassName")(editColumnClassName.asInstanceOf[js.Any])
    if (editTdAttr != null) __obj.updateDynamic("editTdAttr")(editTdAttr.asInstanceOf[js.Any])
    if (editable != null) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (!js.isUndefined(expandable)) __obj.updateDynamic("expandable")(expandable.asInstanceOf[js.Any])
    if (!js.isUndefined(export)) __obj.updateDynamic("export")(export.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(filterFormatted)) __obj.updateDynamic("filterFormatted")(filterFormatted.asInstanceOf[js.Any])
    if (filterValue != null) __obj.updateDynamic("filterValue")(js.Any.fromFunction2((t0: /* cell */ js.Any, t1: /* row */ js.Any) => filterValue(t0, t1).runNow()))
    if (formatExtraData != null) __obj.updateDynamic("formatExtraData")(formatExtraData.asInstanceOf[js.Any])
    if (headerAlign != null) __obj.updateDynamic("headerAlign")(headerAlign.asInstanceOf[js.Any])
    if (headerText != null) __obj.updateDynamic("headerText")(headerText.asInstanceOf[js.Any])
    if (!js.isUndefined(headerTitle)) __obj.updateDynamic("headerTitle")(headerTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (!js.isUndefined(hiddenOnInsert)) __obj.updateDynamic("hiddenOnInsert")(hiddenOnInsert.asInstanceOf[js.Any])
    if (invalidEditColumnClassName != null) __obj.updateDynamic("invalidEditColumnClassName")(invalidEditColumnClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(isKey)) __obj.updateDynamic("isKey")(isKey.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (rowSpan != null) __obj.updateDynamic("rowSpan")(rowSpan.asInstanceOf[js.Any])
    if (!js.isUndefined(searchable)) __obj.updateDynamic("searchable")(searchable.asInstanceOf[js.Any])
    if (sortFunc != null) __obj.updateDynamic("sortFunc")(js.Any.fromFunction5((t0: /* a */ js.Object, t1: /* b */ js.Object, t2: /* order */ typingsJapgolly.reactBootstrapTable.mod.SortOrder, t3: /* sortField */ java.lang.String, t4: /* extraData */ js.Any) => sortFunc(t0, t1, t2, t3, t4).runNow()))
    if (sortFuncExtraData != null) __obj.updateDynamic("sortFuncExtraData")(sortFuncExtraData.asInstanceOf[js.Any])
    if (sortHeaderColumnClassName != null) __obj.updateDynamic("sortHeaderColumnClassName")(sortHeaderColumnClassName.asInstanceOf[js.Any])
    if (tdAttr != null) __obj.updateDynamic("tdAttr")(tdAttr.asInstanceOf[js.Any])
    if (tdStyle != null) __obj.updateDynamic("tdStyle")(tdStyle.asInstanceOf[js.Any])
    if (thStyle != null) __obj.updateDynamic("thStyle")(thStyle.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactBootstrapTable.mod.TableHeaderColumnProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactBootstrapTable.mod.TableHeaderColumn](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactBootstrapTable.mod.TableHeaderColumnProps])(children: _*)
  }
  @JSImport("react-bootstrap-table", "TableHeaderColumn")
  @js.native
  object componentImport extends js.Object
  
}

