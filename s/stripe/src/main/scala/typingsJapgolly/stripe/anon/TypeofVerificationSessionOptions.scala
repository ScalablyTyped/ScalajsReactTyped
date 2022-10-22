package typingsJapgolly.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofVerificationSessionOptions extends StObject {
  
  val Options: TypeofOptions
}
object TypeofVerificationSessionOptions {
  
  inline def apply(Options: TypeofOptions): TypeofVerificationSessionOptions = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofVerificationSessionOptions]
  }
  
  extension [Self <: TypeofVerificationSessionOptions](x: Self) {
    
    inline def setOptions(value: TypeofOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
  }
}
