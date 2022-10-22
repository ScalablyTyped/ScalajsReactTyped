package typingsJapgolly.activexLibreoffice.com_.sun.star.embed

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XStream
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This is a service that allows to get access to a storage hierarchy. */
trait BaseStorage
  extends StObject
     with XStorage
     with XPropertySet {
  
  /**
    * allows to get the mode the storage is opened in.
    *
    * Can be a combination of values from {@link ElementModes} .
    */
  var OpenMode: Double
  
  /** allows to retrieve URL the storage is based on. */
  var URL: String
}
object BaseStorage {
  
  inline def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    OpenMode: Double,
    PropertySetInfo: XPropertySetInfo,
    URL: String,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    cloneEncryptedStreamElement: (String, String) => XStream,
    cloneStreamElement: String => XStream,
    copyElementTo: (String, XStorage, String) => Callback,
    copyLastCommitTo: XStorage => Callback,
    copyStorageElementLastCommitTo: (String, XStorage) => Callback,
    copyToStorage: XStorage => Callback,
    dispose: Callback,
    getByName: String => Any,
    getElementNames: CallbackTo[SafeArray[String]],
    getElementType: CallbackTo[`type`],
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    hasByName: String => Boolean,
    hasElements: CallbackTo[Boolean],
    isStorageElement: String => Boolean,
    isStreamElement: String => Boolean,
    moveElementTo: (String, XStorage, String) => Callback,
    openEncryptedStreamElement: (String, Double, String) => XStream,
    openStorageElement: (String, Double) => XStorage,
    openStreamElement: (String, Double) => XStream,
    queryInterface: `type` => Any,
    release: Callback,
    removeElement: String => Callback,
    removeEventListener: XEventListener => Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    renameElement: (String, String) => Callback,
    setPropertyValue: (String, Any) => Callback
  ): BaseStorage = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], OpenMode = OpenMode.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), cloneEncryptedStreamElement = js.Any.fromFunction2(cloneEncryptedStreamElement), cloneStreamElement = js.Any.fromFunction1(cloneStreamElement), copyElementTo = js.Any.fromFunction3((t0: String, t1: XStorage, t2: String) => (copyElementTo(t0, t1, t2)).runNow()), copyLastCommitTo = js.Any.fromFunction1((t0: XStorage) => copyLastCommitTo(t0).runNow()), copyStorageElementLastCommitTo = js.Any.fromFunction2((t0: String, t1: XStorage) => (copyStorageElementLastCommitTo(t0, t1)).runNow()), copyToStorage = js.Any.fromFunction1((t0: XStorage) => copyToStorage(t0).runNow()), dispose = dispose.toJsFn, getByName = js.Any.fromFunction1(getByName), getElementNames = getElementNames.toJsFn, getElementType = getElementType.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), hasByName = js.Any.fromFunction1(hasByName), hasElements = hasElements.toJsFn, isStorageElement = js.Any.fromFunction1(isStorageElement), isStreamElement = js.Any.fromFunction1(isStreamElement), moveElementTo = js.Any.fromFunction3((t0: String, t1: XStorage, t2: String) => (moveElementTo(t0, t1, t2)).runNow()), openEncryptedStreamElement = js.Any.fromFunction3(openEncryptedStreamElement), openStorageElement = js.Any.fromFunction2(openStorageElement), openStreamElement = js.Any.fromFunction2(openStreamElement), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeElement = js.Any.fromFunction1((t0: String) => removeElement(t0).runNow()), removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), renameElement = js.Any.fromFunction2((t0: String, t1: String) => (renameElement(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()))
    __obj.asInstanceOf[BaseStorage]
  }
  
  extension [Self <: BaseStorage](x: Self) {
    
    inline def setOpenMode(value: Double): Self = StObject.set(x, "OpenMode", value.asInstanceOf[js.Any])
    
    inline def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
  }
}
