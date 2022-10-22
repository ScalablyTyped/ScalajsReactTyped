package typingsJapgolly.activexLibreoffice.com_.sun.star.sdb

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** interface for notifying potential listeners of {@link com.sun.star.sdbc.SQLException} s posted by any database object. */
trait XSQLErrorBroadcaster
  extends StObject
     with XInterface {
  
  /** adds the specified listener to receive the event "errorOccurred" */
  def addSQLErrorListener(Listener: XSQLErrorListener): Unit
  
  /** removes the specified listener. */
  def removeSQLErrorListener(Listener: XSQLErrorListener): Unit
}
object XSQLErrorBroadcaster {
  
  inline def apply(
    acquire: Callback,
    addSQLErrorListener: XSQLErrorListener => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeSQLErrorListener: XSQLErrorListener => Callback
  ): XSQLErrorBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addSQLErrorListener = js.Any.fromFunction1((t0: XSQLErrorListener) => addSQLErrorListener(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeSQLErrorListener = js.Any.fromFunction1((t0: XSQLErrorListener) => removeSQLErrorListener(t0).runNow()))
    __obj.asInstanceOf[XSQLErrorBroadcaster]
  }
  
  extension [Self <: XSQLErrorBroadcaster](x: Self) {
    
    inline def setAddSQLErrorListener(value: XSQLErrorListener => Callback): Self = StObject.set(x, "addSQLErrorListener", js.Any.fromFunction1((t0: XSQLErrorListener) => value(t0).runNow()))
    
    inline def setRemoveSQLErrorListener(value: XSQLErrorListener => Callback): Self = StObject.set(x, "removeSQLErrorListener", js.Any.fromFunction1((t0: XSQLErrorListener) => value(t0).runNow()))
  }
}
