package typingsJapgolly.activexLibreoffice.com_.sun.star.sdb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides the access to a container of database forms.
  * @see Forms
  */
trait XFormDocumentsSupplier
  extends StObject
     with XInterface {
  
  /**
    * returns the container of forms.
    * @returns the form documents
    * @see Forms
    */
  val FormDocuments: XNameAccess
  
  /**
    * returns the container of forms.
    * @returns the form documents
    * @see Forms
    */
  def getFormDocuments(): XNameAccess
}
object XFormDocumentsSupplier {
  
  inline def apply(
    FormDocuments: XNameAccess,
    acquire: Callback,
    getFormDocuments: CallbackTo[XNameAccess],
    queryInterface: `type` => Any,
    release: Callback
  ): XFormDocumentsSupplier = {
    val __obj = js.Dynamic.literal(FormDocuments = FormDocuments.asInstanceOf[js.Any], acquire = acquire.toJsFn, getFormDocuments = getFormDocuments.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XFormDocumentsSupplier]
  }
  
  extension [Self <: XFormDocumentsSupplier](x: Self) {
    
    inline def setFormDocuments(value: XNameAccess): Self = StObject.set(x, "FormDocuments", value.asInstanceOf[js.Any])
    
    inline def setGetFormDocuments(value: CallbackTo[XNameAccess]): Self = StObject.set(x, "getFormDocuments", value.toJsFn)
  }
}
