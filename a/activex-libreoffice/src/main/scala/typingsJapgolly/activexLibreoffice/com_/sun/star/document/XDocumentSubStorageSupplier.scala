package typingsJapgolly.activexLibreoffice.com_.sun.star.document

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.embed.XStorage
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * through this interface documents can provide access to their substorages
  *
  * A temporary interface to get access to documents substorages.
  */
trait XDocumentSubStorageSupplier
  extends StObject
     with XInterface {
  
  /**
    * provides the list of substorages
    * @returns sequence of substorages names
    */
  val DocumentSubStoragesNames: SafeArray[String]
  
  /**
    * provides the access to a substorage with specified name
    * @param StorageName the name of requested substorage
    * @param nMode a mode the storage should be opened in can take value from {@link com.sun.star.embed.ElementModes}
    * @returns XStorage implementation that refers to specified substorage
    */
  def getDocumentSubStorage(StorageName: String, nMode: Double): XStorage
  
  /**
    * provides the list of substorages
    * @returns sequence of substorages names
    */
  def getDocumentSubStoragesNames(): SafeArray[String]
}
object XDocumentSubStorageSupplier {
  
  inline def apply(
    DocumentSubStoragesNames: SafeArray[String],
    acquire: Callback,
    getDocumentSubStorage: (String, Double) => XStorage,
    getDocumentSubStoragesNames: CallbackTo[SafeArray[String]],
    queryInterface: `type` => Any,
    release: Callback
  ): XDocumentSubStorageSupplier = {
    val __obj = js.Dynamic.literal(DocumentSubStoragesNames = DocumentSubStoragesNames.asInstanceOf[js.Any], acquire = acquire.toJsFn, getDocumentSubStorage = js.Any.fromFunction2(getDocumentSubStorage), getDocumentSubStoragesNames = getDocumentSubStoragesNames.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XDocumentSubStorageSupplier]
  }
  
  extension [Self <: XDocumentSubStorageSupplier](x: Self) {
    
    inline def setDocumentSubStoragesNames(value: SafeArray[String]): Self = StObject.set(x, "DocumentSubStoragesNames", value.asInstanceOf[js.Any])
    
    inline def setGetDocumentSubStorage(value: (String, Double) => XStorage): Self = StObject.set(x, "getDocumentSubStorage", js.Any.fromFunction2(value))
    
    inline def setGetDocumentSubStoragesNames(value: CallbackTo[SafeArray[String]]): Self = StObject.set(x, "getDocumentSubStoragesNames", value.toJsFn)
  }
}
