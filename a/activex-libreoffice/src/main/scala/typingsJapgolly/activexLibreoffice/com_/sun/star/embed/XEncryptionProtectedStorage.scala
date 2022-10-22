package typingsJapgolly.activexLibreoffice.com_.sun.star.embed

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.NamedValue
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface allows to set a password for an object.
  * @since OOo 3.4
  */
trait XEncryptionProtectedStorage
  extends StObject
     with XEncryptionProtectedSource2 {
  
  /** allows to get the encryption algorithms of the object. */
  var EncryptionAlgorithms: SafeArray[NamedValue]
  
  /** allows to get the encryption algorithms of the object. */
  def getEncryptionAlgorithms(): SafeArray[NamedValue]
  
  /**
    * allows to set the encryption algorithms for the object.
    *
    * The algorithms will of course be used only for streams that have been marked to be encrypted. If no stream in the storage is marked to be encrypted,
    * the algorithms-related information may have no effect to the result package.
    *
    * The following values could be part of the provided sequence:
    *
    * **StartKeyGenerationAlgorithm **: specifies the algorithm that was used to generate the EncryptionKey from the original password; in case the contents
    * should be decrypted, the algorithm might be already known by the object; if a different one is set an exception should be thrown to indicate the
    * error; it should take values from {@link com.sun.star.xml} :crypto::DigestID.
    *
    * **EncryptionAlgorithm **: specifies the algorithm that should be used to encrypt/decrypt the contents; in case the contents should be decrypted, the
    * algorithm might be already known by the object; if a different one is set an exception should be thrown to indicate the error; it should take values
    * from {@link com.sun.star.xml} :crypto::CipherID.
    *
    * **ChecksumAlgorithm **: specifies the algorithm that was used to generate the checksum of the encrypted data; in case the contents should be
    * decrypted, the algorithm might be already known by the object; if a different one is set an exception should be thrown to indicate the error; it
    * should take values from {@link com.sun.star.xml} :crypto::DigestID.
    */
  def setEncryptionAlgorithms(aAlgorithms: SeqEquiv[NamedValue]): Unit
}
object XEncryptionProtectedStorage {
  
  inline def apply(
    EncryptionAlgorithms: SafeArray[NamedValue],
    acquire: Callback,
    getEncryptionAlgorithms: CallbackTo[SafeArray[NamedValue]],
    hasEncryptionData: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    removeEncryption: Callback,
    setEncryptionAlgorithms: SeqEquiv[NamedValue] => Callback,
    setEncryptionData: SeqEquiv[NamedValue] => Callback,
    setEncryptionPassword: String => Callback
  ): XEncryptionProtectedStorage = {
    val __obj = js.Dynamic.literal(EncryptionAlgorithms = EncryptionAlgorithms.asInstanceOf[js.Any], acquire = acquire.toJsFn, getEncryptionAlgorithms = getEncryptionAlgorithms.toJsFn, hasEncryptionData = hasEncryptionData.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEncryption = removeEncryption.toJsFn, setEncryptionAlgorithms = js.Any.fromFunction1((t0: SeqEquiv[NamedValue]) => setEncryptionAlgorithms(t0).runNow()), setEncryptionData = js.Any.fromFunction1((t0: SeqEquiv[NamedValue]) => setEncryptionData(t0).runNow()), setEncryptionPassword = js.Any.fromFunction1((t0: String) => setEncryptionPassword(t0).runNow()))
    __obj.asInstanceOf[XEncryptionProtectedStorage]
  }
  
  extension [Self <: XEncryptionProtectedStorage](x: Self) {
    
    inline def setEncryptionAlgorithms(value: SafeArray[NamedValue]): Self = StObject.set(x, "EncryptionAlgorithms", value.asInstanceOf[js.Any])
    
    inline def setGetEncryptionAlgorithms(value: CallbackTo[SafeArray[NamedValue]]): Self = StObject.set(x, "getEncryptionAlgorithms", value.toJsFn)
    
    inline def setSetEncryptionAlgorithms(value: SeqEquiv[NamedValue] => Callback): Self = StObject.set(x, "setEncryptionAlgorithms", js.Any.fromFunction1((t0: SeqEquiv[NamedValue]) => value(t0).runNow()))
  }
}
