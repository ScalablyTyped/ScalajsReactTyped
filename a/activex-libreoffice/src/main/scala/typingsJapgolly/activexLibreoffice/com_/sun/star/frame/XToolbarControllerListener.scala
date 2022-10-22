package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is used to notify a toolbar controller about events
  * @see com.sun.star.frame.ToolbarController
  * @since OOo 2.0
  */
trait XToolbarControllerListener
  extends StObject
     with XInterface {
  
  /**
    * gets called to notify a controller that a toolbar function has been selected.
    * @param aToolbarRes a string which identifies the toolbar where the function has been selected.
    * @param aCommand a string which identifies the function that has been selected.  This notification is normally used to implement the toolbar button/sub-t
    */
  def functionSelected(aToolbarRes: String, aCommand: String): Unit
}
object XToolbarControllerListener {
  
  inline def apply(
    acquire: Callback,
    functionSelected: (String, String) => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XToolbarControllerListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, functionSelected = js.Any.fromFunction2((t0: String, t1: String) => (functionSelected(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XToolbarControllerListener]
  }
  
  extension [Self <: XToolbarControllerListener](x: Self) {
    
    inline def setFunctionSelected(value: (String, String) => Callback): Self = StObject.set(x, "functionSelected", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
  }
}
