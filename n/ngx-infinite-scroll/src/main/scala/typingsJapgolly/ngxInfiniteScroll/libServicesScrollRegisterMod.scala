package typingsJapgolly.ngxInfiniteScroll

import typingsJapgolly.ngxInfiniteScroll.modelsMod.IInfiniteScrollAction
import typingsJapgolly.ngxInfiniteScroll.modelsMod.IPositionStats
import typingsJapgolly.ngxInfiniteScroll.modelsMod.IScrollParams
import typingsJapgolly.ngxInfiniteScroll.modelsMod.IScrollRegisterConfig
import typingsJapgolly.ngxInfiniteScroll.modelsMod.IScroller
import typingsJapgolly.ngxInfiniteScroll.modelsMod.IScrollerDistance
import typingsJapgolly.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libServicesScrollRegisterMod {
  
  @JSImport("ngx-infinite-scroll/lib/services/scroll-register", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object InfiniteScrollActions {
    
    @JSImport("ngx-infinite-scroll/lib/services/scroll-register", "InfiniteScrollActions")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ngx-infinite-scroll/lib/services/scroll-register", "InfiniteScrollActions.DOWN")
    @js.native
    def DOWN: String = js.native
    inline def DOWN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOWN")(x.asInstanceOf[js.Any])
    
    @JSImport("ngx-infinite-scroll/lib/services/scroll-register", "InfiniteScrollActions.UP")
    @js.native
    def UP: String = js.native
    inline def UP_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UP")(x.asInstanceOf[js.Any])
  }
  
  inline def attachScrollEvent(options: IScrollRegisterConfig): Observable_[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("attachScrollEvent")(options.asInstanceOf[js.Any]).asInstanceOf[Observable_[js.Object]]
  
  inline def createScroller(config: IScroller): Observable_[IInfiniteScrollAction] = ^.asInstanceOf[js.Dynamic].applyDynamic("createScroller")(config.asInstanceOf[js.Any]).asInstanceOf[Observable_[IInfiniteScrollAction]]
  
  inline def toInfiniteScrollAction(response: IScrollParams): IInfiniteScrollAction = ^.asInstanceOf[js.Dynamic].applyDynamic("toInfiniteScrollAction")(response.asInstanceOf[js.Any]).asInstanceOf[IInfiniteScrollAction]
  
  inline def toInfiniteScrollParams(lastScrollPosition: Double, stats: IPositionStats, distance: IScrollerDistance): IScrollParams = (^.asInstanceOf[js.Dynamic].applyDynamic("toInfiniteScrollParams")(lastScrollPosition.asInstanceOf[js.Any], stats.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[IScrollParams]
}
