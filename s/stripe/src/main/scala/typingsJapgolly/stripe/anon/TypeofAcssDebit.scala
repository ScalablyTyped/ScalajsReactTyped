package typingsJapgolly.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofAcssDebit extends StObject {
  
  val MandateOptions: Any
}
object TypeofAcssDebit {
  
  inline def apply(MandateOptions: Any): TypeofAcssDebit = {
    val __obj = js.Dynamic.literal(MandateOptions = MandateOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofAcssDebit]
  }
  
  extension [Self <: TypeofAcssDebit](x: Self) {
    
    inline def setMandateOptions(value: Any): Self = StObject.set(x, "MandateOptions", value.asInstanceOf[js.Any])
  }
}
