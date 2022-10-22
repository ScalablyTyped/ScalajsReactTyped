package typingsJapgolly.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Production extends StObject {
  
  var production: String
  
  var sandbox: String
}
object Production {
  
  inline def apply(production: String, sandbox: String): Production = {
    val __obj = js.Dynamic.literal(production = production.asInstanceOf[js.Any], sandbox = sandbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[Production]
  }
  
  extension [Self <: Production](x: Self) {
    
    inline def setProduction(value: String): Self = StObject.set(x, "production", value.asInstanceOf[js.Any])
    
    inline def setSandbox(value: String): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
  }
}
