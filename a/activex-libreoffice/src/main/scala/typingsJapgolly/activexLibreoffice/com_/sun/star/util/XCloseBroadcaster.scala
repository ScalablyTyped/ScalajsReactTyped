package typingsJapgolly.activexLibreoffice.com_.sun.star.util

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * broadcasts each tried closing of an object to all interest listener
  *
  * The called object for closing must post the closing events immediately and before any internal cancel operations will be started. If a listener
  * disagree with that it should throw a {@link CloseVetoException} and called function {@link XCloseable.close()} must be broken immediately. It's not
  * allowed to catch it inside the close() request. If no listener nor internal processes hinder the object on closing all listeners get a notification
  * about real closing.
  * @see
  */
trait XCloseBroadcaster
  extends StObject
     with XInterface {
  
  /**
    * adds the specified listener to receive or have a veto for "close" events
    * @param Listener the listener which is interest on closing events
    */
  def addCloseListener(Listener: XCloseListener): Unit
  
  /**
    * removes the specified listener
    * @param Listener the listener which isn't interest on closing events any longer
    */
  def removeCloseListener(Listener: XCloseListener): Unit
}
object XCloseBroadcaster {
  
  inline def apply(
    acquire: Callback,
    addCloseListener: XCloseListener => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeCloseListener: XCloseListener => Callback
  ): XCloseBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addCloseListener = js.Any.fromFunction1((t0: XCloseListener) => addCloseListener(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeCloseListener = js.Any.fromFunction1((t0: XCloseListener) => removeCloseListener(t0).runNow()))
    __obj.asInstanceOf[XCloseBroadcaster]
  }
  
  extension [Self <: XCloseBroadcaster](x: Self) {
    
    inline def setAddCloseListener(value: XCloseListener => Callback): Self = StObject.set(x, "addCloseListener", js.Any.fromFunction1((t0: XCloseListener) => value(t0).runNow()))
    
    inline def setRemoveCloseListener(value: XCloseListener => Callback): Self = StObject.set(x, "removeCloseListener", js.Any.fromFunction1((t0: XCloseListener) => value(t0).runNow()))
  }
}
