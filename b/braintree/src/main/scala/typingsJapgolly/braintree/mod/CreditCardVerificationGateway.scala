package typingsJapgolly.braintree.mod

import typingsJapgolly.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreditCardVerificationGateway extends StObject {
  
  def search(searchFn: Any): Readable
}
object CreditCardVerificationGateway {
  
  inline def apply(search: Any => Readable): CreditCardVerificationGateway = {
    val __obj = js.Dynamic.literal(search = js.Any.fromFunction1(search))
    __obj.asInstanceOf[CreditCardVerificationGateway]
  }
  
  extension [Self <: CreditCardVerificationGateway](x: Self) {
    
    inline def setSearch(value: Any => Readable): Self = StObject.set(x, "search", js.Any.fromFunction1(value))
  }
}
