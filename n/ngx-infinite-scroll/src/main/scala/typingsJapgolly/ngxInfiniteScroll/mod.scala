package typingsJapgolly.ngxInfiniteScroll

import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.NgZone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ngx-infinite-scroll", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class InfiniteScrollDirective protected ()
    extends typingsJapgolly.ngxInfiniteScroll.publicApiMod.InfiniteScrollDirective {
    def this(element: ElementRef[_], zone: NgZone) = this()
  }
  
  @js.native
  class InfiniteScrollModule ()
    extends typingsJapgolly.ngxInfiniteScroll.ngxInfiniteScrollModuleMod.InfiniteScrollModule
  
}

