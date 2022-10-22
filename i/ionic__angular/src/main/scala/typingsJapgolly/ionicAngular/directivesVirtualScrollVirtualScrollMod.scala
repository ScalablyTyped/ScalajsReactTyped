package typingsJapgolly.ionicAngular

import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.IterableDiffers
import typingsJapgolly.angularCore.mod.NgZone
import typingsJapgolly.angularCore.mod.SimpleChanges
import typingsJapgolly.angularCore.mod.TrackByFunction
import typingsJapgolly.angularCore.mod.ɵɵComponentDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.ionicAngular.anon.ApproxFooterHeight
import typingsJapgolly.ionicAngular.directivesVirtualScrollVirtualFooterMod.VirtualFooter
import typingsJapgolly.ionicAngular.directivesVirtualScrollVirtualHeaderMod.VirtualHeader
import typingsJapgolly.ionicAngular.directivesVirtualScrollVirtualItemMod.VirtualItem
import typingsJapgolly.ionicAngular.ionicAngularBooleans.`false`
import typingsJapgolly.ionicAngular.ionicAngularStrings.Asterisk
import typingsJapgolly.ionicAngular.ionicAngularStrings.`ion-virtual-scroll`
import typingsJapgolly.ionicAngular.ionicAngularStrings.ftrTmp
import typingsJapgolly.ionicAngular.ionicAngularStrings.hdrTmp
import typingsJapgolly.ionicAngular.ionicAngularStrings.itmTmp
import typingsJapgolly.ionicCore.distTypesComponentsVirtualScrollVirtualScrollInterfaceMod.FooterHeightFn
import typingsJapgolly.ionicCore.distTypesComponentsVirtualScrollVirtualScrollInterfaceMod.HeaderFn
import typingsJapgolly.ionicCore.distTypesComponentsVirtualScrollVirtualScrollInterfaceMod.HeaderHeightFn
import typingsJapgolly.ionicCore.distTypesComponentsVirtualScrollVirtualScrollInterfaceMod.ItemHeightFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directivesVirtualScrollVirtualScrollMod {
  
  @JSImport("@ionic/angular/directives/virtual-scroll/virtual-scroll", "IonVirtualScroll")
  @js.native
  open class IonVirtualScroll protected () extends StObject {
    def this(z: NgZone, iterableDiffers: IterableDiffers, elementRef: ElementRef[Any]) = this()
    
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
    
    /**
      * This method marks the tail the items array as dirty, so they can be re-rendered.  It's equivalent to calling:  ```js    * virtualScroll.checkRange(lastItemLen, items.length - lastItemLen);    * ```
      */
    def checkEnd(): Unit = js.native
    
    /**
      * This method marks a subset of items as dirty, so they can be re-rendered. Items should be marked as dirty any time the content or their style changes.  The subset of items to be updated can are specifing by an offset and a length.
      */
    def checkRange(offset: Double): Unit = js.native
    def checkRange(offset: Double, len: Double): Unit = js.native
    
    /* private */ var differ: Any = js.native
    
    /* private */ var el: Any = js.native
    
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
    
    var ftrTmp: VirtualFooter = js.native
    
    /* private */ var getComponent: Any = js.native
    
    var hdrTmp: VirtualHeader = js.native
    
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
    
    /**
      * An optional function that maps each item within their height.
      * When this function is provided, heavy optimizations and fast path can be taked by
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
    var items: js.UndefOr[js.Array[Any] | Null] = js.native
    
    /* private */ var iterableDiffers: Any = js.native
    
    var itmTmp: VirtualItem = js.native
    
    def ngDoCheck(): Unit = js.native
    
    def ngOnChanges(changes: SimpleChanges): Unit = js.native
    
    /* private */ var nodeRender: Any = js.native
    
    /**
      * Returns the position of the virtual item at the given index.
      */
    def positionForItem(index: Double): js.Promise[Double] = js.native
    
    /* private */ var refMap: Any = js.native
    
    /**
      * Same as `ngForTrackBy` which can be used on `ngFor`.
      */
    def trackBy[U /* <: Any */](index: Double, item: Any & U): Any = js.native
    /**
      * Same as `ngForTrackBy` which can be used on `ngFor`.
      */
    @JSName("trackBy")
    var trackBy_Original: TrackByFunction[Any] = js.native
    
    /* private */ var z: Any = js.native
  }
  /* static members */
  object IonVirtualScroll {
    
    @JSImport("@ionic/angular/directives/virtual-scroll/virtual-scroll", "IonVirtualScroll")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ionic/angular/directives/virtual-scroll/virtual-scroll", "IonVirtualScroll.\u0275cmp")
    @js.native
    def ɵcmp: ɵɵComponentDeclaration[
        IonVirtualScroll, 
        `ion-virtual-scroll`, 
        scala.Nothing, 
        ApproxFooterHeight, 
        js.Object, 
        js.Tuple3[itmTmp, hdrTmp, ftrTmp], 
        js.Array[Asterisk], 
        `false`
      ] = js.native
    inline def ɵcmp_=(
      x: ɵɵComponentDeclaration[
          IonVirtualScroll, 
          `ion-virtual-scroll`, 
          scala.Nothing, 
          ApproxFooterHeight, 
          js.Object, 
          js.Tuple3[itmTmp, hdrTmp, ftrTmp], 
          js.Array[Asterisk], 
          `false`
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275cmp")(x.asInstanceOf[js.Any])
    
    @JSImport("@ionic/angular/directives/virtual-scroll/virtual-scroll", "IonVirtualScroll.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[IonVirtualScroll, scala.Nothing] = js.native
    inline def ɵfac_=(x: ɵɵFactoryDeclaration[IonVirtualScroll, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  }
}
