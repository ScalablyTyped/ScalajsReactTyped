package typingsJapgolly.pkijs.mod

import typingsJapgolly.asn1js.mod.BaseBlockJson
import typingsJapgolly.asn1js.mod.LocalBaseBlockJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecretBagJson
  extends StObject
     with _BagTypeJson {
  
  var secretTypeId: String
  
  var secretValue: BaseBlockJson[LocalBaseBlockJson]
}
object SecretBagJson {
  
  inline def apply(secretTypeId: String, secretValue: BaseBlockJson[LocalBaseBlockJson]): SecretBagJson = {
    val __obj = js.Dynamic.literal(secretTypeId = secretTypeId.asInstanceOf[js.Any], secretValue = secretValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecretBagJson]
  }
  
  extension [Self <: SecretBagJson](x: Self) {
    
    inline def setSecretTypeId(value: String): Self = StObject.set(x, "secretTypeId", value.asInstanceOf[js.Any])
    
    inline def setSecretValue(value: BaseBlockJson[LocalBaseBlockJson]): Self = StObject.set(x, "secretValue", value.asInstanceOf[js.Any])
  }
}
