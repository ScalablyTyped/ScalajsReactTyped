package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to access the {@link FootnoteSettings} with the context (e.g. document). */
trait XFootnotesSettingsSupplier
  extends StObject
     with XInterface {
  
  /** @returns The {@link FootnoteSettings} of the object. */
  val FootnotesSettings: XPropertySet
  
  /** @returns The {@link FootnoteSettings} of the object. */
  def getFootnotesSettings(): XPropertySet
}
object XFootnotesSettingsSupplier {
  
  inline def apply(
    FootnotesSettings: XPropertySet,
    acquire: Callback,
    getFootnotesSettings: CallbackTo[XPropertySet],
    queryInterface: `type` => Any,
    release: Callback
  ): XFootnotesSettingsSupplier = {
    val __obj = js.Dynamic.literal(FootnotesSettings = FootnotesSettings.asInstanceOf[js.Any], acquire = acquire.toJsFn, getFootnotesSettings = getFootnotesSettings.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XFootnotesSettingsSupplier]
  }
  
  extension [Self <: XFootnotesSettingsSupplier](x: Self) {
    
    inline def setFootnotesSettings(value: XPropertySet): Self = StObject.set(x, "FootnotesSettings", value.asInstanceOf[js.Any])
    
    inline def setGetFootnotesSettings(value: CallbackTo[XPropertySet]): Self = StObject.set(x, "getFootnotesSettings", value.toJsFn)
  }
}
