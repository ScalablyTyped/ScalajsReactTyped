package typingsJapgolly.activexLibreoffice.com_.sun.star.beans

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
  * makes it possible to access all property values and to set them at once.
  *
  * In most cases this interface will be in addition to {@link XPropertySet} . It is especially useful for remote communication because it lessens the
  * number of calls for getting property values; that is especially important because these calls are necessarily synchronous.
  *
  * Another advantage of this method is that conflicts are avoided if property value restrictions depend on the value of other properties.
  */
trait XPropertyAccess
  extends StObject
     with XInterface {
  
  /** @returns a sequence of all property values within the object in a single call. */
  var PropertyValues: SafeArray[PropertyValue]
  
  /** @returns a sequence of all property values within the object in a single call. */
  def getPropertyValues(): SafeArray[PropertyValue]
  
  /**
    * sets the values of given properties.
    *
    * All properties which are not contained in the sequence **aProps** will be left unchanged.
    */
  def setPropertyValues(aProps: SeqEquiv[PropertyValue]): Unit
}
object XPropertyAccess {
  
  inline def apply(
    PropertyValues: SafeArray[PropertyValue],
    acquire: Callback,
    getPropertyValues: CallbackTo[SafeArray[PropertyValue]],
    queryInterface: `type` => Any,
    release: Callback,
    setPropertyValues: SeqEquiv[PropertyValue] => Callback
  ): XPropertyAccess = {
    val __obj = js.Dynamic.literal(PropertyValues = PropertyValues.asInstanceOf[js.Any], acquire = acquire.toJsFn, getPropertyValues = getPropertyValues.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setPropertyValues = js.Any.fromFunction1((t0: SeqEquiv[PropertyValue]) => setPropertyValues(t0).runNow()))
    __obj.asInstanceOf[XPropertyAccess]
  }
  
  extension [Self <: XPropertyAccess](x: Self) {
    
    inline def setGetPropertyValues(value: CallbackTo[SafeArray[PropertyValue]]): Self = StObject.set(x, "getPropertyValues", value.toJsFn)
    
    inline def setPropertyValues(value: SafeArray[PropertyValue]): Self = StObject.set(x, "PropertyValues", value.asInstanceOf[js.Any])
    
    inline def setSetPropertyValues(value: SeqEquiv[PropertyValue] => Callback): Self = StObject.set(x, "setPropertyValues", js.Any.fromFunction1((t0: SeqEquiv[PropertyValue]) => value(t0).runNow()))
  }
}
