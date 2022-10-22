package typingsJapgolly.activexLibreoffice.com_.sun.star.document

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to import a document from a given URL into this document. */
trait XDocumentInsertable
  extends StObject
     with XInterface {
  
  /** inserts the document that is specified by the URL. */
  def insertDocumentFromURL(aURL: String, aOptions: SeqEquiv[PropertyValue]): Unit
}
object XDocumentInsertable {
  
  inline def apply(
    acquire: Callback,
    insertDocumentFromURL: (String, SeqEquiv[PropertyValue]) => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XDocumentInsertable = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, insertDocumentFromURL = js.Any.fromFunction2((t0: String, t1: SeqEquiv[PropertyValue]) => (insertDocumentFromURL(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XDocumentInsertable]
  }
  
  extension [Self <: XDocumentInsertable](x: Self) {
    
    inline def setInsertDocumentFromURL(value: (String, SeqEquiv[PropertyValue]) => Callback): Self = StObject.set(x, "insertDocumentFromURL", js.Any.fromFunction2((t0: String, t1: SeqEquiv[PropertyValue]) => (value(t0, t1)).runNow()))
  }
}
