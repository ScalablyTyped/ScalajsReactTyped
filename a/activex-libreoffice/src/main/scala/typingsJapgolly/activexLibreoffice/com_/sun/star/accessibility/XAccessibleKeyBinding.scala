package typingsJapgolly.activexLibreoffice.com_.sun.star.accessibility

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.KeyStroke
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface can be used to represent any number of key bindings which then can be associated to a certain action.
  *
  * There can be zero, one, or more key bindings. Each key binding consists of a sequence of {@link com.sun.star.awt.KeyStroke} objects. The association
  * of an action with a key binding is established by the {@link XAccessibleAction} interface returning an {@link XAccessibleKeyBinding} object.
  *
  * A key binding describes alternative ways how to invoke an action with pressing one or more keys after each other. Each individual sequence of key
  * strokes
  * @since OOo 1.1.2
  */
trait XAccessibleKeyBinding
  extends StObject
     with XInterface {
  
  /**
    * Return the number of available key bindings.
    * @returns The returned value may be 0 to indicate that there are no key bindings or the positive number of the available key bindings.
    */
  val AccessibleKeyBindingCount: Double
  
  /**
    * The returned sequence of key strokes describes one method to invoke the associated action (the one from which you obtained the object at which you
    * called this method) by pressing keys. The keys specified by each of the returned key strokes have to be pressed at the same time (the Control-key and
    * the A-key for example). The keys of one key stroke have to be released before pressing those of the next. The order of the key strokes in the sequence
    * define the order in which to press them.
    * @param nIndex The index selects one of alternative key bindings. It has to non-negative and smaller then the number of key bindings as returned by the {
    * @returns The returned sequence of key strokes specifies one way to invoke the associated action. The sequence may be empty (but should not be; better not
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the index is not valid.
    */
  def getAccessibleKeyBinding(nIndex: Double): SafeArray[KeyStroke]
  
  /**
    * Return the number of available key bindings.
    * @returns The returned value may be 0 to indicate that there are no key bindings or the positive number of the available key bindings.
    */
  def getAccessibleKeyBindingCount(): Double
}
object XAccessibleKeyBinding {
  
  inline def apply(
    AccessibleKeyBindingCount: Double,
    acquire: Callback,
    getAccessibleKeyBinding: Double => SafeArray[KeyStroke],
    getAccessibleKeyBindingCount: CallbackTo[Double],
    queryInterface: `type` => Any,
    release: Callback
  ): XAccessibleKeyBinding = {
    val __obj = js.Dynamic.literal(AccessibleKeyBindingCount = AccessibleKeyBindingCount.asInstanceOf[js.Any], acquire = acquire.toJsFn, getAccessibleKeyBinding = js.Any.fromFunction1(getAccessibleKeyBinding), getAccessibleKeyBindingCount = getAccessibleKeyBindingCount.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XAccessibleKeyBinding]
  }
  
  extension [Self <: XAccessibleKeyBinding](x: Self) {
    
    inline def setAccessibleKeyBindingCount(value: Double): Self = StObject.set(x, "AccessibleKeyBindingCount", value.asInstanceOf[js.Any])
    
    inline def setGetAccessibleKeyBinding(value: Double => SafeArray[KeyStroke]): Self = StObject.set(x, "getAccessibleKeyBinding", js.Any.fromFunction1(value))
    
    inline def setGetAccessibleKeyBindingCount(value: CallbackTo[Double]): Self = StObject.set(x, "getAccessibleKeyBindingCount", value.toJsFn)
  }
}
