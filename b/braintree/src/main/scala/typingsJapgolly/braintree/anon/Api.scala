package typingsJapgolly.braintree.anon

import typingsJapgolly.braintree.braintreeStrings.ControlPanel
import typingsJapgolly.braintree.braintreeStrings.Recurring
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Api extends StObject {
  
  var Api: typingsJapgolly.braintree.braintreeStrings.Api
  
  var ControlPanel: typingsJapgolly.braintree.braintreeStrings.ControlPanel
  
  var Recurring: typingsJapgolly.braintree.braintreeStrings.Recurring
}
object Api {
  
  inline def apply(): Api = {
    val __obj = js.Dynamic.literal(Api = "Api", ControlPanel = "ControlPanel", Recurring = "Recurring")
    __obj.asInstanceOf[Api]
  }
  
  extension [Self <: Api](x: Self) {
    
    inline def setApi(value: typingsJapgolly.braintree.braintreeStrings.Api): Self = StObject.set(x, "Api", value.asInstanceOf[js.Any])
    
    inline def setControlPanel(value: ControlPanel): Self = StObject.set(x, "ControlPanel", value.asInstanceOf[js.Any])
    
    inline def setRecurring(value: Recurring): Self = StObject.set(x, "Recurring", value.asInstanceOf[js.Any])
  }
}
