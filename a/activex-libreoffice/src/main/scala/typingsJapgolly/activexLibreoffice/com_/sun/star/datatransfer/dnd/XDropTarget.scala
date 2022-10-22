package typingsJapgolly.activexLibreoffice.com_.sun.star.datatransfer.dnd

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface is implemented by a view or window that supports drop operations.
  *
  * Differently to Java, the association between view and interface is fixed and cannot be changed. Otherwise, the AWT messaging would have to be
  * implemented for any window supporting Drag and Drop operations, which would be a performance issue.
  */
trait XDropTarget
  extends StObject
     with XInterface {
  
  /**
    * Determine the actions supported by a drop target.
    * @returns The current action or actions supported by this drop target.  By default this will include all drag and drop actions.
    * @see com.sun.star.datatransfer.dnd.DNDConstants
    */
  var DefaultActions: Double
  
  /**
    * Add a DropTargetListener.
    *
    * The listener will be queried for the {@link XAutoscroll} interface to see if it supports autoscrolling.
    * @param dtl The listener to add to the notification list.
    */
  def addDropTargetListener(dtl: XDropTargetListener): Unit
  
  /**
    * Determine the actions supported by a drop target.
    * @returns The current action or actions supported by this drop target.  By default this will include all drag and drop actions.
    * @see com.sun.star.datatransfer.dnd.DNDConstants
    */
  def getDefaultActions(): Double
  
  /**
    * Indicates either a drop target object is active or not.
    * @returns A boolean indicating whether or not this drop target object is currently active, that is ready to accept drops.
    */
  def isActive(): Boolean
  
  /**
    * Remove a drop target listener.
    * @param dtl The listener to remove from notification list.
    */
  def removeDropTargetListener(dtl: XDropTargetListener): Unit
  
  /**
    * Sets the drop target object active or inactive.
    * @param active A value of `TRUE` sets the drop target object active. A value of `FALSE` sets the drop target object inactive.
    */
  def setActive(active: Boolean): Unit
  
  /**
    * Sets the default acceptable actions for this drop target.
    *
    * This method is a way to reduce the number of Drag and Drop events by blocking events for actions not supported by this target.
    *
    * By default the listener will receive notifications for all actions.
    * @param actions The actions.
    * @see com.sun.star.datatransfer.dnd.DNDConstants
    */
  def setDefaultActions(actions: Double): Unit
}
object XDropTarget {
  
  inline def apply(
    DefaultActions: Double,
    acquire: Callback,
    addDropTargetListener: XDropTargetListener => Callback,
    getDefaultActions: CallbackTo[Double],
    isActive: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    removeDropTargetListener: XDropTargetListener => Callback,
    setActive: Boolean => Callback,
    setDefaultActions: Double => Callback
  ): XDropTarget = {
    val __obj = js.Dynamic.literal(DefaultActions = DefaultActions.asInstanceOf[js.Any], acquire = acquire.toJsFn, addDropTargetListener = js.Any.fromFunction1((t0: XDropTargetListener) => addDropTargetListener(t0).runNow()), getDefaultActions = getDefaultActions.toJsFn, isActive = isActive.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeDropTargetListener = js.Any.fromFunction1((t0: XDropTargetListener) => removeDropTargetListener(t0).runNow()), setActive = js.Any.fromFunction1((t0: Boolean) => setActive(t0).runNow()), setDefaultActions = js.Any.fromFunction1((t0: Double) => setDefaultActions(t0).runNow()))
    __obj.asInstanceOf[XDropTarget]
  }
  
  extension [Self <: XDropTarget](x: Self) {
    
    inline def setAddDropTargetListener(value: XDropTargetListener => Callback): Self = StObject.set(x, "addDropTargetListener", js.Any.fromFunction1((t0: XDropTargetListener) => value(t0).runNow()))
    
    inline def setDefaultActions(value: Double): Self = StObject.set(x, "DefaultActions", value.asInstanceOf[js.Any])
    
    inline def setGetDefaultActions(value: CallbackTo[Double]): Self = StObject.set(x, "getDefaultActions", value.toJsFn)
    
    inline def setIsActive(value: CallbackTo[Boolean]): Self = StObject.set(x, "isActive", value.toJsFn)
    
    inline def setRemoveDropTargetListener(value: XDropTargetListener => Callback): Self = StObject.set(x, "removeDropTargetListener", js.Any.fromFunction1((t0: XDropTargetListener) => value(t0).runNow()))
    
    inline def setSetActive(value: Boolean => Callback): Self = StObject.set(x, "setActive", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetDefaultActions(value: Double => Callback): Self = StObject.set(x, "setDefaultActions", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
