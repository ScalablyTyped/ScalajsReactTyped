package typingsJapgolly.activexLibreoffice.com_.sun.star.accessibility

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Implement this interface to represent a set of states.
  *
  * The interface {@link XAccessibleStateSet} represents a set of states of an accessible object. It can hold any combination of states defined by the
  * constants collection {@link AccessibleStateType} .
  * @since OOo 1.1.2
  */
trait XAccessibleStateSet
  extends StObject
     with XInterface {
  
  /**
    * Get all currently set states as a sequence of state ids.
    *
    * The purpose of this function is to reduce the communication between accessibility objects and AT. Without this function an AT-Tool had to call {@link
    * contains()} for every state type. Now a single call is sufficient.
    * @returns The returned sequence contains one entry for every currently set state. This entry is the id of that state. The order of the states in the sequen
    */
  val States: SafeArray[Double]
  
  /**
    * Checks if the given state is a member of the state set of the called object.
    * @param aState The state for which to check membership. This has to be one of the constants of {@link AccessibleStateType} .
    * @returns Returns `TRUE` if the given state is a member of this object's state set and `FALSE` otherwise.
    */
  def contains(aState: Double): Boolean
  
  /**
    * Checks if all of the given states are in the state set of the called object.
    * @param aStateSet This sequence of states is interpreted as set and every of its members, duplicates are ignored, is checked for membership in this objec
    * @returns Returns `TRUE` if all states of the given state set are members of this object's state set. `FALSE` is returned if at least one of the states in
    */
  def containsAll(aStateSet: SeqEquiv[Double]): Boolean
  
  /**
    * Get all currently set states as a sequence of state ids.
    *
    * The purpose of this function is to reduce the communication between accessibility objects and AT. Without this function an AT-Tool had to call {@link
    * contains()} for every state type. Now a single call is sufficient.
    * @returns The returned sequence contains one entry for every currently set state. This entry is the id of that state. The order of the states in the sequen
    */
  def getStates(): SafeArray[Double]
  
  /**
    * Checks whether the current state set is empty.
    * @returns Returns `TRUE` if there is no state in this state set and `FALSE` if there is at least one set state in it.
    */
  def isEmpty(): Boolean
}
object XAccessibleStateSet {
  
  inline def apply(
    States: SafeArray[Double],
    acquire: Callback,
    contains: Double => Boolean,
    containsAll: SeqEquiv[Double] => Boolean,
    getStates: CallbackTo[SafeArray[Double]],
    isEmpty: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback
  ): XAccessibleStateSet = {
    val __obj = js.Dynamic.literal(States = States.asInstanceOf[js.Any], acquire = acquire.toJsFn, contains = js.Any.fromFunction1(contains), containsAll = js.Any.fromFunction1(containsAll), getStates = getStates.toJsFn, isEmpty = isEmpty.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XAccessibleStateSet]
  }
  
  extension [Self <: XAccessibleStateSet](x: Self) {
    
    inline def setContains(value: Double => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    inline def setContainsAll(value: SeqEquiv[Double] => Boolean): Self = StObject.set(x, "containsAll", js.Any.fromFunction1(value))
    
    inline def setGetStates(value: CallbackTo[SafeArray[Double]]): Self = StObject.set(x, "getStates", value.toJsFn)
    
    inline def setIsEmpty(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEmpty", value.toJsFn)
    
    inline def setStates(value: SafeArray[Double]): Self = StObject.set(x, "States", value.asInstanceOf[js.Any])
  }
}
