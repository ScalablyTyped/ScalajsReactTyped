package typingsJapgolly.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Buyer extends StObject {
  
  /** Adx account id of the buyer. */
  var accountId: js.UndefOr[String] = js.undefined
}
object Buyer {
  
  inline def apply(): Buyer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Buyer]
  }
  
  extension [Self <: Buyer](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
  }
}
