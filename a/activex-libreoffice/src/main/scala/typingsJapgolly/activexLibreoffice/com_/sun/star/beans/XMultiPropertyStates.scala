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
  * The state of a property contains information about the source of the value, e.g. the object itself, a default or a stylesheet. For more information
  * see PropertyState.
  */
trait XMultiPropertyStates
  extends StObject
     with XInterface {
  
  /**
    * @param aPropertyNames specifies the names of the properties. All names must be unique. This sequence must be alphabetically sorted.
    * @returns the default values of the propertes with the specified names.  If no default exists, is not known, or is void, then the return type at the corres
    * @throws UnknownPropertyException if one of the propertes does not exist.
    * @throws com::sun::star::lang::WrappedTargetException if the implementation has an internal reason for the exception. In this case the original exception
    */
  def getPropertyDefaults(aPropertyNames: SeqEquiv[String]): SafeArray[Any]
  
  /**
    * @param aPropertyName specifies the names of the properties. All names must be unique. This sequence must be alphabetically sorted.
    * @returns a sequence of the states of the properties which are specified by their names.  The order of the states is correlating to the order of the given
    */
  def getPropertyStates(aPropertyName: SeqEquiv[String]): SafeArray[PropertyState]
  
  /**
    * sets all properties to their default values.
    *
    * Each value depends on the implementation of this interface. If it is a bound property, you must change the value before the change events are fired.
    * If it is a constrained property, you must fire the vetoable event before you change the property value.
    */
  def setAllPropertiesToDefault(): Unit
  
  /**
    * sets the specified properties to their default values.
    *
    * Each value depends on the implementation of this interface. If it is a bound property, you must change the value before the change events are fired.
    * If it is a constrained property, you must fire the vetoable event before you change the property value.
    * @param aPropertyNames specifies the names of the properties. All names must be unique. This sequence must be alphabetically sorted.
    * @throws UnknownPropertyException if one of the properties does not exist.
    */
  def setPropertiesToDefault(aPropertyNames: SeqEquiv[String]): Unit
}
object XMultiPropertyStates {
  
  inline def apply(
    acquire: Callback,
    getPropertyDefaults: SeqEquiv[String] => SafeArray[Any],
    getPropertyStates: SeqEquiv[String] => SafeArray[PropertyState],
    queryInterface: `type` => Any,
    release: Callback,
    setAllPropertiesToDefault: Callback,
    setPropertiesToDefault: SeqEquiv[String] => Callback
  ): XMultiPropertyStates = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getPropertyDefaults = js.Any.fromFunction1(getPropertyDefaults), getPropertyStates = js.Any.fromFunction1(getPropertyStates), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setAllPropertiesToDefault = setAllPropertiesToDefault.toJsFn, setPropertiesToDefault = js.Any.fromFunction1((t0: SeqEquiv[String]) => setPropertiesToDefault(t0).runNow()))
    __obj.asInstanceOf[XMultiPropertyStates]
  }
  
  extension [Self <: XMultiPropertyStates](x: Self) {
    
    inline def setGetPropertyDefaults(value: SeqEquiv[String] => SafeArray[Any]): Self = StObject.set(x, "getPropertyDefaults", js.Any.fromFunction1(value))
    
    inline def setGetPropertyStates(value: SeqEquiv[String] => SafeArray[PropertyState]): Self = StObject.set(x, "getPropertyStates", js.Any.fromFunction1(value))
    
    inline def setSetAllPropertiesToDefault(value: Callback): Self = StObject.set(x, "setAllPropertiesToDefault", value.toJsFn)
    
    inline def setSetPropertiesToDefault(value: SeqEquiv[String] => Callback): Self = StObject.set(x, "setPropertiesToDefault", js.Any.fromFunction1((t0: SeqEquiv[String]) => value(t0).runNow()))
  }
}
