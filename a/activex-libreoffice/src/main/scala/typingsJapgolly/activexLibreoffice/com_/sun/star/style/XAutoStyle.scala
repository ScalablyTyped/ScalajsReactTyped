package typingsJapgolly.activexLibreoffice.com_.sun.star.style

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyState
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValues
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XMultiPropertyStates
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertiesChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This interface allows access to a single automatic style. */
trait XAutoStyle
  extends StObject
     with XMultiPropertySet
     with XMultiPropertyStates {
  
  /** returns a sequence of all properties that are set in the style */
  val Properties: PropertyValues
  
  /** returns a sequence of all properties that are set in the style */
  def getProperties(): PropertyValues
}
object XAutoStyle {
  
  inline def apply(
    Properties: PropertyValues,
    PropertySetInfo: XPropertySetInfo,
    acquire: Callback,
    addPropertiesChangeListener: (SeqEquiv[String], XPropertiesChangeListener) => Callback,
    firePropertiesChangeEvent: (SeqEquiv[String], XPropertiesChangeListener) => Callback,
    getProperties: CallbackTo[PropertyValues],
    getPropertyDefaults: SeqEquiv[String] => SafeArray[Any],
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyStates: SeqEquiv[String] => SafeArray[PropertyState],
    getPropertyValues: SeqEquiv[String] => SafeArray[Any],
    queryInterface: `type` => Any,
    release: Callback,
    removePropertiesChangeListener: XPropertiesChangeListener => Callback,
    setAllPropertiesToDefault: Callback,
    setPropertiesToDefault: SeqEquiv[String] => Callback,
    setPropertyValues: (SeqEquiv[String], SeqEquiv[Any]) => Callback
  ): XAutoStyle = {
    val __obj = js.Dynamic.literal(Properties = Properties.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertiesChangeListener = js.Any.fromFunction2((t0: SeqEquiv[String], t1: XPropertiesChangeListener) => (addPropertiesChangeListener(t0, t1)).runNow()), firePropertiesChangeEvent = js.Any.fromFunction2((t0: SeqEquiv[String], t1: XPropertiesChangeListener) => (firePropertiesChangeEvent(t0, t1)).runNow()), getProperties = getProperties.toJsFn, getPropertyDefaults = js.Any.fromFunction1(getPropertyDefaults), getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyStates = js.Any.fromFunction1(getPropertyStates), getPropertyValues = js.Any.fromFunction1(getPropertyValues), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertiesChangeListener = js.Any.fromFunction1((t0: XPropertiesChangeListener) => removePropertiesChangeListener(t0).runNow()), setAllPropertiesToDefault = setAllPropertiesToDefault.toJsFn, setPropertiesToDefault = js.Any.fromFunction1((t0: SeqEquiv[String]) => setPropertiesToDefault(t0).runNow()), setPropertyValues = js.Any.fromFunction2((t0: SeqEquiv[String], t1: SeqEquiv[Any]) => (setPropertyValues(t0, t1)).runNow()))
    __obj.asInstanceOf[XAutoStyle]
  }
  
  extension [Self <: XAutoStyle](x: Self) {
    
    inline def setGetProperties(value: CallbackTo[PropertyValues]): Self = StObject.set(x, "getProperties", value.toJsFn)
    
    inline def setProperties(value: PropertyValues): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesVarargs(value: PropertyValue*): Self = StObject.set(x, "Properties", js.Array(value*))
  }
}
