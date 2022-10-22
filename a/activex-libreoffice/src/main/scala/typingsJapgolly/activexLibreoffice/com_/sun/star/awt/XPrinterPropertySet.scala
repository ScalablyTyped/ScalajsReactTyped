package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents an extended property set for printer properties.
  *
  * All properties are vetoable properties. If you change the properties between {@link com.sun.star.awt.XPrinter.startPage()} and {@link
  * com.sun.star.awt.XPrinter.endPage()} , a {@link com.sun.star.beans.PropertyVetoException} is thrown.
  * @see XPrinter
  * @see XInfoPrinter
  */
trait XPrinterPropertySet
  extends StObject
     with XPropertySet {
  
  /** returns a binary encoded version of the printer setup. */
  var BinarySetup: SafeArray[Double]
  
  /** returns descriptions of all available printer forms. */
  val FormDescriptions: SafeArray[String]
  
  /** returns a binary encoded version of the printer setup. */
  def getBinarySetup(): SafeArray[Double]
  
  /** returns descriptions of all available printer forms. */
  def getFormDescriptions(): SafeArray[String]
  
  /**
    * sets the form that should be used.
    *
    * Indirectly a printer is selected.
    */
  def selectForm(aFormDescription: String): Unit
  
  /**
    * sets the data specific to the printer driver.
    *
    * Get this data from the info printer and set the data to the printer.
    */
  def setBinarySetup(data: SeqEquiv[Double]): Unit
  
  /** sets the orientation. */
  def setHorizontal(bHorizontal: Boolean): Unit
}
object XPrinterPropertySet {
  
  inline def apply(
    BinarySetup: SafeArray[Double],
    FormDescriptions: SafeArray[String],
    PropertySetInfo: XPropertySetInfo,
    acquire: Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
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
  ): XPrinterPropertySet = {
    val __obj = js.Dynamic.literal(BinarySetup = BinarySetup.asInstanceOf[js.Any], FormDescriptions = FormDescriptions.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), getBinarySetup = getBinarySetup.toJsFn, getFormDescriptions = getFormDescriptions.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), selectForm = js.Any.fromFunction1((t0: String) => selectForm(t0).runNow()), setBinarySetup = js.Any.fromFunction1((t0: SeqEquiv[Double]) => setBinarySetup(t0).runNow()), setHorizontal = js.Any.fromFunction1((t0: Boolean) => setHorizontal(t0).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()))
    __obj.asInstanceOf[XPrinterPropertySet]
  }
  
  extension [Self <: XPrinterPropertySet](x: Self) {
    
    inline def setBinarySetup(value: SafeArray[Double]): Self = StObject.set(x, "BinarySetup", value.asInstanceOf[js.Any])
    
    inline def setFormDescriptions(value: SafeArray[String]): Self = StObject.set(x, "FormDescriptions", value.asInstanceOf[js.Any])
    
    inline def setGetBinarySetup(value: CallbackTo[SafeArray[Double]]): Self = StObject.set(x, "getBinarySetup", value.toJsFn)
    
    inline def setGetFormDescriptions(value: CallbackTo[SafeArray[String]]): Self = StObject.set(x, "getFormDescriptions", value.toJsFn)
    
    inline def setSelectForm(value: String => Callback): Self = StObject.set(x, "selectForm", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetBinarySetup(value: SeqEquiv[Double] => Callback): Self = StObject.set(x, "setBinarySetup", js.Any.fromFunction1((t0: SeqEquiv[Double]) => value(t0).runNow()))
    
    inline def setSetHorizontal(value: Boolean => Callback): Self = StObject.set(x, "setHorizontal", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
