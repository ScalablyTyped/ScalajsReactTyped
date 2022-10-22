package typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Core

import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains data that can be retrieved from encrypted and authenticated data. Authenticated encryption algorithms are opened by using the SymmetricKeyAlgorithmProvider class. */
trait EncryptedAndAuthenticatedData extends StObject {
  
  /** Gets the authentication tag. */
  var authenticationTag: IBuffer
  
  /** Gets the encrypted data. */
  var encryptedData: IBuffer
}
object EncryptedAndAuthenticatedData {
  
  inline def apply(authenticationTag: IBuffer, encryptedData: IBuffer): EncryptedAndAuthenticatedData = {
    val __obj = js.Dynamic.literal(authenticationTag = authenticationTag.asInstanceOf[js.Any], encryptedData = encryptedData.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptedAndAuthenticatedData]
  }
  
  extension [Self <: EncryptedAndAuthenticatedData](x: Self) {
    
    inline def setAuthenticationTag(value: IBuffer): Self = StObject.set(x, "authenticationTag", value.asInstanceOf[js.Any])
    
    inline def setEncryptedData(value: IBuffer): Self = StObject.set(x, "encryptedData", value.asInstanceOf[js.Any])
  }
}
