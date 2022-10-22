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

/** Extension of {@link XLibraryContainer2} . */
trait XLibraryContainer3
  extends StObject
     with XLibraryContainer2 {
  
  /**
    * returns the location of the library link target.
    *
    * The returned URL is literally the same as the one provided in {@link XLibraryContainer.createLibraryLink()} . Otherwise the behavior is the same as
    * {@link XLibraryContainer2.getLibraryLinkURL()}
    */
  def getOriginalLibraryLinkURL(Name: String): String
}
object XLibraryContainer3 {
  
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
    getOriginalLibraryLinkURL: String => String,
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
  ): XLibraryContainer3 = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = acquire.toJsFn, createLibrary = js.Any.fromFunction1(createLibrary), createLibraryLink = js.Any.fromFunction3(createLibraryLink), getByName = js.Any.fromFunction1(getByName), getElementNames = getElementNames.toJsFn, getElementType = getElementType.toJsFn, getLibraryLinkURL = js.Any.fromFunction1(getLibraryLinkURL), getOriginalLibraryLinkURL = js.Any.fromFunction1(getOriginalLibraryLinkURL), hasByName = js.Any.fromFunction1(hasByName), hasElements = hasElements.toJsFn, isLibraryLink = js.Any.fromFunction1(isLibraryLink), isLibraryLoaded = js.Any.fromFunction1(isLibraryLoaded), isLibraryReadOnly = js.Any.fromFunction1(isLibraryReadOnly), loadLibrary = js.Any.fromFunction1((t0: String) => loadLibrary(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeLibrary = js.Any.fromFunction1((t0: String) => removeLibrary(t0).runNow()), renameLibrary = js.Any.fromFunction2((t0: String, t1: String) => (renameLibrary(t0, t1)).runNow()), setLibraryReadOnly = js.Any.fromFunction2((t0: String, t1: Boolean) => (setLibraryReadOnly(t0, t1)).runNow()))
    __obj.asInstanceOf[XLibraryContainer3]
  }
  
  extension [Self <: XLibraryContainer3](x: Self) {
    
    inline def setGetOriginalLibraryLinkURL(value: String => String): Self = StObject.set(x, "getOriginalLibraryLinkURL", js.Any.fromFunction1(value))
  }
}
