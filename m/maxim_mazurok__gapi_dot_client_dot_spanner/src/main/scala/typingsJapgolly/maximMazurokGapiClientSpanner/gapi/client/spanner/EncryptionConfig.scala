package typingsJapgolly.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptionConfig extends StObject {
  
  /** The Cloud KMS key to be used for encrypting and decrypting the database. Values are of the form `projects//locations//keyRings//cryptoKeys/`. */
  var kmsKeyName: js.UndefOr[String] = js.undefined
}
object EncryptionConfig {
  
  inline def apply(): EncryptionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptionConfig]
  }
  
  extension [Self <: EncryptionConfig](x: Self) {
    
    inline def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
  }
}
