package typingsJapgolly.activexLibreoffice.com_.sun.star.ui

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * special interface to receive notification that a user interface element will execute a function.
  * @since OOo 2.0
  */
trait XUIFunctionListener
  extends StObject
     with XEventListener {
  
  /**
    * gets called to notify a component that a user interface element wants to execute a function.
    * @param aUIElementName a string which identifies the user interface element that wants to execute a function.
    * @param aCommand a string which identifies the function that has been selected by a user.
    */
  def functionExecute(aUIElementName: String, aCommand: String): Unit
}
object XUIFunctionListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    functionExecute: (String, String) => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XUIFunctionListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), functionExecute = js.Any.fromFunction2((t0: String, t1: String) => (functionExecute(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XUIFunctionListener]
  }
  
  extension [Self <: XUIFunctionListener](x: Self) {
    
    inline def setFunctionExecute(value: (String, String) => Callback): Self = StObject.set(x, "functionExecute", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
  }
}
