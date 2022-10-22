package typingsJapgolly.activexLibreoffice.com_.sun.star.form

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides the possibility of receiving an event for configuration of parameters.
  *
  * Note that this interface provides exactly the same functionality as the {@link XDatabaseParameterBroadcaster} interface. It exists purely for
  * compatibility with the {@link com.sun.star.script.XEventAttacher.attachSingleEventListener()} : It expects the methods for adding and removing
  * listeners to follow a certain naming scheme, respective to the name of the listener which is being added/removed.
  * @see XDatabaseParameterBroadcaster
  * @see com.sun.star.script.XEventAttacher
  */
trait XDatabaseParameterBroadcaster2
  extends StObject
     with XDatabaseParameterBroadcaster {
  
  /**
    * registers an {@link XDatabaseParameterListener}
    *
    * This method behaves exactly as the {@link XDatabaseParameterBroadcaster.addParameterListener()} method inherited from the base interface.
    */
  def addDatabaseParameterListener(aListener: XDatabaseParameterListener): Unit
  
  /**
    * revokes an {@link XDatabaseParameterListener}
    *
    * This method behaves exactly as the {@link XDatabaseParameterBroadcaster.removeParameterListener()} method inherited from the base interface.
    */
  def removeDatabaseParameterListener(aListener: XDatabaseParameterListener): Unit
}
object XDatabaseParameterBroadcaster2 {
  
  inline def apply(
    acquire: Callback,
    addDatabaseParameterListener: XDatabaseParameterListener => Callback,
    addParameterListener: XDatabaseParameterListener => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeDatabaseParameterListener: XDatabaseParameterListener => Callback,
    removeParameterListener: XDatabaseParameterListener => Callback
  ): XDatabaseParameterBroadcaster2 = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addDatabaseParameterListener = js.Any.fromFunction1((t0: XDatabaseParameterListener) => addDatabaseParameterListener(t0).runNow()), addParameterListener = js.Any.fromFunction1((t0: XDatabaseParameterListener) => addParameterListener(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeDatabaseParameterListener = js.Any.fromFunction1((t0: XDatabaseParameterListener) => removeDatabaseParameterListener(t0).runNow()), removeParameterListener = js.Any.fromFunction1((t0: XDatabaseParameterListener) => removeParameterListener(t0).runNow()))
    __obj.asInstanceOf[XDatabaseParameterBroadcaster2]
  }
  
  extension [Self <: XDatabaseParameterBroadcaster2](x: Self) {
    
    inline def setAddDatabaseParameterListener(value: XDatabaseParameterListener => Callback): Self = StObject.set(x, "addDatabaseParameterListener", js.Any.fromFunction1((t0: XDatabaseParameterListener) => value(t0).runNow()))
    
    inline def setRemoveDatabaseParameterListener(value: XDatabaseParameterListener => Callback): Self = StObject.set(x, "removeDatabaseParameterListener", js.Any.fromFunction1((t0: XDatabaseParameterListener) => value(t0).runNow()))
  }
}
