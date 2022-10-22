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

/**
  * represents a virtual printer.
  *
  * All properties are vetoable properties. If you change the properties between a call to {@link com.sun.star.awt.XPrinter.startPage()} and a call to
  * {@link com.sun.star.awt.XPrinter.endPage()} , a {@link com.sun.star.beans.PropertyVetoException} is thrown.
  */
trait XPrinter
  extends StObject
     with XPrinterPropertySet {
  
  /**
    * notifies the printer spooler that the job is done and printing starts.
    * @see terminate
    */
  def end(): Unit
  
  /** ends the current page. */
  def endPage(): Unit
  
  /**
    * puts the job into the printer spooler.
    *
    * This call may block the thread. So release all resources (mutex, semaphore, etc.) before this call.
    */
  def start(nJobName: String, nCopies: Double, nCollate: Boolean): Boolean
  
  /** begins with a new page. */
  def startPage(): XDevice
  
  /**
    * stops the current print job.
    *
    * If the method {@link com.sun.star.awt.XPrinter.end()} is called beforehand, then this call does nothing. If you call {@link
    * com.sun.star.awt.XPrinter.terminate()} in or before the call to {@link com.sun.star.awt.XPrinter.start()} , {@link
    * com.sun.star.awt.XPrinter.terminate()} returns `FALSE` . This call must not block the thread.
    * @see end
    */
  def terminate(): Unit
}
object XPrinter {
  
  inline def apply(
    BinarySetup: SafeArray[Double],
    FormDescriptions: SafeArray[String],
    PropertySetInfo: XPropertySetInfo,
    acquire: Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    end: Callback,
    endPage: Callback,
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
    setPropertyValue: (String, Any) => Callback,
    start: (String, Double, Boolean) => Boolean,
    startPage: CallbackTo[XDevice],
    terminate: Callback
  ): XPrinter = {
    val __obj = js.Dynamic.literal(BinarySetup = BinarySetup.asInstanceOf[js.Any], FormDescriptions = FormDescriptions.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), end = end.toJsFn, endPage = endPage.toJsFn, getBinarySetup = getBinarySetup.toJsFn, getFormDescriptions = getFormDescriptions.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), selectForm = js.Any.fromFunction1((t0: String) => selectForm(t0).runNow()), setBinarySetup = js.Any.fromFunction1((t0: SeqEquiv[Double]) => setBinarySetup(t0).runNow()), setHorizontal = js.Any.fromFunction1((t0: Boolean) => setHorizontal(t0).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), start = js.Any.fromFunction3(start), startPage = startPage.toJsFn, terminate = terminate.toJsFn)
    __obj.asInstanceOf[XPrinter]
  }
  
  extension [Self <: XPrinter](x: Self) {
    
    inline def setEnd(value: Callback): Self = StObject.set(x, "end", value.toJsFn)
    
    inline def setEndPage(value: Callback): Self = StObject.set(x, "endPage", value.toJsFn)
    
    inline def setStart(value: (String, Double, Boolean) => Boolean): Self = StObject.set(x, "start", js.Any.fromFunction3(value))
    
    inline def setStartPage(value: CallbackTo[XDevice]): Self = StObject.set(x, "startPage", value.toJsFn)
    
    inline def setTerminate(value: Callback): Self = StObject.set(x, "terminate", value.toJsFn)
  }
}
