package typingsJapgolly.activexLibreoffice.com_.sun.star.document

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides access to a container of the redline objects of the document. */
trait XRedlinesSupplier
  extends StObject
     with XInterface {
  
  /** @returns an enumeration access that provides access to the redline objects of the document.  The returned objects implement at least the interface {@link  */
  val Redlines: XEnumerationAccess
  
  /** @returns an enumeration access that provides access to the redline objects of the document.  The returned objects implement at least the interface {@link  */
  def getRedlines(): XEnumerationAccess
}
object XRedlinesSupplier {
  
  inline def apply(
    Redlines: XEnumerationAccess,
    acquire: Callback,
    getRedlines: CallbackTo[XEnumerationAccess],
    queryInterface: `type` => Any,
    release: Callback
  ): XRedlinesSupplier = {
    val __obj = js.Dynamic.literal(Redlines = Redlines.asInstanceOf[js.Any], acquire = acquire.toJsFn, getRedlines = getRedlines.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XRedlinesSupplier]
  }
  
  extension [Self <: XRedlinesSupplier](x: Self) {
    
    inline def setGetRedlines(value: CallbackTo[XEnumerationAccess]): Self = StObject.set(x, "getRedlines", value.toJsFn)
    
    inline def setRedlines(value: XEnumerationAccess): Self = StObject.set(x, "Redlines", value.asInstanceOf[js.Any])
  }
}
