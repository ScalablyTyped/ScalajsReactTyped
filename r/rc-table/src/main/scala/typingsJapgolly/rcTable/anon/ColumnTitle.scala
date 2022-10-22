package typingsJapgolly.rcTable.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.rcTable.libInterfaceMod.ColumnGroupType
import typingsJapgolly.rcTable.libInterfaceMod.ColumnType
import typingsJapgolly.rcTable.libInterfaceMod.ColumnsType
import typingsJapgolly.rcTable.libInterfaceMod.FixedType
import typingsJapgolly.rcTable.libInterfaceMod.GetRowKey
import typingsJapgolly.rcTable.libInterfaceMod.Key
import typingsJapgolly.rcTable.libInterfaceMod.RenderExpandIcon
import typingsJapgolly.rcTable.libInterfaceMod.RenderExpandIconProps
import typingsJapgolly.rcTable.libInterfaceMod.TriggerEventHandler
import typingsJapgolly.rcTable.rcTableStrings.ltr
import typingsJapgolly.rcTable.rcTableStrings.rtl
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnTitle[RecordType] extends StObject {
  
  var children: js.UndefOr[Node] = js.undefined
  
  var columnTitle: js.UndefOr[Node] = js.undefined
  
  var columnWidth: js.UndefOr[Double | String] = js.undefined
  
  var columns: js.UndefOr[ColumnsType[RecordType]] = js.undefined
  
  var direction: js.UndefOr[ltr | rtl] = js.undefined
  
  var expandIcon: js.UndefOr[RenderExpandIcon[RecordType]] = js.undefined
  
  var expandIconColumnIndex: js.UndefOr[Double] = js.undefined
  
  var expandRowByClick: js.UndefOr[Boolean] = js.undefined
  
  var expandable: Boolean
  
  var expandedKeys: Set[Key]
  
  var fixed: js.UndefOr[FixedType] = js.undefined
  
  var getRowKey: GetRowKey[RecordType]
  
  var onTriggerExpand: TriggerEventHandler[RecordType]
  
  var prefixCls: js.UndefOr[String] = js.undefined
  
  var rowExpandable: js.UndefOr[js.Function1[/* record */ RecordType, Boolean]] = js.undefined
}
object ColumnTitle {
  
  inline def apply[RecordType](
    expandable: Boolean,
    expandedKeys: Set[Key],
    getRowKey: (RecordType, /* index */ js.UndefOr[Double]) => Key,
    onTriggerExpand: (RecordType, /* event */ ReactMouseEventFrom[HTMLElement]) => Callback
  ): ColumnTitle[RecordType] = {
    val __obj = js.Dynamic.literal(expandable = expandable.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], getRowKey = js.Any.fromFunction2(getRowKey), onTriggerExpand = js.Any.fromFunction2((t0: RecordType, t1: /* event */ ReactMouseEventFrom[HTMLElement]) => (onTriggerExpand(t0, t1)).runNow()))
    __obj.asInstanceOf[ColumnTitle[RecordType]]
  }
  
  extension [Self <: ColumnTitle[?], RecordType](x: Self & ColumnTitle[RecordType]) {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setColumnTitle(value: VdomNode): Self = StObject.set(x, "columnTitle", value.rawNode.asInstanceOf[js.Any])
    
    inline def setColumnTitleNull: Self = StObject.set(x, "columnTitle", null)
    
    inline def setColumnTitleUndefined: Self = StObject.set(x, "columnTitle", js.undefined)
    
    inline def setColumnTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "columnTitle", js.Array(value*))
    
    inline def setColumnTitleVdomElement(value: VdomElement): Self = StObject.set(x, "columnTitle", value.rawElement.asInstanceOf[js.Any])
    
    inline def setColumnWidth(value: Double | String): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
    
    inline def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
    
    inline def setColumns(value: ColumnsType[RecordType]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: (ColumnGroupType[RecordType] | ColumnType[RecordType])*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setExpandIcon(value: /* props */ RenderExpandIconProps[RecordType] => Node): Self = StObject.set(x, "expandIcon", js.Any.fromFunction1(value))
    
    inline def setExpandIconColumnIndex(value: Double): Self = StObject.set(x, "expandIconColumnIndex", value.asInstanceOf[js.Any])
    
    inline def setExpandIconColumnIndexUndefined: Self = StObject.set(x, "expandIconColumnIndex", js.undefined)
    
    inline def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
    
    inline def setExpandRowByClick(value: Boolean): Self = StObject.set(x, "expandRowByClick", value.asInstanceOf[js.Any])
    
    inline def setExpandRowByClickUndefined: Self = StObject.set(x, "expandRowByClick", js.undefined)
    
    inline def setExpandable(value: Boolean): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
    
    inline def setExpandedKeys(value: Set[Key]): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
    
    inline def setFixed(value: FixedType): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
    
    inline def setGetRowKey(value: (RecordType, /* index */ js.UndefOr[Double]) => Key): Self = StObject.set(x, "getRowKey", js.Any.fromFunction2(value))
    
    inline def setOnTriggerExpand(value: (RecordType, /* event */ ReactMouseEventFrom[HTMLElement]) => Callback): Self = StObject.set(x, "onTriggerExpand", js.Any.fromFunction2((t0: RecordType, t1: /* event */ ReactMouseEventFrom[HTMLElement]) => (value(t0, t1)).runNow()))
    
    inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    
    inline def setRowExpandable(value: /* record */ RecordType => Boolean): Self = StObject.set(x, "rowExpandable", js.Any.fromFunction1(value))
    
    inline def setRowExpandableUndefined: Self = StObject.set(x, "rowExpandable", js.undefined)
  }
}
