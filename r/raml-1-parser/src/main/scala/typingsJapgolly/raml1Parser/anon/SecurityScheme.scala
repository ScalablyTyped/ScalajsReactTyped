package typingsJapgolly.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityScheme extends StObject {
  
  var securityScheme: NameString
  
  var securitySchemeName: NameString
}
object SecurityScheme {
  
  inline def apply(securityScheme: NameString, securitySchemeName: NameString): SecurityScheme = {
    val __obj = js.Dynamic.literal(securityScheme = securityScheme.asInstanceOf[js.Any], securitySchemeName = securitySchemeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityScheme]
  }
  
  extension [Self <: SecurityScheme](x: Self) {
    
    inline def setSecurityScheme(value: NameString): Self = StObject.set(x, "securityScheme", value.asInstanceOf[js.Any])
    
    inline def setSecuritySchemeName(value: NameString): Self = StObject.set(x, "securitySchemeName", value.asInstanceOf[js.Any])
  }
}
