package typingsJapgolly.smoothScrollbar

import org.scalajs.dom.HTMLElement
import typingsJapgolly.smoothScrollbar.trackDirectionMod.TrackDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trackThumbMod {
  
  @JSImport("smooth-scrollbar/track/thumb", "ScrollbarThumb")
  @js.native
  open class ScrollbarThumb protected ()
    extends StObject
       with typingsJapgolly.smoothScrollbar.interfacesTrackMod.ScrollbarThumb {
    def this(_direction: TrackDirection) = this()
    def this(_direction: TrackDirection, _minSize: Double) = this()
    
    /* private */ var _direction: Any = js.native
    
    /* private */ var _getStyle: Any = js.native
    
    /* private */ var _minSize: Any = js.native
    
    /* CompleteClass */
    override def attachTo(track: HTMLElement): Unit = js.native
    
    /* CompleteClass */
    var displaySize: Double = js.native
    
    /* CompleteClass */
    override val element: HTMLElement = js.native
    
    /* CompleteClass */
    var offset: Double = js.native
    
    /* CompleteClass */
    var realSize: Double = js.native
    
    /* CompleteClass */
    override def update(scrollOffset: Double, containerSize: Double, pageSize: Double): Unit = js.native
  }
}
