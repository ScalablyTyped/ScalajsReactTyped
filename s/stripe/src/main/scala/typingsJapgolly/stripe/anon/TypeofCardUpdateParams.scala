package typingsJapgolly.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCardUpdateParams extends StObject {
  
  val SpendingControls: TypeofSpendingControls
}
object TypeofCardUpdateParams {
  
  inline def apply(SpendingControls: TypeofSpendingControls): TypeofCardUpdateParams = {
    val __obj = js.Dynamic.literal(SpendingControls = SpendingControls.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCardUpdateParams]
  }
  
  extension [Self <: TypeofCardUpdateParams](x: Self) {
    
    inline def setSpendingControls(value: TypeofSpendingControls): Self = StObject.set(x, "SpendingControls", value.asInstanceOf[js.Any])
  }
}
