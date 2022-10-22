package typingsJapgolly.activexLibreoffice.com_.sun.star.util

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies the settings for number formatting. */
trait NumberFormatSettings
  extends StObject
     with XPropertySet {
  
  /** is set to indicate that a zero value should be formatted as an empty string. */
  var NoZero: Boolean
  
  /**
    * specifies the date which is represented by the value 0.
    *
    * The most common value for this is 12/30/1899.
    */
  var NullDate: Date
  
  /** specifies the maximum number of decimals used for the standard number format ("General"). */
  var StandardDecimals: Double
  
  /** specifies the first year to be generated from a two-digit year input. */
  var TwoDigitDateStart: Double
}
object NumberFormatSettings {
  
  inline def apply(
    NoZero: Boolean,
    NullDate: Date,
    PropertySetInfo: XPropertySetInfo,
    StandardDecimals: Double,
    TwoDigitDateStart: Double,
    acquire: Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    queryInterface: `type` => Any,
    release: Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    setPropertyValue: (String, Any) => Callback
  ): NumberFormatSettings = {
    val __obj = js.Dynamic.literal(NoZero = NoZero.asInstanceOf[js.Any], NullDate = NullDate.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], StandardDecimals = StandardDecimals.asInstanceOf[js.Any], TwoDigitDateStart = TwoDigitDateStart.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()))
    __obj.asInstanceOf[NumberFormatSettings]
  }
  
  extension [Self <: NumberFormatSettings](x: Self) {
    
    inline def setNoZero(value: Boolean): Self = StObject.set(x, "NoZero", value.asInstanceOf[js.Any])
    
    inline def setNullDate(value: Date): Self = StObject.set(x, "NullDate", value.asInstanceOf[js.Any])
    
    inline def setStandardDecimals(value: Double): Self = StObject.set(x, "StandardDecimals", value.asInstanceOf[js.Any])
    
    inline def setTwoDigitDateStart(value: Double): Self = StObject.set(x, "TwoDigitDateStart", value.asInstanceOf[js.Any])
  }
}
