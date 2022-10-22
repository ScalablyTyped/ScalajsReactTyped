package typingsJapgolly.googleCloudStorage.buildSrcFileMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyDocument extends StObject {
  
  var base64: String
  
  var signature: String
  
  var string: String
}
object PolicyDocument {
  
  inline def apply(base64: String, signature: String, string: String): PolicyDocument = {
    val __obj = js.Dynamic.literal(base64 = base64.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyDocument]
  }
  
  extension [Self <: PolicyDocument](x: Self) {
    
    inline def setBase64(value: String): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
  }
}
