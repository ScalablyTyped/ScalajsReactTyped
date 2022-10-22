package typingsJapgolly.grpcGrpcJs.anon

import typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Code extends StObject {
  
  var code: Status
  
  var details: String
}
object Code {
  
  inline def apply(code: Status, details: String): Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
  
  extension [Self <: Code](x: Self) {
    
    inline def setCode(value: Status): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
  }
}
