package typingsJapgolly.rcPagination

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.rcPagination.rcPaginationStrings.`jump-next`
import typingsJapgolly.rcPagination.rcPaginationStrings.`jump-prev`
import typingsJapgolly.rcPagination.rcPaginationStrings.next
import typingsJapgolly.rcPagination.rcPaginationStrings.page
import typingsJapgolly.rcPagination.rcPaginationStrings.prev
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-pagination", JSImport.Default)
  @js.native
  open class default ()
    extends Component[PaginationProps, js.Object, Any]
  
  type Pagination = japgolly.scalajs.react.facade.React.Component[PaginationProps & js.Object, js.Object]
  
  trait PaginationData extends StObject {
    
    var className: String
    
    var current: Double
    
    var defaultCurrent: Double
    
    var defaultPageSize: Double
    
    var disabled: Boolean
    
    var hideOnSinglePage: Boolean
    
    var jumpNextIcon: ComponentType[js.Object] | Node
    
    var jumpPrevIcon: ComponentType[js.Object] | Node
    
    var locale: PaginationLocale
    
    var nextIcon: ComponentType[js.Object] | Node
    
    var pageSize: Double
    
    var pageSizeOptions: js.Array[Double | String]
    
    var prefixCls: String
    
    var prevIcon: ComponentType[js.Object] | Node
    
    var selectComponentClass: ComponentType[js.Object]
    
    var selectPrefixCls: String
    
    var showLessItems: Boolean
    
    var showPrevNextJumpers: Boolean
    
    var showQuickJumper: Boolean | js.Object
    
    var showSizeChanger: Boolean
    
    var showTitle: Boolean
    
    var simple: Boolean
    
    var style: CSSProperties
    
    var total: Double
  }
  object PaginationData {
    
    inline def apply(
      className: String,
      current: Double,
      defaultCurrent: Double,
      defaultPageSize: Double,
      disabled: Boolean,
      hideOnSinglePage: Boolean,
      locale: PaginationLocale,
      pageSize: Double,
      pageSizeOptions: js.Array[Double | String],
      prefixCls: String,
      selectComponentClass: ComponentType[js.Object],
      selectPrefixCls: String,
      showLessItems: Boolean,
      showPrevNextJumpers: Boolean,
      showQuickJumper: Boolean | js.Object,
      showSizeChanger: Boolean,
      showTitle: Boolean,
      simple: Boolean,
      style: CSSProperties,
      total: Double
    ): PaginationData = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], defaultCurrent = defaultCurrent.asInstanceOf[js.Any], defaultPageSize = defaultPageSize.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], hideOnSinglePage = hideOnSinglePage.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any], pageSizeOptions = pageSizeOptions.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], selectComponentClass = selectComponentClass.asInstanceOf[js.Any], selectPrefixCls = selectPrefixCls.asInstanceOf[js.Any], showLessItems = showLessItems.asInstanceOf[js.Any], showPrevNextJumpers = showPrevNextJumpers.asInstanceOf[js.Any], showQuickJumper = showQuickJumper.asInstanceOf[js.Any], showSizeChanger = showSizeChanger.asInstanceOf[js.Any], showTitle = showTitle.asInstanceOf[js.Any], simple = simple.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], jumpNextIcon = null, jumpPrevIcon = null, nextIcon = null, prevIcon = null)
      __obj.asInstanceOf[PaginationData]
    }
    
    extension [Self <: PaginationData](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setDefaultCurrent(value: Double): Self = StObject.set(x, "defaultCurrent", value.asInstanceOf[js.Any])
      
      inline def setDefaultPageSize(value: Double): Self = StObject.set(x, "defaultPageSize", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setHideOnSinglePage(value: Boolean): Self = StObject.set(x, "hideOnSinglePage", value.asInstanceOf[js.Any])
      
      inline def setJumpNextIcon(value: ComponentType[js.Object] | Node): Self = StObject.set(x, "jumpNextIcon", value.asInstanceOf[js.Any])
      
      inline def setJumpNextIconNull: Self = StObject.set(x, "jumpNextIcon", null)
      
      inline def setJumpNextIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "jumpNextIcon", js.Array(value*))
      
      inline def setJumpNextIconVdomElement(value: VdomElement): Self = StObject.set(x, "jumpNextIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setJumpPrevIcon(value: ComponentType[js.Object] | Node): Self = StObject.set(x, "jumpPrevIcon", value.asInstanceOf[js.Any])
      
      inline def setJumpPrevIconNull: Self = StObject.set(x, "jumpPrevIcon", null)
      
      inline def setJumpPrevIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "jumpPrevIcon", js.Array(value*))
      
      inline def setJumpPrevIconVdomElement(value: VdomElement): Self = StObject.set(x, "jumpPrevIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLocale(value: PaginationLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setNextIcon(value: ComponentType[js.Object] | Node): Self = StObject.set(x, "nextIcon", value.asInstanceOf[js.Any])
      
      inline def setNextIconNull: Self = StObject.set(x, "nextIcon", null)
      
      inline def setNextIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "nextIcon", js.Array(value*))
      
      inline def setNextIconVdomElement(value: VdomElement): Self = StObject.set(x, "nextIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeOptions(value: js.Array[Double | String]): Self = StObject.set(x, "pageSizeOptions", value.asInstanceOf[js.Any])
      
      inline def setPageSizeOptionsVarargs(value: (Double | String)*): Self = StObject.set(x, "pageSizeOptions", js.Array(value*))
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrevIcon(value: ComponentType[js.Object] | Node): Self = StObject.set(x, "prevIcon", value.asInstanceOf[js.Any])
      
      inline def setPrevIconNull: Self = StObject.set(x, "prevIcon", null)
      
      inline def setPrevIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "prevIcon", js.Array(value*))
      
      inline def setPrevIconVdomElement(value: VdomElement): Self = StObject.set(x, "prevIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSelectComponentClass(value: ComponentType[js.Object]): Self = StObject.set(x, "selectComponentClass", value.asInstanceOf[js.Any])
      
      inline def setSelectPrefixCls(value: String): Self = StObject.set(x, "selectPrefixCls", value.asInstanceOf[js.Any])
      
      inline def setShowLessItems(value: Boolean): Self = StObject.set(x, "showLessItems", value.asInstanceOf[js.Any])
      
      inline def setShowPrevNextJumpers(value: Boolean): Self = StObject.set(x, "showPrevNextJumpers", value.asInstanceOf[js.Any])
      
      inline def setShowQuickJumper(value: Boolean | js.Object): Self = StObject.set(x, "showQuickJumper", value.asInstanceOf[js.Any])
      
      inline def setShowSizeChanger(value: Boolean): Self = StObject.set(x, "showSizeChanger", value.asInstanceOf[js.Any])
      
      inline def setShowTitle(value: Boolean): Self = StObject.set(x, "showTitle", value.asInstanceOf[js.Any])
      
      inline def setSimple(value: Boolean): Self = StObject.set(x, "simple", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  trait PaginationLocale extends StObject {
    
    // Options.jsx
    var items_per_page: js.UndefOr[String] = js.undefined
    
    var jump_to: js.UndefOr[String] = js.undefined
    
    var jump_to_confirm: js.UndefOr[String] = js.undefined
    
    var next_3: js.UndefOr[String] = js.undefined
    
    var next_5: js.UndefOr[String] = js.undefined
    
    var next_page: js.UndefOr[String] = js.undefined
    
    var page: js.UndefOr[String] = js.undefined
    
    var prev_3: js.UndefOr[String] = js.undefined
    
    var prev_5: js.UndefOr[String] = js.undefined
    
    // Pagination.jsx
    var prev_page: js.UndefOr[String] = js.undefined
  }
  object PaginationLocale {
    
    inline def apply(): PaginationLocale = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginationLocale]
    }
    
    extension [Self <: PaginationLocale](x: Self) {
      
      inline def setItems_per_page(value: String): Self = StObject.set(x, "items_per_page", value.asInstanceOf[js.Any])
      
      inline def setItems_per_pageUndefined: Self = StObject.set(x, "items_per_page", js.undefined)
      
      inline def setJump_to(value: String): Self = StObject.set(x, "jump_to", value.asInstanceOf[js.Any])
      
      inline def setJump_toUndefined: Self = StObject.set(x, "jump_to", js.undefined)
      
      inline def setJump_to_confirm(value: String): Self = StObject.set(x, "jump_to_confirm", value.asInstanceOf[js.Any])
      
      inline def setJump_to_confirmUndefined: Self = StObject.set(x, "jump_to_confirm", js.undefined)
      
      inline def setNext_3(value: String): Self = StObject.set(x, "next_3", value.asInstanceOf[js.Any])
      
      inline def setNext_3Undefined: Self = StObject.set(x, "next_3", js.undefined)
      
      inline def setNext_5(value: String): Self = StObject.set(x, "next_5", value.asInstanceOf[js.Any])
      
      inline def setNext_5Undefined: Self = StObject.set(x, "next_5", js.undefined)
      
      inline def setNext_page(value: String): Self = StObject.set(x, "next_page", value.asInstanceOf[js.Any])
      
      inline def setNext_pageUndefined: Self = StObject.set(x, "next_page", js.undefined)
      
      inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      inline def setPrev_3(value: String): Self = StObject.set(x, "prev_3", value.asInstanceOf[js.Any])
      
      inline def setPrev_3Undefined: Self = StObject.set(x, "prev_3", js.undefined)
      
      inline def setPrev_5(value: String): Self = StObject.set(x, "prev_5", value.asInstanceOf[js.Any])
      
      inline def setPrev_5Undefined: Self = StObject.set(x, "prev_5", js.undefined)
      
      inline def setPrev_page(value: String): Self = StObject.set(x, "prev_page", value.asInstanceOf[js.Any])
      
      inline def setPrev_pageUndefined: Self = StObject.set(x, "prev_page", js.undefined)
    }
  }
  
  /* Inlined parent std.Partial<rc-pagination.rc-pagination.PaginationData> */
  trait PaginationProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var current: js.UndefOr[Double] = js.undefined
    
    var defaultCurrent: js.UndefOr[Double] = js.undefined
    
    var defaultPageSize: js.UndefOr[Double] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var hideOnSinglePage: js.UndefOr[Boolean] = js.undefined
    
    var itemRender: js.UndefOr[
        js.Function3[
          /* page */ Double, 
          /* type */ page | prev | next | `jump-prev` | `jump-next`, 
          /* element */ Node, 
          Node
        ]
      ] = js.undefined
    
    var jumpNextIcon: js.UndefOr[ComponentType[js.Object] | Node] = js.undefined
    
    var jumpPrevIcon: js.UndefOr[ComponentType[js.Object] | Node] = js.undefined
    
    var locale: js.UndefOr[PaginationLocale] = js.undefined
    
    var nextIcon: js.UndefOr[ComponentType[js.Object] | Node] = js.undefined
    
    var onChange: js.UndefOr[js.Function2[/* page */ Double, /* pageSize */ Double, Unit]] = js.undefined
    
    var onShowSizeChange: js.UndefOr[js.Function2[/* current */ Double, /* size */ Double, Unit]] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageSizeOptions: js.UndefOr[js.Array[Double | String]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var prevIcon: js.UndefOr[ComponentType[js.Object] | Node] = js.undefined
    
    var selectComponentClass: js.UndefOr[ComponentType[js.Object]] = js.undefined
    
    var selectPrefixCls: js.UndefOr[String] = js.undefined
    
    var showLessItems: js.UndefOr[Boolean] = js.undefined
    
    var showPrevNextJumpers: js.UndefOr[Boolean] = js.undefined
    
    var showQuickJumper: js.UndefOr[Boolean | js.Object] = js.undefined
    
    var showSizeChanger: js.UndefOr[Boolean] = js.undefined
    
    var showTitle: js.UndefOr[Boolean] = js.undefined
    
    var showTotal: js.UndefOr[js.Function2[/* total */ Double, /* range */ js.Tuple2[Double, Double], Node]] = js.undefined
    
    var simple: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var total: js.UndefOr[Double] = js.undefined
  }
  object PaginationProps {
    
    inline def apply(): PaginationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginationProps]
    }
    
    extension [Self <: PaginationProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      inline def setDefaultCurrent(value: Double): Self = StObject.set(x, "defaultCurrent", value.asInstanceOf[js.Any])
      
      inline def setDefaultCurrentUndefined: Self = StObject.set(x, "defaultCurrent", js.undefined)
      
      inline def setDefaultPageSize(value: Double): Self = StObject.set(x, "defaultPageSize", value.asInstanceOf[js.Any])
      
      inline def setDefaultPageSizeUndefined: Self = StObject.set(x, "defaultPageSize", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHideOnSinglePage(value: Boolean): Self = StObject.set(x, "hideOnSinglePage", value.asInstanceOf[js.Any])
      
      inline def setHideOnSinglePageUndefined: Self = StObject.set(x, "hideOnSinglePage", js.undefined)
      
      inline def setItemRender(
        value: (/* page */ Double, /* type */ page | prev | next | `jump-prev` | `jump-next`, /* element */ Node) => Node
      ): Self = StObject.set(x, "itemRender", js.Any.fromFunction3(value))
      
      inline def setItemRenderUndefined: Self = StObject.set(x, "itemRender", js.undefined)
      
      inline def setJumpNextIcon(value: ComponentType[js.Object] | Node): Self = StObject.set(x, "jumpNextIcon", value.asInstanceOf[js.Any])
      
      inline def setJumpNextIconNull: Self = StObject.set(x, "jumpNextIcon", null)
      
      inline def setJumpNextIconUndefined: Self = StObject.set(x, "jumpNextIcon", js.undefined)
      
      inline def setJumpNextIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "jumpNextIcon", js.Array(value*))
      
      inline def setJumpNextIconVdomElement(value: VdomElement): Self = StObject.set(x, "jumpNextIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setJumpPrevIcon(value: ComponentType[js.Object] | Node): Self = StObject.set(x, "jumpPrevIcon", value.asInstanceOf[js.Any])
      
      inline def setJumpPrevIconNull: Self = StObject.set(x, "jumpPrevIcon", null)
      
      inline def setJumpPrevIconUndefined: Self = StObject.set(x, "jumpPrevIcon", js.undefined)
      
      inline def setJumpPrevIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "jumpPrevIcon", js.Array(value*))
      
      inline def setJumpPrevIconVdomElement(value: VdomElement): Self = StObject.set(x, "jumpPrevIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLocale(value: PaginationLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setNextIcon(value: ComponentType[js.Object] | Node): Self = StObject.set(x, "nextIcon", value.asInstanceOf[js.Any])
      
      inline def setNextIconNull: Self = StObject.set(x, "nextIcon", null)
      
      inline def setNextIconUndefined: Self = StObject.set(x, "nextIcon", js.undefined)
      
      inline def setNextIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "nextIcon", js.Array(value*))
      
      inline def setNextIconVdomElement(value: VdomElement): Self = StObject.set(x, "nextIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnChange(value: (/* page */ Double, /* pageSize */ Double) => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: /* page */ Double, t1: /* pageSize */ Double) => (value(t0, t1)).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnShowSizeChange(value: (/* current */ Double, /* size */ Double) => Callback): Self = StObject.set(x, "onShowSizeChange", js.Any.fromFunction2((t0: /* current */ Double, t1: /* size */ Double) => (value(t0, t1)).runNow()))
      
      inline def setOnShowSizeChangeUndefined: Self = StObject.set(x, "onShowSizeChange", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeOptions(value: js.Array[Double | String]): Self = StObject.set(x, "pageSizeOptions", value.asInstanceOf[js.Any])
      
      inline def setPageSizeOptionsUndefined: Self = StObject.set(x, "pageSizeOptions", js.undefined)
      
      inline def setPageSizeOptionsVarargs(value: (Double | String)*): Self = StObject.set(x, "pageSizeOptions", js.Array(value*))
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setPrevIcon(value: ComponentType[js.Object] | Node): Self = StObject.set(x, "prevIcon", value.asInstanceOf[js.Any])
      
      inline def setPrevIconNull: Self = StObject.set(x, "prevIcon", null)
      
      inline def setPrevIconUndefined: Self = StObject.set(x, "prevIcon", js.undefined)
      
      inline def setPrevIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "prevIcon", js.Array(value*))
      
      inline def setPrevIconVdomElement(value: VdomElement): Self = StObject.set(x, "prevIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSelectComponentClass(value: ComponentType[js.Object]): Self = StObject.set(x, "selectComponentClass", value.asInstanceOf[js.Any])
      
      inline def setSelectComponentClassUndefined: Self = StObject.set(x, "selectComponentClass", js.undefined)
      
      inline def setSelectPrefixCls(value: String): Self = StObject.set(x, "selectPrefixCls", value.asInstanceOf[js.Any])
      
      inline def setSelectPrefixClsUndefined: Self = StObject.set(x, "selectPrefixCls", js.undefined)
      
      inline def setShowLessItems(value: Boolean): Self = StObject.set(x, "showLessItems", value.asInstanceOf[js.Any])
      
      inline def setShowLessItemsUndefined: Self = StObject.set(x, "showLessItems", js.undefined)
      
      inline def setShowPrevNextJumpers(value: Boolean): Self = StObject.set(x, "showPrevNextJumpers", value.asInstanceOf[js.Any])
      
      inline def setShowPrevNextJumpersUndefined: Self = StObject.set(x, "showPrevNextJumpers", js.undefined)
      
      inline def setShowQuickJumper(value: Boolean | js.Object): Self = StObject.set(x, "showQuickJumper", value.asInstanceOf[js.Any])
      
      inline def setShowQuickJumperUndefined: Self = StObject.set(x, "showQuickJumper", js.undefined)
      
      inline def setShowSizeChanger(value: Boolean): Self = StObject.set(x, "showSizeChanger", value.asInstanceOf[js.Any])
      
      inline def setShowSizeChangerUndefined: Self = StObject.set(x, "showSizeChanger", js.undefined)
      
      inline def setShowTitle(value: Boolean): Self = StObject.set(x, "showTitle", value.asInstanceOf[js.Any])
      
      inline def setShowTitleUndefined: Self = StObject.set(x, "showTitle", js.undefined)
      
      inline def setShowTotal(value: (/* total */ Double, /* range */ js.Tuple2[Double, Double]) => Node): Self = StObject.set(x, "showTotal", js.Any.fromFunction2(value))
      
      inline def setShowTotalUndefined: Self = StObject.set(x, "showTotal", js.undefined)
      
      inline def setSimple(value: Boolean): Self = StObject.set(x, "simple", value.asInstanceOf[js.Any])
      
      inline def setSimpleUndefined: Self = StObject.set(x, "simple", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    }
  }
}
