package typingsJapgolly.activexLibreoffice.com_.sun.star.util

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** supplies the collection of {@link NumberFormats} (for example, in a document) and the settings belonging to these formats. */
trait XNumberFormatsSupplier
  extends StObject
     with XInterface {
  
  /** @returns the {@link NumberFormatSettings} of this object. */
  val NumberFormatSettings: XPropertySet
  
  /** @returns the collection of number formats belonging to this object (e.g., to this document). */
  val NumberFormats: XNumberFormats
  
  /** @returns the {@link NumberFormatSettings} of this object. */
  def getNumberFormatSettings(): XPropertySet
  
  /** @returns the collection of number formats belonging to this object (e.g., to this document). */
  def getNumberFormats(): XNumberFormats
}
object XNumberFormatsSupplier {
  
  inline def apply(
    NumberFormatSettings: XPropertySet,
    NumberFormats: XNumberFormats,
    acquire: Callback,
    getNumberFormatSettings: CallbackTo[XPropertySet],
    getNumberFormats: CallbackTo[XNumberFormats],
    queryInterface: `type` => Any,
    release: Callback
  ): XNumberFormatsSupplier = {
    val __obj = js.Dynamic.literal(NumberFormatSettings = NumberFormatSettings.asInstanceOf[js.Any], NumberFormats = NumberFormats.asInstanceOf[js.Any], acquire = acquire.toJsFn, getNumberFormatSettings = getNumberFormatSettings.toJsFn, getNumberFormats = getNumberFormats.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XNumberFormatsSupplier]
  }
  
  extension [Self <: XNumberFormatsSupplier](x: Self) {
    
    inline def setGetNumberFormatSettings(value: CallbackTo[XPropertySet]): Self = StObject.set(x, "getNumberFormatSettings", value.toJsFn)
    
    inline def setGetNumberFormats(value: CallbackTo[XNumberFormats]): Self = StObject.set(x, "getNumberFormats", value.toJsFn)
    
    inline def setNumberFormatSettings(value: XPropertySet): Self = StObject.set(x, "NumberFormatSettings", value.asInstanceOf[js.Any])
    
    inline def setNumberFormats(value: XNumberFormats): Self = StObject.set(x, "NumberFormats", value.asInstanceOf[js.Any])
  }
}
