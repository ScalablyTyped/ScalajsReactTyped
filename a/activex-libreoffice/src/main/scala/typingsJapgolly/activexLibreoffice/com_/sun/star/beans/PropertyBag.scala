package typingsJapgolly.activexLibreoffice.com_.sun.star.beans

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Implementation of this service can keep any properties and is useful when an {@link XPropertySet} is to be used, for example, as parameters for a
  * method call.
  *
  * Scripting engines might not be able to use such objects as normal property sets, giving direct access to the properties. In this case, use the methods
  * like {@link XPropertySet.getPropertyValue()} .
  */
trait PropertyBag
  extends StObject
     with XPropertyBag {
  
  def createDefault(): Unit
  
  def createWithTypes(AllowedTypes: SeqEquiv[`type`], AllowEmptyPropertyName: Boolean, AutomaticAddition: Boolean): Unit
}
object PropertyBag {
  
  inline def apply(
    PropertySetInfo: XPropertySetInfo,
    PropertyValues: SafeArray[PropertyValue],
    acquire: Callback,
    addProperty: (String, Double, Any) => Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    createDefault: Callback,
    createWithTypes: (SeqEquiv[`type`], Boolean, Boolean) => Callback,
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    getPropertyValues: CallbackTo[SafeArray[PropertyValue]],
    queryInterface: `type` => Any,
    release: Callback,
    removeProperty: String => Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    setPropertyValue: (String, Any) => Callback,
    setPropertyValues: SeqEquiv[PropertyValue] => Callback
  ): PropertyBag = {
    val __obj = js.Dynamic.literal(PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], PropertyValues = PropertyValues.asInstanceOf[js.Any], acquire = acquire.toJsFn, addProperty = js.Any.fromFunction3((t0: String, t1: Double, t2: Any) => (addProperty(t0, t1, t2)).runNow()), addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), createDefault = createDefault.toJsFn, createWithTypes = js.Any.fromFunction3((t0: SeqEquiv[`type`], t1: Boolean, t2: Boolean) => (createWithTypes(t0, t1, t2)).runNow()), getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValues = getPropertyValues.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeProperty = js.Any.fromFunction1((t0: String) => removeProperty(t0).runNow()), removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), setPropertyValues = js.Any.fromFunction1((t0: SeqEquiv[PropertyValue]) => setPropertyValues(t0).runNow()))
    __obj.asInstanceOf[PropertyBag]
  }
  
  extension [Self <: PropertyBag](x: Self) {
    
    inline def setCreateDefault(value: Callback): Self = StObject.set(x, "createDefault", value.toJsFn)
    
    inline def setCreateWithTypes(value: (SeqEquiv[`type`], Boolean, Boolean) => Callback): Self = StObject.set(x, "createWithTypes", js.Any.fromFunction3((t0: SeqEquiv[`type`], t1: Boolean, t2: Boolean) => (value(t0, t1, t2)).runNow()))
  }
}
