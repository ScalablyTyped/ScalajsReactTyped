package typingsJapgolly.activexLibreoffice.com_.sun.star.datatransfer.dnd

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface must be implemented by any drag gesture recognizer implementation that a drag source supports.
  * @see com.sun.star.datatransfer.dnd.XDragGestureRecognizer
  * @see com.sun.star.datatransfer.dnd.XDragSource
  */
trait XDragSourceListener
  extends StObject
     with XEventListener {
  
  /**
    * This method is invoked to signify that the Drag and Drop operation is complete.
    * @param dsde The {@link DragSourceDropEvent}
    */
  def dragDropEnd(dsde: DragSourceDropEvent): Unit
  
  /**
    * Called as the hotspot enters a platform dependent drop site.
    *
    * **NOTE:** currently this notification can not be ensured by all implementations. Do not rely on it !
    * @param dsde The {@link DragSourceDragEvent} .
    */
  def dragEnter(dsde: DragSourceDragEvent): Unit
  
  /**
    * Called as the hotspot exits a platform dependent drop site.
    *
    * **NOTE:** Currently this notification can not be ensured by all implementations. Do not rely on it !
    * @param dse The {@link DragSourceEvent} .
    */
  def dragExit(dse: DragSourceEvent): Unit
  
  /**
    * Called as the hotspot moves over a platform dependent drop site.
    * @param dsde The {@link DragSourceEvent}
    */
  def dragOver(dsde: DragSourceDragEvent): Unit
  
  /**
    * Called when the user has modified the drop gesture.
    * @param dsde The {@link DragSourceEvent} .
    */
  def dropActionChanged(dsde: DragSourceDragEvent): Unit
}
object XDragSourceListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    dragDropEnd: DragSourceDropEvent => Callback,
    dragEnter: DragSourceDragEvent => Callback,
    dragExit: DragSourceEvent => Callback,
    dragOver: DragSourceDragEvent => Callback,
    dropActionChanged: DragSourceDragEvent => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XDragSourceListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), dragDropEnd = js.Any.fromFunction1((t0: DragSourceDropEvent) => dragDropEnd(t0).runNow()), dragEnter = js.Any.fromFunction1((t0: DragSourceDragEvent) => dragEnter(t0).runNow()), dragExit = js.Any.fromFunction1((t0: DragSourceEvent) => dragExit(t0).runNow()), dragOver = js.Any.fromFunction1((t0: DragSourceDragEvent) => dragOver(t0).runNow()), dropActionChanged = js.Any.fromFunction1((t0: DragSourceDragEvent) => dropActionChanged(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XDragSourceListener]
  }
  
  extension [Self <: XDragSourceListener](x: Self) {
    
    inline def setDragDropEnd(value: DragSourceDropEvent => Callback): Self = StObject.set(x, "dragDropEnd", js.Any.fromFunction1((t0: DragSourceDropEvent) => value(t0).runNow()))
    
    inline def setDragEnter(value: DragSourceDragEvent => Callback): Self = StObject.set(x, "dragEnter", js.Any.fromFunction1((t0: DragSourceDragEvent) => value(t0).runNow()))
    
    inline def setDragExit(value: DragSourceEvent => Callback): Self = StObject.set(x, "dragExit", js.Any.fromFunction1((t0: DragSourceEvent) => value(t0).runNow()))
    
    inline def setDragOver(value: DragSourceDragEvent => Callback): Self = StObject.set(x, "dragOver", js.Any.fromFunction1((t0: DragSourceDragEvent) => value(t0).runNow()))
    
    inline def setDropActionChanged(value: DragSourceDragEvent => Callback): Self = StObject.set(x, "dropActionChanged", js.Any.fromFunction1((t0: DragSourceDragEvent) => value(t0).runNow()))
  }
}
