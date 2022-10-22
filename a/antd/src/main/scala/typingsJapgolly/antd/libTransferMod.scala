package typingsJapgolly.antd

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLUListElement
import typingsJapgolly.antd.anon.DataSource
import typingsJapgolly.antd.anon.Direction
import typingsJapgolly.antd.anon.ItemUnit
import typingsJapgolly.antd.anon.Key
import typingsJapgolly.antd.anon.LeftDataSource
import typingsJapgolly.antd.anon.PartialTransferLocale
import typingsJapgolly.antd.anon.RightDataSource
import typingsJapgolly.antd.anon.SelectedCount
import typingsJapgolly.antd.anon.SourceSelectedKeys
import typingsJapgolly.antd.libConfigProviderDefaultRenderEmptyMod.RenderEmptyHandler
import typingsJapgolly.antd.libTransferInterfaceMod.PaginationType
import typingsJapgolly.antd.libTransferListBodyMod.TransferListBodyProps
import typingsJapgolly.antd.libTransferListMod.TransferListProps
import typingsJapgolly.antd.libTransferOperationMod.TransferOperationProps
import typingsJapgolly.antd.libTransferSearchMod.TransferSearchProps
import typingsJapgolly.antd.libUtilStatusUtilsMod.InputStatus
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTransferMod {
  
  @JSImport("antd/lib/transfer", JSImport.Default)
  @js.native
  open class default[RecordType /* <: TransferItem */] protected () extends Transfer[RecordType] {
    def this(props: TransferProps[RecordType]) = this()
  }
  object default {
    
    @JSImport("antd/lib/transfer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("antd/lib/transfer", "default.List")
    @js.native
    open class List[RecordType /* <: KeyWiseTransferItem */] protected ()
      extends typingsJapgolly.antd.libTransferListMod.default[RecordType] {
      def this(props: TransferListProps[/* import warning: RewrittenClass.unapply cls was tparam RecordType */ Any]) = this()
    }
    /* static member */
    /* was `typeof List` */
    object List {
      
      @JSImport("antd/lib/transfer", "default.List")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("antd/lib/transfer", "default.List.defaultProps")
      @js.native
      def defaultProps: DataSource = js.native
      inline def defaultProps_=(x: DataSource): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("antd/lib/transfer", "default.Operation")
    @js.native
    def Operation: js.Function1[
        /* hasDisabledMoveToLeftMoveToRightLeftArrowTextRightArrowTextLeftActiveRightActiveClassNameStyleDirectionOneWay */ TransferOperationProps, 
        Element
      ] = js.native
    inline def Operation_=(
      x: js.Function1[
          /* hasDisabledMoveToLeftMoveToRightLeftArrowTextRightArrowTextLeftActiveRightActiveClassNameStyleDirectionOneWay */ TransferOperationProps, 
          Element
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Operation")(x.asInstanceOf[js.Any])
    
    /* static member */
    /* was `typeof Search` */
    @JSImport("antd/lib/transfer", "default.Search")
    @js.native
    def Search: js.Function1[/* props */ TransferSearchProps, Element] = js.native
    inline def Search_=(x: js.Function1[/* props */ TransferSearchProps, Element]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Search")(x.asInstanceOf[js.Any])
    
    /* static member */
    object defaultProps {
      
      @JSImport("antd/lib/transfer", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("antd/lib/transfer", "default.defaultProps.dataSource")
      @js.native
      def dataSource: js.Array[scala.Nothing] = js.native
      inline def dataSource_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(x.asInstanceOf[js.Any])
      
      inline def listStyle(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("listStyle")().asInstanceOf[Unit]
      
      @JSImport("antd/lib/transfer", "default.defaultProps.showSearch")
      @js.native
      def showSearch: Boolean = js.native
      inline def showSearch_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showSearch")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    inline def getDerivedStateFromProps[T](hasSelectedKeysTargetKeysPaginationChildren: TransferProps[T]): SourceSelectedKeys | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(hasSelectedKeysTargetKeysPaginationChildren.asInstanceOf[js.Any]).asInstanceOf[SourceSelectedKeys | Null]
  }
  
  type KeyWise[T] = T & Key
  
  /* Inlined antd.antd/lib/transfer.KeyWise<antd.antd/lib/transfer.TransferItem> */
  trait KeyWiseTransferItem
    extends StObject
       with /* customProp */ StringDictionary[Any] {
    
    var description: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var key: js.UndefOr[String] & String
    
    var title: js.UndefOr[String] = js.undefined
  }
  object KeyWiseTransferItem {
    
    inline def apply(key: js.UndefOr[String] & String): KeyWiseTransferItem = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyWiseTransferItem]
    }
    
    extension [Self <: KeyWiseTransferItem](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setKey(value: js.UndefOr[String] & String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait ListStyle extends StObject {
    
    var direction: TransferDirection
  }
  object ListStyle {
    
    inline def apply(direction: TransferDirection): ListStyle = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListStyle]
    }
    
    extension [Self <: ListStyle](x: Self) {
      
      inline def setDirection(value: TransferDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    }
  }
  
  type RenderResult = japgolly.scalajs.react.facade.React.Element | RenderResultObject | String | Null
  
  trait RenderResultObject extends StObject {
    
    var label: japgolly.scalajs.react.facade.React.Element
    
    var value: String
  }
  object RenderResultObject {
    
    inline def apply(label: VdomElement, value: String): RenderResultObject = {
      val __obj = js.Dynamic.literal(label = label.rawElement.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderResultObject]
    }
    
    extension [Self <: RenderResultObject](x: Self) {
      
      inline def setLabel(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type SelectAllLabel = Node | (js.Function1[/* info */ SelectedCount, Node])
  
  @js.native
  trait Transfer[RecordType /* <: TransferItem */] extends Component[TransferProps[RecordType], TransferState, Any] {
    
    def getLocale(transferLocale: TransferLocale, renderEmpty: RenderEmptyHandler): ItemUnit = js.native
    
    def getTitles(transferLocale: TransferLocale): js.Array[Node] = js.native
    
    def handleClear(direction: TransferDirection): Unit = js.native
    
    def handleFilter(direction: TransferDirection, e: ReactEventFrom[HTMLInputElement]): Unit = js.native
    
    def handleLeftClear(): Unit = js.native
    
    def handleLeftFilter(e: ReactEventFrom[HTMLInputElement]): Unit = js.native
    
    def handleLeftScroll(e: ReactEventFrom[HTMLUListElement]): Unit = js.native
    
    def handleListStyle(listStyle: js.Function1[/* style */ ListStyle, CSSProperties], direction: TransferDirection): js.UndefOr[CSSProperties] = js.native
    def handleListStyle(listStyle: Unit, direction: TransferDirection): js.UndefOr[CSSProperties] = js.native
    def handleListStyle(listStyle: CSSProperties, direction: TransferDirection): js.UndefOr[CSSProperties] = js.native
    
    def handleRightClear(): Unit = js.native
    
    def handleRightFilter(e: ReactEventFrom[HTMLInputElement]): Unit = js.native
    
    def handleRightScroll(e: ReactEventFrom[HTMLUListElement]): Unit = js.native
    
    def handleScroll(direction: TransferDirection, e: ReactEventFrom[HTMLUListElement]): Unit = js.native
    
    def handleSelectChange(direction: TransferDirection, holder: js.Array[String]): Unit = js.native
    
    def moveTo(direction: TransferDirection): Unit = js.native
    
    def moveToLeft(): Unit = js.native
    
    def moveToRight(): Unit = js.native
    
    def onItemSelect(direction: TransferDirection, selectedKey: String, checked: Boolean): Unit = js.native
    
    def onItemSelectAll(direction: TransferDirection, selectedKeys: js.Array[String], checkAll: Boolean): Unit = js.native
    
    def onLeftItemSelect(selectedKey: String, checked: Boolean): Unit = js.native
    
    def onLeftItemSelectAll(selectedKeys: js.Array[String], checkAll: Boolean): Unit = js.native
    
    def onRightItemRemove(selectedKeys: js.Array[String]): Unit = js.native
    
    def onRightItemSelect(selectedKey: String, checked: Boolean): Unit = js.native
    
    def onRightItemSelectAll(selectedKeys: js.Array[String], checkAll: Boolean): Unit = js.native
    
    def separateDataSource(): RightDataSource[RecordType] = js.native
    
    var separatedDataSource: LeftDataSource[RecordType] | Null = js.native
    
    def setStateKeys(direction: TransferDirection, keys: js.Array[String]): Unit = js.native
    def setStateKeys(
      direction: TransferDirection,
      keys: js.Function1[/* prevKeys */ js.Array[String], js.Array[String]]
    ): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antd.antdStrings.left
    - typingsJapgolly.antd.antdStrings.right
  */
  trait TransferDirection extends StObject
  object TransferDirection {
    
    inline def left: typingsJapgolly.antd.antdStrings.left = "left".asInstanceOf[typingsJapgolly.antd.antdStrings.left]
    
    inline def right: typingsJapgolly.antd.antdStrings.right = "right".asInstanceOf[typingsJapgolly.antd.antdStrings.right]
  }
  
  trait TransferItem
    extends StObject
       with /* customProp */ StringDictionary[Any] {
    
    var description: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object TransferItem {
    
    inline def apply(): TransferItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransferItem]
    }
    
    extension [Self <: TransferItem](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait TransferLocale extends StObject {
    
    var itemUnit: String
    
    var itemsUnit: String
    
    var notFoundContent: js.UndefOr[Node | js.Array[Node]] = js.undefined
    
    var remove: js.UndefOr[String] = js.undefined
    
    var removeAll: js.UndefOr[String] = js.undefined
    
    var removeCurrent: js.UndefOr[String] = js.undefined
    
    var searchPlaceholder: String
    
    var selectAll: js.UndefOr[String] = js.undefined
    
    var selectCurrent: js.UndefOr[String] = js.undefined
    
    var selectInvert: js.UndefOr[String] = js.undefined
    
    var titles: js.UndefOr[js.Array[Node]] = js.undefined
  }
  object TransferLocale {
    
    inline def apply(itemUnit: String, itemsUnit: String, searchPlaceholder: String): TransferLocale = {
      val __obj = js.Dynamic.literal(itemUnit = itemUnit.asInstanceOf[js.Any], itemsUnit = itemsUnit.asInstanceOf[js.Any], searchPlaceholder = searchPlaceholder.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransferLocale]
    }
    
    extension [Self <: TransferLocale](x: Self) {
      
      inline def setItemUnit(value: String): Self = StObject.set(x, "itemUnit", value.asInstanceOf[js.Any])
      
      inline def setItemsUnit(value: String): Self = StObject.set(x, "itemsUnit", value.asInstanceOf[js.Any])
      
      inline def setNotFoundContent(value: Node | js.Array[Node]): Self = StObject.set(x, "notFoundContent", value.asInstanceOf[js.Any])
      
      inline def setNotFoundContentNull: Self = StObject.set(x, "notFoundContent", null)
      
      inline def setNotFoundContentUndefined: Self = StObject.set(x, "notFoundContent", js.undefined)
      
      inline def setNotFoundContentVarargs(value: (japgolly.scalajs.react.facade.React.Element | Empty | JsNumber | Node | String)*): Self = StObject.set(x, "notFoundContent", js.Array(value*))
      
      inline def setNotFoundContentVdomElement(value: VdomElement): Self = StObject.set(x, "notFoundContent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setRemove(value: String): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      inline def setRemoveAll(value: String): Self = StObject.set(x, "removeAll", value.asInstanceOf[js.Any])
      
      inline def setRemoveAllUndefined: Self = StObject.set(x, "removeAll", js.undefined)
      
      inline def setRemoveCurrent(value: String): Self = StObject.set(x, "removeCurrent", value.asInstanceOf[js.Any])
      
      inline def setRemoveCurrentUndefined: Self = StObject.set(x, "removeCurrent", js.undefined)
      
      inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      inline def setSearchPlaceholder(value: String): Self = StObject.set(x, "searchPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setSelectAll(value: String): Self = StObject.set(x, "selectAll", value.asInstanceOf[js.Any])
      
      inline def setSelectAllUndefined: Self = StObject.set(x, "selectAll", js.undefined)
      
      inline def setSelectCurrent(value: String): Self = StObject.set(x, "selectCurrent", value.asInstanceOf[js.Any])
      
      inline def setSelectCurrentUndefined: Self = StObject.set(x, "selectCurrent", js.undefined)
      
      inline def setSelectInvert(value: String): Self = StObject.set(x, "selectInvert", value.asInstanceOf[js.Any])
      
      inline def setSelectInvertUndefined: Self = StObject.set(x, "selectInvert", js.undefined)
      
      inline def setTitles(value: js.Array[Node]): Self = StObject.set(x, "titles", value.asInstanceOf[js.Any])
      
      inline def setTitlesUndefined: Self = StObject.set(x, "titles", js.undefined)
      
      inline def setTitlesVarargs(value: Node*): Self = StObject.set(x, "titles", js.Array(value*))
    }
  }
  
  trait TransferProps[RecordType] extends StObject {
    
    var children: js.UndefOr[js.Function1[/* props */ TransferListBodyProps[RecordType], Node]] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataSource: js.Array[RecordType]
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var filterOption: js.UndefOr[js.Function2[/* inputValue */ String, /* item */ RecordType, Boolean]] = js.undefined
    
    var footer: js.UndefOr[
        js.Function2[/* props */ TransferListProps[RecordType], /* info */ js.UndefOr[Direction], Node]
      ] = js.undefined
    
    var listStyle: js.UndefOr[(js.Function1[/* style */ ListStyle, CSSProperties]) | CSSProperties] = js.undefined
    
    var locale: js.UndefOr[PartialTransferLocale] = js.undefined
    
    var onChange: js.UndefOr[
        js.Function3[
          /* targetKeys */ js.Array[String], 
          /* direction */ TransferDirection, 
          /* moveKeys */ js.Array[String], 
          Unit
        ]
      ] = js.undefined
    
    var onScroll: js.UndefOr[
        js.Function2[/* direction */ TransferDirection, /* e */ ReactEventFrom[HTMLUListElement], Unit]
      ] = js.undefined
    
    var onSearch: js.UndefOr[js.Function2[/* direction */ TransferDirection, /* value */ String, Unit]] = js.undefined
    
    var onSelectChange: js.UndefOr[
        js.Function2[
          /* sourceSelectedKeys */ js.Array[String], 
          /* targetSelectedKeys */ js.Array[String], 
          Unit
        ]
      ] = js.undefined
    
    var oneWay: js.UndefOr[Boolean] = js.undefined
    
    var operationStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var operations: js.UndefOr[js.Array[String]] = js.undefined
    
    var pagination: js.UndefOr[PaginationType] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var render: js.UndefOr[TransferRender[RecordType]] = js.undefined
    
    var rowKey: js.UndefOr[js.Function1[/* record */ RecordType, String]] = js.undefined
    
    var selectAllLabels: js.UndefOr[js.Array[SelectAllLabel]] = js.undefined
    
    var selectedKeys: js.UndefOr[js.Array[String]] = js.undefined
    
    var showSearch: js.UndefOr[Boolean] = js.undefined
    
    var showSelectAll: js.UndefOr[Boolean] = js.undefined
    
    var status: js.UndefOr[InputStatus] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var targetKeys: js.UndefOr[js.Array[String]] = js.undefined
    
    var titles: js.UndefOr[js.Array[Node]] = js.undefined
  }
  object TransferProps {
    
    inline def apply[RecordType](dataSource: js.Array[RecordType]): TransferProps[RecordType] = {
      val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransferProps[RecordType]]
    }
    
    extension [Self <: TransferProps[?], RecordType](x: Self & TransferProps[RecordType]) {
      
      inline def setChildren(value: /* props */ TransferListBodyProps[RecordType] => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataSource(value: js.Array[RecordType]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      inline def setDataSourceVarargs(value: RecordType*): Self = StObject.set(x, "dataSource", js.Array(value*))
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFilterOption(value: (/* inputValue */ String, /* item */ RecordType) => Boolean): Self = StObject.set(x, "filterOption", js.Any.fromFunction2(value))
      
      inline def setFilterOptionUndefined: Self = StObject.set(x, "filterOption", js.undefined)
      
      inline def setFooter(value: (/* props */ TransferListProps[RecordType], /* info */ js.UndefOr[Direction]) => Node): Self = StObject.set(x, "footer", js.Any.fromFunction2(value))
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setListStyle(value: (js.Function1[/* style */ ListStyle, CSSProperties]) | CSSProperties): Self = StObject.set(x, "listStyle", value.asInstanceOf[js.Any])
      
      inline def setListStyleFunction1(value: /* style */ ListStyle => CSSProperties): Self = StObject.set(x, "listStyle", js.Any.fromFunction1(value))
      
      inline def setListStyleUndefined: Self = StObject.set(x, "listStyle", js.undefined)
      
      inline def setLocale(value: PartialTransferLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setOnChange(
        value: (/* targetKeys */ js.Array[String], /* direction */ TransferDirection, /* moveKeys */ js.Array[String]) => Callback
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction3((t0: /* targetKeys */ js.Array[String], t1: /* direction */ TransferDirection, t2: /* moveKeys */ js.Array[String]) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnScroll(value: (/* direction */ TransferDirection, /* e */ ReactEventFrom[HTMLUListElement]) => Callback): Self = StObject.set(x, "onScroll", js.Any.fromFunction2((t0: /* direction */ TransferDirection, t1: /* e */ ReactEventFrom[HTMLUListElement]) => (value(t0, t1)).runNow()))
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setOnSearch(value: (/* direction */ TransferDirection, /* value */ String) => Callback): Self = StObject.set(x, "onSearch", js.Any.fromFunction2((t0: /* direction */ TransferDirection, t1: /* value */ String) => (value(t0, t1)).runNow()))
      
      inline def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
      
      inline def setOnSelectChange(
        value: (/* sourceSelectedKeys */ js.Array[String], /* targetSelectedKeys */ js.Array[String]) => Callback
      ): Self = StObject.set(x, "onSelectChange", js.Any.fromFunction2((t0: /* sourceSelectedKeys */ js.Array[String], t1: /* targetSelectedKeys */ js.Array[String]) => (value(t0, t1)).runNow()))
      
      inline def setOnSelectChangeUndefined: Self = StObject.set(x, "onSelectChange", js.undefined)
      
      inline def setOneWay(value: Boolean): Self = StObject.set(x, "oneWay", value.asInstanceOf[js.Any])
      
      inline def setOneWayUndefined: Self = StObject.set(x, "oneWay", js.undefined)
      
      inline def setOperationStyle(value: CSSProperties): Self = StObject.set(x, "operationStyle", value.asInstanceOf[js.Any])
      
      inline def setOperationStyleUndefined: Self = StObject.set(x, "operationStyle", js.undefined)
      
      inline def setOperations(value: js.Array[String]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
      
      inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
      
      inline def setOperationsVarargs(value: String*): Self = StObject.set(x, "operations", js.Array(value*))
      
      inline def setPagination(value: PaginationType): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
      
      inline def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setRender(value: RecordType => RenderResult): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setRowKey(value: /* record */ RecordType => String): Self = StObject.set(x, "rowKey", js.Any.fromFunction1(value))
      
      inline def setRowKeyUndefined: Self = StObject.set(x, "rowKey", js.undefined)
      
      inline def setSelectAllLabels(value: js.Array[SelectAllLabel]): Self = StObject.set(x, "selectAllLabels", value.asInstanceOf[js.Any])
      
      inline def setSelectAllLabelsUndefined: Self = StObject.set(x, "selectAllLabels", js.undefined)
      
      inline def setSelectAllLabelsVarargs(value: SelectAllLabel*): Self = StObject.set(x, "selectAllLabels", js.Array(value*))
      
      inline def setSelectedKeys(value: js.Array[String]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
      
      inline def setSelectedKeysUndefined: Self = StObject.set(x, "selectedKeys", js.undefined)
      
      inline def setSelectedKeysVarargs(value: String*): Self = StObject.set(x, "selectedKeys", js.Array(value*))
      
      inline def setShowSearch(value: Boolean): Self = StObject.set(x, "showSearch", value.asInstanceOf[js.Any])
      
      inline def setShowSearchUndefined: Self = StObject.set(x, "showSearch", js.undefined)
      
      inline def setShowSelectAll(value: Boolean): Self = StObject.set(x, "showSelectAll", value.asInstanceOf[js.Any])
      
      inline def setShowSelectAllUndefined: Self = StObject.set(x, "showSelectAll", js.undefined)
      
      inline def setStatus(value: InputStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTargetKeys(value: js.Array[String]): Self = StObject.set(x, "targetKeys", value.asInstanceOf[js.Any])
      
      inline def setTargetKeysUndefined: Self = StObject.set(x, "targetKeys", js.undefined)
      
      inline def setTargetKeysVarargs(value: String*): Self = StObject.set(x, "targetKeys", js.Array(value*))
      
      inline def setTitles(value: js.Array[Node]): Self = StObject.set(x, "titles", value.asInstanceOf[js.Any])
      
      inline def setTitlesUndefined: Self = StObject.set(x, "titles", js.undefined)
      
      inline def setTitlesVarargs(value: Node*): Self = StObject.set(x, "titles", js.Array(value*))
    }
  }
  
  type TransferRender[RecordType] = js.Function1[/* item */ RecordType, RenderResult]
  
  trait TransferState extends StObject {
    
    var sourceSelectedKeys: js.Array[String]
    
    var targetSelectedKeys: js.Array[String]
  }
  object TransferState {
    
    inline def apply(sourceSelectedKeys: js.Array[String], targetSelectedKeys: js.Array[String]): TransferState = {
      val __obj = js.Dynamic.literal(sourceSelectedKeys = sourceSelectedKeys.asInstanceOf[js.Any], targetSelectedKeys = targetSelectedKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransferState]
    }
    
    extension [Self <: TransferState](x: Self) {
      
      inline def setSourceSelectedKeys(value: js.Array[String]): Self = StObject.set(x, "sourceSelectedKeys", value.asInstanceOf[js.Any])
      
      inline def setSourceSelectedKeysVarargs(value: String*): Self = StObject.set(x, "sourceSelectedKeys", js.Array(value*))
      
      inline def setTargetSelectedKeys(value: js.Array[String]): Self = StObject.set(x, "targetSelectedKeys", value.asInstanceOf[js.Any])
      
      inline def setTargetSelectedKeysVarargs(value: String*): Self = StObject.set(x, "targetSelectedKeys", js.Array(value*))
    }
  }
}
