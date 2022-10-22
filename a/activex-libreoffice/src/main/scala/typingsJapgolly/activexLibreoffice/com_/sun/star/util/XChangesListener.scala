package typingsJapgolly.activexLibreoffice.com_.sun.star.util

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * receives events from batch change broadcaster objects.
  * @see ChangesEvent
  * @see XChangesNotifier
  * @see XChangesBatch
  */
trait XChangesListener
  extends StObject
     with XEventListener {
  
  /** is invoked when a batch of changes occurred. */
  def changesOccurred(Event: ChangesEvent): Unit
}
object XChangesListener {
  
  inline def apply(
    acquire: Callback,
    changesOccurred: ChangesEvent => Callback,
    disposing: EventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XChangesListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, changesOccurred = js.Any.fromFunction1((t0: ChangesEvent) => changesOccurred(t0).runNow()), disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XChangesListener]
  }
  
  extension [Self <: XChangesListener](x: Self) {
    
    inline def setChangesOccurred(value: ChangesEvent => Callback): Self = StObject.set(x, "changesOccurred", js.Any.fromFunction1((t0: ChangesEvent) => value(t0).runNow()))
  }
}
