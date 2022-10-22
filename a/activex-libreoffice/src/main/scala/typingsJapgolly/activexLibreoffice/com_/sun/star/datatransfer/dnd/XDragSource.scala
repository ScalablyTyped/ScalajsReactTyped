package typingsJapgolly.activexLibreoffice.com_.sun.star.datatransfer.dnd

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.datatransfer.XTransferable
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface is implemented by a view or window that supports drag operations and will be received as part of a {@link DragGestureEvent} through a
  * {@link com.sun.star.datatransfer.dnd.XDragGestureListener.dragGestureRecognized()} callback.
  *
  * Differently to Java, the association between view and interface is fixed and can not be changed. Otherwise, the AWT messaging would have to be
  * implemented for any window supporting Drag and Drop operations, which would be a real performance issue.
  */
trait XDragSource
  extends StObject
     with XInterface {
  
  /**
    * To get the default cursor for a specified drag action.
    * @param dragAction A drag action as specified in {@link DNDConstants} .
    * @returns The default drag cursor for the specified drag action. The returned value may be used as parameter for the method {@link com.sun.star.datatransfe
    */
  def getDefaultCursor(dragAction: Double): Double
  
  /**
    * In order to query if drag image support is available.
    * @returns A boolean indicating whether or not drag image support is available on the underlying platform.
    */
  def isDragImageSupported(): Boolean
  
  /**
    * Starts the drag operation.
    *
    * Note: this call does **not** block until the drag and drop operation ends. If the Drag and Drop system is unable to initiate a drag operation or if
    * the user attempts to start a drag while an existing drag operation is still executing, the action fails immediately. This is indicated by calling
    * {@link com.sun.star.datatransfer.dnd.XDragSourceListener.dragDropEnd()} on the parameter listener with a {@link DragSourceDragEvent} showing a
    * failure.
    * @param trigger The {@link DragGestureEvent} that initiated the drag.
    * @param sourceActions The action or actions supported for this transferable as defined in {@link DNDConstants} .
    * @param cursor The initial drag cursor id or 0 as default.
    * @param image The initial drag image id or 0 as default.
    * @param trans The transferable object dragged.
    * @param listener The {@link XDragSourceListener} .
    * @see com.sun.star.datatransfer.XTransferable
    */
  def startDrag(
    trigger: DragGestureEvent,
    sourceActions: Double,
    cursor: Double,
    image: Double,
    trans: XTransferable,
    listener: XDragSourceListener
  ): Unit
}
object XDragSource {
  
  inline def apply(
    acquire: Callback,
    getDefaultCursor: Double => Double,
    isDragImageSupported: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    startDrag: (DragGestureEvent, Double, Double, Double, XTransferable, XDragSourceListener) => Callback
  ): XDragSource = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getDefaultCursor = js.Any.fromFunction1(getDefaultCursor), isDragImageSupported = isDragImageSupported.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, startDrag = js.Any.fromFunction6((t0: DragGestureEvent, t1: Double, t2: Double, t3: Double, t4: XTransferable, t5: XDragSourceListener) => (startDrag(t0, t1, t2, t3, t4, t5)).runNow()))
    __obj.asInstanceOf[XDragSource]
  }
  
  extension [Self <: XDragSource](x: Self) {
    
    inline def setGetDefaultCursor(value: Double => Double): Self = StObject.set(x, "getDefaultCursor", js.Any.fromFunction1(value))
    
    inline def setIsDragImageSupported(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDragImageSupported", value.toJsFn)
    
    inline def setStartDrag(value: (DragGestureEvent, Double, Double, Double, XTransferable, XDragSourceListener) => Callback): Self = StObject.set(x, "startDrag", js.Any.fromFunction6((t0: DragGestureEvent, t1: Double, t2: Double, t3: Double, t4: XTransferable, t5: XDragSourceListener) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
  }
}
