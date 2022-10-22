package typingsJapgolly.activexLibreoffice.com_.sun.star.datatransfer.dnd

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface is implemented by any drop target context object.
  *
  * A drop target context is created whenever the logical cursor associated with a Drag and Drop operation moves within the visible geometry of a window
  * associated with a drop target.
  *
  * The drop target context provides the mechanism for a potential receiver of a drop operation to both provide the end user with the appropriate drag
  * under feedback and effect the subsequent data transfer, if appropriate.
  */
trait XDropTargetDragContext
  extends StObject
     with XInterface {
  
  /**
    * Accept the Drag.
    *
    * This method should be called from the methods of {@link XDropTargetListener}{@link XDropTargetListener.dragEnter()}{@link
    * XDropTargetListener.dragOver()}XDropTargetListener::dragActionChanged() if the implementation wishes to accept the drag operation with the specified
    * action.
    * @param dragOperation The operation accepted by the target.
    * @see DNDConstants
    * @see DropTargetDragEvent
    */
  def acceptDrag(dragOperation: Double): Unit
  
  /**
    * Reject the drag as a result of examining the available {@link com.sun.star.datatransfer.DataFlavor} types received in the {@link
    * com.sun.star.datatransfer.dnd.XDropTargetListener.dragEnter()} method.
    */
  def rejectDrag(): Unit
}
object XDropTargetDragContext {
  
  inline def apply(
    acceptDrag: Double => Callback,
    acquire: Callback,
    queryInterface: `type` => Any,
    rejectDrag: Callback,
    release: Callback
  ): XDropTargetDragContext = {
    val __obj = js.Dynamic.literal(acceptDrag = js.Any.fromFunction1((t0: Double) => acceptDrag(t0).runNow()), acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), rejectDrag = rejectDrag.toJsFn, release = release.toJsFn)
    __obj.asInstanceOf[XDropTargetDragContext]
  }
  
  extension [Self <: XDropTargetDragContext](x: Self) {
    
    inline def setAcceptDrag(value: Double => Callback): Self = StObject.set(x, "acceptDrag", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setRejectDrag(value: Callback): Self = StObject.set(x, "rejectDrag", value.toJsFn)
  }
}
