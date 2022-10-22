package typingsJapgolly.reactDndTestBackend

import typingsJapgolly.dndCore.distInterfacesMod.BeginDragOptions
import typingsJapgolly.dndCore.distInterfacesMod.DragDropManager
import typingsJapgolly.dndCore.distInterfacesMod.HoverOptions
import typingsJapgolly.dndCore.distInterfacesMod.Identifier
import typingsJapgolly.dndCore.distInterfacesMod.Unsubscribe
import typingsJapgolly.reactDndTestBackend.distTypesMod.ITestBackend
import typingsJapgolly.reactDndTestBackend.distTypesMod.TestBackendContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTestBackendMod {
  
  @JSImport("react-dnd-test-backend/dist/TestBackend", "TestBackendImpl")
  @js.native
  open class TestBackendImpl protected ()
    extends StObject
       with ITestBackend {
    def this(manager: DragDropManager, context: TestBackendContext) = this()
    
    /* private */ var actions: Any = js.native
    
    def connectDragPreview(): Unsubscribe = js.native
    
    def connectDragSource(): Unsubscribe = js.native
    
    def connectDropTarget(): Unsubscribe = js.native
    
    var context: TestBackendContext = js.native
    
    var manager: DragDropManager = js.native
    
    def simulateBeginDrag(sourceIds: js.Array[Identifier], options: BeginDragOptions): Unit = js.native
    
    def simulateHover(targetIds: js.Array[Identifier], options: HoverOptions): Unit = js.native
  }
}
