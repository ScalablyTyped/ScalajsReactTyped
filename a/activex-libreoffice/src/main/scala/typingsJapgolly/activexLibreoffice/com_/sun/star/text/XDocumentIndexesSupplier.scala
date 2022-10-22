package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gives access to the collection of document indexes.
  *
  * In general this interface is supported by a {@link TextDocument} .
  */
trait XDocumentIndexesSupplier
  extends StObject
     with XInterface {
  
  /** @returns the collection of "DocumentIndexes" currently contained in the object. */
  val DocumentIndexes: XIndexAccess
  
  /** @returns the collection of "DocumentIndexes" currently contained in the object. */
  def getDocumentIndexes(): XIndexAccess
}
object XDocumentIndexesSupplier {
  
  inline def apply(
    DocumentIndexes: XIndexAccess,
    acquire: Callback,
    getDocumentIndexes: CallbackTo[XIndexAccess],
    queryInterface: `type` => Any,
    release: Callback
  ): XDocumentIndexesSupplier = {
    val __obj = js.Dynamic.literal(DocumentIndexes = DocumentIndexes.asInstanceOf[js.Any], acquire = acquire.toJsFn, getDocumentIndexes = getDocumentIndexes.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XDocumentIndexesSupplier]
  }
  
  extension [Self <: XDocumentIndexesSupplier](x: Self) {
    
    inline def setDocumentIndexes(value: XIndexAccess): Self = StObject.set(x, "DocumentIndexes", value.asInstanceOf[js.Any])
    
    inline def setGetDocumentIndexes(value: CallbackTo[XIndexAccess]): Self = StObject.set(x, "getDocumentIndexes", value.toJsFn)
  }
}
