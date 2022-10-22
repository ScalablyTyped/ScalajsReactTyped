package typingsJapgolly.activexLibreoffice.com_.sun.star.embed

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XStream
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a service that allows to get access to a package using storage hierarchy.
  *
  * A root storage should be retrieved by using {@link StorageFactory} service. Substorages are created through {@link XStorage} interface of a parent
  * storage.
  */
trait Storage
  extends StObject
     with BaseStorage
     with XTransactedObject
     with XTransactionBroadcaster
     with XEncryptionProtectedSource {
  
  /**
    * allows to detect if the storage contains encrypted entries.
    *
    * In case it is set to `TRUE` the storage itself and/or a tree of substorages contain encrypted streams. Usually in case this property is supported the
    * implementation supports {@link XEncryptionProtectedSource} interface.
    */
  var HasEncryptedEntries: Boolean
  
  /**
    * allows to detect if the storage contains non-encrypted entries.
    *
    * In case it is set to `TRUE` the storage itself and/or a tree of substorages contains non-encrypted streams. Usually in case this property is supported
    * the implementation supports {@link XEncryptionProtectedSource} interface.
    */
  var HasNonEncryptedEntries: Boolean
  
  /** allows to detect whether the storage is a root one. */
  var IsRoot: Boolean
  
  /** allows to get and set the media type of the storage. */
  var MediaType: String
  
  /**
    * allows to detect whether mediatype is detected by using fallback approach.
    *
    * Can be set to true if the mediatype can not be detected in standard way, but there is a fallback solution allows to do it.
    *
    * Usually means that the document validity is questionable, although the package itself is not corrupted. The decision about document validity in this
    * case is in application hands. It is up to user of the storage to decide whether they accept the fallback approach for an implementation of this
    * service, outputs a warning or an error.
    */
  var MediaTypeFallbackIsUsed: Boolean
  
  /** allows to detect whether storage is open in "repair package" mode or not. */
  var RepairPackage: Boolean
  
  /** allows to get and set the version of the format related to the MediaType. */
  var Version: String
}
object Storage {
  
  inline def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    HasEncryptedEntries: Boolean,
    HasNonEncryptedEntries: Boolean,
    IsRoot: Boolean,
    MediaType: String,
    MediaTypeFallbackIsUsed: Boolean,
    OpenMode: Double,
    PropertySetInfo: XPropertySetInfo,
    RepairPackage: Boolean,
    URL: String,
    Version: String,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addTransactionListener: XTransactionListener => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    cloneEncryptedStreamElement: (String, String) => XStream,
    cloneStreamElement: String => XStream,
    commit: Callback,
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
    removeEncryption: Callback,
    removeEventListener: XEventListener => Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeTransactionListener: XTransactionListener => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    renameElement: (String, String) => Callback,
    revert: Callback,
    setEncryptionPassword: String => Callback,
    setPropertyValue: (String, Any) => Callback
  ): Storage = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], HasEncryptedEntries = HasEncryptedEntries.asInstanceOf[js.Any], HasNonEncryptedEntries = HasNonEncryptedEntries.asInstanceOf[js.Any], IsRoot = IsRoot.asInstanceOf[js.Any], MediaType = MediaType.asInstanceOf[js.Any], MediaTypeFallbackIsUsed = MediaTypeFallbackIsUsed.asInstanceOf[js.Any], OpenMode = OpenMode.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RepairPackage = RepairPackage.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addTransactionListener = js.Any.fromFunction1((t0: XTransactionListener) => addTransactionListener(t0).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), cloneEncryptedStreamElement = js.Any.fromFunction2(cloneEncryptedStreamElement), cloneStreamElement = js.Any.fromFunction1(cloneStreamElement), commit = commit.toJsFn, copyElementTo = js.Any.fromFunction3((t0: String, t1: XStorage, t2: String) => (copyElementTo(t0, t1, t2)).runNow()), copyLastCommitTo = js.Any.fromFunction1((t0: XStorage) => copyLastCommitTo(t0).runNow()), copyStorageElementLastCommitTo = js.Any.fromFunction2((t0: String, t1: XStorage) => (copyStorageElementLastCommitTo(t0, t1)).runNow()), copyToStorage = js.Any.fromFunction1((t0: XStorage) => copyToStorage(t0).runNow()), dispose = dispose.toJsFn, getByName = js.Any.fromFunction1(getByName), getElementNames = getElementNames.toJsFn, getElementType = getElementType.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), hasByName = js.Any.fromFunction1(hasByName), hasElements = hasElements.toJsFn, isStorageElement = js.Any.fromFunction1(isStorageElement), isStreamElement = js.Any.fromFunction1(isStreamElement), moveElementTo = js.Any.fromFunction3((t0: String, t1: XStorage, t2: String) => (moveElementTo(t0, t1, t2)).runNow()), openEncryptedStreamElement = js.Any.fromFunction3(openEncryptedStreamElement), openStorageElement = js.Any.fromFunction2(openStorageElement), openStreamElement = js.Any.fromFunction2(openStreamElement), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeElement = js.Any.fromFunction1((t0: String) => removeElement(t0).runNow()), removeEncryption = removeEncryption.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeTransactionListener = js.Any.fromFunction1((t0: XTransactionListener) => removeTransactionListener(t0).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), renameElement = js.Any.fromFunction2((t0: String, t1: String) => (renameElement(t0, t1)).runNow()), revert = revert.toJsFn, setEncryptionPassword = js.Any.fromFunction1((t0: String) => setEncryptionPassword(t0).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()))
    __obj.asInstanceOf[Storage]
  }
  
  extension [Self <: Storage](x: Self) {
    
    inline def setHasEncryptedEntries(value: Boolean): Self = StObject.set(x, "HasEncryptedEntries", value.asInstanceOf[js.Any])
    
    inline def setHasNonEncryptedEntries(value: Boolean): Self = StObject.set(x, "HasNonEncryptedEntries", value.asInstanceOf[js.Any])
    
    inline def setIsRoot(value: Boolean): Self = StObject.set(x, "IsRoot", value.asInstanceOf[js.Any])
    
    inline def setMediaType(value: String): Self = StObject.set(x, "MediaType", value.asInstanceOf[js.Any])
    
    inline def setMediaTypeFallbackIsUsed(value: Boolean): Self = StObject.set(x, "MediaTypeFallbackIsUsed", value.asInstanceOf[js.Any])
    
    inline def setRepairPackage(value: Boolean): Self = StObject.set(x, "RepairPackage", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
  }
}
