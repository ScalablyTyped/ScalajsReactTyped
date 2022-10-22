package typingsJapgolly.ngxInfiniteScroll

import typingsJapgolly.angularCore.mod.AfterViewInit
import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.EventEmitter
import typingsJapgolly.angularCore.mod.NgZone
import typingsJapgolly.angularCore.mod.OnChanges
import typingsJapgolly.angularCore.mod.OnDestroy
import typingsJapgolly.angularCore.mod.SimpleChanges
import typingsJapgolly.angularCore.mod.ɵɵDirectiveDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.ngxInfiniteScroll.anon.AlwaysCallback
import typingsJapgolly.ngxInfiniteScroll.anon.Scrolled
import typingsJapgolly.ngxInfiniteScroll.modelsMod.IInfiniteScrollAction
import typingsJapgolly.ngxInfiniteScroll.modelsMod.IInfiniteScrollEvent
import typingsJapgolly.ngxInfiniteScroll.ngxInfiniteScrollBooleans.`false`
import typingsJapgolly.ngxInfiniteScroll.ngxInfiniteScrollStrings.`[infiniteScroll]Comma [infinite-scroll]Comma [data-infinite-scroll]`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNgxInfiniteScrollDotdirectiveMod {
  
  @JSImport("ngx-infinite-scroll/lib/ngx-infinite-scroll.directive", "InfiniteScrollDirective")
  @js.native
  open class InfiniteScrollDirective protected ()
    extends StObject
       with OnDestroy
       with OnChanges
       with AfterViewInit {
    def this(element: ElementRef[Any], zone: NgZone) = this()
    
    var alwaysCallback: Boolean = js.native
    
    def destroyScroller(): Unit = js.native
    
    /* private */ var disposeScroller: Any = js.native
    
    /* private */ var element: Any = js.native
    
    var fromRoot: Boolean = js.native
    
    def handleOnScroll(hasTypePayload: IInfiniteScrollAction): Unit = js.native
    
    var horizontal: Boolean = js.native
    
    var immediateCheck: Boolean = js.native
    
    var infiniteScrollContainer: Any = js.native
    
    var infiniteScrollDisabled: Boolean = js.native
    
    var infiniteScrollDistance: Double = js.native
    
    var infiniteScrollThrottle: Double = js.native
    
    var infiniteScrollUpDistance: Double = js.native
    
    /**
      * A callback method that is invoked immediately after
      * Angular has completed initialization of a component's view.
      * It is invoked only once when the view is instantiated.
      *
      */
    /* CompleteClass */
    override def ngAfterViewInit(): Unit = js.native
    
    /**
      * A callback method that is invoked immediately after the
      * default change detector has checked data-bound properties
      * if at least one has changed, and before the view and content
      * children are checked.
      * @param changes The changed properties.
      */
    /* CompleteClass */
    override def ngOnChanges(changes: SimpleChanges): Unit = js.native
    
    /**
      * A callback method that performs custom clean-up, invoked immediately
      * before a directive, pipe, or service instance is destroyed.
      */
    /* CompleteClass */
    override def ngOnDestroy(): Unit = js.native
    
    var scrollWindow: Boolean = js.native
    
    var scrolled: EventEmitter[IInfiniteScrollEvent] = js.native
    
    var scrolledUp: EventEmitter[IInfiniteScrollEvent] = js.native
    
    def setup(): Unit = js.native
    
    /* private */ var zone: Any = js.native
  }
  /* static members */
  object InfiniteScrollDirective {
    
    @JSImport("ngx-infinite-scroll/lib/ngx-infinite-scroll.directive", "InfiniteScrollDirective")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ngx-infinite-scroll/lib/ngx-infinite-scroll.directive", "InfiniteScrollDirective.\u0275dir")
    @js.native
    def ɵdir: ɵɵDirectiveDeclaration[
        InfiniteScrollDirective, 
        `[infiniteScroll]Comma [infinite-scroll]Comma [data-infinite-scroll]`, 
        scala.Nothing, 
        AlwaysCallback, 
        Scrolled, 
        scala.Nothing, 
        scala.Nothing, 
        `false`
      ] = js.native
    inline def ɵdir_=(
      x: ɵɵDirectiveDeclaration[
          InfiniteScrollDirective, 
          `[infiniteScroll]Comma [infinite-scroll]Comma [data-infinite-scroll]`, 
          scala.Nothing, 
          AlwaysCallback, 
          Scrolled, 
          scala.Nothing, 
          scala.Nothing, 
          `false`
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275dir")(x.asInstanceOf[js.Any])
    
    @JSImport("ngx-infinite-scroll/lib/ngx-infinite-scroll.directive", "InfiniteScrollDirective.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[InfiniteScrollDirective, scala.Nothing] = js.native
    inline def ɵfac_=(x: ɵɵFactoryDeclaration[InfiniteScrollDirective, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  }
}
