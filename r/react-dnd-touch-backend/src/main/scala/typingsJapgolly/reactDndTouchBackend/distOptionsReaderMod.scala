package typingsJapgolly.reactDndTouchBackend

import org.scalajs.dom.Document
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Node
import org.scalajs.dom.Window
import typingsJapgolly.reactDndTouchBackend.anon.PartialTouchBackendOption
import typingsJapgolly.reactDndTouchBackend.distInterfacesMod.AngleRange
import typingsJapgolly.reactDndTouchBackend.distInterfacesMod.TouchBackendContext
import typingsJapgolly.reactDndTouchBackend.distInterfacesMod.TouchBackendOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOptionsReaderMod {
  
  @JSImport("react-dnd-touch-backend/dist/OptionsReader", "OptionsReader")
  @js.native
  open class OptionsReader protected ()
    extends StObject
       with TouchBackendOptions {
    def this(args: PartialTouchBackendOption, context: TouchBackendContext) = this()
    
    /* private */ var args: Any = js.native
    
    /* private */ var context: Any = js.native
    
    /* CompleteClass */
    var delay: Double = js.native
    
    /* CompleteClass */
    var delayMouseStart: Double = js.native
    @JSName("delayMouseStart")
    def delayMouseStart_MOptionsReader: Double = js.native
    
    /* CompleteClass */
    var delayTouchStart: Double = js.native
    @JSName("delayTouchStart")
    def delayTouchStart_MOptionsReader: Double = js.native
    
    @JSName("delay")
    def delay_MOptionsReader: Double = js.native
    
    def document: js.UndefOr[Document] = js.native
    
    /* CompleteClass */
    var enableHoverOutsideTarget: Boolean = js.native
    @JSName("enableHoverOutsideTarget")
    def enableHoverOutsideTarget_MOptionsReader: Boolean = js.native
    
    /* CompleteClass */
    var enableKeyboardEvents: Boolean = js.native
    @JSName("enableKeyboardEvents")
    def enableKeyboardEvents_MOptionsReader: Boolean = js.native
    
    /* CompleteClass */
    var enableMouseEvents: Boolean = js.native
    @JSName("enableMouseEvents")
    def enableMouseEvents_MOptionsReader: Boolean = js.native
    
    /* CompleteClass */
    var enableTouchEvents: Boolean = js.native
    @JSName("enableTouchEvents")
    def enableTouchEvents_MOptionsReader: Boolean = js.native
    
    @JSName("getDropTargetElementsAtPoint")
    def getDropTargetElementsAtPoint_MOptionsReader: js.UndefOr[
        js.Function3[
          /* x */ Double, 
          /* y */ Double, 
          /* elements */ js.Array[HTMLElement], 
          js.Array[HTMLElement]
        ]
      ] = js.native
    
    /* CompleteClass */
    var ignoreContextMenu: Boolean = js.native
    @JSName("ignoreContextMenu")
    def ignoreContextMenu_MOptionsReader: Boolean = js.native
    
    @JSName("rootElement")
    def rootElement_MOptionsReader: js.UndefOr[Node] = js.native
    
    @JSName("scrollAngleRanges")
    def scrollAngleRanges_MOptionsReader: js.UndefOr[js.Array[AngleRange]] = js.native
    
    /* CompleteClass */
    var touchSlop: Double = js.native
    @JSName("touchSlop")
    def touchSlop_MOptionsReader: Double = js.native
    
    def window: js.UndefOr[Window] = js.native
  }
}
