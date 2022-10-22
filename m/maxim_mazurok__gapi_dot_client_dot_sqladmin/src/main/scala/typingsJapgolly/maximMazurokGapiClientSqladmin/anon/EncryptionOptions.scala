package typingsJapgolly.maximMazurokGapiClientSqladmin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptionOptions extends StObject {
  
  var encryptionOptions: js.UndefOr[CertPath] = js.undefined
}
object EncryptionOptions {
  
  inline def apply(): EncryptionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptionOptions]
  }
  
  extension [Self <: EncryptionOptions](x: Self) {
    
    inline def setEncryptionOptions(value: CertPath): Self = StObject.set(x, "encryptionOptions", value.asInstanceOf[js.Any])
    
    inline def setEncryptionOptionsUndefined: Self = StObject.set(x, "encryptionOptions", js.undefined)
  }
}
