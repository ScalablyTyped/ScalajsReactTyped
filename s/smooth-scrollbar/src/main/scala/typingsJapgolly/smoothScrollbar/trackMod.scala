package typingsJapgolly.smoothScrollbar

import typingsJapgolly.smoothScrollbar.interfacesScrollbarMod.Scrollbar
import typingsJapgolly.smoothScrollbar.interfacesTrackMod.ScrollbarTrack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trackMod {
  
  @JSImport("smooth-scrollbar/track", "TrackController")
  @js.native
  open class TrackController protected ()
    extends StObject
       with typingsJapgolly.smoothScrollbar.interfacesTrackMod.TrackController {
    def this(_scrollbar: Scrollbar) = this()
    
    /* private */ var _scrollbar: Any = js.native
    
    /* CompleteClass */
    override def autoHideOnIdle(): Unit = js.native
    
    /* CompleteClass */
    override def update(): Unit = js.native
    
    /* CompleteClass */
    override val xAxis: ScrollbarTrack = js.native
    
    /* CompleteClass */
    override val yAxis: ScrollbarTrack = js.native
  }
}
