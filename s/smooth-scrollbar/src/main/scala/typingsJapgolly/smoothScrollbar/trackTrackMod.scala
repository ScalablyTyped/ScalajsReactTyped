package typingsJapgolly.smoothScrollbar

import org.scalajs.dom.HTMLElement
import typingsJapgolly.smoothScrollbar.interfacesTrackMod.ScrollbarThumb
import typingsJapgolly.smoothScrollbar.trackDirectionMod.TrackDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trackTrackMod {
  
  @JSImport("smooth-scrollbar/track/track", "ScrollbarTrack")
  @js.native
  open class ScrollbarTrack protected ()
    extends StObject
       with typingsJapgolly.smoothScrollbar.interfacesTrackMod.ScrollbarTrack {
    def this(direction: TrackDirection) = this()
    def this(direction: TrackDirection, thumbMinSize: Double) = this()
    
    /* private */ var _isShown: Any = js.native
    
    /* CompleteClass */
    override def attachTo(container: HTMLElement): Unit = js.native
    
    /* CompleteClass */
    override val element: HTMLElement = js.native
    
    /* CompleteClass */
    override def hide(): Unit = js.native
    
    /* CompleteClass */
    override def show(): Unit = js.native
    
    /* CompleteClass */
    override val thumb: ScrollbarThumb = js.native
    
    /* CompleteClass */
    override def update(scrollOffset: Double, containerSize: Double, pageSize: Double): Unit = js.native
  }
}
