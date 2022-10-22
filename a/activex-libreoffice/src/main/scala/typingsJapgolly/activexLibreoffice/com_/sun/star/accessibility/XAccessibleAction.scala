package typingsJapgolly.activexLibreoffice.com_.sun.star.accessibility

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Implement this interface to give access to actions that can be executed for accessible objects.
  *
  * Every accessible object that can be manipulated beyond its methods exported over the accessibility API should support this interface to expose all
  * actions that it can perform. Each action can be performed or be queried for a description or associated key bindings.
  * @since OOo 1.1.2
  */
trait XAccessibleAction
  extends StObject
     with XInterface {
  
  /**
    * Returns the number of accessible actions available in this object.
    *
    * If there are more than one, the first one is considered the "default" action of the object.
    * @returns The returned value of the number of actions is zero if there are no actions.
    */
  val AccessibleActionCount: Double
  
  /**
    * Perform the specified Action on the object.
    * @param nIndex This index specifies the action to perform. If it lies outside the valid range `FALSE` is returned and no action is performed.
    * @returns Returns `TRUE` if the action was successfully performed. If the action could not be performed successfully `FALSE` is returned.
    * @throws IndexOutOfBoundsException If no action with the given index exists then an {@link com.sun.star.lang.IndexOutOfBoundsException} exception is thrown.
    */
  def doAccessibleAction(nIndex: Double): Boolean
  
  /**
    * Returns the number of accessible actions available in this object.
    *
    * If there are more than one, the first one is considered the "default" action of the object.
    * @returns The returned value of the number of actions is zero if there are no actions.
    */
  def getAccessibleActionCount(): Double
  
  /**
    * Returns a description of the specified action of the object.
    * @param nIndex This index specifies the action of which to return a description. If it lies outside the valid range an empty string is returned.
    * @returns The returned value is a localized string of the specified action.
    * @throws IndexOutOfBoundsException If the given index lies not in the valid range then an {@link com.sun.star.lang.IndexOutOfBoundsException} exception is
    */
  def getAccessibleActionDescription(nIndex: Double): String
  
  /**
    * Returns a key binding object, if there is one, associated with the specified action. Note that there can be several alternative key bindings for an
    * action. See {@link XAccessibleKeyBinding} for more information about how key bindings are represented.
    * @param nIndex This index specifies the action of which to return the key binding.
    * @returns The returned object describes a set of key bindings associated with the specified action.
    * @throws IndexOutOfBoundsException if the given index is not valid.
    */
  def getAccessibleActionKeyBinding(nIndex: Double): XAccessibleKeyBinding
}
object XAccessibleAction {
  
  inline def apply(
    AccessibleActionCount: Double,
    acquire: Callback,
    doAccessibleAction: Double => Boolean,
    getAccessibleActionCount: CallbackTo[Double],
    getAccessibleActionDescription: Double => String,
    getAccessibleActionKeyBinding: Double => XAccessibleKeyBinding,
    queryInterface: `type` => Any,
    release: Callback
  ): XAccessibleAction = {
    val __obj = js.Dynamic.literal(AccessibleActionCount = AccessibleActionCount.asInstanceOf[js.Any], acquire = acquire.toJsFn, doAccessibleAction = js.Any.fromFunction1(doAccessibleAction), getAccessibleActionCount = getAccessibleActionCount.toJsFn, getAccessibleActionDescription = js.Any.fromFunction1(getAccessibleActionDescription), getAccessibleActionKeyBinding = js.Any.fromFunction1(getAccessibleActionKeyBinding), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XAccessibleAction]
  }
  
  extension [Self <: XAccessibleAction](x: Self) {
    
    inline def setAccessibleActionCount(value: Double): Self = StObject.set(x, "AccessibleActionCount", value.asInstanceOf[js.Any])
    
    inline def setDoAccessibleAction(value: Double => Boolean): Self = StObject.set(x, "doAccessibleAction", js.Any.fromFunction1(value))
    
    inline def setGetAccessibleActionCount(value: CallbackTo[Double]): Self = StObject.set(x, "getAccessibleActionCount", value.toJsFn)
    
    inline def setGetAccessibleActionDescription(value: Double => String): Self = StObject.set(x, "getAccessibleActionDescription", js.Any.fromFunction1(value))
    
    inline def setGetAccessibleActionKeyBinding(value: Double => XAccessibleKeyBinding): Self = StObject.set(x, "getAccessibleActionKeyBinding", js.Any.fromFunction1(value))
  }
}
