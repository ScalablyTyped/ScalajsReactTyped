package typingsJapgolly.stripeV3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error extends StObject {
  
  var error: typingsJapgolly.stripeV3.stripe.Error
}
object Error {
  
  inline def apply(error: typingsJapgolly.stripeV3.stripe.Error): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  
  extension [Self <: Error](x: Self) {
    
    inline def setError(value: typingsJapgolly.stripeV3.stripe.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
