package typingsJapgolly.activexLibreoffice.com_.sun.star.script

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameContainer
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Extension of {@link XLibraryContainer} to provide additional information about the libraries contained in a library container */
trait XLibraryContainer2
  extends StObject
     with XLibraryContainer {
  
  /**
    * returns the location of the library link target. Should return the same URL that was passed to createLibraryLink in the StorageURL parameter.
    *
    * If the accessed library item exists but isn't a link, a IllegalArgumentException is thrown
    */
  def getLibraryLinkURL(Name: String): String
  
  /** returns true if the accessed library item is a link, e.g., created by createLibraryLink, otherwise false. */
  def isLibraryLink(Name: String): Boolean
  
  /**
    * returns true if the accessed library item (library or library link) is read only. A library can be read only because it was set to read only using the
    * methods provided by this interface or because of other reasons depending on the implementation (e.g., file system write protection)
    */
  def isLibraryReadOnly(Name: String): Boolean
  
  /**
    * renames the library item with the specified name. If the accessed library item is a link only the link is renamed, not the target library. If a
    * library with the new name exists already a {@link com.sun.star.container.ElementExistException} is thrown.
    */
  def renameLibrary(Name: String, NewName: String): Unit
  
  /** Sets the accessed library item (library or library link) to read only according to the flag bReadOnly (true means read only) */
  def setLibraryReadOnly(Name: String, bReadOnly: Boolean): Unit
}
object XLibraryContainer2 {
  
  inline def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: Callback,
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
    loadLibrary: String => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeLibrary: String => Callback,
    renameLibrary: (String, String) => Callback,
    setLibraryReadOnly: (String, Boolean) => Callback
  ): XLibraryContainer2 = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = acquire.toJsFn, createLibrary = js.Any.fromFunction1(createLibrary), createLibraryLink = js.Any.fromFunction3(createLibraryLink), getByName = js.Any.fromFunction1(getByName), getElementNames = getElementNames.toJsFn, getElementType = getElementType.toJsFn, getLibraryLinkURL = js.Any.fromFunction1(getLibraryLinkURL), hasByName = js.Any.fromFunction1(hasByName), hasElements = hasElements.toJsFn, isLibraryLink = js.Any.fromFunction1(isLibraryLink), isLibraryLoaded = js.Any.fromFunction1(isLibraryLoaded), isLibraryReadOnly = js.Any.fromFunction1(isLibraryReadOnly), loadLibrary = js.Any.fromFunction1((t0: String) => loadLibrary(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeLibrary = js.Any.fromFunction1((t0: String) => removeLibrary(t0).runNow()), renameLibrary = js.Any.fromFunction2((t0: String, t1: String) => (renameLibrary(t0, t1)).runNow()), setLibraryReadOnly = js.Any.fromFunction2((t0: String, t1: Boolean) => (setLibraryReadOnly(t0, t1)).runNow()))
    __obj.asInstanceOf[XLibraryContainer2]
  }
  
  extension [Self <: XLibraryContainer2](x: Self) {
    
    inline def setGetLibraryLinkURL(value: String => String): Self = StObject.set(x, "getLibraryLinkURL", js.Any.fromFunction1(value))
    
    inline def setIsLibraryLink(value: String => Boolean): Self = StObject.set(x, "isLibraryLink", js.Any.fromFunction1(value))
    
    inline def setIsLibraryReadOnly(value: String => Boolean): Self = StObject.set(x, "isLibraryReadOnly", js.Any.fromFunction1(value))
    
    inline def setRenameLibrary(value: (String, String) => Callback): Self = StObject.set(x, "renameLibrary", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setSetLibraryReadOnly(value: (String, Boolean) => Callback): Self = StObject.set(x, "setLibraryReadOnly", js.Any.fromFunction2((t0: String, t1: Boolean) => (value(t0, t1)).runNow()))
  }
}
