package typingsJapgolly.activexLibreoffice.com_.sun.star.embed

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.NamedValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XStream
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This interface extends the base {@link XStorage} interface. */
trait XStorage2
  extends StObject
     with XStorage {
  
  /**
    * allows to get readonly copy of a child encrypted stream with encryption data.
    *
    * If storage does not allow any encryption this method will always throw {@link com.sun.star.packages.NoEncryptionException} .
    *
    * The stream is open in readonly mode so the {@link com.sun.star.io.XStream.getOutputStream()} method will return an empty reference.
    *
    * This method allows to specify encryption data for the child stream explicitly.
    * @param sStreamName the name of the substream that should be copied
    * @param aEncryptionData this parameter allowes to specify an encryption data for the stream, the encryption data must be correct, otherwise an exception
    * @throws com::sun::star::embed::InvalidStorageException this storage is in invalid state for any reason
    * @throws com::sun::star::lang::IllegalArgumentException one of provided arguments is illegal
    * @throws com::sun::star::packages::NoEncryptionException the stream is not encrypted
    * @throws com::sun::star::packages::WrongPasswordException the provided encryption data is wrong
    * @throws com::sun::star::io::IOException in case of io errors during stream opening
    * @throws com::sun::star::embed::StorageWrappedTargetException wraps other exceptions
    */
  def cloneEncryptedStream(sStreamName: String, aEncryptionData: SeqEquiv[NamedValue]): XStream
  
  /**
    * allows to get access to a child encrypted stream with EncryptionData.
    *
    * If storage does not allow any encryption this method will always throw {@link com.sun.star.packages.NoEncryptionException} .
    *
    * In case the stream is open in readonly mode the {@link com.sun.star.io.XStream.getOutputStream()} method will return an empty reference.
    * @param sStreamName the name of the substream that should be open
    * @param nOpenMode a mode the stream should be open in, can be a combination of {@link ElementModes} values
    * @param aEncryptionData this parameter allowes to specify an encryption data to decrypt the stream, the encryption data must be correct, otherwise an exc
    * @throws com::sun::star::embed::InvalidStorageException this storage is in invalid state for any reason
    * @throws com::sun::star::lang::IllegalArgumentException one of provided arguments is illegal
    * @throws com::sun::star::packages::NoEncryptionException the stream is not encrypted
    * @throws com::sun::star::packages::WrongPasswordException the provided encryption data is wrong
    * @throws com::sun::star::io::IOException in case of io errors during stream opening
    * @throws com::sun::star::embed::StorageWrappedTargetException wraps other exceptions
    */
  def openEncryptedStream(sStreamName: String, nOpenMode: Double, aEncryptionData: SeqEquiv[NamedValue]): XStream
}
object XStorage2 {
  
  inline def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    cloneEncryptedStream: (String, SeqEquiv[NamedValue]) => XStream,
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
    hasByName: String => Boolean,
    hasElements: CallbackTo[Boolean],
    isStorageElement: String => Boolean,
    isStreamElement: String => Boolean,
    moveElementTo: (String, XStorage, String) => Callback,
    openEncryptedStream: (String, Double, SeqEquiv[NamedValue]) => XStream,
    openEncryptedStreamElement: (String, Double, String) => XStream,
    openStorageElement: (String, Double) => XStorage,
    openStreamElement: (String, Double) => XStream,
    queryInterface: `type` => Any,
    release: Callback,
    removeElement: String => Callback,
    removeEventListener: XEventListener => Callback,
    renameElement: (String, String) => Callback
  ): XStorage2 = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), cloneEncryptedStream = js.Any.fromFunction2(cloneEncryptedStream), cloneEncryptedStreamElement = js.Any.fromFunction2(cloneEncryptedStreamElement), cloneStreamElement = js.Any.fromFunction1(cloneStreamElement), copyElementTo = js.Any.fromFunction3((t0: String, t1: XStorage, t2: String) => (copyElementTo(t0, t1, t2)).runNow()), copyLastCommitTo = js.Any.fromFunction1((t0: XStorage) => copyLastCommitTo(t0).runNow()), copyStorageElementLastCommitTo = js.Any.fromFunction2((t0: String, t1: XStorage) => (copyStorageElementLastCommitTo(t0, t1)).runNow()), copyToStorage = js.Any.fromFunction1((t0: XStorage) => copyToStorage(t0).runNow()), dispose = dispose.toJsFn, getByName = js.Any.fromFunction1(getByName), getElementNames = getElementNames.toJsFn, getElementType = getElementType.toJsFn, hasByName = js.Any.fromFunction1(hasByName), hasElements = hasElements.toJsFn, isStorageElement = js.Any.fromFunction1(isStorageElement), isStreamElement = js.Any.fromFunction1(isStreamElement), moveElementTo = js.Any.fromFunction3((t0: String, t1: XStorage, t2: String) => (moveElementTo(t0, t1, t2)).runNow()), openEncryptedStream = js.Any.fromFunction3(openEncryptedStream), openEncryptedStreamElement = js.Any.fromFunction3(openEncryptedStreamElement), openStorageElement = js.Any.fromFunction2(openStorageElement), openStreamElement = js.Any.fromFunction2(openStreamElement), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeElement = js.Any.fromFunction1((t0: String) => removeElement(t0).runNow()), removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), renameElement = js.Any.fromFunction2((t0: String, t1: String) => (renameElement(t0, t1)).runNow()))
    __obj.asInstanceOf[XStorage2]
  }
  
  extension [Self <: XStorage2](x: Self) {
    
    inline def setCloneEncryptedStream(value: (String, SeqEquiv[NamedValue]) => XStream): Self = StObject.set(x, "cloneEncryptedStream", js.Any.fromFunction2(value))
    
    inline def setOpenEncryptedStream(value: (String, Double, SeqEquiv[NamedValue]) => XStream): Self = StObject.set(x, "openEncryptedStream", js.Any.fromFunction3(value))
  }
}
