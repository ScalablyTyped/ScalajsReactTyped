package typingsJapgolly.activexLibreoffice.com_.sun.star.accessibility

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Implement this interface to give access to a single numerical value.
  *
  * The {@link XAccessibleValue} interface represents a single numerical value and should be implemented by any class that supports numerical value like
  * scroll bars and spin boxes. This interface lets you access the value and its upper and lower bounds.
  * @since OOo 1.1.2
  */
trait XAccessibleValue
  extends StObject
     with XInterface {
  
  /**
    * Returns the value of this object as a number.
    *
    * The exact return type is implementation dependent. Typical types are long and double.
    * @returns Returns the current value represented by this object.
    */
  var CurrentValue: Any
  
  /**
    * Returns the maximal value that can be represented by this object.
    *
    * The type of the returned value is implementation dependent. It does not have to be the same type as that returned by getCurrentAccessibleValue().
    * @returns Returns the maximal value in an implementation dependent type. If this object has no upper bound then an empty object is returned.
    */
  val MaximumValue: Any
  
  /**
    * Returns the minimal value that can be represented by this object.
    *
    * The type of the returned value is implementation dependent. It does not have to be the same type as that returned by getCurrentAccessibleValue().
    * @returns Returns the minimal value in an implementation dependent type. If this object has no upper bound then an empty object is returned.
    */
  val MinimumValue: Any
  
  /**
    * Returns the value of this object as a number.
    *
    * The exact return type is implementation dependent. Typical types are long and double.
    * @returns Returns the current value represented by this object.
    */
  def getCurrentValue(): Any
  
  /**
    * Returns the maximal value that can be represented by this object.
    *
    * The type of the returned value is implementation dependent. It does not have to be the same type as that returned by getCurrentAccessibleValue().
    * @returns Returns the maximal value in an implementation dependent type. If this object has no upper bound then an empty object is returned.
    */
  def getMaximumValue(): Any
  
  /**
    * Returns the minimal value that can be represented by this object.
    *
    * The type of the returned value is implementation dependent. It does not have to be the same type as that returned by getCurrentAccessibleValue().
    * @returns Returns the minimal value in an implementation dependent type. If this object has no upper bound then an empty object is returned.
    */
  def getMinimumValue(): Any
  
  /**
    * Sets the value of this object to the given number.
    *
    * The argument is clipped to the valid interval whose upper and lower bounds are returned by the methods getMaximumAccessibleValue() and
    * getMinimumAccessibleValue(), i.e. if it is lower than the minimum value the new value will be the minimum and if it is greater than the maximum then
    * the new value will be the maximum.
    * @param aNumber The new value represented by this object. The set of admissible types for this argument is implementation dependent.
    * @returns Returns `TRUE` if the new value could successfully be set and `FALSE` otherwise.
    */
  def setCurrentValue(aNumber: Any): Boolean
}
object XAccessibleValue {
  
  inline def apply(
    CurrentValue: Any,
    MaximumValue: Any,
    MinimumValue: Any,
    acquire: Callback,
    getCurrentValue: CallbackTo[Any],
    getMaximumValue: CallbackTo[Any],
    getMinimumValue: CallbackTo[Any],
    queryInterface: `type` => Any,
    release: Callback,
    setCurrentValue: Any => Boolean
  ): XAccessibleValue = {
    val __obj = js.Dynamic.literal(CurrentValue = CurrentValue.asInstanceOf[js.Any], MaximumValue = MaximumValue.asInstanceOf[js.Any], MinimumValue = MinimumValue.asInstanceOf[js.Any], acquire = acquire.toJsFn, getCurrentValue = getCurrentValue.toJsFn, getMaximumValue = getMaximumValue.toJsFn, getMinimumValue = getMinimumValue.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setCurrentValue = js.Any.fromFunction1(setCurrentValue))
    __obj.asInstanceOf[XAccessibleValue]
  }
  
  extension [Self <: XAccessibleValue](x: Self) {
    
    inline def setCurrentValue(value: Any): Self = StObject.set(x, "CurrentValue", value.asInstanceOf[js.Any])
    
    inline def setGetCurrentValue(value: CallbackTo[Any]): Self = StObject.set(x, "getCurrentValue", value.toJsFn)
    
    inline def setGetMaximumValue(value: CallbackTo[Any]): Self = StObject.set(x, "getMaximumValue", value.toJsFn)
    
    inline def setGetMinimumValue(value: CallbackTo[Any]): Self = StObject.set(x, "getMinimumValue", value.toJsFn)
    
    inline def setMaximumValue(value: Any): Self = StObject.set(x, "MaximumValue", value.asInstanceOf[js.Any])
    
    inline def setMinimumValue(value: Any): Self = StObject.set(x, "MinimumValue", value.asInstanceOf[js.Any])
    
    inline def setSetCurrentValue(value: Any => Boolean): Self = StObject.set(x, "setCurrentValue", js.Any.fromFunction1(value))
  }
}
