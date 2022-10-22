package typingsJapgolly.activexLibreoffice.com_.sun.star.text

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

/** Print several pages on one printer page. */
trait XPagePrintable
  extends StObject
     with XInterface {
  
  /** @returns the settings of printing of pages. These settings contains:   short PageRows - number of rows of pages printed to one page    short PageColumns - */
  var PagePrintSettings: SafeArray[PropertyValue]
  
  /** @returns the settings of printing of pages. These settings contains:   short PageRows - number of rows of pages printed to one page    short PageColumns - */
  def getPagePrintSettings(): SafeArray[PropertyValue]
  
  /**
    * prints the pages according to the {@link PagePrintSettings} .
    * @see com.sun.star.view.PrintOptions
    */
  def printPages(xOptions: SeqEquiv[PropertyValue]): Unit
  
  /**
    * adjusts the settings of the page printing.
    * @see getPagePrintSettings
    */
  def setPagePrintSettings(aSettings: SeqEquiv[PropertyValue]): Unit
}
object XPagePrintable {
  
  inline def apply(
    PagePrintSettings: SafeArray[PropertyValue],
    acquire: Callback,
    getPagePrintSettings: CallbackTo[SafeArray[PropertyValue]],
    printPages: SeqEquiv[PropertyValue] => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    setPagePrintSettings: SeqEquiv[PropertyValue] => Callback
  ): XPagePrintable = {
    val __obj = js.Dynamic.literal(PagePrintSettings = PagePrintSettings.asInstanceOf[js.Any], acquire = acquire.toJsFn, getPagePrintSettings = getPagePrintSettings.toJsFn, printPages = js.Any.fromFunction1((t0: SeqEquiv[PropertyValue]) => printPages(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setPagePrintSettings = js.Any.fromFunction1((t0: SeqEquiv[PropertyValue]) => setPagePrintSettings(t0).runNow()))
    __obj.asInstanceOf[XPagePrintable]
  }
  
  extension [Self <: XPagePrintable](x: Self) {
    
    inline def setGetPagePrintSettings(value: CallbackTo[SafeArray[PropertyValue]]): Self = StObject.set(x, "getPagePrintSettings", value.toJsFn)
    
    inline def setPagePrintSettings(value: SafeArray[PropertyValue]): Self = StObject.set(x, "PagePrintSettings", value.asInstanceOf[js.Any])
    
    inline def setPrintPages(value: SeqEquiv[PropertyValue] => Callback): Self = StObject.set(x, "printPages", js.Any.fromFunction1((t0: SeqEquiv[PropertyValue]) => value(t0).runNow()))
    
    inline def setSetPagePrintSettings(value: SeqEquiv[PropertyValue] => Callback): Self = StObject.set(x, "setPagePrintSettings", js.Any.fromFunction1((t0: SeqEquiv[PropertyValue]) => value(t0).runNow()))
  }
}
