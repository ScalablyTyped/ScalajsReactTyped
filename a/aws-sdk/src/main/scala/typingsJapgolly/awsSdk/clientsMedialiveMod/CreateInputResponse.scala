package typingsJapgolly.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateInputResponse extends StObject {
  
  var Input: js.UndefOr[typingsJapgolly.awsSdk.clientsMedialiveMod.Input] = js.undefined
}
object CreateInputResponse {
  
  inline def apply(): CreateInputResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateInputResponse]
  }
  
  extension [Self <: CreateInputResponse](x: Self) {
    
    inline def setInput(value: Input): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "Input", js.undefined)
  }
}
