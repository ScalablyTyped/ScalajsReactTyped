package typingsJapgolly.activexLibreoffice.com_.sun.star.document

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XDocumentLanguages
  extends StObject
     with XInterface {
  
  /**
    * retrieve the list of languages already used in current document
    * @returns sequence
    */
  def getDocumentLanguages(nScriptTypes: Double, nCount: Double): SafeArray[Locale]
}
object XDocumentLanguages {
  
  inline def apply(
    acquire: Callback,
    getDocumentLanguages: (Double, Double) => SafeArray[Locale],
    queryInterface: `type` => Any,
    release: Callback
  ): XDocumentLanguages = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getDocumentLanguages = js.Any.fromFunction2(getDocumentLanguages), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XDocumentLanguages]
  }
  
  extension [Self <: XDocumentLanguages](x: Self) {
    
    inline def setGetDocumentLanguages(value: (Double, Double) => SafeArray[Locale]): Self = StObject.set(x, "getDocumentLanguages", js.Any.fromFunction2(value))
  }
}
