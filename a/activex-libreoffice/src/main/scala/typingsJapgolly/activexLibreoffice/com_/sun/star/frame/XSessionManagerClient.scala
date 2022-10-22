package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Connect to a session manager to get information about pending desktop shutdown */
trait XSessionManagerClient
  extends StObject
     with XInterface {
  
  /**
    * addSessionManagerListener registers a listener for session management events
    * @param xListener listener for session management events
    * @see XSessionManagerListener
    * @see XSessionManagerClient.removeSessionManagerListener()
    */
  def addSessionManagerListener(xListener: XSessionManagerListener): Unit
  
  /**
    * Call cancelShutdown to try to cancel a desktop shutdown in progress
    * @returns `TRUE` if shutdown was canceled, `FALSE` else.
    */
  def cancelShutdown(): Boolean
  
  /**
    * interactionDone is called when a listener has finished user interaction
    * @param xListener the listener done with user interaction
    * @see XSessionManagerListener
    */
  def interactionDone(xListener: XSessionManagerListener): Unit
  
  /**
    * queryInteraction issues a request for a user interaction slot from the session manager
    * @param xListener the listener requesting user interaction
    * @see XSessionManagerListener
    */
  def queryInteraction(xListener: XSessionManagerListener): Unit
  
  /**
    * removeSessionManagerListener deregisters a listener for session events
    * @param xListener listener to be removed
    * @see XSessionManagerListener
    * @see XSessionManagerClient.addSessionManagerListener()
    */
  def removeSessionManagerListener(xListener: XSessionManagerListener): Unit
  
  /**
    * saveDone signals that a listener has processed a save request
    * @param xListener the listener having finished save request processing
    * @see XSessionManagerListener
    */
  def saveDone(xListener: XSessionManagerListener): Unit
}
object XSessionManagerClient {
  
  inline def apply(
    acquire: Callback,
    addSessionManagerListener: XSessionManagerListener => Callback,
    cancelShutdown: CallbackTo[Boolean],
    interactionDone: XSessionManagerListener => Callback,
    queryInteraction: XSessionManagerListener => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeSessionManagerListener: XSessionManagerListener => Callback,
    saveDone: XSessionManagerListener => Callback
  ): XSessionManagerClient = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addSessionManagerListener = js.Any.fromFunction1((t0: XSessionManagerListener) => addSessionManagerListener(t0).runNow()), cancelShutdown = cancelShutdown.toJsFn, interactionDone = js.Any.fromFunction1((t0: XSessionManagerListener) => interactionDone(t0).runNow()), queryInteraction = js.Any.fromFunction1((t0: XSessionManagerListener) => queryInteraction(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeSessionManagerListener = js.Any.fromFunction1((t0: XSessionManagerListener) => removeSessionManagerListener(t0).runNow()), saveDone = js.Any.fromFunction1((t0: XSessionManagerListener) => saveDone(t0).runNow()))
    __obj.asInstanceOf[XSessionManagerClient]
  }
  
  extension [Self <: XSessionManagerClient](x: Self) {
    
    inline def setAddSessionManagerListener(value: XSessionManagerListener => Callback): Self = StObject.set(x, "addSessionManagerListener", js.Any.fromFunction1((t0: XSessionManagerListener) => value(t0).runNow()))
    
    inline def setCancelShutdown(value: CallbackTo[Boolean]): Self = StObject.set(x, "cancelShutdown", value.toJsFn)
    
    inline def setInteractionDone(value: XSessionManagerListener => Callback): Self = StObject.set(x, "interactionDone", js.Any.fromFunction1((t0: XSessionManagerListener) => value(t0).runNow()))
    
    inline def setQueryInteraction(value: XSessionManagerListener => Callback): Self = StObject.set(x, "queryInteraction", js.Any.fromFunction1((t0: XSessionManagerListener) => value(t0).runNow()))
    
    inline def setRemoveSessionManagerListener(value: XSessionManagerListener => Callback): Self = StObject.set(x, "removeSessionManagerListener", js.Any.fromFunction1((t0: XSessionManagerListener) => value(t0).runNow()))
    
    inline def setSaveDone(value: XSessionManagerListener => Callback): Self = StObject.set(x, "saveDone", js.Any.fromFunction1((t0: XSessionManagerListener) => value(t0).runNow()))
  }
}
