package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to add and remove {@link XActivationEventListener}
  * @since OOo 2.0
  */
trait XActivationBroadcaster
  extends StObject
     with XInterface {
  
  /**
    * allows a component supporting the {@link XActivationEventListener} interface to register as listener. The component will be notified with a {@link
    * ActivationEvent} every time the active sheet changes.
    * @param aListener the component that is to be added as listener
    * @see XActivationEventListener
    * @see ActivationEvent
    */
  def addActivationEventListener(aListener: XActivationEventListener): Unit
  
  /**
    * removes a previously registered listener.
    * @param aListener the component that is to be removed
    */
  def removeActivationEventListener(aListener: XActivationEventListener): Unit
}
object XActivationBroadcaster {
  
  inline def apply(
    acquire: Callback,
    addActivationEventListener: XActivationEventListener => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeActivationEventListener: XActivationEventListener => Callback
  ): XActivationBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addActivationEventListener = js.Any.fromFunction1((t0: XActivationEventListener) => addActivationEventListener(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeActivationEventListener = js.Any.fromFunction1((t0: XActivationEventListener) => removeActivationEventListener(t0).runNow()))
    __obj.asInstanceOf[XActivationBroadcaster]
  }
  
  extension [Self <: XActivationBroadcaster](x: Self) {
    
    inline def setAddActivationEventListener(value: XActivationEventListener => Callback): Self = StObject.set(x, "addActivationEventListener", js.Any.fromFunction1((t0: XActivationEventListener) => value(t0).runNow()))
    
    inline def setRemoveActivationEventListener(value: XActivationEventListener => Callback): Self = StObject.set(x, "removeActivationEventListener", js.Any.fromFunction1((t0: XActivationEventListener) => value(t0).runNow()))
  }
}
