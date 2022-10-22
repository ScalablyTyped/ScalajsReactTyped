package typingsJapgolly.activexLibreoffice.com_.sun.star.sdb

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is not to be used anymore
  * @deprecated Deprecated
  */
trait XDatabaseAccessListener
  extends StObject
     with XEventListener {
  
  def approveConnectionClosing(event: EventObject): Boolean
  
  def connectionChanged(event: EventObject): Unit
  
  def connectionClosing(event: EventObject): Unit
}
object XDatabaseAccessListener {
  
  inline def apply(
    acquire: Callback,
    approveConnectionClosing: EventObject => Boolean,
    connectionChanged: EventObject => Callback,
    connectionClosing: EventObject => Callback,
    disposing: EventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XDatabaseAccessListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, approveConnectionClosing = js.Any.fromFunction1(approveConnectionClosing), connectionChanged = js.Any.fromFunction1((t0: EventObject) => connectionChanged(t0).runNow()), connectionClosing = js.Any.fromFunction1((t0: EventObject) => connectionClosing(t0).runNow()), disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XDatabaseAccessListener]
  }
  
  extension [Self <: XDatabaseAccessListener](x: Self) {
    
    inline def setApproveConnectionClosing(value: EventObject => Boolean): Self = StObject.set(x, "approveConnectionClosing", js.Any.fromFunction1(value))
    
    inline def setConnectionChanged(value: EventObject => Callback): Self = StObject.set(x, "connectionChanged", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
    
    inline def setConnectionClosing(value: EventObject => Callback): Self = StObject.set(x, "connectionClosing", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
  }
}
