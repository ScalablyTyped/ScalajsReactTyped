package typingsJapgolly.activexLibreoffice.com_.sun.star.ui

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XContextChangeEventListener
  extends StObject
     with XEventListener {
  
  def notifyContextChangeEvent(event: ContextChangeEventObject): Unit
}
object XContextChangeEventListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    notifyContextChangeEvent: ContextChangeEventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XContextChangeEventListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), notifyContextChangeEvent = js.Any.fromFunction1((t0: ContextChangeEventObject) => notifyContextChangeEvent(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XContextChangeEventListener]
  }
  
  extension [Self <: XContextChangeEventListener](x: Self) {
    
    inline def setNotifyContextChangeEvent(value: ContextChangeEventObject => Callback): Self = StObject.set(x, "notifyContextChangeEvent", js.Any.fromFunction1((t0: ContextChangeEventObject) => value(t0).runNow()))
  }
}
