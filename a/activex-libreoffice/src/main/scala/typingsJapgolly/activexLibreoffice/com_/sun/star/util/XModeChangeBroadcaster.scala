package typingsJapgolly.activexLibreoffice.com_.sun.star.util

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * broadcasts changes in an object's internal mode.
  * @see XModeSelector
  * @see XModeChangeListener
  * @see XModeChangeApproveListener
  * @since OOo 1.1.2
  */
trait XModeChangeBroadcaster
  extends StObject
     with XInterface {
  
  /**
    * adds the given listener to the list of components to be notified when the mode is about to change.
    * @throws com::sun::star::lang::NoSupportException if the component does not allow vetoing mode changes
    */
  def addModeChangeApproveListener(rxListener: XModeChangeApproveListener): Unit
  
  /** adds the given listener to the list of components to be notified when the mode changes. */
  def addModeChangeListener(rxListener: XModeChangeListener): Unit
  
  /**
    * remove the given listener from the list of components to be notified when the mode is about to change.
    * @throws com::sun::star::lang::NoSupportException if the component does not allow vetoing mode changes
    */
  def removeModeChangeApproveListener(rxListener: XModeChangeApproveListener): Unit
  
  /** removes the given listener from the list of components to be notified when the mode changes. */
  def removeModeChangeListener(rxListener: XModeChangeListener): Unit
}
object XModeChangeBroadcaster {
  
  inline def apply(
    acquire: Callback,
    addModeChangeApproveListener: XModeChangeApproveListener => Callback,
    addModeChangeListener: XModeChangeListener => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeModeChangeApproveListener: XModeChangeApproveListener => Callback,
    removeModeChangeListener: XModeChangeListener => Callback
  ): XModeChangeBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addModeChangeApproveListener = js.Any.fromFunction1((t0: XModeChangeApproveListener) => addModeChangeApproveListener(t0).runNow()), addModeChangeListener = js.Any.fromFunction1((t0: XModeChangeListener) => addModeChangeListener(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeModeChangeApproveListener = js.Any.fromFunction1((t0: XModeChangeApproveListener) => removeModeChangeApproveListener(t0).runNow()), removeModeChangeListener = js.Any.fromFunction1((t0: XModeChangeListener) => removeModeChangeListener(t0).runNow()))
    __obj.asInstanceOf[XModeChangeBroadcaster]
  }
  
  extension [Self <: XModeChangeBroadcaster](x: Self) {
    
    inline def setAddModeChangeApproveListener(value: XModeChangeApproveListener => Callback): Self = StObject.set(x, "addModeChangeApproveListener", js.Any.fromFunction1((t0: XModeChangeApproveListener) => value(t0).runNow()))
    
    inline def setAddModeChangeListener(value: XModeChangeListener => Callback): Self = StObject.set(x, "addModeChangeListener", js.Any.fromFunction1((t0: XModeChangeListener) => value(t0).runNow()))
    
    inline def setRemoveModeChangeApproveListener(value: XModeChangeApproveListener => Callback): Self = StObject.set(x, "removeModeChangeApproveListener", js.Any.fromFunction1((t0: XModeChangeApproveListener) => value(t0).runNow()))
    
    inline def setRemoveModeChangeListener(value: XModeChangeListener => Callback): Self = StObject.set(x, "removeModeChangeListener", js.Any.fromFunction1((t0: XModeChangeListener) => value(t0).runNow()))
  }
}
