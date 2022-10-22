package typingsJapgolly.consumerDataStandards.bankingMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.consumerDataStandards.anon.Balances
import typingsJapgolly.consumerDataStandards.anon.First
import typingsJapgolly.consumerDataStandards.anon.TotalPages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseBankingAccountsBalanceList
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var data: Balances
  
  var links: First
  
  var meta: TotalPages
}
object ResponseBankingAccountsBalanceList {
  
  inline def apply(data: Balances, links: First, meta: TotalPages): ResponseBankingAccountsBalanceList = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseBankingAccountsBalanceList]
  }
  
  extension [Self <: ResponseBankingAccountsBalanceList](x: Self) {
    
    inline def setData(value: Balances): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: First): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: TotalPages): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
