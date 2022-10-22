package typingsJapgolly.activexLibreoffice.com_.sun.star.datatransfer.dnd

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The drag source context class is responsible for managing the initiator side of the Drag and Drop protocol.
  *
  * In particular, it is responsible for managing event notifications to the DragSourceListener and providing the Transferable state to enable the data
  * transfer.
  *
  * An instance of this class is created as a result of the method {@link XDragSource.startDrag()} being successfully invoked. This instance is
  * responsible for tracking the state of the operation on behalf of the drag source and dispatching state changes to the drag source listener.
  * @see com.sun.star.datatransfer.dnd.XDragSourceContext
  * @see com.sun.star.datatransfer.dnd.XDragSourceListener
  */
trait XDragSourceContext
  extends StObject
     with XInterface {
  
  /**
    * Get the identifier of the currently used cursor.
    * @returns The currently selected drag cursor.
    */
  val CurrentCursor: Double
  
  /**
    * Get the identifier of the currently used cursor.
    * @returns The currently selected drag cursor.
    */
  def getCurrentCursor(): Double
  
  /**
    * This method sets the current drag cursor.
    *
    * This method should only be called to set another cursor than the default one for drag action currently selected by the user.
    *
    * Invalid cursor identifiers will be ignored.
    * @param cursorId The identifier the drag source returned when registering the cursor.
    */
  def setCursor(cursorId: Double): Unit
  
  /**
    * This method sets the current drag image.
    * @param imageId The identifier the drag source returned when registering the image (0 = none). Invalid identifier will be ignored.
    */
  def setImage(imageId: Double): Unit
  
  /**
    * This method notifies the context that the {@link com.sun.star.datatransfer.DataFlavor} types of the transferable object have changed.
    * @see com.sun.star.datatransfer.XTransferable
    */
  def transferablesFlavorsChanged(): Unit
}
object XDragSourceContext {
  
  inline def apply(
    CurrentCursor: Double,
    acquire: Callback,
    getCurrentCursor: CallbackTo[Double],
    queryInterface: `type` => Any,
    release: Callback,
    setCursor: Double => Callback,
    setImage: Double => Callback,
    transferablesFlavorsChanged: Callback
  ): XDragSourceContext = {
    val __obj = js.Dynamic.literal(CurrentCursor = CurrentCursor.asInstanceOf[js.Any], acquire = acquire.toJsFn, getCurrentCursor = getCurrentCursor.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setCursor = js.Any.fromFunction1((t0: Double) => setCursor(t0).runNow()), setImage = js.Any.fromFunction1((t0: Double) => setImage(t0).runNow()), transferablesFlavorsChanged = transferablesFlavorsChanged.toJsFn)
    __obj.asInstanceOf[XDragSourceContext]
  }
  
  extension [Self <: XDragSourceContext](x: Self) {
    
    inline def setCurrentCursor(value: Double): Self = StObject.set(x, "CurrentCursor", value.asInstanceOf[js.Any])
    
    inline def setGetCurrentCursor(value: CallbackTo[Double]): Self = StObject.set(x, "getCurrentCursor", value.toJsFn)
    
    inline def setSetCursor(value: Double => Callback): Self = StObject.set(x, "setCursor", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetImage(value: Double => Callback): Self = StObject.set(x, "setImage", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setTransferablesFlavorsChanged(value: Callback): Self = StObject.set(x, "transferablesFlavorsChanged", value.toJsFn)
  }
}
