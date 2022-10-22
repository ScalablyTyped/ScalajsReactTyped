package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to access the {@link FootnoteSettings} within the context (e.g. document). */
trait XEndnotesSettingsSupplier
  extends StObject
     with XInterface {
  
  /** @returns The {@link EndnoteSettings} of the object. */
  val EndnotesSettings: XPropertySet
  
  /** @returns The {@link EndnoteSettings} of the object. */
  def getEndnotesSettings(): XPropertySet
}
object XEndnotesSettingsSupplier {
  
  inline def apply(
    EndnotesSettings: XPropertySet,
    acquire: Callback,
    getEndnotesSettings: CallbackTo[XPropertySet],
    queryInterface: `type` => Any,
    release: Callback
  ): XEndnotesSettingsSupplier = {
    val __obj = js.Dynamic.literal(EndnotesSettings = EndnotesSettings.asInstanceOf[js.Any], acquire = acquire.toJsFn, getEndnotesSettings = getEndnotesSettings.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XEndnotesSettingsSupplier]
  }
  
  extension [Self <: XEndnotesSettingsSupplier](x: Self) {
    
    inline def setEndnotesSettings(value: XPropertySet): Self = StObject.set(x, "EndnotesSettings", value.asInstanceOf[js.Any])
    
    inline def setGetEndnotesSettings(value: CallbackTo[XPropertySet]): Self = StObject.set(x, "getEndnotesSettings", value.toJsFn)
  }
}
