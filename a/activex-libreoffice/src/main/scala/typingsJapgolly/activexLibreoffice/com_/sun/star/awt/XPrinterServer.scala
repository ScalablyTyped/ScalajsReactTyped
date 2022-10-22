package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** manages several printers on one machine. */
trait XPrinterServer
  extends StObject
     with XInterface {
  
  /** returns a list of all available printer names. */
  val PrinterNames: SafeArray[String]
  
  /**
    * creates a new information printer.
    *
    * You can get all information from this printer, but the printer cannot really print.
    */
  def createInfoPrinter(printerName: String): XInfoPrinter
  
  /**
    * creates a new virtual printer.
    *
    * You must call {@link com.sun.star.awt.XPrinter.start()} to put the job into the printer spooler.
    */
  def createPrinter(printerName: String): XPrinter
  
  /** returns a list of all available printer names. */
  def getPrinterNames(): SafeArray[String]
}
object XPrinterServer {
  
  inline def apply(
    PrinterNames: SafeArray[String],
    acquire: Callback,
    createInfoPrinter: String => XInfoPrinter,
    createPrinter: String => XPrinter,
    getPrinterNames: CallbackTo[SafeArray[String]],
    queryInterface: `type` => Any,
    release: Callback
  ): XPrinterServer = {
    val __obj = js.Dynamic.literal(PrinterNames = PrinterNames.asInstanceOf[js.Any], acquire = acquire.toJsFn, createInfoPrinter = js.Any.fromFunction1(createInfoPrinter), createPrinter = js.Any.fromFunction1(createPrinter), getPrinterNames = getPrinterNames.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XPrinterServer]
  }
  
  extension [Self <: XPrinterServer](x: Self) {
    
    inline def setCreateInfoPrinter(value: String => XInfoPrinter): Self = StObject.set(x, "createInfoPrinter", js.Any.fromFunction1(value))
    
    inline def setCreatePrinter(value: String => XPrinter): Self = StObject.set(x, "createPrinter", js.Any.fromFunction1(value))
    
    inline def setGetPrinterNames(value: CallbackTo[SafeArray[String]]): Self = StObject.set(x, "getPrinterNames", value.toJsFn)
    
    inline def setPrinterNames(value: SafeArray[String]): Self = StObject.set(x, "PrinterNames", value.asInstanceOf[js.Any])
  }
}
