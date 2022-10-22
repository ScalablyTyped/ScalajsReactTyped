package typingsJapgolly.activexLibreoffice.com_.sun.star.style

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This interface provides access to the style families within the container document. */
trait XStyleFamiliesSupplier
  extends StObject
     with XInterface {
  
  /**
    * This method returns the collection of style families available in the container document.
    * @see StyleFamilies
    */
  val StyleFamilies: XNameAccess
  
  /**
    * This method returns the collection of style families available in the container document.
    * @see StyleFamilies
    */
  def getStyleFamilies(): XNameAccess
}
object XStyleFamiliesSupplier {
  
  inline def apply(
    StyleFamilies: XNameAccess,
    acquire: Callback,
    getStyleFamilies: CallbackTo[XNameAccess],
    queryInterface: `type` => Any,
    release: Callback
  ): XStyleFamiliesSupplier = {
    val __obj = js.Dynamic.literal(StyleFamilies = StyleFamilies.asInstanceOf[js.Any], acquire = acquire.toJsFn, getStyleFamilies = getStyleFamilies.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XStyleFamiliesSupplier]
  }
  
  extension [Self <: XStyleFamiliesSupplier](x: Self) {
    
    inline def setGetStyleFamilies(value: CallbackTo[XNameAccess]): Self = StObject.set(x, "getStyleFamilies", value.toJsFn)
    
    inline def setStyleFamilies(value: XNameAccess): Self = StObject.set(x, "StyleFamilies", value.asInstanceOf[js.Any])
  }
}
