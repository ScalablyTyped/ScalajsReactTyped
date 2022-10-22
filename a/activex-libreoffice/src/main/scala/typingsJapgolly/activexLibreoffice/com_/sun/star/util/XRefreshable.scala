package typingsJapgolly.activexLibreoffice.com_.sun.star.util

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is supported by objects with data that can be refreshed from a data source. */
trait XRefreshable
  extends StObject
     with XInterface {
  
  /** adds the specified listener to receive the event "refreshed." */
  def addRefreshListener(l: XRefreshListener): Unit
  
  /** refreshes the data of the object from the connected data source. */
  def refresh(): Unit
  
  /** removes the specified listener. */
  def removeRefreshListener(l: XRefreshListener): Unit
}
object XRefreshable {
  
  inline def apply(
    acquire: Callback,
    addRefreshListener: XRefreshListener => Callback,
    queryInterface: `type` => Any,
    refresh: Callback,
    release: Callback,
    removeRefreshListener: XRefreshListener => Callback
  ): XRefreshable = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addRefreshListener = js.Any.fromFunction1((t0: XRefreshListener) => addRefreshListener(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), refresh = refresh.toJsFn, release = release.toJsFn, removeRefreshListener = js.Any.fromFunction1((t0: XRefreshListener) => removeRefreshListener(t0).runNow()))
    __obj.asInstanceOf[XRefreshable]
  }
  
  extension [Self <: XRefreshable](x: Self) {
    
    inline def setAddRefreshListener(value: XRefreshListener => Callback): Self = StObject.set(x, "addRefreshListener", js.Any.fromFunction1((t0: XRefreshListener) => value(t0).runNow()))
    
    inline def setRefresh(value: Callback): Self = StObject.set(x, "refresh", value.toJsFn)
    
    inline def setRemoveRefreshListener(value: XRefreshListener => Callback): Self = StObject.set(x, "removeRefreshListener", js.Any.fromFunction1((t0: XRefreshListener) => value(t0).runNow()))
  }
}
