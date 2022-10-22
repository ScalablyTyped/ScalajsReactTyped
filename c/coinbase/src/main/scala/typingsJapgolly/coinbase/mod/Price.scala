package typingsJapgolly.coinbase.mod

import typingsJapgolly.coinbase.anon.Amount
import typingsJapgolly.coinbase.anon.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Price extends StObject {
  
  var data: Amount
  
  var warnings: js.UndefOr[js.Array[Message]] = js.undefined
}
object Price {
  
  inline def apply(data: Amount): Price = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Price]
  }
  
  extension [Self <: Price](x: Self) {
    
    inline def setData(value: Amount): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setWarnings(value: js.Array[Message]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: Message*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
