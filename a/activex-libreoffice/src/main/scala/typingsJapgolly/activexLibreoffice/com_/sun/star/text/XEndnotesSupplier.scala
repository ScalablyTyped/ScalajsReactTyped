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

/** makes it possible to access the endnotes within the context (e.g. document). */
trait XEndnotesSupplier
  extends StObject
     with XInterface {
  
  /** @returns the endnote settings of the document. */
  val EndnoteSettings: XPropertySet
  
  /** @returns a collection of endnotes. */
  val Endnotes: XIndexAccess
  
  /** @returns the endnote settings of the document. */
  def getEndnoteSettings(): XPropertySet
  
  /** @returns a collection of endnotes. */
  def getEndnotes(): XIndexAccess
}
object XEndnotesSupplier {
  
  inline def apply(
    EndnoteSettings: XPropertySet,
    Endnotes: XIndexAccess,
    acquire: Callback,
    getEndnoteSettings: CallbackTo[XPropertySet],
    getEndnotes: CallbackTo[XIndexAccess],
    queryInterface: `type` => Any,
    release: Callback
  ): XEndnotesSupplier = {
    val __obj = js.Dynamic.literal(EndnoteSettings = EndnoteSettings.asInstanceOf[js.Any], Endnotes = Endnotes.asInstanceOf[js.Any], acquire = acquire.toJsFn, getEndnoteSettings = getEndnoteSettings.toJsFn, getEndnotes = getEndnotes.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XEndnotesSupplier]
  }
  
  extension [Self <: XEndnotesSupplier](x: Self) {
    
    inline def setEndnoteSettings(value: XPropertySet): Self = StObject.set(x, "EndnoteSettings", value.asInstanceOf[js.Any])
    
    inline def setEndnotes(value: XIndexAccess): Self = StObject.set(x, "Endnotes", value.asInstanceOf[js.Any])
    
    inline def setGetEndnoteSettings(value: CallbackTo[XPropertySet]): Self = StObject.set(x, "getEndnoteSettings", value.toJsFn)
    
    inline def setGetEndnotes(value: CallbackTo[XIndexAccess]): Self = StObject.set(x, "getEndnotes", value.toJsFn)
  }
}
