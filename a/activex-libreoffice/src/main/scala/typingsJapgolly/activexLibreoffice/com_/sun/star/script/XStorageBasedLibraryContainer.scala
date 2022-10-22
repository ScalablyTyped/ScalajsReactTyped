package typingsJapgolly.activexLibreoffice.com_.sun.star.script

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameContainer
import typingsJapgolly.activexLibreoffice.com_.sun.star.embed.XStorage
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XModifyListener
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is the interface for an {@link XLibraryContainer} which can be made persistent in an {@link com.sun.star.embed.XStorage} .
  *
  * A persistent library container is associated with a root storage. The container is responsible for a particular sub storage of the root storage, the
  * container storage.
  * @since OOo 2.3
  */
trait XStorageBasedLibraryContainer
  extends StObject
     with XPersistentLibraryContainer {
  
  /**
    * denotes the root storage associated with the container.
    *
    * Effectively, this attribute is a typed version of {@link XPersistentLibraryContainer.RootLocation} , it's guaranteed that at every time,
    * `XPersistentLibraryContainer::RootLocation` and `RootStorage` have the same value.
    *
    * You should only **set** this attribute to a new value if you previously called storeLibrariesToStorage with the same storage. Setting this attribute
    * to a storage into which the container has not been stored previously might result in unexpected behavior.
    */
  var RootStorage: XStorage
  
  /**
    * stores the libraries to a storage other than the current container storage
    *
    * Note that the library container is not automatically associated with the new root storage. Instead, you need to manually set the RootStorage attribute
    * afterwards. This separation allows for Save-To as well Save-As operations.
    * @param RootStorage denotes the root storage into which the libraries should be written, which must not be `NULL` . ;  Note that the actual libraries are
    * @throws com::sun::star::lang::IllegalArgumentException if the `RootStorage` parameter is `NULL` , or equals {@link RootStorage} .
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs during storing.
    */
  def storeLibrariesToStorage(RootStorage: XStorage): Unit
}
object XStorageBasedLibraryContainer {
  
  inline def apply(
    ContainerLocationName: String,
    ElementNames: SafeArray[String],
    ElementType: `type`,
    RootLocation: Any,
    RootStorage: XStorage,
    acquire: Callback,
    addModifyListener: XModifyListener => Callback,
    createLibrary: String => XNameContainer,
    createLibraryLink: (String, String, Boolean) => XNameAccess,
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
  ): XStorageBasedLibraryContainer = {
    val __obj = js.Dynamic.literal(ContainerLocationName = ContainerLocationName.asInstanceOf[js.Any], ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], RootLocation = RootLocation.asInstanceOf[js.Any], RootStorage = RootStorage.asInstanceOf[js.Any], acquire = acquire.toJsFn, addModifyListener = js.Any.fromFunction1((t0: XModifyListener) => addModifyListener(t0).runNow()), createLibrary = js.Any.fromFunction1(createLibrary), createLibraryLink = js.Any.fromFunction3(createLibraryLink), getByName = js.Any.fromFunction1(getByName), getElementNames = getElementNames.toJsFn, getElementType = getElementType.toJsFn, getLibraryLinkURL = js.Any.fromFunction1(getLibraryLinkURL), hasByName = js.Any.fromFunction1(hasByName), hasElements = hasElements.toJsFn, isLibraryLink = js.Any.fromFunction1(isLibraryLink), isLibraryLoaded = js.Any.fromFunction1(isLibraryLoaded), isLibraryReadOnly = js.Any.fromFunction1(isLibraryReadOnly), isModified = isModified.toJsFn, loadLibrary = js.Any.fromFunction1((t0: String) => loadLibrary(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeLibrary = js.Any.fromFunction1((t0: String) => removeLibrary(t0).runNow()), removeModifyListener = js.Any.fromFunction1((t0: XModifyListener) => removeModifyListener(t0).runNow()), renameLibrary = js.Any.fromFunction2((t0: String, t1: String) => (renameLibrary(t0, t1)).runNow()), setLibraryReadOnly = js.Any.fromFunction2((t0: String, t1: Boolean) => (setLibraryReadOnly(t0, t1)).runNow()), setModified = js.Any.fromFunction1((t0: Boolean) => setModified(t0).runNow()), storeLibraries = storeLibraries.toJsFn, storeLibrariesToStorage = js.Any.fromFunction1((t0: XStorage) => storeLibrariesToStorage(t0).runNow()))
    __obj.asInstanceOf[XStorageBasedLibraryContainer]
  }
  
  extension [Self <: XStorageBasedLibraryContainer](x: Self) {
    
    inline def setRootStorage(value: XStorage): Self = StObject.set(x, "RootStorage", value.asInstanceOf[js.Any])
    
    inline def setStoreLibrariesToStorage(value: XStorage => Callback): Self = StObject.set(x, "storeLibrariesToStorage", js.Any.fromFunction1((t0: XStorage) => value(t0).runNow()))
  }
}
