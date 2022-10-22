package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.task.XInteractionHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandEnvironment
  extends StObject
     with XCommandEnvironment {
  
  /**
    * Constructor.
    * @param InteractionHandler the interaction handler instance that will be returned by this service's implementation of XCommandEnvironemt::getInteractionH
    * @param ProgressHandler the progress handler instance that will be returned by this service's implementation of XCommandEnvironemt::getProgressHandler()
    */
  def create(InteractionHandler: XInteractionHandler, ProgressHandler: XProgressHandler): Unit
}
object CommandEnvironment {
  
  inline def apply(
    InteractionHandler: XInteractionHandler,
    ProgressHandler: XProgressHandler,
    acquire: Callback,
    create: (XInteractionHandler, XProgressHandler) => Callback,
    getInteractionHandler: CallbackTo[XInteractionHandler],
    getProgressHandler: CallbackTo[XProgressHandler],
    queryInterface: `type` => Any,
    release: Callback
  ): CommandEnvironment = {
    val __obj = js.Dynamic.literal(InteractionHandler = InteractionHandler.asInstanceOf[js.Any], ProgressHandler = ProgressHandler.asInstanceOf[js.Any], acquire = acquire.toJsFn, create = js.Any.fromFunction2((t0: XInteractionHandler, t1: XProgressHandler) => (create(t0, t1)).runNow()), getInteractionHandler = getInteractionHandler.toJsFn, getProgressHandler = getProgressHandler.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[CommandEnvironment]
  }
  
  extension [Self <: CommandEnvironment](x: Self) {
    
    inline def setCreate(value: (XInteractionHandler, XProgressHandler) => Callback): Self = StObject.set(x, "create", js.Any.fromFunction2((t0: XInteractionHandler, t1: XProgressHandler) => (value(t0, t1)).runNow()))
  }
}
