package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is used to query, register and unregister user interface controller.
  *
  * A user interface controller can be registered for a command URL. A certain user interface controller will be created when a user interface element
  * contains a registered command URL.
  * @see PopupMenuControllerFactory
  * @since OOo 2.0
  */
trait XUIControllerRegistration
  extends StObject
     with XInterface {
  
  /**
    * function to remove a previously defined association between a user interface controller implementation and a command URL and optional module.
    * @param aCommandURL a command URL which specifies an action which should be associated with a user interface controller.
    * @param aModelName an optional name of an OpenOffice model service. This value can remain empty if no model service name was specified.
    */
  def deregisterController(aCommandURL: String, aModelName: String): Unit
  
  /**
    * function to check if an user interface controller is registered for a command URL and optional module.
    * @param aCommandURL a command URL which specifies an action.
    * @param aModelName an optional name of an OpenOffice model service. This value can remain empty if no model service name was specified.
    * @returns true if a controller was registered for the combination of command URL and model name.
    */
  def hasController(aCommandURL: String, aModelName: String): Boolean
  
  /**
    * function to create an association between a user interface controller implementation and a command URL and optional module.
    * @param aCommandURL a command URL which specifies an action which should be associated with a user interface controller.
    * @param aModelName an optional name of an OpenOffice model service. This value can remain empty if no model service name was specified.
    * @param aControllerImplementationName a UNO implementation name that can be used to create a user interface controller with the OpenOffice service manager.
    */
  def registerController(aCommandURL: String, aModelName: String, aControllerImplementationName: String): Unit
}
object XUIControllerRegistration {
  
  inline def apply(
    acquire: Callback,
    deregisterController: (String, String) => Callback,
    hasController: (String, String) => Boolean,
    queryInterface: `type` => Any,
    registerController: (String, String, String) => Callback,
    release: Callback
  ): XUIControllerRegistration = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, deregisterController = js.Any.fromFunction2((t0: String, t1: String) => (deregisterController(t0, t1)).runNow()), hasController = js.Any.fromFunction2(hasController), queryInterface = js.Any.fromFunction1(queryInterface), registerController = js.Any.fromFunction3((t0: String, t1: String, t2: String) => (registerController(t0, t1, t2)).runNow()), release = release.toJsFn)
    __obj.asInstanceOf[XUIControllerRegistration]
  }
  
  extension [Self <: XUIControllerRegistration](x: Self) {
    
    inline def setDeregisterController(value: (String, String) => Callback): Self = StObject.set(x, "deregisterController", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setHasController(value: (String, String) => Boolean): Self = StObject.set(x, "hasController", js.Any.fromFunction2(value))
    
    inline def setRegisterController(value: (String, String, String) => Callback): Self = StObject.set(x, "registerController", js.Any.fromFunction3((t0: String, t1: String, t2: String) => (value(t0, t1, t2)).runNow()))
  }
}
