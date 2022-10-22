package typingsJapgolly.antd

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antd.antdBooleans.`false`
import typingsJapgolly.antd.libListItemMod.ListItemTypeProps
import typingsJapgolly.antd.libPaginationPaginationMod.PaginationConfig
import typingsJapgolly.antd.libSpinMod.SpinProps
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Consumer
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libListMod {
  
  object default {
    
    inline def apply[T](
      hasPaginationCustomizePrefixClsBorderedSplitClassNameChildrenItemLayoutLoadMoreGridDataSourceSizeHeaderFooterLoadingRowKeyRenderItemLocaleRest: ListProps[T]
    ): Element = ^.asInstanceOf[js.Dynamic].apply(hasPaginationCustomizePrefixClsBorderedSplitClassNameChildrenItemLayoutLoadMoreGridDataSourceSizeHeaderFooterLoadingRowKeyRenderItemLocaleRest.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("antd/lib/list", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/lib/list", "default.Item")
    @js.native
    def Item: ListItemTypeProps = js.native
    inline def Item_=(x: ListItemTypeProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("antd/lib/list", "ListConsumer")
  @js.native
  val ListConsumer: Consumer[ListConsumerProps] = js.native
  
  @JSImport("antd/lib/list", "ListContext")
  @js.native
  val ListContext: Context[ListConsumerProps] = js.native
  
  type ColumnCount = Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antd.antdStrings.gutter
    - typingsJapgolly.antd.antdStrings.column
    - typingsJapgolly.antd.antdStrings.xs
    - typingsJapgolly.antd.antdStrings.sm
    - typingsJapgolly.antd.antdStrings.md
    - typingsJapgolly.antd.antdStrings.lg
    - typingsJapgolly.antd.antdStrings.xl
    - typingsJapgolly.antd.antdStrings.xxl
  */
  trait ColumnType extends StObject
  object ColumnType {
    
    inline def column: typingsJapgolly.antd.antdStrings.column = "column".asInstanceOf[typingsJapgolly.antd.antdStrings.column]
    
    inline def gutter: typingsJapgolly.antd.antdStrings.gutter = "gutter".asInstanceOf[typingsJapgolly.antd.antdStrings.gutter]
    
    inline def lg: typingsJapgolly.antd.antdStrings.lg = "lg".asInstanceOf[typingsJapgolly.antd.antdStrings.lg]
    
    inline def md: typingsJapgolly.antd.antdStrings.md = "md".asInstanceOf[typingsJapgolly.antd.antdStrings.md]
    
    inline def sm: typingsJapgolly.antd.antdStrings.sm = "sm".asInstanceOf[typingsJapgolly.antd.antdStrings.sm]
    
    inline def xl: typingsJapgolly.antd.antdStrings.xl = "xl".asInstanceOf[typingsJapgolly.antd.antdStrings.xl]
    
    inline def xs: typingsJapgolly.antd.antdStrings.xs = "xs".asInstanceOf[typingsJapgolly.antd.antdStrings.xs]
    
    inline def xxl: typingsJapgolly.antd.antdStrings.xxl = "xxl".asInstanceOf[typingsJapgolly.antd.antdStrings.xxl]
  }
  
  trait ListConsumerProps extends StObject {
    
    var grid: js.UndefOr[Any] = js.undefined
    
    var itemLayout: js.UndefOr[String] = js.undefined
  }
  object ListConsumerProps {
    
    inline def apply(): ListConsumerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListConsumerProps]
    }
    
    extension [Self <: ListConsumerProps](x: Self) {
      
      inline def setGrid(value: Any): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      inline def setItemLayout(value: String): Self = StObject.set(x, "itemLayout", value.asInstanceOf[js.Any])
      
      inline def setItemLayoutUndefined: Self = StObject.set(x, "itemLayout", js.undefined)
    }
  }
  
  trait ListGridType extends StObject {
    
    var column: js.UndefOr[ColumnCount] = js.undefined
    
    var gutter: js.UndefOr[Double] = js.undefined
    
    var lg: js.UndefOr[ColumnCount] = js.undefined
    
    var md: js.UndefOr[ColumnCount] = js.undefined
    
    var sm: js.UndefOr[ColumnCount] = js.undefined
    
    var xl: js.UndefOr[ColumnCount] = js.undefined
    
    var xs: js.UndefOr[ColumnCount] = js.undefined
    
    var xxl: js.UndefOr[ColumnCount] = js.undefined
  }
  object ListGridType {
    
    inline def apply(): ListGridType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListGridType]
    }
    
    extension [Self <: ListGridType](x: Self) {
      
      inline def setColumn(value: ColumnCount): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setGutter(value: Double): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
      
      inline def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
      
      inline def setLg(value: ColumnCount): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
      
      inline def setLgUndefined: Self = StObject.set(x, "lg", js.undefined)
      
      inline def setMd(value: ColumnCount): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      inline def setMdUndefined: Self = StObject.set(x, "md", js.undefined)
      
      inline def setSm(value: ColumnCount): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
      
      inline def setSmUndefined: Self = StObject.set(x, "sm", js.undefined)
      
      inline def setXl(value: ColumnCount): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
      
      inline def setXlUndefined: Self = StObject.set(x, "xl", js.undefined)
      
      inline def setXs(value: ColumnCount): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
      
      inline def setXsUndefined: Self = StObject.set(x, "xs", js.undefined)
      
      inline def setXxl(value: ColumnCount): Self = StObject.set(x, "xxl", value.asInstanceOf[js.Any])
      
      inline def setXxlUndefined: Self = StObject.set(x, "xxl", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antd.antdStrings.horizontal
    - typingsJapgolly.antd.antdStrings.vertical
  */
  trait ListItemLayout extends StObject
  object ListItemLayout {
    
    inline def horizontal: typingsJapgolly.antd.antdStrings.horizontal = "horizontal".asInstanceOf[typingsJapgolly.antd.antdStrings.horizontal]
    
    inline def vertical: typingsJapgolly.antd.antdStrings.vertical = "vertical".asInstanceOf[typingsJapgolly.antd.antdStrings.vertical]
  }
  
  trait ListLocale extends StObject {
    
    var emptyText: Node
  }
  object ListLocale {
    
    inline def apply(): ListLocale = {
      val __obj = js.Dynamic.literal(emptyText = null)
      __obj.asInstanceOf[ListLocale]
    }
    
    extension [Self <: ListLocale](x: Self) {
      
      inline def setEmptyText(value: VdomNode): Self = StObject.set(x, "emptyText", value.rawNode.asInstanceOf[js.Any])
      
      inline def setEmptyTextNull: Self = StObject.set(x, "emptyText", null)
      
      inline def setEmptyTextVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "emptyText", js.Array(value*))
      
      inline def setEmptyTextVdomElement(value: VdomElement): Self = StObject.set(x, "emptyText", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait ListProps[T] extends StObject {
    
    var bordered: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataSource: js.UndefOr[js.Array[T]] = js.undefined
    
    var extra: js.UndefOr[Node] = js.undefined
    
    var footer: js.UndefOr[Node] = js.undefined
    
    var grid: js.UndefOr[ListGridType] = js.undefined
    
    var header: js.UndefOr[Node] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var itemLayout: js.UndefOr[ListItemLayout] = js.undefined
    
    var loadMore: js.UndefOr[Node] = js.undefined
    
    var loading: js.UndefOr[Boolean | SpinProps] = js.undefined
    
    var locale: js.UndefOr[ListLocale] = js.undefined
    
    var pagination: js.UndefOr[PaginationConfig | `false`] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var renderItem: js.UndefOr[js.Function2[/* item */ T, /* index */ Double, Node]] = js.undefined
    
    var rowKey: js.UndefOr[(js.Function1[/* item */ T, Key]) | (/* keyof T */ String)] = js.undefined
    
    var size: js.UndefOr[ListSize] = js.undefined
    
    var split: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object ListProps {
    
    inline def apply[T](): ListProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListProps[T]]
    }
    
    extension [Self <: ListProps[?], T](x: Self & ListProps[T]) {
      
      inline def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
      
      inline def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataSource(value: js.Array[T]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      inline def setDataSourceVarargs(value: T*): Self = StObject.set(x, "dataSource", js.Array(value*))
      
      inline def setExtra(value: VdomNode): Self = StObject.set(x, "extra", value.rawNode.asInstanceOf[js.Any])
      
      inline def setExtraNull: Self = StObject.set(x, "extra", null)
      
      inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      inline def setExtraVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "extra", js.Array(value*))
      
      inline def setExtraVdomElement(value: VdomElement): Self = StObject.set(x, "extra", value.rawElement.asInstanceOf[js.Any])
      
      inline def setFooter(value: VdomNode): Self = StObject.set(x, "footer", value.rawNode.asInstanceOf[js.Any])
      
      inline def setFooterNull: Self = StObject.set(x, "footer", null)
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setFooterVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "footer", js.Array(value*))
      
      inline def setFooterVdomElement(value: VdomElement): Self = StObject.set(x, "footer", value.rawElement.asInstanceOf[js.Any])
      
      inline def setGrid(value: ListGridType): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      inline def setHeader(value: VdomNode): Self = StObject.set(x, "header", value.rawNode.asInstanceOf[js.Any])
      
      inline def setHeaderNull: Self = StObject.set(x, "header", null)
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setHeaderVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "header", js.Array(value*))
      
      inline def setHeaderVdomElement(value: VdomElement): Self = StObject.set(x, "header", value.rawElement.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setItemLayout(value: ListItemLayout): Self = StObject.set(x, "itemLayout", value.asInstanceOf[js.Any])
      
      inline def setItemLayoutUndefined: Self = StObject.set(x, "itemLayout", js.undefined)
      
      inline def setLoadMore(value: VdomNode): Self = StObject.set(x, "loadMore", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLoadMoreNull: Self = StObject.set(x, "loadMore", null)
      
      inline def setLoadMoreUndefined: Self = StObject.set(x, "loadMore", js.undefined)
      
      inline def setLoadMoreVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "loadMore", js.Array(value*))
      
      inline def setLoadMoreVdomElement(value: VdomElement): Self = StObject.set(x, "loadMore", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLoading(value: Boolean | SpinProps): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setLocale(value: ListLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setPagination(value: PaginationConfig | `false`): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
      
      inline def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setRenderItem(value: (/* item */ T, /* index */ Double) => Node): Self = StObject.set(x, "renderItem", js.Any.fromFunction2(value))
      
      inline def setRenderItemUndefined: Self = StObject.set(x, "renderItem", js.undefined)
      
      inline def setRowKey(value: (js.Function1[/* item */ T, Key]) | (/* keyof T */ String)): Self = StObject.set(x, "rowKey", value.asInstanceOf[js.Any])
      
      inline def setRowKeyFunction1(value: /* item */ T => Key): Self = StObject.set(x, "rowKey", js.Any.fromFunction1(value))
      
      inline def setRowKeyUndefined: Self = StObject.set(x, "rowKey", js.undefined)
      
      inline def setSize(value: ListSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSplit(value: Boolean): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
      
      inline def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antd.antdStrings.small
    - typingsJapgolly.antd.antdStrings.default
    - typingsJapgolly.antd.antdStrings.large
  */
  trait ListSize extends StObject
  object ListSize {
    
    inline def default: typingsJapgolly.antd.antdStrings.default = "default".asInstanceOf[typingsJapgolly.antd.antdStrings.default]
    
    inline def large: typingsJapgolly.antd.antdStrings.large = "large".asInstanceOf[typingsJapgolly.antd.antdStrings.large]
    
    inline def small: typingsJapgolly.antd.antdStrings.small = "small".asInstanceOf[typingsJapgolly.antd.antdStrings.small]
  }
}
