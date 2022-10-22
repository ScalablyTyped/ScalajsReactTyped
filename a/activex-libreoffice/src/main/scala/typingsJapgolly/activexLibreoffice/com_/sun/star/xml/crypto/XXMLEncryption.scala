package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.crypto

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of XML encryption
  *
  * This interface represents a XML encryptor or decryptor.
  *
  * The encryptor or decryptor concrete a key by retrieve security context and encryption template.
  *
  * In some cases, the encryptor or decryptor can determine and locate the EncryptedKey from the encryption template by dereference the RetrievalMethod
  * inside EncryptedData.
  *
  * In some cases, the EncryptedKey need to be clearly pointed out by the encryption template.
  */
trait XXMLEncryption
  extends StObject
     with XInterface {
  
  /** Perform decryption in the environment of encryption template and context. */
  def decrypt(aTemplate: XXMLEncryptionTemplate, aContext: XXMLSecurityContext): XXMLEncryptionTemplate
  
  /** Perform encryption in the environment of encryption template and context. */
  def encrypt(aTemplate: XXMLEncryptionTemplate, aEnvironment: XSecurityEnvironment): XXMLEncryptionTemplate
}
object XXMLEncryption {
  
  inline def apply(
    acquire: Callback,
    decrypt: (XXMLEncryptionTemplate, XXMLSecurityContext) => XXMLEncryptionTemplate,
    encrypt: (XXMLEncryptionTemplate, XSecurityEnvironment) => XXMLEncryptionTemplate,
    queryInterface: `type` => Any,
    release: Callback
  ): XXMLEncryption = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, decrypt = js.Any.fromFunction2(decrypt), encrypt = js.Any.fromFunction2(encrypt), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XXMLEncryption]
  }
  
  extension [Self <: XXMLEncryption](x: Self) {
    
    inline def setDecrypt(value: (XXMLEncryptionTemplate, XXMLSecurityContext) => XXMLEncryptionTemplate): Self = StObject.set(x, "decrypt", js.Any.fromFunction2(value))
    
    inline def setEncrypt(value: (XXMLEncryptionTemplate, XSecurityEnvironment) => XXMLEncryptionTemplate): Self = StObject.set(x, "encrypt", js.Any.fromFunction2(value))
  }
}
