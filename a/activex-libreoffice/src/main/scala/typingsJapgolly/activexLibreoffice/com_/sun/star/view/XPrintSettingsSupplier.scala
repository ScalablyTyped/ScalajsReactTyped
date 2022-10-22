package typingsJapgolly.activexLibreoffice.com_.sun.star.view

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** offers printing related settings, which affect document rendering, but are not related to the printer itself. */
trait XPrintSettingsSupplier
  extends StObject
     with XInterface {
  
  /**
    * @returns a set of properties which are related to printing.
    * @see PrintSettings
    */
  val PrintSettings: XPropertySet
  
  /**
    * @returns a set of properties which are related to printing.
    * @see PrintSettings
    */
  def getPrintSettings(): XPropertySet
}
object XPrintSettingsSupplier {
  
  inline def apply(
    PrintSettings: XPropertySet,
    acquire: Callback,
    getPrintSettings: CallbackTo[XPropertySet],
    queryInterface: `type` => Any,
    release: Callback
  ): XPrintSettingsSupplier = {
    val __obj = js.Dynamic.literal(PrintSettings = PrintSettings.asInstanceOf[js.Any], acquire = acquire.toJsFn, getPrintSettings = getPrintSettings.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XPrintSettingsSupplier]
  }
  
  extension [Self <: XPrintSettingsSupplier](x: Self) {
    
    inline def setGetPrintSettings(value: CallbackTo[XPropertySet]): Self = StObject.set(x, "getPrintSettings", value.toJsFn)
    
    inline def setPrintSettings(value: XPropertySet): Self = StObject.set(x, "PrintSettings", value.asInstanceOf[js.Any])
  }
}
