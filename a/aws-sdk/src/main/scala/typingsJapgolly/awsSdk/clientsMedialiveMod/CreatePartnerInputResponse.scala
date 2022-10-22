package typingsJapgolly.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePartnerInputResponse extends StObject {
  
  var Input: js.UndefOr[typingsJapgolly.awsSdk.clientsMedialiveMod.Input] = js.undefined
}
object CreatePartnerInputResponse {
  
  inline def apply(): CreatePartnerInputResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePartnerInputResponse]
  }
  
  extension [Self <: CreatePartnerInputResponse](x: Self) {
    
    inline def setInput(value: Input): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "Input", js.undefined)
  }
}
