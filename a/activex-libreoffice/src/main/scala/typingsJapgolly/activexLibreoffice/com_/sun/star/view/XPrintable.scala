package typingsJapgolly.activexLibreoffice.com_.sun.star.view

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** offers printing functionality. */
trait XPrintable
  extends StObject
     with XInterface {
  
  /**
    * @returns a descriptor of the current printer.  The attributes of the current printer are used for formatting.
    * @see PrinterDescriptor
    */
  var Printer: SafeArray[PropertyValue]
  
  /**
    * @returns a descriptor of the current printer.  The attributes of the current printer are used for formatting.
    * @see PrinterDescriptor
    */
  def getPrinter(): SafeArray[PropertyValue]
  
  /**
    * prints the object.
    * @param xOptions specifies the number of copies and some other values which do not affect formatting.
    * @see PrintOptions
    */
  def print(xOptions: SeqEquiv[PropertyValue]): Unit
  
  /**
    * assigns a new printer to the object.
    *
    * Setting a new printer will cause reformatting.
    * @see PrinterDescriptor
    */
  def setPrinter(aPrinter: SeqEquiv[PropertyValue]): Unit
}
object XPrintable {
  
  inline def apply(
    Printer: SafeArray[PropertyValue],
    acquire: Callback,
    getPrinter: CallbackTo[SafeArray[PropertyValue]],
    print: SeqEquiv[PropertyValue] => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    setPrinter: SeqEquiv[PropertyValue] => Callback
  ): XPrintable = {
    val __obj = js.Dynamic.literal(Printer = Printer.asInstanceOf[js.Any], acquire = acquire.toJsFn, getPrinter = getPrinter.toJsFn, print = js.Any.fromFunction1((t0: SeqEquiv[PropertyValue]) => print(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setPrinter = js.Any.fromFunction1((t0: SeqEquiv[PropertyValue]) => setPrinter(t0).runNow()))
    __obj.asInstanceOf[XPrintable]
  }
  
  extension [Self <: XPrintable](x: Self) {
    
    inline def setGetPrinter(value: CallbackTo[SafeArray[PropertyValue]]): Self = StObject.set(x, "getPrinter", value.toJsFn)
    
    inline def setPrint(value: SeqEquiv[PropertyValue] => Callback): Self = StObject.set(x, "print", js.Any.fromFunction1((t0: SeqEquiv[PropertyValue]) => value(t0).runNow()))
    
    inline def setPrinter(value: SafeArray[PropertyValue]): Self = StObject.set(x, "Printer", value.asInstanceOf[js.Any])
    
    inline def setSetPrinter(value: SeqEquiv[PropertyValue] => Callback): Self = StObject.set(x, "setPrinter", js.Any.fromFunction1((t0: SeqEquiv[PropertyValue]) => value(t0).runNow()))
  }
}
