package typingsJapgolly.grommet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.EventTarget
import org.scalajs.dom.HTMLTableRowElement
import typingsJapgolly.grommet.anon.Aggregate
import typingsJapgolly.grommet.anon.Body
import typingsJapgolly.grommet.anon.Border
import typingsJapgolly.grommet.anon.ColorError
import typingsJapgolly.grommet.anon.Count
import typingsJapgolly.grommet.anon.Direction
import typingsJapgolly.grommet.anon.DirectionProperty
import typingsJapgolly.grommet.anon.Expand
import typingsJapgolly.grommet.anon.Page
import typingsJapgolly.grommet.es6ComponentsPaginationMod.PaginationType
import typingsJapgolly.grommet.es6UtilsMod.A11yTitleType
import typingsJapgolly.grommet.es6UtilsMod.AlignSelfType
import typingsJapgolly.grommet.es6UtilsMod.BackgroundType
import typingsJapgolly.grommet.es6UtilsMod.BorderType
import typingsJapgolly.grommet.es6UtilsMod.GridAreaType
import typingsJapgolly.grommet.es6UtilsMod.MarginType
import typingsJapgolly.grommet.es6UtilsMod.PadType
import typingsJapgolly.grommet.grommetStrings.avg
import typingsJapgolly.grommet.grommetStrings.center
import typingsJapgolly.grommet.grommetStrings.end
import typingsJapgolly.grommet.grommetStrings.footer
import typingsJapgolly.grommet.grommetStrings.header
import typingsJapgolly.grommet.grommetStrings.horizontal
import typingsJapgolly.grommet.grommetStrings.large
import typingsJapgolly.grommet.grommetStrings.max
import typingsJapgolly.grommet.grommetStrings.medium
import typingsJapgolly.grommet.grommetStrings.min
import typingsJapgolly.grommet.grommetStrings.select
import typingsJapgolly.grommet.grommetStrings.small
import typingsJapgolly.grommet.grommetStrings.start
import typingsJapgolly.grommet.grommetStrings.sum
import typingsJapgolly.grommet.grommetStrings.vertical
import typingsJapgolly.grommet.grommetStrings.xlarge
import typingsJapgolly.react.mod.AbstractView
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.KeyboardEvent
import typingsJapgolly.react.mod.MouseEvent
import typingsJapgolly.react.mod.NativeMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es6ComponentsDataTableMod {
  
  @JSImport("grommet/es6/components/DataTable", "DataTable")
  @js.native
  open class DataTable[TRowType] protected ()
    extends Component[DataTableExtendedProps[TRowType], js.Object, Any] {
    def this(props: DataTableExtendedProps[TRowType]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DataTableExtendedProps[TRowType], context: Any) = this()
  }
  
  trait ColumnConfig[TRowType] extends StObject {
    
    var aggregate: js.UndefOr[avg | max | min | sum] = js.undefined
    
    var align: js.UndefOr[center | start | end] = js.undefined
    
    var footer: js.UndefOr[Node | Aggregate] = js.undefined
    
    var header: js.UndefOr[String | Node | Aggregate] = js.undefined
    
    var pin: js.UndefOr[Boolean] = js.undefined
    
    var plain: js.UndefOr[Boolean] = js.undefined
    
    var primary: js.UndefOr[Boolean] = js.undefined
    
    var property: String
    
    var render: js.UndefOr[js.Function1[/* datum */ TRowType, Node]] = js.undefined
    
    var search: js.UndefOr[Boolean] = js.undefined
    
    var show: js.UndefOr[Double | Page] = js.undefined
    
    var size: js.UndefOr[ColumnSizeType | String] = js.undefined
    
    var sortable: js.UndefOr[Boolean] = js.undefined
    
    var units: js.UndefOr[String] = js.undefined
    
    var verticalAlign: js.UndefOr[VerticalAlignType] = js.undefined
  }
  object ColumnConfig {
    
    inline def apply[TRowType](property: String): ColumnConfig[TRowType] = {
      val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnConfig[TRowType]]
    }
    
    extension [Self <: ColumnConfig[?], TRowType](x: Self & ColumnConfig[TRowType]) {
      
      inline def setAggregate(value: avg | max | min | sum): Self = StObject.set(x, "aggregate", value.asInstanceOf[js.Any])
      
      inline def setAggregateUndefined: Self = StObject.set(x, "aggregate", js.undefined)
      
      inline def setAlign(value: center | start | end): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setFooter(value: Node | Aggregate): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterNull: Self = StObject.set(x, "footer", null)
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setFooterVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "footer", js.Array(value*))
      
      inline def setFooterVdomElement(value: VdomElement): Self = StObject.set(x, "footer", value.rawElement.asInstanceOf[js.Any])
      
      inline def setHeader(value: String | Node | Aggregate): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderNull: Self = StObject.set(x, "header", null)
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setHeaderVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "header", js.Array(value*))
      
      inline def setHeaderVdomElement(value: VdomElement): Self = StObject.set(x, "header", value.rawElement.asInstanceOf[js.Any])
      
      inline def setPin(value: Boolean): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
      
      inline def setPinUndefined: Self = StObject.set(x, "pin", js.undefined)
      
      inline def setPlain(value: Boolean): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
      
      inline def setPlainUndefined: Self = StObject.set(x, "plain", js.undefined)
      
      inline def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setRender(value: /* datum */ TRowType => Node): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setSearch(value: Boolean): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      inline def setShow(value: Double | Page): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setSize(value: ColumnSizeType | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
      
      inline def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
      
      inline def setUnits(value: String): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
      
      inline def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
      
      inline def setVerticalAlign(value: VerticalAlignType): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.grommet.grommetStrings.small
    - typingsJapgolly.grommet.grommetStrings.medium
    - typingsJapgolly.grommet.grommetStrings.large
    - typingsJapgolly.grommet.grommetStrings.xlarge
    - typingsJapgolly.grommet.grommetStrings.`1Slash2`
    - typingsJapgolly.grommet.grommetStrings.`1Slash4`
    - typingsJapgolly.grommet.grommetStrings.`2Slash4`
    - typingsJapgolly.grommet.grommetStrings.`3Slash4`
    - typingsJapgolly.grommet.grommetStrings.`1Slash3`
    - typingsJapgolly.grommet.grommetStrings.`2Slash3`
  */
  trait ColumnSizeType extends StObject
  object ColumnSizeType {
    
    inline def `1Slash2`: typingsJapgolly.grommet.grommetStrings.`1Slash2` = "1/2".asInstanceOf[typingsJapgolly.grommet.grommetStrings.`1Slash2`]
    
    inline def `1Slash3`: typingsJapgolly.grommet.grommetStrings.`1Slash3` = "1/3".asInstanceOf[typingsJapgolly.grommet.grommetStrings.`1Slash3`]
    
    inline def `1Slash4`: typingsJapgolly.grommet.grommetStrings.`1Slash4` = "1/4".asInstanceOf[typingsJapgolly.grommet.grommetStrings.`1Slash4`]
    
    inline def `2Slash3`: typingsJapgolly.grommet.grommetStrings.`2Slash3` = "2/3".asInstanceOf[typingsJapgolly.grommet.grommetStrings.`2Slash3`]
    
    inline def `2Slash4`: typingsJapgolly.grommet.grommetStrings.`2Slash4` = "2/4".asInstanceOf[typingsJapgolly.grommet.grommetStrings.`2Slash4`]
    
    inline def `3Slash4`: typingsJapgolly.grommet.grommetStrings.`3Slash4` = "3/4".asInstanceOf[typingsJapgolly.grommet.grommetStrings.`3Slash4`]
    
    inline def large: typingsJapgolly.grommet.grommetStrings.large = "large".asInstanceOf[typingsJapgolly.grommet.grommetStrings.large]
    
    inline def medium: typingsJapgolly.grommet.grommetStrings.medium = "medium".asInstanceOf[typingsJapgolly.grommet.grommetStrings.medium]
    
    inline def small: typingsJapgolly.grommet.grommetStrings.small = "small".asInstanceOf[typingsJapgolly.grommet.grommetStrings.small]
    
    inline def xlarge: typingsJapgolly.grommet.grommetStrings.xlarge = "xlarge".asInstanceOf[typingsJapgolly.grommet.grommetStrings.xlarge]
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof react.react.DetailedHTMLProps<react.react.TableHTMLAttributes<std.HTMLTableElement>, std.HTMLTableElement>, 'onSelect' | 'placeholder' | 'border'> ]: react.react.DetailedHTMLProps<react.react.TableHTMLAttributes<std.HTMLTableElement>, std.HTMLTableElement>[P]} */ trait DataTableExtendedProps[TRowType]
    extends StObject
       with DataTableProps[TRowType]
  object DataTableExtendedProps {
    
    inline def apply[TRowType](): DataTableExtendedProps[TRowType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataTableExtendedProps[TRowType]]
    }
  }
  
  trait DataTableProps[TRowType] extends StObject {
    
    var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
    
    // Appearance
    var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
    
    var background: js.UndefOr[
        BackgroundType | (Sections[
          BackgroundType | js.Array[String], 
          BackgroundType, 
          BackgroundType, 
          BackgroundType | js.Array[String]
        ])
      ] = js.undefined
    
    var border: js.UndefOr[BorderType | (Sections[BorderType, BorderType, BorderType, BorderType])] = js.undefined
    
    var columns: js.UndefOr[js.Array[ColumnConfig[TRowType]]] = js.undefined
    
    // Data
    var data: js.UndefOr[js.Array[TRowType]] = js.undefined
    
    var disabled: js.UndefOr[js.Array[String | Double]] = js.undefined
    
    var fill: js.UndefOr[Boolean | vertical | horizontal] = js.undefined
    
    var gridArea: js.UndefOr[GridAreaType] = js.undefined
    
    var groupBy: js.UndefOr[String | Expand[TRowType]] = js.undefined
    
    var margin: js.UndefOr[MarginType] = js.undefined
    
    // Events
    var onClickRow: js.UndefOr[
        select | (js.Function1[/* event */ MouseClick[TRowType] | KeyPress[TRowType], Unit])
      ] = js.undefined
    
    var onMore: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onSearch: js.UndefOr[js.Function1[/* search */ String, Unit]] = js.undefined
    
    var onSelect: js.UndefOr[js.Function2[/* select */ js.Array[String | Double], /* datum */ TRowType, Unit]] = js.undefined
    
    var onSort: js.UndefOr[js.Function1[/* sort */ DirectionProperty, Unit]] = js.undefined
    
    var onUpdate: js.UndefOr[js.Function1[/* datatableState */ Count, Unit]] = js.undefined
    
    var pad: js.UndefOr[PadType | (Sections[PadType, PadType, PadType, PadType])] = js.undefined
    
    var paginate: js.UndefOr[Boolean | PaginationType] = js.undefined
    
    var pin: js.UndefOr[Boolean | header | footer] = js.undefined
    
    var placeholder: js.UndefOr[String | Node] = js.undefined
    
    var primaryKey: js.UndefOr[String | Boolean] = js.undefined
    
    var replace: js.UndefOr[Boolean] = js.undefined
    
    var resizeable: js.UndefOr[Boolean] = js.undefined
    
    var rowDetails: js.UndefOr[Node] = js.undefined
    
    var rowProps: js.UndefOr[StringDictionary[Border]] = js.undefined
    
    var select: js.UndefOr[js.Array[String | Double]] = js.undefined
    
    var size: js.UndefOr[small | medium | large | xlarge | String] = js.undefined
    
    var sort: js.UndefOr[Direction] = js.undefined
    
    var sortable: js.UndefOr[Boolean] = js.undefined
    
    var step: js.UndefOr[Double] = js.undefined
    
    var verticalAlign: js.UndefOr[VerticalAlignType | Body] = js.undefined
  }
  object DataTableProps {
    
    inline def apply[TRowType](): DataTableProps[TRowType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataTableProps[TRowType]]
    }
    
    extension [Self <: DataTableProps[?], TRowType](x: Self & DataTableProps[TRowType]) {
      
      inline def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
      
      inline def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
      
      inline def setAlignSelf(value: AlignSelfType): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      inline def setBackground(
        value: BackgroundType | (Sections[
              BackgroundType | js.Array[String], 
              BackgroundType, 
              BackgroundType, 
              BackgroundType | js.Array[String]
            ])
      ): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setBorder(value: BorderType | (Sections[BorderType, BorderType, BorderType, BorderType])): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setBorderVarargs(value: ColorError*): Self = StObject.set(x, "border", js.Array(value*))
      
      inline def setColumns(value: js.Array[ColumnConfig[TRowType]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setColumnsVarargs(value: ColumnConfig[TRowType]*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setData(value: js.Array[TRowType]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: TRowType*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDisabled(value: js.Array[String | Double]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDisabledVarargs(value: (String | Double)*): Self = StObject.set(x, "disabled", js.Array(value*))
      
      inline def setFill(value: Boolean | vertical | horizontal): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setGridArea(value: GridAreaType): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
      
      inline def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
      
      inline def setGroupBy(value: String | Expand[TRowType]): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
      
      inline def setGroupByUndefined: Self = StObject.set(x, "groupBy", js.undefined)
      
      inline def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setOnClickRow(value: select | (js.Function1[/* event */ MouseClick[TRowType] | KeyPress[TRowType], Unit])): Self = StObject.set(x, "onClickRow", value.asInstanceOf[js.Any])
      
      inline def setOnClickRowFunction1(value: /* event */ MouseClick[TRowType] | KeyPress[TRowType] => Callback): Self = StObject.set(x, "onClickRow", js.Any.fromFunction1((t0: /* event */ MouseClick[TRowType] | KeyPress[TRowType]) => value(t0).runNow()))
      
      inline def setOnClickRowUndefined: Self = StObject.set(x, "onClickRow", js.undefined)
      
      inline def setOnMore(value: Callback): Self = StObject.set(x, "onMore", value.toJsFn)
      
      inline def setOnMoreUndefined: Self = StObject.set(x, "onMore", js.undefined)
      
      inline def setOnSearch(value: /* search */ String => Callback): Self = StObject.set(x, "onSearch", js.Any.fromFunction1((t0: /* search */ String) => value(t0).runNow()))
      
      inline def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
      
      inline def setOnSelect(value: (/* select */ js.Array[String | Double], /* datum */ TRowType) => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction2((t0: /* select */ js.Array[String | Double], t1: /* datum */ TRowType) => (value(t0, t1)).runNow()))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnSort(value: /* sort */ DirectionProperty => Callback): Self = StObject.set(x, "onSort", js.Any.fromFunction1((t0: /* sort */ DirectionProperty) => value(t0).runNow()))
      
      inline def setOnSortUndefined: Self = StObject.set(x, "onSort", js.undefined)
      
      inline def setOnUpdate(value: /* datatableState */ Count => Callback): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1((t0: /* datatableState */ Count) => value(t0).runNow()))
      
      inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      inline def setPad(value: PadType | (Sections[PadType, PadType, PadType, PadType])): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
      
      inline def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
      
      inline def setPaginate(value: Boolean | PaginationType): Self = StObject.set(x, "paginate", value.asInstanceOf[js.Any])
      
      inline def setPaginateUndefined: Self = StObject.set(x, "paginate", js.undefined)
      
      inline def setPin(value: Boolean | header | footer): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
      
      inline def setPinUndefined: Self = StObject.set(x, "pin", js.undefined)
      
      inline def setPlaceholder(value: String | Node): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderNull: Self = StObject.set(x, "placeholder", null)
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPlaceholderVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "placeholder", js.Array(value*))
      
      inline def setPlaceholderVdomElement(value: VdomElement): Self = StObject.set(x, "placeholder", value.rawElement.asInstanceOf[js.Any])
      
      inline def setPrimaryKey(value: String | Boolean): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
      
      inline def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
      
      inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      inline def setResizeable(value: Boolean): Self = StObject.set(x, "resizeable", value.asInstanceOf[js.Any])
      
      inline def setResizeableUndefined: Self = StObject.set(x, "resizeable", js.undefined)
      
      inline def setRowDetails(value: VdomNode): Self = StObject.set(x, "rowDetails", value.rawNode.asInstanceOf[js.Any])
      
      inline def setRowDetailsNull: Self = StObject.set(x, "rowDetails", null)
      
      inline def setRowDetailsUndefined: Self = StObject.set(x, "rowDetails", js.undefined)
      
      inline def setRowDetailsVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "rowDetails", js.Array(value*))
      
      inline def setRowDetailsVdomElement(value: VdomElement): Self = StObject.set(x, "rowDetails", value.rawElement.asInstanceOf[js.Any])
      
      inline def setRowProps(value: StringDictionary[Border]): Self = StObject.set(x, "rowProps", value.asInstanceOf[js.Any])
      
      inline def setRowPropsUndefined: Self = StObject.set(x, "rowProps", js.undefined)
      
      inline def setSelect(value: js.Array[String | Double]): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setSelectVarargs(value: (String | Double)*): Self = StObject.set(x, "select", js.Array(value*))
      
      inline def setSize(value: small | medium | large | xlarge | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSort(value: Direction): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      inline def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
      
      inline def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setVerticalAlign(value: VerticalAlignType | Body): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    }
  }
  
  trait KeyPress[TRowType]
    extends StObject
       with KeyboardEvent[org.scalajs.dom.Element] {
    
    var datum: TRowType
  }
  object KeyPress {
    
    inline def apply[TRowType](
      altKey: Boolean,
      bubbles: Boolean,
      cancelable: Boolean,
      charCode: Double,
      code: String,
      ctrlKey: Boolean,
      currentTarget: EventTarget & org.scalajs.dom.Element,
      datum: TRowType,
      defaultPrevented: Boolean,
      detail: Double,
      eventPhase: Double,
      getModifierState: String => Boolean,
      isDefaultPrevented: CallbackTo[Boolean],
      isPropagationStopped: CallbackTo[Boolean],
      isTrusted: Boolean,
      key: String,
      keyCode: Double,
      locale: String,
      location: Double,
      metaKey: Boolean,
      nativeEvent: org.scalajs.dom.KeyboardEvent,
      persist: Callback,
      preventDefault: Callback,
      repeat: Boolean,
      shiftKey: Boolean,
      stopPropagation: Callback,
      target: EventTarget,
      timeStamp: Double,
      `type`: String,
      view: AbstractView,
      which: Double
    ): KeyPress[TRowType] = {
      val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], charCode = charCode.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], datum = datum.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], getModifierState = js.Any.fromFunction1(getModifierState), isDefaultPrevented = isDefaultPrevented.toJsFn, isPropagationStopped = isPropagationStopped.toJsFn, isTrusted = isTrusted.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], persist = persist.toJsFn, preventDefault = preventDefault.toJsFn, repeat = repeat.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], stopPropagation = stopPropagation.toJsFn, target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyPress[TRowType]]
    }
    
    extension [Self <: KeyPress[?], TRowType](x: Self & KeyPress[TRowType]) {
      
      inline def setDatum(value: TRowType): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
    }
  }
  
  trait MouseClick[TRowType]
    extends StObject
       with MouseEvent[HTMLTableRowElement, NativeMouseEvent] {
    
    var datum: TRowType
    
    var index: Double
  }
  object MouseClick {
    
    inline def apply[TRowType](
      altKey: Boolean,
      bubbles: Boolean,
      button: Double,
      buttons: Double,
      cancelable: Boolean,
      clientX: Double,
      clientY: Double,
      ctrlKey: Boolean,
      currentTarget: EventTarget & HTMLTableRowElement,
      datum: TRowType,
      defaultPrevented: Boolean,
      detail: Double,
      eventPhase: Double,
      getModifierState: String => Boolean,
      index: Double,
      isDefaultPrevented: CallbackTo[Boolean],
      isPropagationStopped: CallbackTo[Boolean],
      isTrusted: Boolean,
      metaKey: Boolean,
      movementX: Double,
      movementY: Double,
      nativeEvent: NativeMouseEvent,
      pageX: Double,
      pageY: Double,
      persist: Callback,
      preventDefault: Callback,
      screenX: Double,
      screenY: Double,
      shiftKey: Boolean,
      stopPropagation: Callback,
      target: EventTarget,
      timeStamp: Double,
      `type`: String,
      view: AbstractView
    ): MouseClick[TRowType] = {
      val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], datum = datum.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], getModifierState = js.Any.fromFunction1(getModifierState), index = index.asInstanceOf[js.Any], isDefaultPrevented = isDefaultPrevented.toJsFn, isPropagationStopped = isPropagationStopped.toJsFn, isTrusted = isTrusted.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], movementX = movementX.asInstanceOf[js.Any], movementY = movementY.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], persist = persist.toJsFn, preventDefault = preventDefault.toJsFn, screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], stopPropagation = stopPropagation.toJsFn, target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], relatedTarget = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MouseClick[TRowType]]
    }
    
    extension [Self <: MouseClick[?], TRowType](x: Self & MouseClick[TRowType]) {
      
      inline def setDatum(value: TRowType): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
  
  trait Sections[TBody, THeader, TFooter, TPinned] extends StObject {
    
    var body: js.UndefOr[TBody] = js.undefined
    
    var footer: js.UndefOr[TFooter] = js.undefined
    
    var header: js.UndefOr[THeader] = js.undefined
    
    var pinned: js.UndefOr[TPinned] = js.undefined
  }
  object Sections {
    
    inline def apply[TBody, THeader, TFooter, TPinned](): Sections[TBody, THeader, TFooter, TPinned] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Sections[TBody, THeader, TFooter, TPinned]]
    }
    
    extension [Self <: Sections[?, ?, ?, ?], TBody, THeader, TFooter, TPinned](x: Self & (Sections[TBody, THeader, TFooter, TPinned])) {
      
      inline def setBody(value: TBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setFooter(value: TFooter): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setHeader(value: THeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setPinned(value: TPinned): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
      
      inline def setPinnedUndefined: Self = StObject.set(x, "pinned", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.grommet.grommetStrings.middle
    - typingsJapgolly.grommet.grommetStrings.top
    - typingsJapgolly.grommet.grommetStrings.bottom
  */
  trait VerticalAlignType extends StObject
  object VerticalAlignType {
    
    inline def bottom: typingsJapgolly.grommet.grommetStrings.bottom = "bottom".asInstanceOf[typingsJapgolly.grommet.grommetStrings.bottom]
    
    inline def middle: typingsJapgolly.grommet.grommetStrings.middle = "middle".asInstanceOf[typingsJapgolly.grommet.grommetStrings.middle]
    
    inline def top: typingsJapgolly.grommet.grommetStrings.top = "top".asInstanceOf[typingsJapgolly.grommet.grommetStrings.top]
  }
}
