package typingsJapgolly.activexLibreoffice.com_.sun.star.script

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameContainer
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XModifiable
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XModifyListener
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes a container of script libraries which is persistent.
  *
  * The type of persistence of the container elements is not defined here, but in derived interfaces or services using `XPersistentLibraryContainer` .
  *
  * The actual libraries are stored in some object - a sub folder, or a sub storage, for example - below the root location.
  * @since OOo 2.3
  */
trait XPersistentLibraryContainer
  extends StObject
     with XModifiable
     with XLibraryContainer2 {
  
  /**
    * denotes the name of the sub location where the container elements are actually stored.
    * @see RootLocation
    */
  var ContainerLocationName: String
  
  /**
    * denotes the root location associated with the container.
    *
    * The type of this location - it might be a folder in a file system, a storage, or anything else - is not specified here, but in derived interfaces or
    * services implementing `XPersistentLibraryContainer` .
    *
    * All operations of the library container take place in a location below the root location, the so-called container location, whose name is exposed as
    * {@link ContainerLocationName} .
    * @see ContainerLocationName
    */
  var RootLocation: Any
  
  /**
    * stores the libraries to the current location.
    * @see RootLocation
    * @see ContainerLocationName
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs during storing.
    */
  def storeLibraries(): Unit
}
object XPersistentLibraryContainer {
  
  inline def apply(
    ContainerLocationName: String,
    ElementNames: SafeArray[String],
    ElementType: `type`,
    RootLocation: Any,
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
    storeLibraries: Callback
  ): XPersistentLibraryContainer = {
    val __obj = js.Dynamic.literal(ContainerLocationName = ContainerLocationName.asInstanceOf[js.Any], ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], RootLocation = RootLocation.asInstanceOf[js.Any], acquire = acquire.toJsFn, addModifyListener = js.Any.fromFunction1((t0: XModifyListener) => addModifyListener(t0).runNow()), createLibrary = js.Any.fromFunction1(createLibrary), createLibraryLink = js.Any.fromFunction3(createLibraryLink), getByName = js.Any.fromFunction1(getByName), getElementNames = getElementNames.toJsFn, getElementType = getElementType.toJsFn, getLibraryLinkURL = js.Any.fromFunction1(getLibraryLinkURL), hasByName = js.Any.fromFunction1(hasByName), hasElements = hasElements.toJsFn, isLibraryLink = js.Any.fromFunction1(isLibraryLink), isLibraryLoaded = js.Any.fromFunction1(isLibraryLoaded), isLibraryReadOnly = js.Any.fromFunction1(isLibraryReadOnly), isModified = isModified.toJsFn, loadLibrary = js.Any.fromFunction1((t0: String) => loadLibrary(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeLibrary = js.Any.fromFunction1((t0: String) => removeLibrary(t0).runNow()), removeModifyListener = js.Any.fromFunction1((t0: XModifyListener) => removeModifyListener(t0).runNow()), renameLibrary = js.Any.fromFunction2((t0: String, t1: String) => (renameLibrary(t0, t1)).runNow()), setLibraryReadOnly = js.Any.fromFunction2((t0: String, t1: Boolean) => (setLibraryReadOnly(t0, t1)).runNow()), setModified = js.Any.fromFunction1((t0: Boolean) => setModified(t0).runNow()), storeLibraries = storeLibraries.toJsFn)
    __obj.asInstanceOf[XPersistentLibraryContainer]
  }
  
  extension [Self <: XPersistentLibraryContainer](x: Self) {
    
    inline def setContainerLocationName(value: String): Self = StObject.set(x, "ContainerLocationName", value.asInstanceOf[js.Any])
    
    inline def setRootLocation(value: Any): Self = StObject.set(x, "RootLocation", value.asInstanceOf[js.Any])
    
    inline def setStoreLibraries(value: Callback): Self = StObject.set(x, "storeLibraries", value.toJsFn)
  }
}
