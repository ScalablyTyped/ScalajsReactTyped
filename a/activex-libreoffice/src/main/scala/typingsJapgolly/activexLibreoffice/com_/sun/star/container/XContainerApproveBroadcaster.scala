package typingsJapgolly.activexLibreoffice.com_.sun.star.container

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows containers to implement a vetoing mechanism for insertion, removal, and replacement of their elements. */
trait XContainerApproveBroadcaster extends StObject {
  
  /** adds a listener which can veto changes in the container's content */
  def addContainerApproveListener(Listener: XContainerApproveListener): Unit
  
  /** removes a previously added listener */
  def removeContainerApproveListener(Listener: XContainerApproveListener): Unit
}
object XContainerApproveBroadcaster {
  
  inline def apply(
    addContainerApproveListener: XContainerApproveListener => Callback,
    removeContainerApproveListener: XContainerApproveListener => Callback
  ): XContainerApproveBroadcaster = {
    val __obj = js.Dynamic.literal(addContainerApproveListener = js.Any.fromFunction1((t0: XContainerApproveListener) => addContainerApproveListener(t0).runNow()), removeContainerApproveListener = js.Any.fromFunction1((t0: XContainerApproveListener) => removeContainerApproveListener(t0).runNow()))
    __obj.asInstanceOf[XContainerApproveBroadcaster]
  }
  
  extension [Self <: XContainerApproveBroadcaster](x: Self) {
    
    inline def setAddContainerApproveListener(value: XContainerApproveListener => Callback): Self = StObject.set(x, "addContainerApproveListener", js.Any.fromFunction1((t0: XContainerApproveListener) => value(t0).runNow()))
    
    inline def setRemoveContainerApproveListener(value: XContainerApproveListener => Callback): Self = StObject.set(x, "removeContainerApproveListener", js.Any.fromFunction1((t0: XContainerApproveListener) => value(t0).runNow()))
  }
}
