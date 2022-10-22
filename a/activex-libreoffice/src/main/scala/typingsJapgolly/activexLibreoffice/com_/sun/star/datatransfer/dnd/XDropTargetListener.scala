package typingsJapgolly.activexLibreoffice.com_.sun.star.datatransfer.dnd

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface is the callback interface used by the drop target object to provide notification of Drag and Drop operations that involve the subject
  * drop target.
  *
  * Methods of this interface may be implemented to provide "drag under" visual feedback to the user throughout the Drag and Drop operation.
  */
trait XDropTargetListener
  extends StObject
     with XEventListener {
  
  /**
    * Called when a drag operation has encountered the drop target.
    * @param dtdee The {@link DropTargetDragEvent} .
    */
  def dragEnter(dtdee: DropTargetDragEnterEvent): Unit
  
  /**
    * The drag operation has departed the drop target without dropping.
    * @param dte The {@link DropTargetEvent} .
    */
  def dragExit(dte: DropTargetEvent): Unit
  
  /**
    * Called when a drag operation is ongoing on the drop target.
    * @param dtde The {@link DropTargetEvent} .
    */
  def dragOver(dtde: DropTargetDragEvent): Unit
  
  /**
    * The drag operation has terminated with a drop on this drop target.
    *
    * **NOTE:** The implementation has to wait until the method {@link XDropTargetDropContext.dropComplete()} is called before releasing the data for the
    * drop operation. This should occur before returning from drop in a normal flow of operation. Also, the implementor of {@link XDropTargetListener}
    * should not assume the {@link DropTargetDropEvent} to be meaningful after returning from the {@link XDropTargetListener.drop()} method.
    * @param dtde The {@link DropTargetDropEvent} .
    */
  def drop(dtde: DropTargetDropEvent): Unit
  
  /**
    * Called when the user has modified the drop gesture.
    * @param dtde The {@link DropTargetEvent} .
    */
  def dropActionChanged(dtde: DropTargetDragEvent): Unit
}
object XDropTargetListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    dragEnter: DropTargetDragEnterEvent => Callback,
    dragExit: DropTargetEvent => Callback,
    dragOver: DropTargetDragEvent => Callback,
    drop: DropTargetDropEvent => Callback,
    dropActionChanged: DropTargetDragEvent => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XDropTargetListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), dragEnter = js.Any.fromFunction1((t0: DropTargetDragEnterEvent) => dragEnter(t0).runNow()), dragExit = js.Any.fromFunction1((t0: DropTargetEvent) => dragExit(t0).runNow()), dragOver = js.Any.fromFunction1((t0: DropTargetDragEvent) => dragOver(t0).runNow()), drop = js.Any.fromFunction1((t0: DropTargetDropEvent) => drop(t0).runNow()), dropActionChanged = js.Any.fromFunction1((t0: DropTargetDragEvent) => dropActionChanged(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XDropTargetListener]
  }
  
  extension [Self <: XDropTargetListener](x: Self) {
    
    inline def setDragEnter(value: DropTargetDragEnterEvent => Callback): Self = StObject.set(x, "dragEnter", js.Any.fromFunction1((t0: DropTargetDragEnterEvent) => value(t0).runNow()))
    
    inline def setDragExit(value: DropTargetEvent => Callback): Self = StObject.set(x, "dragExit", js.Any.fromFunction1((t0: DropTargetEvent) => value(t0).runNow()))
    
    inline def setDragOver(value: DropTargetDragEvent => Callback): Self = StObject.set(x, "dragOver", js.Any.fromFunction1((t0: DropTargetDragEvent) => value(t0).runNow()))
    
    inline def setDrop(value: DropTargetDropEvent => Callback): Self = StObject.set(x, "drop", js.Any.fromFunction1((t0: DropTargetDropEvent) => value(t0).runNow()))
    
    inline def setDropActionChanged(value: DropTargetDragEvent => Callback): Self = StObject.set(x, "dropActionChanged", js.Any.fromFunction1((t0: DropTargetDragEvent) => value(t0).runNow()))
  }
}
