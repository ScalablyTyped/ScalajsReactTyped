package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonIncompleteresultsBooleanItemsArrayTotalcountNumber extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: IncompleteresultsBooleanItemsArrayTotalcountNumber
}
object ApplicationjsonIncompleteresultsBooleanItemsArrayTotalcountNumber {
  
  inline def apply(applicationSlashjson: IncompleteresultsBooleanItemsArrayTotalcountNumber): ApplicationjsonIncompleteresultsBooleanItemsArrayTotalcountNumber = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonIncompleteresultsBooleanItemsArrayTotalcountNumber]
  }
  
  extension [Self <: ApplicationjsonIncompleteresultsBooleanItemsArrayTotalcountNumber](x: Self) {
    
    inline def setApplicationSlashjson(value: IncompleteresultsBooleanItemsArrayTotalcountNumber): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
