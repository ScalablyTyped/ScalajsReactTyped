package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is the main interface of a desktop service.
  *
  * A desktop is an environment for components which can be viewed in frames. Frames are like frames in HTML framesets. This does not imply that a desktop
  * can handle framesets; the frames may be top frames only.
  * @see Desktop
  */
trait XDesktop
  extends StObject
     with XInterface {
  
  /**
    * provides read access to collection of all currently loaded components inside the frame tree
    *
    * The component is, by definition, the model of the control which is loaded into a frame, or if no model exists, into the control itself. The service
    * {@link Components} which is available from this method is a collection of all components of the desktop which are open within a frame of the desktop.
    * @returns the collection of all components
    * @see Components
    */
  val Components: XEnumerationAccess
  
  /**
    * provides read access to the component inside the tree which has the UI focus
    *
    * Normally, the component is the model part of the active component. If no model exists it is the active controller (view) itself.
    * @returns the component within the desktop environment which has the UI focus.
    * @see XDesktop.getCurrentFrame()
    */
  val CurrentComponent: XComponent
  
  /**
    * provides read access to the frame which contains the current component
    * @returns the frame of the component which has the UI focus within this desktop environment
    * @see XDesktop.getCurrentComponent()
    */
  val CurrentFrame: XFrame
  
  /**
    * registers an event listener to the desktop, which is called when the desktop is queried to terminate, and when it really terminates.
    * @param Listener listener for termination events
    * @see XDesktop.removeTerminateListener()
    */
  def addTerminateListener(Listener: XTerminateListener): Unit
  
  /**
    * provides read access to collection of all currently loaded components inside the frame tree
    *
    * The component is, by definition, the model of the control which is loaded into a frame, or if no model exists, into the control itself. The service
    * {@link Components} which is available from this method is a collection of all components of the desktop which are open within a frame of the desktop.
    * @returns the collection of all components
    * @see Components
    */
  def getComponents(): XEnumerationAccess
  
  /**
    * provides read access to the component inside the tree which has the UI focus
    *
    * Normally, the component is the model part of the active component. If no model exists it is the active controller (view) itself.
    * @returns the component within the desktop environment which has the UI focus.
    * @see XDesktop.getCurrentFrame()
    */
  def getCurrentComponent(): XComponent
  
  /**
    * provides read access to the frame which contains the current component
    * @returns the frame of the component which has the UI focus within this desktop environment
    * @see XDesktop.getCurrentComponent()
    */
  def getCurrentFrame(): XFrame
  
  /**
    * unregisters an event listener for termination events.
    * @param Listener listener which wish to be deregistered
    * @see XDesktop.addTerminateListener()
    */
  def removeTerminateListener(Listener: XTerminateListener): Unit
  
  /**
    * tries to terminate the desktop.
    *
    * First, every terminate listener is called by their {@link XTerminateListener.queryTermination()} method. Throwing of a {@link TerminationVetoException}
    * can break the termination process and the listener how has done that will be the new "controller" of the desktop lifetime. They should try to terminate
    * it by themselves after their own processes will be finished. If nobody disagree with the termination request, every listener will be called by their {@link
    * XTerminateListener.notifyTermination()} method.
    * @returns `TRUE` if all listener agree with this request ; `FALSE` otherwise
    * @see XTerminateListener
    * @see TerminationVetoException
    */
  def terminate(): Boolean
}
object XDesktop {
  
  inline def apply(
    Components: XEnumerationAccess,
    CurrentComponent: XComponent,
    CurrentFrame: XFrame,
    acquire: Callback,
    addTerminateListener: XTerminateListener => Callback,
    getComponents: CallbackTo[XEnumerationAccess],
    getCurrentComponent: CallbackTo[XComponent],
    getCurrentFrame: CallbackTo[XFrame],
    queryInterface: `type` => Any,
    release: Callback,
    removeTerminateListener: XTerminateListener => Callback,
    terminate: CallbackTo[Boolean]
  ): XDesktop = {
    val __obj = js.Dynamic.literal(Components = Components.asInstanceOf[js.Any], CurrentComponent = CurrentComponent.asInstanceOf[js.Any], CurrentFrame = CurrentFrame.asInstanceOf[js.Any], acquire = acquire.toJsFn, addTerminateListener = js.Any.fromFunction1((t0: XTerminateListener) => addTerminateListener(t0).runNow()), getComponents = getComponents.toJsFn, getCurrentComponent = getCurrentComponent.toJsFn, getCurrentFrame = getCurrentFrame.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeTerminateListener = js.Any.fromFunction1((t0: XTerminateListener) => removeTerminateListener(t0).runNow()), terminate = terminate.toJsFn)
    __obj.asInstanceOf[XDesktop]
  }
  
  extension [Self <: XDesktop](x: Self) {
    
    inline def setAddTerminateListener(value: XTerminateListener => Callback): Self = StObject.set(x, "addTerminateListener", js.Any.fromFunction1((t0: XTerminateListener) => value(t0).runNow()))
    
    inline def setComponents(value: XEnumerationAccess): Self = StObject.set(x, "Components", value.asInstanceOf[js.Any])
    
    inline def setCurrentComponent(value: XComponent): Self = StObject.set(x, "CurrentComponent", value.asInstanceOf[js.Any])
    
    inline def setCurrentFrame(value: XFrame): Self = StObject.set(x, "CurrentFrame", value.asInstanceOf[js.Any])
    
    inline def setGetComponents(value: CallbackTo[XEnumerationAccess]): Self = StObject.set(x, "getComponents", value.toJsFn)
    
    inline def setGetCurrentComponent(value: CallbackTo[XComponent]): Self = StObject.set(x, "getCurrentComponent", value.toJsFn)
    
    inline def setGetCurrentFrame(value: CallbackTo[XFrame]): Self = StObject.set(x, "getCurrentFrame", value.toJsFn)
    
    inline def setRemoveTerminateListener(value: XTerminateListener => Callback): Self = StObject.set(x, "removeTerminateListener", js.Any.fromFunction1((t0: XTerminateListener) => value(t0).runNow()))
    
    inline def setTerminate(value: CallbackTo[Boolean]): Self = StObject.set(x, "terminate", value.toJsFn)
  }
}
