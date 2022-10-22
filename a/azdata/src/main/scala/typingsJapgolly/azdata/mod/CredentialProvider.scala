package typingsJapgolly.azdata.mod

import typingsJapgolly.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CredentialProvider extends StObject {
  
  def deleteCredential(credentialId: String): Thenable[Boolean]
  
  var handle: Double
  
  def readCredential(credentialId: String): Thenable[Credential]
  
  def saveCredential(credentialId: String, password: String): Thenable[Boolean]
}
object CredentialProvider {
  
  inline def apply(
    deleteCredential: String => Thenable[Boolean],
    handle: Double,
    readCredential: String => Thenable[Credential],
    saveCredential: (String, String) => Thenable[Boolean]
  ): CredentialProvider = {
    val __obj = js.Dynamic.literal(deleteCredential = js.Any.fromFunction1(deleteCredential), handle = handle.asInstanceOf[js.Any], readCredential = js.Any.fromFunction1(readCredential), saveCredential = js.Any.fromFunction2(saveCredential))
    __obj.asInstanceOf[CredentialProvider]
  }
  
  extension [Self <: CredentialProvider](x: Self) {
    
    inline def setDeleteCredential(value: String => Thenable[Boolean]): Self = StObject.set(x, "deleteCredential", js.Any.fromFunction1(value))
    
    inline def setHandle(value: Double): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    inline def setReadCredential(value: String => Thenable[Credential]): Self = StObject.set(x, "readCredential", js.Any.fromFunction1(value))
    
    inline def setSaveCredential(value: (String, String) => Thenable[Boolean]): Self = StObject.set(x, "saveCredential", js.Any.fromFunction2(value))
  }
}
