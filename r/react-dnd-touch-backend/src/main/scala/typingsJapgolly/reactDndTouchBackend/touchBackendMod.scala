package typingsJapgolly.reactDndTouchBackend

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.dndCore.interfacesMod.Backend
import typingsJapgolly.dndCore.interfacesMod.DragDropManager
import typingsJapgolly.dndCore.interfacesMod.Unsubscribe
import typingsJapgolly.reactDndTouchBackend.interfacesMod.TouchBackendOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd-touch-backend/lib/TouchBackend", JSImport.Namespace)
@js.native
object touchBackendMod extends js.Object {
  @js.native
  trait TouchBackend extends Backend {
    var _isScrolling: js.Any = js.native
    var _mouseClientOffset: js.Any = js.native
    var actions: js.Any = js.native
    var addEventListener: js.Any = js.native
    var dragOverTargetIds: js.Any = js.native
    var draggedSourceNode: js.Any = js.native
    var draggedSourceNodeRemovalObserver: js.Any = js.native
    var getSourceClientOffset: js.Any = js.native
    var getTopMoveStartHandler: js.Any = js.native
    var handleCancelOnEscape: js.Any = js.native
    var handleMove: js.Any = js.native
    var handleMoveStart: js.Any = js.native
    var handleTopMove: js.Any = js.native
    var handleTopMoveCapture: js.Any = js.native
    var handleTopMoveEndCapture: js.Any = js.native
    var handleTopMoveStart: js.Any = js.native
    var handleTopMoveStartCapture: js.Any = js.native
    var handleTopMoveStartDelay: js.Any = js.native
    var installSourceNodeRemovalObserver: js.Any = js.native
    var listenerTypes: js.Any = js.native
    var monitor: js.Any = js.native
    var moveStartSourceIds: js.Any = js.native
    var options: js.Any = js.native
    var removeEventListener: js.Any = js.native
    var resurrectSourceNode: js.Any = js.native
    var sourceNodes: js.Any = js.native
    var sourcePreviewNodeOptions: js.Any = js.native
    var sourcePreviewNodes: js.Any = js.native
    var targetNodes: js.Any = js.native
    var timeout: js.Any = js.native
    var uninstallSourceNodeRemovalObserver: js.Any = js.native
    var waitingForDelay: js.Any = js.native
    def connectDragPreview(sourceId: String, node: HTMLElement, options: js.Any): js.Function0[Unit] = js.native
    def connectDragSource(sourceId: String, node: HTMLElement): js.Function0[Unit] = js.native
    def connectDropTarget(targetId: String, node: HTMLElement): Unsubscribe = js.native
    def document(): js.Any = js.native
    def window(): js.Any = js.native
  }
  
  @js.native
  class default protected () extends TouchBackend {
    def this(manager: DragDropManager, context: js.Any, options: TouchBackendOptions) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var isSetUp: js.Any = js.native
  }
  
}

