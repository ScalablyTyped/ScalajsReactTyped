package typingsJapgolly.rnSwipeablePanel

import typingsJapgolly.rnSwipeablePanel.distPanelMod.SwipeablePanelProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rn-swipeable-panel", "LARGE_PANEL_CONTENT_HEIGHT")
  @js.native
  val LARGE_PANEL_CONTENT_HEIGHT: Double = js.native
  
  @JSImport("rn-swipeable-panel", "SMALL_PANEL_CONTENT_HEIGHT")
  @js.native
  val SMALL_PANEL_CONTENT_HEIGHT: Double = js.native
  
  @JSImport("rn-swipeable-panel", "SwipeablePanel")
  @js.native
  open class SwipeablePanel protected ()
    extends typingsJapgolly.rnSwipeablePanel.distPanelMod.SwipeablePanel {
    def this(props: SwipeablePanelProps) = this()
  }
}
