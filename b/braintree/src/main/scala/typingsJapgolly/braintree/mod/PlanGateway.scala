package typingsJapgolly.braintree.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.braintree.anon.Plans
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlanGateway extends StObject {
  
  def all(): js.Promise[Plans]
}
object PlanGateway {
  
  inline def apply(all: CallbackTo[js.Promise[Plans]]): PlanGateway = {
    val __obj = js.Dynamic.literal(all = all.toJsFn)
    __obj.asInstanceOf[PlanGateway]
  }
  
  extension [Self <: PlanGateway](x: Self) {
    
    inline def setAll(value: CallbackTo[js.Promise[Plans]]): Self = StObject.set(x, "all", value.toJsFn)
  }
}
