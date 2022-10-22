package typingsJapgolly.nodeBarion.mod

import typingsJapgolly.nodeBarion.nodeBarionStrings.CZK
import typingsJapgolly.nodeBarion.nodeBarionStrings.EUR
import typingsJapgolly.nodeBarion.nodeBarionStrings.HUF
import typingsJapgolly.nodeBarion.nodeBarionStrings.USD
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Money extends StObject {
  
  var Currency: CZK | EUR | HUF | USD
  
  var Value: Double
}
object Money {
  
  inline def apply(Currency: CZK | EUR | HUF | USD, Value: Double): Money = {
    val __obj = js.Dynamic.literal(Currency = Currency.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Money]
  }
  
  extension [Self <: Money](x: Self) {
    
    inline def setCurrency(value: CZK | EUR | HUF | USD): Self = StObject.set(x, "Currency", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
