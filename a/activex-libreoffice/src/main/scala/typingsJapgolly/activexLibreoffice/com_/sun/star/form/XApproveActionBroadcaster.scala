package typingsJapgolly.activexLibreoffice.com_.sun.star.form

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows to probably veto actions to be performed on components.
  *
  * Usually, a component which supports the {@link XApproveActionBroadcaster} interface implements {@link com.sun.star.awt.XActionListener} as well.
  */
trait XApproveActionBroadcaster
  extends StObject
     with XInterface {
  
  /**
    * adds the specified listener to receive the {@link XApproveActionListener.approveAction()} event.
    * @param aListener the listener to be added
    */
  def addApproveActionListener(aListener: XApproveActionListener): Unit
  
  /**
    * removes the specified listener
    * @param aListener the listener to be removed
    */
  def removeApproveActionListener(aListener: XApproveActionListener): Unit
}
object XApproveActionBroadcaster {
  
  inline def apply(
    acquire: Callback,
    addApproveActionListener: XApproveActionListener => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeApproveActionListener: XApproveActionListener => Callback
  ): XApproveActionBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addApproveActionListener = js.Any.fromFunction1((t0: XApproveActionListener) => addApproveActionListener(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeApproveActionListener = js.Any.fromFunction1((t0: XApproveActionListener) => removeApproveActionListener(t0).runNow()))
    __obj.asInstanceOf[XApproveActionBroadcaster]
  }
  
  extension [Self <: XApproveActionBroadcaster](x: Self) {
    
    inline def setAddApproveActionListener(value: XApproveActionListener => Callback): Self = StObject.set(x, "addApproveActionListener", js.Any.fromFunction1((t0: XApproveActionListener) => value(t0).runNow()))
    
    inline def setRemoveApproveActionListener(value: XApproveActionListener => Callback): Self = StObject.set(x, "removeApproveActionListener", js.Any.fromFunction1((t0: XApproveActionListener) => value(t0).runNow()))
  }
}
