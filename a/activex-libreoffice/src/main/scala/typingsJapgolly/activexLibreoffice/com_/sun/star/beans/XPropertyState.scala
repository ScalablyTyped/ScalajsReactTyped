package typingsJapgolly.activexLibreoffice.com_.sun.star.beans

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to query information about the state of one or more properties.
  *
  * The state contains the information if:
  *
  * a value is available or voidthe value is stored in the object itself, or if a default value is to be usedand if the value cannot be determined, due to
  * ambiguity (multi selection with multiple values).
  */
trait XPropertyState
  extends StObject
     with XInterface {
  
  /**
    * @param aPropertyName specifies the name of the property.
    * @returns the default value of the property with the name PropertyName.  If no default exists, is not known or is void, then the return type is `void` .
    * @throws UnknownPropertyException if the property does not exist.
    * @throws com::sun::star::lang::WrappedTargetException if the implementation has an internal reason for the exception. In this case the original exception
    */
  def getPropertyDefault(aPropertyName: String): Any
  
  /**
    * @param PropertyName specifies the name of the property.
    * @returns the state of the property.
    * @throws UnknownPropertyException if the property does not exist.
    */
  def getPropertyState(PropertyName: String): PropertyState
  
  /**
    * @param aPropertyName contains the sequence of property names.
    * @returns a sequence of the states of the properties which are specified by their names.  The order of the states is correlating to the order of the given
    * @throws UnknownPropertyException if one property does not exist.
    */
  def getPropertyStates(aPropertyName: SeqEquiv[String]): SafeArray[PropertyState]
  
  /**
    * Sets the property to default value.
    *
    * The value depends on the implementation of this interface. If it is a bound property, you must change the value before the change events are fired. If
    * it is a constrained property, you must fire the vetoable event before you change the property value.
    * @param PropertyName specifies the name of the property.
    * @throws UnknownPropertyException if the property does not exist.
    */
  def setPropertyToDefault(PropertyName: String): Unit
}
object XPropertyState {
  
  inline def apply(
    acquire: Callback,
    getPropertyDefault: String => Any,
    getPropertyState: String => PropertyState,
    getPropertyStates: SeqEquiv[String] => SafeArray[PropertyState],
    queryInterface: `type` => Any,
    release: Callback,
    setPropertyToDefault: String => Callback
  ): XPropertyState = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getPropertyDefault = js.Any.fromFunction1(getPropertyDefault), getPropertyState = js.Any.fromFunction1(getPropertyState), getPropertyStates = js.Any.fromFunction1(getPropertyStates), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setPropertyToDefault = js.Any.fromFunction1((t0: String) => setPropertyToDefault(t0).runNow()))
    __obj.asInstanceOf[XPropertyState]
  }
  
  extension [Self <: XPropertyState](x: Self) {
    
    inline def setGetPropertyDefault(value: String => Any): Self = StObject.set(x, "getPropertyDefault", js.Any.fromFunction1(value))
    
    inline def setGetPropertyState(value: String => PropertyState): Self = StObject.set(x, "getPropertyState", js.Any.fromFunction1(value))
    
    inline def setGetPropertyStates(value: SeqEquiv[String] => SafeArray[PropertyState]): Self = StObject.set(x, "getPropertyStates", js.Any.fromFunction1(value))
    
    inline def setSetPropertyToDefault(value: String => Callback): Self = StObject.set(x, "setPropertyToDefault", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
