package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonVirtualScrollElement
import typingsJapgolly.ionicCore.distTypesComponentsVirtualScrollVirtualScrollInterfaceMod.DomRenderFn
import typingsJapgolly.ionicCore.distTypesComponentsVirtualScrollVirtualScrollInterfaceMod.FooterHeightFn
import typingsJapgolly.ionicCore.distTypesComponentsVirtualScrollVirtualScrollInterfaceMod.HeaderFn
import typingsJapgolly.ionicCore.distTypesComponentsVirtualScrollVirtualScrollInterfaceMod.HeaderHeightFn
import typingsJapgolly.ionicCore.distTypesComponentsVirtualScrollVirtualScrollInterfaceMod.ItemHeightFn
import typingsJapgolly.ionicCore.distTypesComponentsVirtualScrollVirtualScrollInterfaceMod.ItemRenderFn
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsVirtualScrollVirtualScrollMod {
  
  @JSImport("@ionic/core/dist/types/components/virtual-scroll/virtual-scroll", "VirtualScroll")
  @js.native
  open class VirtualScroll ()
    extends StObject
       with ComponentInterface {
    
    /**
      * The approximate width of each footer template's cell.
      * This dimension is used to help determine how many cells should
      * be created when initialized, and to help calculate the height of
      * the scrollable area. This height value can only use `px` units.
      * Note that the actual rendered size of each cell comes from the
      * app's CSS, whereas this approximation is used to help calculate
      * initial dimensions before the item has been rendered.
      */
    var approxFooterHeight: Double = js.native
    
    /**
      * The approximate height of each header template's cell.
      * This dimension is used to help determine how many cells should
      * be created when initialized, and to help calculate the height of
      * the scrollable area. This height value can only use `px` units.
      * Note that the actual rendered size of each cell comes from the
      * app's CSS, whereas this approximation is used to help calculate
      * initial dimensions before the item has been rendered.
      */
    var approxHeaderHeight: Double = js.native
    
    /**
      * It is important to provide this
      * if virtual item height will be significantly larger than the default
      * The approximate height of each virtual item template's cell.
      * This dimension is used to help determine how many cells should
      * be created when initialized, and to help calculate the height of
      * the scrollable area. This height value can only use `px` units.
      * Note that the actual rendered size of each cell comes from the
      * app's CSS, whereas this approximation is used to help calculate
      * initial dimensions before the item has been rendered.
      */
    var approxItemHeight: Double = js.native
    
    /* private */ var calcCells: Any = js.native
    
    /* private */ var calcHeightIndex: Any = js.native
    
    /* private */ var cells: Any = js.native
    
    /**
      * This method marks the tail the items array as dirty, so they can be re-rendered.
      *
      * It's equivalent to calling:
      *
      * ```js
      * virtualScroll.checkRange(lastItemLen);
      * ```
      */
    def checkEnd(): js.Promise[Unit] = js.native
    
    /**
      * This method marks a subset of items as dirty, so they can be re-rendered. Items should be marked as
      * dirty any time the content or their style changes.
      *
      * The subset of items to be updated can are specifying by an offset and a length.
      */
    def checkRange(offset: Double): js.Promise[Unit] = js.native
    def checkRange(offset: Double, len: Double): js.Promise[Unit] = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MVirtualScroll(): Unit = js.native
    
    @JSName("componentWillLoad")
    def componentWillLoad_MVirtualScroll(): Unit = js.native
    
    @JSName("connectedCallback")
    def connectedCallback_MVirtualScroll(): js.Promise[Unit] = js.native
    
    /* private */ var contentEl: Any = js.native
    
    /* private */ var currentScrollTop: Any = js.native
    
    @JSName("disconnectedCallback")
    def disconnectedCallback_MVirtualScroll(): Unit = js.native
    
    /** @internal */
    var domRender: js.UndefOr[DomRenderFn] = js.native
    
    var el: HTMLIonVirtualScrollElement = js.native
    
    /* private */ var enableScrollEvents: Any = js.native
    
    /**
      * Section footers and the data used within its given
      * template can be dynamically created by passing a function to `footerFn`.
      * The logic within the footer function can decide if the footer template
      * should be used, and what data to give to the footer template. The function
      * must return `null` if a footer cell shouldn't be created.
      */
    var footerFn: js.UndefOr[HeaderFn] = js.native
    
    /**
      * An optional function that maps each item footer within their height.
      */
    var footerHeight: js.UndefOr[FooterHeightFn] = js.native
    
    /* private */ var getHeightIndex: Any = js.native
    
    /**
      * Section headers and the data used within its given
      * template can be dynamically created by passing a function to `headerFn`.
      * For example, a large list of contacts usually has dividers between each
      * letter in the alphabet. App's can provide their own custom `headerFn`
      * which is called with each record within the dataset. The logic within
      * the header function can decide if the header template should be used,
      * and what data to give to the header template. The function must return
      * `null` if a header cell shouldn't be created.
      */
    var headerFn: js.UndefOr[HeaderFn] = js.native
    
    /**
      * An optional function that maps each item header within their height.
      */
    var headerHeight: js.UndefOr[HeaderHeightFn] = js.native
    
    /* private */ var heightIndex: Any = js.native
    
    /* private */ var indexDirty: Any = js.native
    
    /* private */ var isEnabled: Any = js.native
    
    /**
      * An optional function that maps each item within their height.
      * When this function is provides, heavy optimizations and fast path can be taked by
      * `ion-virtual-scroll` leading to massive performance improvements.
      *
      * This function allows to skip all DOM reads, which can be Doing so leads
      * to massive performance
      */
    var itemHeight: js.UndefOr[ItemHeightFn] = js.native
    
    /**
      * The data that builds the templates within the virtual scroll.
      * It's important to note that when this data has changed, then the
      * entire virtual scroll is reset, which is an expensive operation and
      * should be avoided if possible.
      */
    var items: js.UndefOr[js.Array[Any]] = js.native
    
    def itemsChanged(): Unit = js.native
    
    /* private */ var lastItemLen: Any = js.native
    
    /**
      * NOTE: only Vanilla JS API.
      */
    var nodeRender: js.UndefOr[ItemRenderFn] = js.native
    
    def onResize(): Unit = js.native
    
    /* private */ var onScroll: Any = js.native
    
    /**
      * Returns the position of the virtual item at the given index.
      */
    def positionForItem(index: Double): js.Promise[Double] = js.native
    
    /* private */ var range: Any = js.native
    
    /* private */ var readVS: Any = js.native
    
    /**
      * NOTE: only JSX API for stencil.
      *
      * Provide a render function for the footer to be rendered. Returns a JSX virtual-dom.
      */
    var renderFooter: js.UndefOr[js.Function2[/* item */ Any, /* index */ Double, Any]] = js.native
    
    /**
      * NOTE: only JSX API for stencil.
      *
      * Provide a render function for the header to be rendered. Returns a JSX virtual-dom.
      */
    var renderHeader: js.UndefOr[js.Function2[/* item */ Any, /* index */ Double, Any]] = js.native
    
    /**
      * NOTE: only JSX API for stencil.
      *
      * Provide a render function for the items to be rendered. Returns a JSX virtual-dom.
      */
    var renderItem: js.UndefOr[js.Function2[/* item */ Any, /* index */ Double, Any]] = js.native
    
    /* private */ var renderVirtualNode: Any = js.native
    
    @JSName("render")
    def render_MVirtualScroll(): Any = js.native
    
    /* private */ var rmEvent: Any = js.native
    
    /* private */ var scheduleUpdate: Any = js.native
    
    /* private */ var scrollEl: Any = js.native
    
    /* private */ var setCellHeight: Any = js.native
    
    /* private */ var timerUpdate: Any = js.native
    
    var totalHeight: Double = js.native
    
    /* private */ var updateCellHeight: Any = js.native
    
    /* private */ var updateState: Any = js.native
    
    /* private */ var updateVirtualScroll: Any = js.native
    
    /* private */ var viewportHeight: Any = js.native
    
    /* private */ var viewportOffset: Any = js.native
    
    /* private */ var virtualDom: Any = js.native
    
    /* private */ var writeVS: Any = js.native
  }
}
