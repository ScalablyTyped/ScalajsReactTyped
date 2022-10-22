package typingsJapgolly.activexLibreoffice.com_.sun.star.form

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides the possibility of receiving database error events.
  *
  * Please do **not** use anymore, this interface is superseded by {@link com.sun.star.sdb.XSQLErrorBroadcaster} .
  * @deprecated Deprecated
  */
trait XErrorBroadcaster
  extends StObject
     with XInterface {
  
  /** adds the specified listener to be notified of errors. */
  def addErrorListener(aListener: XErrorListener): Unit
  
  /** removes the specified listener. */
  def removeErrorListener(aListener: XErrorListener): Unit
}
object XErrorBroadcaster {
  
  inline def apply(
    acquire: Callback,
    addErrorListener: XErrorListener => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeErrorListener: XErrorListener => Callback
  ): XErrorBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addErrorListener = js.Any.fromFunction1((t0: XErrorListener) => addErrorListener(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeErrorListener = js.Any.fromFunction1((t0: XErrorListener) => removeErrorListener(t0).runNow()))
    __obj.asInstanceOf[XErrorBroadcaster]
  }
  
  extension [Self <: XErrorBroadcaster](x: Self) {
    
    inline def setAddErrorListener(value: XErrorListener => Callback): Self = StObject.set(x, "addErrorListener", js.Any.fromFunction1((t0: XErrorListener) => value(t0).runNow()))
    
    inline def setRemoveErrorListener(value: XErrorListener => Callback): Self = StObject.set(x, "removeErrorListener", js.Any.fromFunction1((t0: XErrorListener) => value(t0).runNow()))
  }
}
