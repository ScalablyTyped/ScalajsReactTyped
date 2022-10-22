package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to access the footnotes within the context (e.g. document). */
trait XFootnotesSupplier
  extends StObject
     with XInterface {
  
  /** @returns the footnotes settings of the document. */
  val FootnoteSettings: XPropertySet
  
  /** returns a collection of footnotes. */
  val Footnotes: XIndexAccess
  
  /** @returns the footnotes settings of the document. */
  def getFootnoteSettings(): XPropertySet
  
  /** returns a collection of footnotes. */
  def getFootnotes(): XIndexAccess
}
object XFootnotesSupplier {
  
  inline def apply(
    FootnoteSettings: XPropertySet,
    Footnotes: XIndexAccess,
    acquire: Callback,
    getFootnoteSettings: CallbackTo[XPropertySet],
    getFootnotes: CallbackTo[XIndexAccess],
    queryInterface: `type` => Any,
    release: Callback
  ): XFootnotesSupplier = {
    val __obj = js.Dynamic.literal(FootnoteSettings = FootnoteSettings.asInstanceOf[js.Any], Footnotes = Footnotes.asInstanceOf[js.Any], acquire = acquire.toJsFn, getFootnoteSettings = getFootnoteSettings.toJsFn, getFootnotes = getFootnotes.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XFootnotesSupplier]
  }
  
  extension [Self <: XFootnotesSupplier](x: Self) {
    
    inline def setFootnoteSettings(value: XPropertySet): Self = StObject.set(x, "FootnoteSettings", value.asInstanceOf[js.Any])
    
    inline def setFootnotes(value: XIndexAccess): Self = StObject.set(x, "Footnotes", value.asInstanceOf[js.Any])
    
    inline def setGetFootnoteSettings(value: CallbackTo[XPropertySet]): Self = StObject.set(x, "getFootnoteSettings", value.toJsFn)
    
    inline def setGetFootnotes(value: CallbackTo[XIndexAccess]): Self = StObject.set(x, "getFootnotes", value.toJsFn)
  }
}
