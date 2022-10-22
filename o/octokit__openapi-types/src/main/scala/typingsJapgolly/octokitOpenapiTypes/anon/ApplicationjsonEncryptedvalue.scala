package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonEncryptedvalue extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Encryptedvalue
}
object ApplicationjsonEncryptedvalue {
  
  inline def apply(applicationSlashjson: Encryptedvalue): ApplicationjsonEncryptedvalue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonEncryptedvalue]
  }
  
  extension [Self <: ApplicationjsonEncryptedvalue](x: Self) {
    
    inline def setApplicationSlashjson(value: Encryptedvalue): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
