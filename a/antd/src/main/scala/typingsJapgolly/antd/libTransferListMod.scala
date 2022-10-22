package typingsJapgolly.antd

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactUIEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefHandle
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLUListElement
import typingsJapgolly.antd.anon.BodyContent
import typingsJapgolly.antd.anon.DataSource
import typingsJapgolly.antd.anon.Direction
import typingsJapgolly.antd.anon.Disabled
import typingsJapgolly.antd.anon.FilteredItems
import typingsJapgolly.antd.anon.SelectedCount
import typingsJapgolly.antd.antdBooleans.`false`
import typingsJapgolly.antd.antdStrings.all
import typingsJapgolly.antd.antdStrings.none
import typingsJapgolly.antd.antdStrings.part
import typingsJapgolly.antd.libTransferInterfaceMod.PaginationType
import typingsJapgolly.antd.libTransferListBodyMod.TransferListBodyProps
import typingsJapgolly.antd.libTransferMod.KeyWiseTransferItem
import typingsJapgolly.antd.libTransferMod.RenderResult
import typingsJapgolly.antd.libTransferMod.SelectAllLabel
import typingsJapgolly.antd.libTransferMod.TransferDirection
import typingsJapgolly.antd.libTransferMod.TransferLocale
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTransferListMod {
  
  @JSImport("antd/lib/transfer/list", JSImport.Default)
  @js.native
  open class default[RecordType /* <: KeyWiseTransferItem */] protected () extends TransferList[RecordType] {
    def this(props: TransferListProps[RecordType]) = this()
  }
  /* static members */
  object default {
    
    @JSImport("antd/lib/transfer/list", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/lib/transfer/list", "default.defaultProps")
    @js.native
    def defaultProps: DataSource = js.native
    inline def defaultProps_=(x: DataSource): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  type RenderListFunction[T] = js.Function1[/* props */ TransferListBodyProps[T], Node]
  
  trait RenderedItem[RecordType] extends StObject {
    
    var item: RecordType
    
    var renderedEl: Node
    
    var renderedText: String
  }
  object RenderedItem {
    
    inline def apply[RecordType](item: RecordType, renderedText: String): RenderedItem[RecordType] = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], renderedText = renderedText.asInstanceOf[js.Any], renderedEl = null)
      __obj.asInstanceOf[RenderedItem[RecordType]]
    }
    
    extension [Self <: RenderedItem[?], RecordType](x: Self & RenderedItem[RecordType]) {
      
      inline def setItem(value: RecordType): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setRenderedEl(value: VdomNode): Self = StObject.set(x, "renderedEl", value.rawNode.asInstanceOf[js.Any])
      
      inline def setRenderedElNull: Self = StObject.set(x, "renderedEl", null)
      
      inline def setRenderedElVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "renderedEl", js.Array(value*))
      
      inline def setRenderedElVdomElement(value: VdomElement): Self = StObject.set(x, "renderedEl", value.rawElement.asInstanceOf[js.Any])
      
      inline def setRenderedText(value: String): Self = StObject.set(x, "renderedText", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TransferList[RecordType /* <: KeyWiseTransferItem */] extends PureComponent[TransferListProps[RecordType], TransferListState, Any] {
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MTransferList(): Unit = js.native
    
    var defaultListBodyRef: RefHandle[typingsJapgolly.antd.libTransferListBodyMod.default[RecordType]] = js.native
    
    def getCheckBox(hasFilteredItemsOnItemSelectAllDisabledPrefixCls: Disabled[RecordType]): `false` | typingsJapgolly.react.mod.global.JSX.Element = js.native
    
    def getCheckStatus(filteredItems: js.Array[RecordType]): none | all | part = js.native
    
    def getFilteredItems(dataSource: js.Array[RecordType], filterValue: String): FilteredItems[RecordType] = js.native
    
    def getListBody(
      prefixCls: String,
      searchPlaceholder: String,
      filterValue: String,
      filteredItems: js.Array[RecordType],
      notFoundContent: Node,
      filteredRenderItems: js.Array[RenderedItem[RecordType]],
      checkedKeys: js.Array[String]
    ): Node = js.native
    def getListBody(
      prefixCls: String,
      searchPlaceholder: String,
      filterValue: String,
      filteredItems: js.Array[RecordType],
      notFoundContent: Node,
      filteredRenderItems: js.Array[RenderedItem[RecordType]],
      checkedKeys: js.Array[String],
      renderList: Unit,
      showSearch: Boolean
    ): Node = js.native
    def getListBody(
      prefixCls: String,
      searchPlaceholder: String,
      filterValue: String,
      filteredItems: js.Array[RecordType],
      notFoundContent: Node,
      filteredRenderItems: js.Array[RenderedItem[RecordType]],
      checkedKeys: js.Array[String],
      renderList: Unit,
      showSearch: Boolean,
      disabled: Boolean
    ): Node = js.native
    def getListBody(
      prefixCls: String,
      searchPlaceholder: String,
      filterValue: String,
      filteredItems: js.Array[RecordType],
      notFoundContent: Node,
      filteredRenderItems: js.Array[RenderedItem[RecordType]],
      checkedKeys: js.Array[String],
      renderList: Unit,
      showSearch: Unit,
      disabled: Boolean
    ): Node = js.native
    def getListBody(
      prefixCls: String,
      searchPlaceholder: String,
      filterValue: String,
      filteredItems: js.Array[RecordType],
      notFoundContent: Node,
      filteredRenderItems: js.Array[RenderedItem[RecordType]],
      checkedKeys: js.Array[String],
      renderList: RenderListFunction[RecordType]
    ): Node = js.native
    def getListBody(
      prefixCls: String,
      searchPlaceholder: String,
      filterValue: String,
      filteredItems: js.Array[RecordType],
      notFoundContent: Node,
      filteredRenderItems: js.Array[RenderedItem[RecordType]],
      checkedKeys: js.Array[String],
      renderList: RenderListFunction[RecordType],
      showSearch: Boolean
    ): Node = js.native
    def getListBody(
      prefixCls: String,
      searchPlaceholder: String,
      filterValue: String,
      filteredItems: js.Array[RecordType],
      notFoundContent: Node,
      filteredRenderItems: js.Array[RenderedItem[RecordType]],
      checkedKeys: js.Array[String],
      renderList: RenderListFunction[RecordType],
      showSearch: Boolean,
      disabled: Boolean
    ): Node = js.native
    def getListBody(
      prefixCls: String,
      searchPlaceholder: String,
      filterValue: String,
      filteredItems: js.Array[RecordType],
      notFoundContent: Node,
      filteredRenderItems: js.Array[RenderedItem[RecordType]],
      checkedKeys: js.Array[String],
      renderList: RenderListFunction[RecordType],
      showSearch: Unit,
      disabled: Boolean
    ): Node = js.native
    
    def getSelectAllLabel(selectedCount: Double, totalCount: Double): Node = js.native
    
    def handleClear(): Unit = js.native
    
    def handleFilter(e: ReactEventFrom[HTMLInputElement]): Unit = js.native
    
    def matchFilter(text: String, item: RecordType): Boolean = js.native
    
    def renderItem(item: RecordType): RenderedItem[RecordType] = js.native
    
    def renderListBody(renderList: Unit, props: TransferListBodyProps[RecordType]): BodyContent = js.native
    def renderListBody(renderList: RenderListFunction[RecordType], props: TransferListBodyProps[RecordType]): BodyContent = js.native
    
    var timer: Double = js.native
    
    var triggerScrollTimer: Double = js.native
  }
  
  trait TransferListProps[RecordType]
    extends StObject
       with TransferLocale {
    
    var checkedKeys: js.Array[String]
    
    var dataSource: js.Array[RecordType]
    
    var direction: TransferDirection
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var filterOption: js.UndefOr[js.Function2[/* filterText */ String, /* item */ RecordType, Boolean]] = js.undefined
    
    var footer: js.UndefOr[
        js.Function2[/* props */ TransferListProps[RecordType], /* info */ js.UndefOr[Direction], Node]
      ] = js.undefined
    
    def handleClear(): Unit
    
    def handleFilter(e: ReactEventFrom[HTMLInputElement]): Unit
    
    var onItemRemove: js.UndefOr[js.Function1[/* keys */ js.Array[String], Unit]] = js.undefined
    
    def onItemSelect(key: String, check: Boolean): Unit
    
    def onItemSelectAll(dataSource: js.Array[String], checkAll: Boolean): Unit
    
    def onScroll(e: ReactUIEventFrom[HTMLUListElement]): Unit
    
    var pagination: js.UndefOr[PaginationType] = js.undefined
    
    var prefixCls: String
    
    /** Render item */
    var render: js.UndefOr[js.Function1[/* item */ RecordType, RenderResult]] = js.undefined
    
    var renderList: js.UndefOr[RenderListFunction[RecordType]] = js.undefined
    
    var selectAllLabel: js.UndefOr[SelectAllLabel] = js.undefined
    
    var showRemove: js.UndefOr[Boolean] = js.undefined
    
    var showSearch: js.UndefOr[Boolean] = js.undefined
    
    var showSelectAll: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var titleText: Node
  }
  object TransferListProps {
    
    inline def apply[RecordType](
      checkedKeys: js.Array[String],
      dataSource: js.Array[RecordType],
      direction: TransferDirection,
      handleClear: Callback,
      handleFilter: ReactEventFrom[HTMLInputElement] => Callback,
      itemUnit: String,
      itemsUnit: String,
      onItemSelect: (String, Boolean) => Callback,
      onItemSelectAll: (js.Array[String], Boolean) => Callback,
      onScroll: ReactUIEventFrom[HTMLUListElement] => Callback,
      prefixCls: String,
      searchPlaceholder: String
    ): TransferListProps[RecordType] = {
      val __obj = js.Dynamic.literal(checkedKeys = checkedKeys.asInstanceOf[js.Any], dataSource = dataSource.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], handleClear = handleClear.toJsFn, handleFilter = js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement]) => handleFilter(t0).runNow()), itemUnit = itemUnit.asInstanceOf[js.Any], itemsUnit = itemsUnit.asInstanceOf[js.Any], onItemSelect = js.Any.fromFunction2((t0: String, t1: Boolean) => (onItemSelect(t0, t1)).runNow()), onItemSelectAll = js.Any.fromFunction2((t0: js.Array[String], t1: Boolean) => (onItemSelectAll(t0, t1)).runNow()), onScroll = js.Any.fromFunction1((t0: ReactUIEventFrom[HTMLUListElement]) => onScroll(t0).runNow()), prefixCls = prefixCls.asInstanceOf[js.Any], searchPlaceholder = searchPlaceholder.asInstanceOf[js.Any], titleText = null)
      __obj.asInstanceOf[TransferListProps[RecordType]]
    }
    
    extension [Self <: TransferListProps[?], RecordType](x: Self & TransferListProps[RecordType]) {
      
      inline def setCheckedKeys(value: js.Array[String]): Self = StObject.set(x, "checkedKeys", value.asInstanceOf[js.Any])
      
      inline def setCheckedKeysVarargs(value: String*): Self = StObject.set(x, "checkedKeys", js.Array(value*))
      
      inline def setDataSource(value: js.Array[RecordType]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      inline def setDataSourceVarargs(value: RecordType*): Self = StObject.set(x, "dataSource", js.Array(value*))
      
      inline def setDirection(value: TransferDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFilterOption(value: (/* filterText */ String, /* item */ RecordType) => Boolean): Self = StObject.set(x, "filterOption", js.Any.fromFunction2(value))
      
      inline def setFilterOptionUndefined: Self = StObject.set(x, "filterOption", js.undefined)
      
      inline def setFooter(value: (/* props */ TransferListProps[RecordType], /* info */ js.UndefOr[Direction]) => Node): Self = StObject.set(x, "footer", js.Any.fromFunction2(value))
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setHandleClear(value: Callback): Self = StObject.set(x, "handleClear", value.toJsFn)
      
      inline def setHandleFilter(value: ReactEventFrom[HTMLInputElement] => Callback): Self = StObject.set(x, "handleFilter", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement]) => value(t0).runNow()))
      
      inline def setOnItemRemove(value: /* keys */ js.Array[String] => Callback): Self = StObject.set(x, "onItemRemove", js.Any.fromFunction1((t0: /* keys */ js.Array[String]) => value(t0).runNow()))
      
      inline def setOnItemRemoveUndefined: Self = StObject.set(x, "onItemRemove", js.undefined)
      
      inline def setOnItemSelect(value: (String, Boolean) => Callback): Self = StObject.set(x, "onItemSelect", js.Any.fromFunction2((t0: String, t1: Boolean) => (value(t0, t1)).runNow()))
      
      inline def setOnItemSelectAll(value: (js.Array[String], Boolean) => Callback): Self = StObject.set(x, "onItemSelectAll", js.Any.fromFunction2((t0: js.Array[String], t1: Boolean) => (value(t0, t1)).runNow()))
      
      inline def setOnScroll(value: ReactUIEventFrom[HTMLUListElement] => Callback): Self = StObject.set(x, "onScroll", js.Any.fromFunction1((t0: ReactUIEventFrom[HTMLUListElement]) => value(t0).runNow()))
      
      inline def setPagination(value: PaginationType): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
      
      inline def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setRender(value: /* item */ RecordType => RenderResult): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setRenderList(value: /* props */ TransferListBodyProps[RecordType] => Node): Self = StObject.set(x, "renderList", js.Any.fromFunction1(value))
      
      inline def setRenderListUndefined: Self = StObject.set(x, "renderList", js.undefined)
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setSelectAllLabel(value: SelectAllLabel): Self = StObject.set(x, "selectAllLabel", value.asInstanceOf[js.Any])
      
      inline def setSelectAllLabelFunction1(value: /* info */ SelectedCount => Node): Self = StObject.set(x, "selectAllLabel", js.Any.fromFunction1(value))
      
      inline def setSelectAllLabelNull: Self = StObject.set(x, "selectAllLabel", null)
      
      inline def setSelectAllLabelUndefined: Self = StObject.set(x, "selectAllLabel", js.undefined)
      
      inline def setSelectAllLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "selectAllLabel", js.Array(value*))
      
      inline def setSelectAllLabelVdomElement(value: VdomElement): Self = StObject.set(x, "selectAllLabel", value.rawElement.asInstanceOf[js.Any])
      
      inline def setShowRemove(value: Boolean): Self = StObject.set(x, "showRemove", value.asInstanceOf[js.Any])
      
      inline def setShowRemoveUndefined: Self = StObject.set(x, "showRemove", js.undefined)
      
      inline def setShowSearch(value: Boolean): Self = StObject.set(x, "showSearch", value.asInstanceOf[js.Any])
      
      inline def setShowSearchUndefined: Self = StObject.set(x, "showSearch", js.undefined)
      
      inline def setShowSelectAll(value: Boolean): Self = StObject.set(x, "showSelectAll", value.asInstanceOf[js.Any])
      
      inline def setShowSelectAllUndefined: Self = StObject.set(x, "showSelectAll", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTitleText(value: VdomNode): Self = StObject.set(x, "titleText", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTitleTextNull: Self = StObject.set(x, "titleText", null)
      
      inline def setTitleTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "titleText", js.Array(value*))
      
      inline def setTitleTextVdomElement(value: VdomElement): Self = StObject.set(x, "titleText", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait TransferListState extends StObject {
    
    /** Filter input value */
    var filterValue: String
  }
  object TransferListState {
    
    inline def apply(filterValue: String): TransferListState = {
      val __obj = js.Dynamic.literal(filterValue = filterValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransferListState]
    }
    
    extension [Self <: TransferListState](x: Self) {
      
      inline def setFilterValue(value: String): Self = StObject.set(x, "filterValue", value.asInstanceOf[js.Any])
    }
  }
}
