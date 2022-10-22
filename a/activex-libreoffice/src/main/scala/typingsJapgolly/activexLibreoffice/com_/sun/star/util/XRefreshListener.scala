package typingsJapgolly.activexLibreoffice.com_.sun.star.util

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to receive **refreshed** events. */
trait XRefreshListener
  extends StObject
     with XEventListener {
  
  /** is called when the object data is refreshed. */
  def refreshed(rEvent: EventObject): Unit
}
object XRefreshListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    queryInterface: `type` => Any,
    refreshed: EventObject => Callback,
    release: Callback
  ): XRefreshListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), refreshed = js.Any.fromFunction1((t0: EventObject) => refreshed(t0).runNow()), release = release.toJsFn)
    __obj.asInstanceOf[XRefreshListener]
  }
  
  extension [Self <: XRefreshListener](x: Self) {
    
    inline def setRefreshed(value: EventObject => Callback): Self = StObject.set(x, "refreshed", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
  }
}
