package typingsJapgolly.smoothScrollbar

import typingsJapgolly.smoothScrollbar.scrollbarMod.Scrollbar
import typingsJapgolly.smoothScrollbar.trackMod.ScrollbarTrack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("smooth-scrollbar/track", JSImport.Namespace)
@js.native
object smoothScrollbarTrackMod extends js.Object {
  @js.native
  class TrackController protected ()
    extends typingsJapgolly.smoothScrollbar.trackMod.TrackController {
    def this(_scrollbar: Scrollbar) = this()
    var _scrollbar: js.Any = js.native
    /* CompleteClass */
    override val xAxis: ScrollbarTrack = js.native
    /* CompleteClass */
    override val yAxis: ScrollbarTrack = js.native
    /* CompleteClass */
    override def autoHideOnIdle(): Unit = js.native
    /* CompleteClass */
    override def update(): Unit = js.native
  }
  
}

