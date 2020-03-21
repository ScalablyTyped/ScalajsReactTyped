package typingsJapgolly.ngxInfiniteScroll

import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.NgZone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ngx-infinite-scroll/src/ngx-infinite-scroll", JSImport.Namespace)
@js.native
object ngxInfiniteScrollMod extends js.Object {
  @js.native
  class InfiniteScrollDirective protected ()
    extends typingsJapgolly.ngxInfiniteScroll.infiniteScrollDirectiveMod.InfiniteScrollDirective {
    def this(element: ElementRef[_], zone: NgZone) = this()
  }
  
  @js.native
  class InfiniteScrollModule ()
    extends typingsJapgolly.ngxInfiniteScroll.ngxInfiniteScrollModuleMod.InfiniteScrollModule
  
}

