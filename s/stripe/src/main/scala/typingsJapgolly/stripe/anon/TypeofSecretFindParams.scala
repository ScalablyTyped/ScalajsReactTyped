package typingsJapgolly.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSecretFindParams extends StObject {
  
  val Scope: Any
}
object TypeofSecretFindParams {
  
  inline def apply(Scope: Any): TypeofSecretFindParams = {
    val __obj = js.Dynamic.literal(Scope = Scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSecretFindParams]
  }
  
  extension [Self <: TypeofSecretFindParams](x: Self) {
    
    inline def setScope(value: Any): Self = StObject.set(x, "Scope", value.asInstanceOf[js.Any])
  }
}
