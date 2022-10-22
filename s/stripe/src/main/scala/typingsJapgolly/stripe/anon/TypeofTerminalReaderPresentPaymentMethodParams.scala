package typingsJapgolly.stripe.anon

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.stripe.mod.Stripe.TestHelpers.Terminal.ReadersResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTerminalReaderPresentPaymentMethodParams extends StObject {
  
  val ReaderPresentPaymentMethodParams: Any
  
  var ReadersResource: Instantiable0[typingsJapgolly.stripe.mod.Stripe.TestHelpers.Terminal.ReadersResource]
}
object TypeofTerminalReaderPresentPaymentMethodParams {
  
  inline def apply(ReaderPresentPaymentMethodParams: Any, ReadersResource: Instantiable0[ReadersResource]): TypeofTerminalReaderPresentPaymentMethodParams = {
    val __obj = js.Dynamic.literal(ReaderPresentPaymentMethodParams = ReaderPresentPaymentMethodParams.asInstanceOf[js.Any], ReadersResource = ReadersResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTerminalReaderPresentPaymentMethodParams]
  }
  
  extension [Self <: TypeofTerminalReaderPresentPaymentMethodParams](x: Self) {
    
    inline def setReaderPresentPaymentMethodParams(value: Any): Self = StObject.set(x, "ReaderPresentPaymentMethodParams", value.asInstanceOf[js.Any])
    
    inline def setReadersResource(value: Instantiable0[ReadersResource]): Self = StObject.set(x, "ReadersResource", value.asInstanceOf[js.Any])
  }
}
