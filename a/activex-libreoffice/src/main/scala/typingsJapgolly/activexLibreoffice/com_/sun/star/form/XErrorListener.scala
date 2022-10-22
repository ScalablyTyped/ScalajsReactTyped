package typingsJapgolly.activexLibreoffice.com_.sun.star.form

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * used to be notified when errors in a database form happen.
  *
  * Each time an exception is triggered by a database form, the error event is posted to the error listeners. This event may be used to configure the
  * error handling of a database form.
  *
  * Please do **not** use anymore, this interface is superseded by {@link com.sun.star.sdb.XSQLErrorListener} .
  * @deprecated Deprecated
  */
trait XErrorListener
  extends StObject
     with XEventListener {
  
  /** is invoked when a database action performed by a database form raises an exception. */
  def errorOccured(aEvent: ErrorEvent): Unit
}
object XErrorListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    errorOccured: ErrorEvent => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XErrorListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), errorOccured = js.Any.fromFunction1((t0: ErrorEvent) => errorOccured(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XErrorListener]
  }
  
  extension [Self <: XErrorListener](x: Self) {
    
    inline def setErrorOccured(value: ErrorEvent => Callback): Self = StObject.set(x, "errorOccured", js.Any.fromFunction1((t0: ErrorEvent) => value(t0).runNow()))
  }
}
