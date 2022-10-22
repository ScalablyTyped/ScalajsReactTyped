package typingsJapgolly.activexLibreoffice.com_.sun.star.sdb

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.task.XInteractionHandler
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is used for execution where information for execution may be required from the user. */
trait XCompletedExecution
  extends StObject
     with XInterface {
  
  /**
    * completes necessary information before execution, for example parameter values.
    * @param handler will be asked when more information is needed
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def executeWithCompletion(handler: XInteractionHandler): Unit
}
object XCompletedExecution {
  
  inline def apply(
    acquire: Callback,
    executeWithCompletion: XInteractionHandler => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XCompletedExecution = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, executeWithCompletion = js.Any.fromFunction1((t0: XInteractionHandler) => executeWithCompletion(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XCompletedExecution]
  }
  
  extension [Self <: XCompletedExecution](x: Self) {
    
    inline def setExecuteWithCompletion(value: XInteractionHandler => Callback): Self = StObject.set(x, "executeWithCompletion", js.Any.fromFunction1((t0: XInteractionHandler) => value(t0).runNow()))
  }
}
