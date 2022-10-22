package typingsJapgolly.activexLibreoffice.com_.sun.star.security

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for running an action.
  * @since OOo 1.1.2
  */
trait XAction
  extends StObject
     with XInterface {
  
  /**
    * Action to be done.
    * @returns result
    * @throws com::sun::star::uno::Exception any UNO exception may be thrown
    */
  def run(): Any
}
object XAction {
  
  inline def apply(acquire: Callback, queryInterface: `type` => Any, release: Callback, run: CallbackTo[Any]): XAction = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, run = run.toJsFn)
    __obj.asInstanceOf[XAction]
  }
  
  extension [Self <: XAction](x: Self) {
    
    inline def setRun(value: CallbackTo[Any]): Self = StObject.set(x, "run", value.toJsFn)
  }
}
