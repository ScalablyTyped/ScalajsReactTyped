package typingsJapgolly.activexLibreoffice.com_.sun.star.view

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows for getting information about a print job.
  *
  * {@link XPrintJob} is implemented by print jobs that are created by classes that implement {@link XPrintable} . It gives information about the context
  * of the print job.
  * @see XPrintJobListener
  * @since OOo 1.1.2
  */
trait XPrintJob
  extends StObject
     with XInterface {
  
  /** returns the {@link PrintOptions} used for the print job */
  val PrintOptions: SafeArray[PropertyValue]
  
  /** returns the printed object used for the print job */
  val Printable: XPrintable
  
  /** returns the Printer used for the print job */
  val Printer: SafeArray[PropertyValue]
  
  def cancelJob(): Unit
  
  /** returns the {@link PrintOptions} used for the print job */
  def getPrintOptions(): SafeArray[PropertyValue]
  
  /** returns the printed object used for the print job */
  def getPrintable(): XPrintable
  
  /** returns the Printer used for the print job */
  def getPrinter(): SafeArray[PropertyValue]
}
object XPrintJob {
  
  inline def apply(
    PrintOptions: SafeArray[PropertyValue],
    Printable: XPrintable,
    Printer: SafeArray[PropertyValue],
    acquire: Callback,
    cancelJob: Callback,
    getPrintOptions: CallbackTo[SafeArray[PropertyValue]],
    getPrintable: CallbackTo[XPrintable],
    getPrinter: CallbackTo[SafeArray[PropertyValue]],
    queryInterface: `type` => Any,
    release: Callback
  ): XPrintJob = {
    val __obj = js.Dynamic.literal(PrintOptions = PrintOptions.asInstanceOf[js.Any], Printable = Printable.asInstanceOf[js.Any], Printer = Printer.asInstanceOf[js.Any], acquire = acquire.toJsFn, cancelJob = cancelJob.toJsFn, getPrintOptions = getPrintOptions.toJsFn, getPrintable = getPrintable.toJsFn, getPrinter = getPrinter.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XPrintJob]
  }
  
  extension [Self <: XPrintJob](x: Self) {
    
    inline def setCancelJob(value: Callback): Self = StObject.set(x, "cancelJob", value.toJsFn)
    
    inline def setGetPrintOptions(value: CallbackTo[SafeArray[PropertyValue]]): Self = StObject.set(x, "getPrintOptions", value.toJsFn)
    
    inline def setGetPrintable(value: CallbackTo[XPrintable]): Self = StObject.set(x, "getPrintable", value.toJsFn)
    
    inline def setGetPrinter(value: CallbackTo[SafeArray[PropertyValue]]): Self = StObject.set(x, "getPrinter", value.toJsFn)
    
    inline def setPrintOptions(value: SafeArray[PropertyValue]): Self = StObject.set(x, "PrintOptions", value.asInstanceOf[js.Any])
    
    inline def setPrintable(value: XPrintable): Self = StObject.set(x, "Printable", value.asInstanceOf[js.Any])
    
    inline def setPrinter(value: SafeArray[PropertyValue]): Self = StObject.set(x, "Printer", value.asInstanceOf[js.Any])
  }
}
