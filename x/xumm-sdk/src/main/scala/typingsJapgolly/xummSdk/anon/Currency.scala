package typingsJapgolly.xummSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Currency extends StObject {
  
  var currency: Code
}
object Currency {
  
  inline def apply(currency: Code): Currency = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any])
    __obj.asInstanceOf[Currency]
  }
  
  extension [Self <: Currency](x: Self) {
    
    inline def setCurrency(value: Code): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
  }
}
