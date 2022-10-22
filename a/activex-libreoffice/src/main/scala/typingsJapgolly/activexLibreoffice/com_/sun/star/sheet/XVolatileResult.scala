package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to handle a volatile function result.
  * @see com.sun.star.sheet.VolatileResult
  * @see com.sun.star.sheet.ResultEvent
  */
trait XVolatileResult
  extends StObject
     with XInterface {
  
  /** adds a listener to be notified when a new value is available. */
  def addResultListener(aListener: XResultListener): Unit
  
  /** removes the specified listener. */
  def removeResultListener(aListener: XResultListener): Unit
}
object XVolatileResult {
  
  inline def apply(
    acquire: Callback,
    addResultListener: XResultListener => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeResultListener: XResultListener => Callback
  ): XVolatileResult = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addResultListener = js.Any.fromFunction1((t0: XResultListener) => addResultListener(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeResultListener = js.Any.fromFunction1((t0: XResultListener) => removeResultListener(t0).runNow()))
    __obj.asInstanceOf[XVolatileResult]
  }
  
  extension [Self <: XVolatileResult](x: Self) {
    
    inline def setAddResultListener(value: XResultListener => Callback): Self = StObject.set(x, "addResultListener", js.Any.fromFunction1((t0: XResultListener) => value(t0).runNow()))
    
    inline def setRemoveResultListener(value: XResultListener => Callback): Self = StObject.set(x, "removeResultListener", js.Any.fromFunction1((t0: XResultListener) => value(t0).runNow()))
  }
}
