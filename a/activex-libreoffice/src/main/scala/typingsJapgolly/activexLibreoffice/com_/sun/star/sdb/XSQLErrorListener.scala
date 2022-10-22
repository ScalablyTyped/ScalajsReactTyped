package typingsJapgolly.activexLibreoffice.com_.sun.star.sdb

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** the listener interface for receiving "errorOccured" events posted by any database object. */
trait XSQLErrorListener
  extends StObject
     with XEventListener {
  
  /**
    * invoked when a database error occurs, just before a {@link com.sun.star.sdbc.SQLException} is thrown to the application.
    * @param aEvent the event which occurred
    */
  def errorOccured(aEvent: SQLErrorEvent): Unit
}
object XSQLErrorListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    errorOccured: SQLErrorEvent => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XSQLErrorListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), errorOccured = js.Any.fromFunction1((t0: SQLErrorEvent) => errorOccured(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XSQLErrorListener]
  }
  
  extension [Self <: XSQLErrorListener](x: Self) {
    
    inline def setErrorOccured(value: SQLErrorEvent => Callback): Self = StObject.set(x, "errorOccured", js.Any.fromFunction1((t0: SQLErrorEvent) => value(t0).runNow()))
  }
}
