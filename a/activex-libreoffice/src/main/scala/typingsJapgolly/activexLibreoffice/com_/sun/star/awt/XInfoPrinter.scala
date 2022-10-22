package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents an information printer. */
trait XInfoPrinter
  extends StObject
     with XPrinterPropertySet {
  
  /**
    * creates a new object which implements an {@link XDevice} .
    *
    * The current settings are used as a template.
    */
  def createDevice(): XDevice
}
object XInfoPrinter {
  
  inline def apply(
    BinarySetup: SafeArray[Double],
    FormDescriptions: SafeArray[String],
    PropertySetInfo: XPropertySetInfo,
    acquire: Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    createDevice: CallbackTo[XDevice],
    getBinarySetup: CallbackTo[SafeArray[Double]],
    getFormDescriptions: CallbackTo[SafeArray[String]],
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    queryInterface: `type` => Any,
    release: Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    selectForm: String => Callback,
    setBinarySetup: SeqEquiv[Double] => Callback,
    setHorizontal: Boolean => Callback,
    setPropertyValue: (String, Any) => Callback
  ): XInfoPrinter = {
    val __obj = js.Dynamic.literal(BinarySetup = BinarySetup.asInstanceOf[js.Any], FormDescriptions = FormDescriptions.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), createDevice = createDevice.toJsFn, getBinarySetup = getBinarySetup.toJsFn, getFormDescriptions = getFormDescriptions.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), selectForm = js.Any.fromFunction1((t0: String) => selectForm(t0).runNow()), setBinarySetup = js.Any.fromFunction1((t0: SeqEquiv[Double]) => setBinarySetup(t0).runNow()), setHorizontal = js.Any.fromFunction1((t0: Boolean) => setHorizontal(t0).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()))
    __obj.asInstanceOf[XInfoPrinter]
  }
  
  extension [Self <: XInfoPrinter](x: Self) {
    
    inline def setCreateDevice(value: CallbackTo[XDevice]): Self = StObject.set(x, "createDevice", value.toJsFn)
  }
}
