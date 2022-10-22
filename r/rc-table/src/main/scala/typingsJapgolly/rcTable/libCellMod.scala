package typingsJapgolly.rcTable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLTableCellElement
import typingsJapgolly.rcTable.libInterfaceMod.AlignType
import typingsJapgolly.rcTable.libInterfaceMod.CellEllipsisType
import typingsJapgolly.rcTable.libInterfaceMod.CustomizeComponent
import typingsJapgolly.rcTable.libInterfaceMod.DataIndex
import typingsJapgolly.rcTable.libInterfaceMod.DefaultRecordType
import typingsJapgolly.rcTable.libInterfaceMod.RenderedCell
import typingsJapgolly.rcTable.rcTableBooleans.`false`
import typingsJapgolly.rcTable.rcTableStrings.body
import typingsJapgolly.rcTable.rcTableStrings.footer
import typingsJapgolly.rcTable.rcTableStrings.header
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.react.mod.TdHTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCellMod extends Shortcut {
  
  /** Inject hover data here, we still wish MemoCell keep simple `shouldCellUpdate` logic */
  @JSImport("rc-table/lib/Cell", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[CellProps[Any] & RefAttributes[Any]] = js.native
  
  /* Inlined std.Omit<rc-table.rc-table/lib/Cell.InternalCellProps<RecordType>, keyof rc-table.rc-table/lib/context/HoverContext.HoverContextProps> */
  trait CellProps[RecordType /* <: DefaultRecordType */] extends StObject {
    
    var additionalProps: js.UndefOr[TdHTMLAttributes[HTMLTableCellElement]] = js.undefined
    
    var align: js.UndefOr[AlignType] = js.undefined
    
    var allColsFixedLeft: js.UndefOr[Boolean] = js.undefined
    
    var appendNode: js.UndefOr[Node] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var colSpan: js.UndefOr[Double] = js.undefined
    
    var component: js.UndefOr[CustomizeComponent] = js.undefined
    
    var dataIndex: js.UndefOr[DataIndex] = js.undefined
    
    var ellipsis: js.UndefOr[CellEllipsisType] = js.undefined
    
    var expanded: js.UndefOr[Boolean] = js.undefined
    
    var firstFixLeft: js.UndefOr[Boolean] = js.undefined
    
    var firstFixRight: js.UndefOr[Boolean] = js.undefined
    
    var fixLeft: js.UndefOr[Double | `false`] = js.undefined
    
    var fixRight: js.UndefOr[Double | `false`] = js.undefined
    
    var hovering: js.UndefOr[Boolean] = js.undefined
    
    var index: js.UndefOr[Double] = js.undefined
    
    var isSticky: js.UndefOr[Boolean] = js.undefined
    
    var lastFixLeft: js.UndefOr[Boolean] = js.undefined
    
    var lastFixRight: js.UndefOr[Boolean] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var record: js.UndefOr[RecordType] = js.undefined
    
    var render: js.UndefOr[
        js.Function3[
          /* value */ Any, 
          /* record */ RecordType, 
          /* index */ Double, 
          Node | RenderedCell[RecordType]
        ]
      ] = js.undefined
    
    var renderIndex: js.UndefOr[Double] = js.undefined
    
    var rowSpan: js.UndefOr[Double] = js.undefined
    
    var rowType: js.UndefOr[header | body | footer] = js.undefined
    
    var shouldCellUpdate: js.UndefOr[js.Function2[/* record */ RecordType, /* prevRecord */ RecordType, Boolean]] = js.undefined
  }
  object CellProps {
    
    inline def apply[RecordType /* <: DefaultRecordType */](): CellProps[RecordType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellProps[RecordType]]
    }
    
    extension [Self <: CellProps[?], RecordType /* <: DefaultRecordType */](x: Self & CellProps[RecordType]) {
      
      inline def setAdditionalProps(value: TdHTMLAttributes[HTMLTableCellElement]): Self = StObject.set(x, "additionalProps", value.asInstanceOf[js.Any])
      
      inline def setAdditionalPropsUndefined: Self = StObject.set(x, "additionalProps", js.undefined)
      
      inline def setAlign(value: AlignType): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setAllColsFixedLeft(value: Boolean): Self = StObject.set(x, "allColsFixedLeft", value.asInstanceOf[js.Any])
      
      inline def setAllColsFixedLeftUndefined: Self = StObject.set(x, "allColsFixedLeft", js.undefined)
      
      inline def setAppendNode(value: VdomNode): Self = StObject.set(x, "appendNode", value.rawNode.asInstanceOf[js.Any])
      
      inline def setAppendNodeNull: Self = StObject.set(x, "appendNode", null)
      
      inline def setAppendNodeUndefined: Self = StObject.set(x, "appendNode", js.undefined)
      
      inline def setAppendNodeVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "appendNode", js.Array(value*))
      
      inline def setAppendNodeVdomElement(value: VdomElement): Self = StObject.set(x, "appendNode", value.rawElement.asInstanceOf[js.Any])
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
      
      inline def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
      
      inline def setComponent(value: CustomizeComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setDataIndex(value: DataIndex): Self = StObject.set(x, "dataIndex", value.asInstanceOf[js.Any])
      
      inline def setDataIndexUndefined: Self = StObject.set(x, "dataIndex", js.undefined)
      
      inline def setDataIndexVarargs(value: (String | Double)*): Self = StObject.set(x, "dataIndex", js.Array(value*))
      
      inline def setEllipsis(value: CellEllipsisType): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
      
      inline def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      inline def setFirstFixLeft(value: Boolean): Self = StObject.set(x, "firstFixLeft", value.asInstanceOf[js.Any])
      
      inline def setFirstFixLeftUndefined: Self = StObject.set(x, "firstFixLeft", js.undefined)
      
      inline def setFirstFixRight(value: Boolean): Self = StObject.set(x, "firstFixRight", value.asInstanceOf[js.Any])
      
      inline def setFirstFixRightUndefined: Self = StObject.set(x, "firstFixRight", js.undefined)
      
      inline def setFixLeft(value: Double | `false`): Self = StObject.set(x, "fixLeft", value.asInstanceOf[js.Any])
      
      inline def setFixLeftUndefined: Self = StObject.set(x, "fixLeft", js.undefined)
      
      inline def setFixRight(value: Double | `false`): Self = StObject.set(x, "fixRight", value.asInstanceOf[js.Any])
      
      inline def setFixRightUndefined: Self = StObject.set(x, "fixRight", js.undefined)
      
      inline def setHovering(value: Boolean): Self = StObject.set(x, "hovering", value.asInstanceOf[js.Any])
      
      inline def setHoveringUndefined: Self = StObject.set(x, "hovering", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setIsSticky(value: Boolean): Self = StObject.set(x, "isSticky", value.asInstanceOf[js.Any])
      
      inline def setIsStickyUndefined: Self = StObject.set(x, "isSticky", js.undefined)
      
      inline def setLastFixLeft(value: Boolean): Self = StObject.set(x, "lastFixLeft", value.asInstanceOf[js.Any])
      
      inline def setLastFixLeftUndefined: Self = StObject.set(x, "lastFixLeft", js.undefined)
      
      inline def setLastFixRight(value: Boolean): Self = StObject.set(x, "lastFixRight", value.asInstanceOf[js.Any])
      
      inline def setLastFixRightUndefined: Self = StObject.set(x, "lastFixRight", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setRecord(value: RecordType): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
      
      inline def setRecordUndefined: Self = StObject.set(x, "record", js.undefined)
      
      inline def setRender(
        value: (/* value */ Any, /* record */ RecordType, /* index */ Double) => Node | RenderedCell[RecordType]
      ): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
      
      inline def setRenderIndex(value: Double): Self = StObject.set(x, "renderIndex", value.asInstanceOf[js.Any])
      
      inline def setRenderIndexUndefined: Self = StObject.set(x, "renderIndex", js.undefined)
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
      
      inline def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
      
      inline def setRowType(value: header | body | footer): Self = StObject.set(x, "rowType", value.asInstanceOf[js.Any])
      
      inline def setRowTypeUndefined: Self = StObject.set(x, "rowType", js.undefined)
      
      inline def setShouldCellUpdate(value: (/* record */ RecordType, /* prevRecord */ RecordType) => Boolean): Self = StObject.set(x, "shouldCellUpdate", js.Any.fromFunction2(value))
      
      inline def setShouldCellUpdateUndefined: Self = StObject.set(x, "shouldCellUpdate", js.undefined)
    }
  }
  
  /* Inlined parent std.Pick<rc-table.rc-table/lib/context/HoverContext.HoverContextProps, 'onHover'> */
  trait InternalCellProps[RecordType /* <: DefaultRecordType */] extends StObject {
    
    var additionalProps: js.UndefOr[TdHTMLAttributes[HTMLTableCellElement]] = js.undefined
    
    var align: js.UndefOr[AlignType] = js.undefined
    
    var allColsFixedLeft: js.UndefOr[Boolean] = js.undefined
    
    /** @private Used for `expandable` with nest tree */
    var appendNode: js.UndefOr[Node] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var colSpan: js.UndefOr[Double] = js.undefined
    
    var component: js.UndefOr[CustomizeComponent] = js.undefined
    
    var dataIndex: js.UndefOr[DataIndex] = js.undefined
    
    var ellipsis: js.UndefOr[CellEllipsisType] = js.undefined
    
    /** @private Fixed for user use `shouldCellUpdate` which block the render */
    var expanded: js.UndefOr[Boolean] = js.undefined
    
    var firstFixLeft: js.UndefOr[Boolean] = js.undefined
    
    var firstFixRight: js.UndefOr[Boolean] = js.undefined
    
    var fixLeft: js.UndefOr[Double | `false`] = js.undefined
    
    var fixRight: js.UndefOr[Double | `false`] = js.undefined
    
    var hovering: js.UndefOr[Boolean] = js.undefined
    
    /** `column` index is the real show rowIndex */
    var index: js.UndefOr[Double] = js.undefined
    
    var isSticky: js.UndefOr[Boolean] = js.undefined
    
    var lastFixLeft: js.UndefOr[Boolean] = js.undefined
    
    var lastFixRight: js.UndefOr[Boolean] = js.undefined
    
    var onHover: js.Function2[/* start */ Double, /* end */ Double, Unit]
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var record: js.UndefOr[RecordType] = js.undefined
    
    var render: js.UndefOr[
        js.Function3[
          /* value */ Any, 
          /* record */ RecordType, 
          /* index */ Double, 
          Node | RenderedCell[RecordType]
        ]
      ] = js.undefined
    
    /** the index of the record. For the render(value, record, renderIndex) */
    var renderIndex: js.UndefOr[Double] = js.undefined
    
    var rowSpan: js.UndefOr[Double] = js.undefined
    
    var rowType: js.UndefOr[header | body | footer] = js.undefined
    
    var shouldCellUpdate: js.UndefOr[js.Function2[/* record */ RecordType, /* prevRecord */ RecordType, Boolean]] = js.undefined
  }
  object InternalCellProps {
    
    inline def apply[RecordType /* <: DefaultRecordType */](onHover: (/* start */ Double, /* end */ Double) => Callback): InternalCellProps[RecordType] = {
      val __obj = js.Dynamic.literal(onHover = js.Any.fromFunction2((t0: /* start */ Double, t1: /* end */ Double) => (onHover(t0, t1)).runNow()))
      __obj.asInstanceOf[InternalCellProps[RecordType]]
    }
    
    extension [Self <: InternalCellProps[?], RecordType /* <: DefaultRecordType */](x: Self & InternalCellProps[RecordType]) {
      
      inline def setAdditionalProps(value: TdHTMLAttributes[HTMLTableCellElement]): Self = StObject.set(x, "additionalProps", value.asInstanceOf[js.Any])
      
      inline def setAdditionalPropsUndefined: Self = StObject.set(x, "additionalProps", js.undefined)
      
      inline def setAlign(value: AlignType): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setAllColsFixedLeft(value: Boolean): Self = StObject.set(x, "allColsFixedLeft", value.asInstanceOf[js.Any])
      
      inline def setAllColsFixedLeftUndefined: Self = StObject.set(x, "allColsFixedLeft", js.undefined)
      
      inline def setAppendNode(value: VdomNode): Self = StObject.set(x, "appendNode", value.rawNode.asInstanceOf[js.Any])
      
      inline def setAppendNodeNull: Self = StObject.set(x, "appendNode", null)
      
      inline def setAppendNodeUndefined: Self = StObject.set(x, "appendNode", js.undefined)
      
      inline def setAppendNodeVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "appendNode", js.Array(value*))
      
      inline def setAppendNodeVdomElement(value: VdomElement): Self = StObject.set(x, "appendNode", value.rawElement.asInstanceOf[js.Any])
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
      
      inline def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
      
      inline def setComponent(value: CustomizeComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setDataIndex(value: DataIndex): Self = StObject.set(x, "dataIndex", value.asInstanceOf[js.Any])
      
      inline def setDataIndexUndefined: Self = StObject.set(x, "dataIndex", js.undefined)
      
      inline def setDataIndexVarargs(value: (String | Double)*): Self = StObject.set(x, "dataIndex", js.Array(value*))
      
      inline def setEllipsis(value: CellEllipsisType): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
      
      inline def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      inline def setFirstFixLeft(value: Boolean): Self = StObject.set(x, "firstFixLeft", value.asInstanceOf[js.Any])
      
      inline def setFirstFixLeftUndefined: Self = StObject.set(x, "firstFixLeft", js.undefined)
      
      inline def setFirstFixRight(value: Boolean): Self = StObject.set(x, "firstFixRight", value.asInstanceOf[js.Any])
      
      inline def setFirstFixRightUndefined: Self = StObject.set(x, "firstFixRight", js.undefined)
      
      inline def setFixLeft(value: Double | `false`): Self = StObject.set(x, "fixLeft", value.asInstanceOf[js.Any])
      
      inline def setFixLeftUndefined: Self = StObject.set(x, "fixLeft", js.undefined)
      
      inline def setFixRight(value: Double | `false`): Self = StObject.set(x, "fixRight", value.asInstanceOf[js.Any])
      
      inline def setFixRightUndefined: Self = StObject.set(x, "fixRight", js.undefined)
      
      inline def setHovering(value: Boolean): Self = StObject.set(x, "hovering", value.asInstanceOf[js.Any])
      
      inline def setHoveringUndefined: Self = StObject.set(x, "hovering", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setIsSticky(value: Boolean): Self = StObject.set(x, "isSticky", value.asInstanceOf[js.Any])
      
      inline def setIsStickyUndefined: Self = StObject.set(x, "isSticky", js.undefined)
      
      inline def setLastFixLeft(value: Boolean): Self = StObject.set(x, "lastFixLeft", value.asInstanceOf[js.Any])
      
      inline def setLastFixLeftUndefined: Self = StObject.set(x, "lastFixLeft", js.undefined)
      
      inline def setLastFixRight(value: Boolean): Self = StObject.set(x, "lastFixRight", value.asInstanceOf[js.Any])
      
      inline def setLastFixRightUndefined: Self = StObject.set(x, "lastFixRight", js.undefined)
      
      inline def setOnHover(value: (/* start */ Double, /* end */ Double) => Callback): Self = StObject.set(x, "onHover", js.Any.fromFunction2((t0: /* start */ Double, t1: /* end */ Double) => (value(t0, t1)).runNow()))
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setRecord(value: RecordType): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
      
      inline def setRecordUndefined: Self = StObject.set(x, "record", js.undefined)
      
      inline def setRender(
        value: (/* value */ Any, /* record */ RecordType, /* index */ Double) => Node | RenderedCell[RecordType]
      ): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
      
      inline def setRenderIndex(value: Double): Self = StObject.set(x, "renderIndex", value.asInstanceOf[js.Any])
      
      inline def setRenderIndexUndefined: Self = StObject.set(x, "renderIndex", js.undefined)
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
      
      inline def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
      
      inline def setRowType(value: header | body | footer): Self = StObject.set(x, "rowType", value.asInstanceOf[js.Any])
      
      inline def setRowTypeUndefined: Self = StObject.set(x, "rowType", js.undefined)
      
      inline def setShouldCellUpdate(value: (/* record */ RecordType, /* prevRecord */ RecordType) => Boolean): Self = StObject.set(x, "shouldCellUpdate", js.Any.fromFunction2(value))
      
      inline def setShouldCellUpdateUndefined: Self = StObject.set(x, "shouldCellUpdate", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[CellProps[Any] & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libCellMod.foo` */
  override def _to: ForwardRefExoticComponent[CellProps[Any] & RefAttributes[Any]] = default
}
