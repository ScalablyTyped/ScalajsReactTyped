package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.task.XInteractionHandler
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * defines the environment for a command.
  * @author Kai Sommerfeld
  * @see XCommandProcessor
  * @version 1.0
  */
trait XCommandEnvironment
  extends StObject
     with XInterface {
  
  /**
    * returns the command's interaction handler.
    *
    * If called multiple times, this method should consistently return the same value (to allow caching).
    * @returns an interaction handler
    */
  val InteractionHandler: XInteractionHandler
  
  /**
    * returns the command's progress handler.
    *
    * If called multiple times, this method should consistently return the same value (to allow caching).
    * @returns a progress handler
    */
  val ProgressHandler: XProgressHandler
  
  /**
    * returns the command's interaction handler.
    *
    * If called multiple times, this method should consistently return the same value (to allow caching).
    * @returns an interaction handler
    */
  def getInteractionHandler(): XInteractionHandler
  
  /**
    * returns the command's progress handler.
    *
    * If called multiple times, this method should consistently return the same value (to allow caching).
    * @returns a progress handler
    */
  def getProgressHandler(): XProgressHandler
}
object XCommandEnvironment {
  
  inline def apply(
    InteractionHandler: XInteractionHandler,
    ProgressHandler: XProgressHandler,
    acquire: Callback,
    getInteractionHandler: CallbackTo[XInteractionHandler],
    getProgressHandler: CallbackTo[XProgressHandler],
    queryInterface: `type` => Any,
    release: Callback
  ): XCommandEnvironment = {
    val __obj = js.Dynamic.literal(InteractionHandler = InteractionHandler.asInstanceOf[js.Any], ProgressHandler = ProgressHandler.asInstanceOf[js.Any], acquire = acquire.toJsFn, getInteractionHandler = getInteractionHandler.toJsFn, getProgressHandler = getProgressHandler.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XCommandEnvironment]
  }
  
  extension [Self <: XCommandEnvironment](x: Self) {
    
    inline def setGetInteractionHandler(value: CallbackTo[XInteractionHandler]): Self = StObject.set(x, "getInteractionHandler", value.toJsFn)
    
    inline def setGetProgressHandler(value: CallbackTo[XProgressHandler]): Self = StObject.set(x, "getProgressHandler", value.toJsFn)
    
    inline def setInteractionHandler(value: XInteractionHandler): Self = StObject.set(x, "InteractionHandler", value.asInstanceOf[js.Any])
    
    inline def setProgressHandler(value: XProgressHandler): Self = StObject.set(x, "ProgressHandler", value.asInstanceOf[js.Any])
  }
}
