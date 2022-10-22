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

/** Provides access to a library system. */
trait XLibraryContainer
  extends StObject
     with XNameAccess {
  
  /** Creates a new library */
  def createLibrary(Name: String): XNameContainer
  
  /**
    * Creates a link to an "external" library that then can be accessed using this library manager. The format of the StorageURL is a matter of the
    * implementation. If the read only flag is set, the linked library cannot be modified. In this case, the returned interface really is only an
    * XNameAccess. If ReadOnly is false (and the referenced storage allows write access) the returned interface also can be a {@link
    * com.sun.star.container.XNameContainer} .
    */
  def createLibraryLink(Name: String, StorageURL: String, ReadOnly: Boolean): XNameAccess
  
  /** returns true if the accessed library is already loaded from the storage, otherwise false. */
  def isLibraryLoaded(Name: String): Boolean
  
  /** Causes the accessed library to be loaded from its storage if it hasn't already been loaded. */
  def loadLibrary(Name: String): Unit
  
  /** removes the library item with the specified name. If the accessed library item is a link only the link is removed, not the target library. */
  def removeLibrary(Name: String): Unit
}
object XLibraryContainer {
  
  inline def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: Callback,
    createLibrary: String => XNameContainer,
    createLibraryLink: (String, String, Boolean) => XNameAccess,
    getByName: String => Any,
    getElementNames: CallbackTo[SafeArray[String]],
    getElementType: CallbackTo[`type`],
    hasByName: String => Boolean,
    hasElements: CallbackTo[Boolean],
    isLibraryLoaded: String => Boolean,
    loadLibrary: String => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeLibrary: String => Callback
  ): XLibraryContainer = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = acquire.toJsFn, createLibrary = js.Any.fromFunction1(createLibrary), createLibraryLink = js.Any.fromFunction3(createLibraryLink), getByName = js.Any.fromFunction1(getByName), getElementNames = getElementNames.toJsFn, getElementType = getElementType.toJsFn, hasByName = js.Any.fromFunction1(hasByName), hasElements = hasElements.toJsFn, isLibraryLoaded = js.Any.fromFunction1(isLibraryLoaded), loadLibrary = js.Any.fromFunction1((t0: String) => loadLibrary(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeLibrary = js.Any.fromFunction1((t0: String) => removeLibrary(t0).runNow()))
    __obj.asInstanceOf[XLibraryContainer]
  }
  
  extension [Self <: XLibraryContainer](x: Self) {
    
    inline def setCreateLibrary(value: String => XNameContainer): Self = StObject.set(x, "createLibrary", js.Any.fromFunction1(value))
    
    inline def setCreateLibraryLink(value: (String, String, Boolean) => XNameAccess): Self = StObject.set(x, "createLibraryLink", js.Any.fromFunction3(value))
    
    inline def setIsLibraryLoaded(value: String => Boolean): Self = StObject.set(x, "isLibraryLoaded", js.Any.fromFunction1(value))
    
    inline def setLoadLibrary(value: String => Callback): Self = StObject.set(x, "loadLibrary", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setRemoveLibrary(value: String => Callback): Self = StObject.set(x, "removeLibrary", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
