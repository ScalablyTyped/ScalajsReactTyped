package typingsJapgolly.activexLibreoffice.com_.sun.star.datatransfer.dnd

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface is implemented by a view or window that supports drag operations.
  *
  * Different to Java, the association between view and interface is fixed and cannot be changed. Otherwise, the AWT messaging would have to be
  * implemented for any window supporting Drag and Drop operations, which would be a performance issue.
  */
trait XDragGestureRecognizer
  extends StObject
     with XInterface {
  
  /**
    * Registers a new {@link XDragGestureListener} .
    * @param dgl The {@link XDragGestureListener} to register with this {@link XDragGestureRecognizer} .
    */
  def addDragGestureListener(dgl: XDragGestureListener): Unit
  
  /**
    * Unregisters the specified {@link XDragGestureListener} .
    * @param dgl The {@link XDragGestureListener} to register with this {@link XDragGestureRecognizer} .
    */
  def removeDragGestureListener(dgl: XDragGestureListener): Unit
  
  /** Reset the recognizer. If it is currently recognizing a gesture, ignore it. */
  def resetRecognizer(): Unit
}
object XDragGestureRecognizer {
  
  inline def apply(
    acquire: Callback,
    addDragGestureListener: XDragGestureListener => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeDragGestureListener: XDragGestureListener => Callback,
    resetRecognizer: Callback
  ): XDragGestureRecognizer = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addDragGestureListener = js.Any.fromFunction1((t0: XDragGestureListener) => addDragGestureListener(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeDragGestureListener = js.Any.fromFunction1((t0: XDragGestureListener) => removeDragGestureListener(t0).runNow()), resetRecognizer = resetRecognizer.toJsFn)
    __obj.asInstanceOf[XDragGestureRecognizer]
  }
  
  extension [Self <: XDragGestureRecognizer](x: Self) {
    
    inline def setAddDragGestureListener(value: XDragGestureListener => Callback): Self = StObject.set(x, "addDragGestureListener", js.Any.fromFunction1((t0: XDragGestureListener) => value(t0).runNow()))
    
    inline def setRemoveDragGestureListener(value: XDragGestureListener => Callback): Self = StObject.set(x, "removeDragGestureListener", js.Any.fromFunction1((t0: XDragGestureListener) => value(t0).runNow()))
    
    inline def setResetRecognizer(value: Callback): Self = StObject.set(x, "resetRecognizer", value.toJsFn)
  }
}
