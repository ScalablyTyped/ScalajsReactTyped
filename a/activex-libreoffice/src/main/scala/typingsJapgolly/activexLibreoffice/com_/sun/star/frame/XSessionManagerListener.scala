package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XSessionManagerListener
  extends StObject
     with XEventListener {
  
  /**
    * approveInteraction is called when an outstanding interaction request was processed by the session manager
    * @param bInteractionGranted If `FALSE` the listener must not interact with the user. If `TRUE` the listener can interact with the user now. After interac
    * @see XSessionManagerClient
    * @see XSessionManagerClient.interactionDone()
    */
  def approveInteraction(bInteractionGranted: Boolean): Unit
  
  /** returns true, if a session was restored */
  def doRestore(): Boolean
  
  /**
    * doSave gets called when a save event was issued by the session manager the listener should do what is necessary to restore the current state of the
    * application
    *
    * If the listener desires to interact with the user it must first issue a user interaction request and only do so if interaction was granted
    *
    * When the save request is processed (with or without user interaction) the listener must call {@link XSessionManagerClient.saveDone()} on the session
    * manager client service object.
    * @param bShutdown `TRUE` if a shutdown is in progress, `FALSE` if just a save point was requested
    * @param bCancelable `TRUE` if a shutdown in progress can be canceled by the listener, `FALSE` else  the listener may choose to ignore the saveDone() even
    * @see XSessionManagerClient
    * @see XSessionManagerClient.saveDone()
    */
  def doSave(bShutdown: Boolean, bCancelable: Boolean): Unit
  
  /**
    * shutdownCanceled is called when a shutdown was canceled by the user The listener can cancel its saving operations. No further interaction is necessary
    * and further calls on the session manager client service object will be ignored.
    */
  def shutdownCanceled(): Unit
}
object XSessionManagerListener {
  
  inline def apply(
    acquire: Callback,
    approveInteraction: Boolean => Callback,
    disposing: EventObject => Callback,
    doRestore: CallbackTo[Boolean],
    doSave: (Boolean, Boolean) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    shutdownCanceled: Callback
  ): XSessionManagerListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, approveInteraction = js.Any.fromFunction1((t0: Boolean) => approveInteraction(t0).runNow()), disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), doRestore = doRestore.toJsFn, doSave = js.Any.fromFunction2((t0: Boolean, t1: Boolean) => (doSave(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, shutdownCanceled = shutdownCanceled.toJsFn)
    __obj.asInstanceOf[XSessionManagerListener]
  }
  
  extension [Self <: XSessionManagerListener](x: Self) {
    
    inline def setApproveInteraction(value: Boolean => Callback): Self = StObject.set(x, "approveInteraction", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setDoRestore(value: CallbackTo[Boolean]): Self = StObject.set(x, "doRestore", value.toJsFn)
    
    inline def setDoSave(value: (Boolean, Boolean) => Callback): Self = StObject.set(x, "doSave", js.Any.fromFunction2((t0: Boolean, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setShutdownCanceled(value: Callback): Self = StObject.set(x, "shutdownCanceled", value.toJsFn)
  }
}
