package typingsJapgolly.activexLibreoffice.com_.sun.star.script

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameContainer
import typingsJapgolly.activexLibreoffice.com_.sun.star.document.XStorageBasedDocument
import typingsJapgolly.activexLibreoffice.com_.sun.star.embed.XStorage
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XModifyListener
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * defines a container of dialog libraries, which is to be made persistent in a sub storage of a document storage.
  * @since OOo 2.3
  */
trait DocumentDialogLibraryContainer
  extends StObject
     with XStorageBasedLibraryContainer {
  
  /**
    * creates an instance of the `DocumentDialogLibraryContainer` , belonging to a document
    *
    * The current storage of the document will be set as initial root storage (see XPersistentLibraryContainer::RootStorage) of the container.
    *
    * Usually, you will only create a `DocumentDialogLibraryContainer` within the implementation of the document to which the container should belong.
    * @param Document The document to which the container should belong to. Must not be `NULL` .
    * @throws com::sun::star::lang::IllegalArgumentException if `Document` does not denote a valid {@link com.sun.star.document.OfficeDocument} .
    */
  def create(Document: XStorageBasedDocument): Unit
  
  def createWithURL(URL: String): Unit
}
object DocumentDialogLibraryContainer {
  
  inline def apply(
    ContainerLocationName: String,
    ElementNames: SafeArray[String],
    ElementType: `type`,
    RootLocation: Any,
    RootStorage: XStorage,
    acquire: Callback,
    addModifyListener: XModifyListener => Callback,
    create: XStorageBasedDocument => Callback,
    createLibrary: String => XNameContainer,
    createLibraryLink: (String, String, Boolean) => XNameAccess,
    createWithURL: String => Callback,
    getByName: String => Any,
    getElementNames: CallbackTo[SafeArray[String]],
    getElementType: CallbackTo[`type`],
    getLibraryLinkURL: String => String,
    hasByName: String => Boolean,
    hasElements: CallbackTo[Boolean],
    isLibraryLink: String => Boolean,
    isLibraryLoaded: String => Boolean,
    isLibraryReadOnly: String => Boolean,
    isModified: CallbackTo[Boolean],
    loadLibrary: String => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeLibrary: String => Callback,
    removeModifyListener: XModifyListener => Callback,
    renameLibrary: (String, String) => Callback,
    setLibraryReadOnly: (String, Boolean) => Callback,
    setModified: Boolean => Callback,
    storeLibraries: Callback,
    storeLibrariesToStorage: XStorage => Callback
  ): DocumentDialogLibraryContainer = {
    val __obj = js.Dynamic.literal(ContainerLocationName = ContainerLocationName.asInstanceOf[js.Any], ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], RootLocation = RootLocation.asInstanceOf[js.Any], RootStorage = RootStorage.asInstanceOf[js.Any], acquire = acquire.toJsFn, addModifyListener = js.Any.fromFunction1((t0: XModifyListener) => addModifyListener(t0).runNow()), create = js.Any.fromFunction1((t0: XStorageBasedDocument) => create(t0).runNow()), createLibrary = js.Any.fromFunction1(createLibrary), createLibraryLink = js.Any.fromFunction3(createLibraryLink), createWithURL = js.Any.fromFunction1((t0: String) => createWithURL(t0).runNow()), getByName = js.Any.fromFunction1(getByName), getElementNames = getElementNames.toJsFn, getElementType = getElementType.toJsFn, getLibraryLinkURL = js.Any.fromFunction1(getLibraryLinkURL), hasByName = js.Any.fromFunction1(hasByName), hasElements = hasElements.toJsFn, isLibraryLink = js.Any.fromFunction1(isLibraryLink), isLibraryLoaded = js.Any.fromFunction1(isLibraryLoaded), isLibraryReadOnly = js.Any.fromFunction1(isLibraryReadOnly), isModified = isModified.toJsFn, loadLibrary = js.Any.fromFunction1((t0: String) => loadLibrary(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeLibrary = js.Any.fromFunction1((t0: String) => removeLibrary(t0).runNow()), removeModifyListener = js.Any.fromFunction1((t0: XModifyListener) => removeModifyListener(t0).runNow()), renameLibrary = js.Any.fromFunction2((t0: String, t1: String) => (renameLibrary(t0, t1)).runNow()), setLibraryReadOnly = js.Any.fromFunction2((t0: String, t1: Boolean) => (setLibraryReadOnly(t0, t1)).runNow()), setModified = js.Any.fromFunction1((t0: Boolean) => setModified(t0).runNow()), storeLibraries = storeLibraries.toJsFn, storeLibrariesToStorage = js.Any.fromFunction1((t0: XStorage) => storeLibrariesToStorage(t0).runNow()))
    __obj.asInstanceOf[DocumentDialogLibraryContainer]
  }
  
  extension [Self <: DocumentDialogLibraryContainer](x: Self) {
    
    inline def setCreate(value: XStorageBasedDocument => Callback): Self = StObject.set(x, "create", js.Any.fromFunction1((t0: XStorageBasedDocument) => value(t0).runNow()))
    
    inline def setCreateWithURL(value: String => Callback): Self = StObject.set(x, "createWithURL", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
