package typingsJapgolly.gridstack

import typingsJapgolly.gridstack.distEs5DdDraggableMod.DDDraggable
import typingsJapgolly.gridstack.distEs5DdDroppableMod.DDDroppable
import typingsJapgolly.gridstack.distEs5DdResizableMod.DDResizable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs5DdManagerMod {
  
  @JSImport("gridstack/dist/es5/dd-manager", "DDManager")
  @js.native
  open class DDManager () extends StObject
  /* static members */
  object DDManager {
    
    @JSImport("gridstack/dist/es5/dd-manager", "DDManager")
    @js.native
    val ^ : js.Any = js.native
    
    /** item being dragged */
    @JSImport("gridstack/dist/es5/dd-manager", "DDManager.dragElement")
    @js.native
    def dragElement: DDDraggable = js.native
    inline def dragElement_=(x: DDDraggable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragElement")(x.asInstanceOf[js.Any])
    
    /** item we are currently over as drop target */
    @JSImport("gridstack/dist/es5/dd-manager", "DDManager.dropElement")
    @js.native
    def dropElement: DDDroppable = js.native
    inline def dropElement_=(x: DDDroppable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dropElement")(x.asInstanceOf[js.Any])
    
    /** true if a mouse down event was handled */
    @JSImport("gridstack/dist/es5/dd-manager", "DDManager.mouseHandled")
    @js.native
    def mouseHandled: Boolean = js.native
    inline def mouseHandled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mouseHandled")(x.asInstanceOf[js.Any])
    
    /** current item we're over for resizing purpose (ignore nested grid resize handles) */
    @JSImport("gridstack/dist/es5/dd-manager", "DDManager.overResizeElement")
    @js.native
    def overResizeElement: DDResizable = js.native
    inline def overResizeElement_=(x: DDResizable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overResizeElement")(x.asInstanceOf[js.Any])
    
    /** if set (true | in msec), dragging placement (collision) will only happen after a pause by the user*/
    @JSImport("gridstack/dist/es5/dd-manager", "DDManager.pauseDrag")
    @js.native
    def pauseDrag: Boolean | Double = js.native
    inline def pauseDrag_=(x: Boolean | Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pauseDrag")(x.asInstanceOf[js.Any])
  }
}
