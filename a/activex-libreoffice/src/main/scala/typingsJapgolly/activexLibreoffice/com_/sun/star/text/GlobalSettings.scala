package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.view.XPrintSettingsSupplier
import typingsJapgolly.activexLibreoffice.com_.sun.star.view.XViewSettingsSupplier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a service that provides access to the settings of a text module. */
trait GlobalSettings
  extends StObject
     with XPrintSettingsSupplier
     with XViewSettingsSupplier
object GlobalSettings {
  
  inline def apply(
    PrintSettings: XPropertySet,
    ViewSettings: XPropertySet,
    acquire: Callback,
    getPrintSettings: CallbackTo[XPropertySet],
    getViewSettings: CallbackTo[XPropertySet],
    queryInterface: `type` => Any,
    release: Callback
  ): GlobalSettings = {
    val __obj = js.Dynamic.literal(PrintSettings = PrintSettings.asInstanceOf[js.Any], ViewSettings = ViewSettings.asInstanceOf[js.Any], acquire = acquire.toJsFn, getPrintSettings = getPrintSettings.toJsFn, getViewSettings = getViewSettings.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[GlobalSettings]
  }
}
