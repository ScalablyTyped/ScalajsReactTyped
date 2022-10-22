package typingsJapgolly.activexLibreoffice.com_.sun.star.document

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.embed.XStorage
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows to initialize document with a storage, to store document to a storage, and to set document to be based on provided storage. */
trait XStorageBasedDocument
  extends StObject
     with XInterface {
  
  /** allows to get the storage the document is based on. */
  val DocumentStorage: XStorage
  
  /** allows to register a listener that will be notified when another storage is set to the document. */
  def addStorageChangeListener(xListener: XStorageChangeListener): Unit
  
  /** allows to get the storage the document is based on. */
  def getDocumentStorage(): XStorage
  
  /** lets the document load itself using provided storage. */
  def loadFromStorage(xStorage: XStorage, aMediaDescriptor: SeqEquiv[PropertyValue]): Unit
  
  /** allows to deregister the listener. */
  def removeStorageChangeListener(xListener: XStorageChangeListener): Unit
  
  /** lets the document store itself to the provided storage. */
  def storeToStorage(xStorage: XStorage, aMediaDescriptor: SeqEquiv[PropertyValue]): Unit
  
  /** allows to switch the document to the provided storage. */
  def switchToStorage(xStorage: XStorage): Unit
}
object XStorageBasedDocument {
  
  inline def apply(
    DocumentStorage: XStorage,
    acquire: Callback,
    addStorageChangeListener: XStorageChangeListener => Callback,
    getDocumentStorage: CallbackTo[XStorage],
    loadFromStorage: (XStorage, SeqEquiv[PropertyValue]) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeStorageChangeListener: XStorageChangeListener => Callback,
    storeToStorage: (XStorage, SeqEquiv[PropertyValue]) => Callback,
    switchToStorage: XStorage => Callback
  ): XStorageBasedDocument = {
    val __obj = js.Dynamic.literal(DocumentStorage = DocumentStorage.asInstanceOf[js.Any], acquire = acquire.toJsFn, addStorageChangeListener = js.Any.fromFunction1((t0: XStorageChangeListener) => addStorageChangeListener(t0).runNow()), getDocumentStorage = getDocumentStorage.toJsFn, loadFromStorage = js.Any.fromFunction2((t0: XStorage, t1: SeqEquiv[PropertyValue]) => (loadFromStorage(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeStorageChangeListener = js.Any.fromFunction1((t0: XStorageChangeListener) => removeStorageChangeListener(t0).runNow()), storeToStorage = js.Any.fromFunction2((t0: XStorage, t1: SeqEquiv[PropertyValue]) => (storeToStorage(t0, t1)).runNow()), switchToStorage = js.Any.fromFunction1((t0: XStorage) => switchToStorage(t0).runNow()))
    __obj.asInstanceOf[XStorageBasedDocument]
  }
  
  extension [Self <: XStorageBasedDocument](x: Self) {
    
    inline def setAddStorageChangeListener(value: XStorageChangeListener => Callback): Self = StObject.set(x, "addStorageChangeListener", js.Any.fromFunction1((t0: XStorageChangeListener) => value(t0).runNow()))
    
    inline def setDocumentStorage(value: XStorage): Self = StObject.set(x, "DocumentStorage", value.asInstanceOf[js.Any])
    
    inline def setGetDocumentStorage(value: CallbackTo[XStorage]): Self = StObject.set(x, "getDocumentStorage", value.toJsFn)
    
    inline def setLoadFromStorage(value: (XStorage, SeqEquiv[PropertyValue]) => Callback): Self = StObject.set(x, "loadFromStorage", js.Any.fromFunction2((t0: XStorage, t1: SeqEquiv[PropertyValue]) => (value(t0, t1)).runNow()))
    
    inline def setRemoveStorageChangeListener(value: XStorageChangeListener => Callback): Self = StObject.set(x, "removeStorageChangeListener", js.Any.fromFunction1((t0: XStorageChangeListener) => value(t0).runNow()))
    
    inline def setStoreToStorage(value: (XStorage, SeqEquiv[PropertyValue]) => Callback): Self = StObject.set(x, "storeToStorage", js.Any.fromFunction2((t0: XStorage, t1: SeqEquiv[PropertyValue]) => (value(t0, t1)).runNow()))
    
    inline def setSwitchToStorage(value: XStorage => Callback): Self = StObject.set(x, "switchToStorage", js.Any.fromFunction1((t0: XStorage) => value(t0).runNow()))
  }
}
