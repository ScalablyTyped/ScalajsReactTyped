package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface should be implemented by an internal {@link XCommandEnvironment} that can not supply an {@link com.sun.star.task.XInteractionHandler} ,
  * but instead wants interaction requests to be handled by other internal error handling mechanism.
  */
trait XInteractionHandlerSupplier
  extends StObject
     with XInterface {
  
  /**
    * Returns whether an {@link com.sun.star.task.XInteractionHandler} can be supplied.
    * @returns `TRUE` , if an {@link com.sun.star.task.XInteractionHandler} can be supplied, `FALSE` otherwise.
    */
  def hasInteractionHandler(): Boolean
}
object XInteractionHandlerSupplier {
  
  inline def apply(
    acquire: Callback,
    hasInteractionHandler: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback
  ): XInteractionHandlerSupplier = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, hasInteractionHandler = hasInteractionHandler.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XInteractionHandlerSupplier]
  }
  
  extension [Self <: XInteractionHandlerSupplier](x: Self) {
    
    inline def setHasInteractionHandler(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasInteractionHandler", value.toJsFn)
  }
}
