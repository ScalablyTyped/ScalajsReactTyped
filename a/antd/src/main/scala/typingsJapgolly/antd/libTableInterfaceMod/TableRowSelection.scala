package typingsJapgolly.antd.libTableInterfaceMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.Event
import typingsJapgolly.antd.anon.PartialOmitCheckboxPropsc
import typingsJapgolly.antd.anon.Type
import typingsJapgolly.antd.libTableHooksUseSelectionMod.INTERNAL_SELECTION_ITEM
import typingsJapgolly.rcTable.libInterfaceMod.FixedType
import typingsJapgolly.rcTable.libInterfaceMod.RenderedCell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableRowSelection[T] extends StObject {
  
  var checkStrictly: js.UndefOr[Boolean] = js.undefined
  
  var columnTitle: js.UndefOr[String | Node] = js.undefined
  
  var columnWidth: js.UndefOr[String | Double] = js.undefined
  
  var defaultSelectedRowKeys: js.UndefOr[js.Array[Key]] = js.undefined
  
  var fixed: js.UndefOr[FixedType] = js.undefined
  
  var getCheckboxProps: js.UndefOr[js.Function1[/* record */ T, PartialOmitCheckboxPropsc]] = js.undefined
  
  var hideSelectAll: js.UndefOr[Boolean] = js.undefined
  
  var onChange: js.UndefOr[
    js.Function3[
      /* selectedRowKeys */ js.Array[Key], 
      /* selectedRows */ js.Array[T], 
      /* info */ Type, 
      Unit
    ]
  ] = js.undefined
  
  var onSelect: js.UndefOr[SelectionSelectFn[T]] = js.undefined
  
  /** @deprecated This function is deprecated and should use `onChange` instead */
  var onSelectAll: js.UndefOr[
    js.Function3[
      /* selected */ Boolean, 
      /* selectedRows */ js.Array[T], 
      /* changeRows */ js.Array[T], 
      Unit
    ]
  ] = js.undefined
  
  /** @deprecated This function is deprecated and should use `onChange` instead */
  var onSelectInvert: js.UndefOr[js.Function1[/* selectedRowKeys */ js.Array[Key], Unit]] = js.undefined
  
  /** @deprecated This function is deprecated and should use `onChange` instead */
  var onSelectMultiple: js.UndefOr[
    js.Function3[
      /* selected */ Boolean, 
      /* selectedRows */ js.Array[T], 
      /* changeRows */ js.Array[T], 
      Unit
    ]
  ] = js.undefined
  
  /** @deprecated This function is deprecated and should use `onChange` instead */
  var onSelectNone: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** Keep the selection keys in list even the key not exist in `dataSource` anymore */
  var preserveSelectedRowKeys: js.UndefOr[Boolean] = js.undefined
  
  var renderCell: js.UndefOr[
    js.Function4[
      /* value */ Boolean, 
      /* record */ T, 
      /* index */ Double, 
      /* originNode */ Node, 
      Node | RenderedCell[T]
    ]
  ] = js.undefined
  
  var selectedRowKeys: js.UndefOr[js.Array[Key]] = js.undefined
  
  var selections: js.UndefOr[js.Array[INTERNAL_SELECTION_ITEM] | Boolean] = js.undefined
  
  var `type`: js.UndefOr[RowSelectionType] = js.undefined
}
object TableRowSelection {
  
