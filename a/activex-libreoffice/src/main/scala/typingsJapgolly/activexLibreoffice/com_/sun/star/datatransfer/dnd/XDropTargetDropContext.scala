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
  * A DropTargetContext is created whenever the logical cursor associated with a Drag and Drop operation moves within the visible geometry of a window
  * associated with a DropTarget.
  *
  * The drop target context provides the mechanism for a potential receiver of a drop operation to provide the end user with the appropriate drag under
  * feedback and to effect the subsequent data transfer, if appropriate.
  */
trait XDropTargetDropContext
  extends StObject
     with XInterface {
  
  /**
    * Accept the Drop.
    *
    * This method should be called from the {@link com.sun.star.datatransfer.dnd.XDropTargetListener.drop()} method if the implementation wishes to accept
    * the drop operation with the specified action.
    * @param dragOperation The operation accepted by the target.
    * @see DNDConstants
    * @see DropTargetDragEvent
    */
  def acceptDrop(dragOperation: Double): Unit
  
  /**
    * Signals that the drop is completed and if it was successful or not.
    * @param success A value of `TRUE` means the drop completed successfully A value of `FALSE` means the drop completed unsuccessfully.
    */
  def dropComplete(success: Boolean): Unit
  
  /**
    * Reject the drop as a result of examining the available {@link com.sun.star.datatransfer.DataFlavor} types received in the {@link
    * XDropTargetListener.dragEnter()} method.
    */
  def rejectDrop(): Unit
}
object XDropTargetDropContext {
  
  inline def apply(
    acceptDrop: Double => Callback,
    acquire: Callback,
    dropComplete: Boolean => Callback,
    queryInterface: `type` => Any,
    rejectDrop: Callback,
    release: Callback
  ): XDropTargetDropContext = {
    val __obj = js.Dynamic.literal(acceptDrop = js.Any.fromFunction1((t0: Double) => acceptDrop(t0).runNow()), acquire = acquire.toJsFn, dropComplete = js.Any.fromFunction1((t0: Boolean) => dropComplete(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), rejectDrop = rejectDrop.toJsFn, release = release.toJsFn)
    __obj.asInstanceOf[XDropTargetDropContext]
  }
  
  extension [Self <: XDropTargetDropContext](x: Self) {
    
    inline def setAcceptDrop(value: Double => Callback): Self = StObject.set(x, "acceptDrop", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setDropComplete(value: Boolean => Callback): Self = StObject.set(x, "dropComplete", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setRejectDrop(value: Callback): Self = StObject.set(x, "rejectDrop", value.toJsFn)
  }
}
