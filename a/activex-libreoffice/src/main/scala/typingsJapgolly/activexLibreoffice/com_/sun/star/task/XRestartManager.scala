package typingsJapgolly.activexLibreoffice.com_.sun.star.task

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows to try to restart the office.
  * @since OOo 3.3
  */
trait XRestartManager
  extends StObject
     with XInterface {
  
  /**
    * allows to get info whether the restart has been requested and provide the initialization status.
    *
    * The office has to call this method just before the main loop has been started, with the `TRUE` as argument, so that the implementation knows that the
    * office is initialized. If the method returns `TRUE` , the office should restart without starting the main loop.
    * @param bInitialized specifies whether the office process is initialized already, if the caller does not have this information, they should provide `FALSE` .
    * @returns `TRUE` if the office restart has been requested, `FALSE` otherwise
    * @throws com::sun::star::uno::Exception to notify the caller about possible failures
    */
  def isRestartRequested(bInitialized: Boolean): Boolean
  
  /**
    * let the office restart asynchronously
    * @param xInteractionHandler the {@link com.sun.star.task.InteractionHandler} service implementation, that is used in case a problem is detected during re
    * @throws com::sun::star::uno::Exception to notify the caller about possible failures
    */
  def requestRestart(xInteractionHandler: XInteractionHandler): Unit
}
object XRestartManager {
  
  inline def apply(
    acquire: Callback,
    isRestartRequested: Boolean => Boolean,
    queryInterface: `type` => Any,
    release: Callback,
    requestRestart: XInteractionHandler => Callback
  ): XRestartManager = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, isRestartRequested = js.Any.fromFunction1(isRestartRequested), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, requestRestart = js.Any.fromFunction1((t0: XInteractionHandler) => requestRestart(t0).runNow()))
    __obj.asInstanceOf[XRestartManager]
  }
  
  extension [Self <: XRestartManager](x: Self) {
    
    inline def setIsRestartRequested(value: Boolean => Boolean): Self = StObject.set(x, "isRestartRequested", js.Any.fromFunction1(value))
    
    inline def setRequestRestart(value: XInteractionHandler => Callback): Self = StObject.set(x, "requestRestart", js.Any.fromFunction1((t0: XInteractionHandler) => value(t0).runNow()))
  }
}