  inline def apply[T](): TableRowSelection[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableRowSelection[T]]
  }
  
  extension [Self <: TableRowSelection[?], T](x: Self & TableRowSelection[T]) {
    
    inline def setCheckStrictly(value: Boolean): Self = StObject.set(x, "checkStrictly", value.asInstanceOf[js.Any])
    
    inline def setCheckStrictlyUndefined: Self = StObject.set(x, "checkStrictly", js.undefined)
    
    inline def setColumnTitle(value: String | Node): Self = StObject.set(x, "columnTitle", value.asInstanceOf[js.Any])
    
    inline def setColumnTitleNull: Self = StObject.set(x, "columnTitle", null)
    
    inline def setColumnTitleUndefined: Self = StObject.set(x, "columnTitle", js.undefined)
    
    inline def setColumnTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "columnTitle", js.Array(value*))
    
    inline def setColumnTitleVdomElement(value: VdomElement): Self = StObject.set(x, "columnTitle", value.rawElement.asInstanceOf[js.Any])
    
    inline def setColumnWidth(value: String | Double): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
    
    inline def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
    
    inline def setDefaultSelectedRowKeys(value: js.Array[Key]): Self = StObject.set(x, "defaultSelectedRowKeys", value.asInstanceOf[js.Any])
    
    inline def setDefaultSelectedRowKeysUndefined: Self = StObject.set(x, "defaultSelectedRowKeys", js.undefined)
    
    inline def setDefaultSelectedRowKeysVarargs(value: Key*): Self = StObject.set(x, "defaultSelectedRowKeys", js.Array(value*))
    
    inline def setFixed(value: FixedType): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
    
    inline def setGetCheckboxProps(value: /* record */ T => PartialOmitCheckboxPropsc): Self = StObject.set(x, "getCheckboxProps", js.Any.fromFunction1(value))
    
    inline def setGetCheckboxPropsUndefined: Self = StObject.set(x, "getCheckboxProps", js.undefined)
    
    inline def setHideSelectAll(value: Boolean): Self = StObject.set(x, "hideSelectAll", value.asInstanceOf[js.Any])
    
    inline def setHideSelectAllUndefined: Self = StObject.set(x, "hideSelectAll", js.undefined)
    
    inline def setOnChange(
      value: (/* selectedRowKeys */ js.Array[Key], /* selectedRows */ js.Array[T], /* info */ Type) => Callback
    ): Self = StObject.set(x, "onChange", js.Any.fromFunction3((t0: /* selectedRowKeys */ js.Array[Key], t1: /* selectedRows */ js.Array[T], t2: /* info */ Type) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnSelect(
      value: (T, /* selected */ Boolean, /* selectedRows */ js.Array[T], /* nativeEvent */ Event) => Callback
    ): Self = StObject.set(x, "onSelect", js.Any.fromFunction4((t0: T, t1: /* selected */ Boolean, t2: /* selectedRows */ js.Array[T], t3: /* nativeEvent */ Event) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setOnSelectAll(
      value: (/* selected */ Boolean, /* selectedRows */ js.Array[T], /* changeRows */ js.Array[T]) => Callback
    ): Self = StObject.set(x, "onSelectAll", js.Any.fromFunction3((t0: /* selected */ Boolean, t1: /* selectedRows */ js.Array[T], t2: /* changeRows */ js.Array[T]) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnSelectAllUndefined: Self = StObject.set(x, "onSelectAll", js.undefined)
    
    inline def setOnSelectInvert(value: /* selectedRowKeys */ js.Array[Key] => Callback): Self = StObject.set(x, "onSelectInvert", js.Any.fromFunction1((t0: /* selectedRowKeys */ js.Array[Key]) => value(t0).runNow()))
    
    inline def setOnSelectInvertUndefined: Self = StObject.set(x, "onSelectInvert", js.undefined)
    
    inline def setOnSelectMultiple(
      value: (/* selected */ Boolean, /* selectedRows */ js.Array[T], /* changeRows */ js.Array[T]) => Callback
    ): Self = StObject.set(x, "onSelectMultiple", js.Any.fromFunction3((t0: /* selected */ Boolean, t1: /* selectedRows */ js.Array[T], t2: /* changeRows */ js.Array[T]) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnSelectMultipleUndefined: Self = StObject.set(x, "onSelectMultiple", js.undefined)
    
    inline def setOnSelectNone(value: Callback): Self = StObject.set(x, "onSelectNone", value.toJsFn)
    
    inline def setOnSelectNoneUndefined: Self = StObject.set(x, "onSelectNone", js.undefined)
    
    inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    inline def setPreserveSelectedRowKeys(value: Boolean): Self = StObject.set(x, "preserveSelectedRowKeys", value.asInstanceOf[js.Any])
    
    inline def setPreserveSelectedRowKeysUndefined: Self = StObject.set(x, "preserveSelectedRowKeys", js.undefined)
    
    inline def setRenderCell(
      value: (/* value */ Boolean, /* record */ T, /* index */ Double, /* originNode */ Node) => Node | RenderedCell[T]
    ): Self = StObject.set(x, "renderCell", js.Any.fromFunction4(value))
    
    inline def setRenderCellUndefined: Self = StObject.set(x, "renderCell", js.undefined)
    
    inline def setSelectedRowKeys(value: js.Array[Key]): Self = StObject.set(x, "selectedRowKeys", value.asInstanceOf[js.Any])
    
    inline def setSelectedRowKeysUndefined: Self = StObject.set(x, "selectedRowKeys", js.undefined)
    
    inline def setSelectedRowKeysVarargs(value: Key*): Self = StObject.set(x, "selectedRowKeys", js.Array(value*))
    
    inline def setSelections(value: js.Array[INTERNAL_SELECTION_ITEM] | Boolean): Self = StObject.set(x, "selections", value.asInstanceOf[js.Any])
    
    inline def setSelectionsUndefined: Self = StObject.set(x, "selections", js.undefined)
    
    inline def setSelectionsVarargs(value: INTERNAL_SELECTION_ITEM*): Self = StObject.set(x, "selections", js.Array(value*))
    
    inline def setType(value: RowSelectionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
