package typingsJapgolly.ngxInfiniteScroll

import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.NgZone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ngx-infinite-scroll/public_api", JSImport.Namespace)
@js.native
object publicApiMod extends js.Object {
  @js.native
  class InfiniteScrollDirective protected ()
    extends typingsJapgolly.ngxInfiniteScroll.ngxInfiniteScrollMod.InfiniteScrollDirective {
    def this(element: ElementRef[_], zone: NgZone) = this()
  }
  
  @js.native
  class InfiniteScrollModule ()
    extends typingsJapgolly.ngxInfiniteScroll.ngxInfiniteScrollModuleMod.InfiniteScrollModule
  
}

