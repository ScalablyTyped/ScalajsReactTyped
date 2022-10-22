package typingsJapgolly.consumerDataStandards.bankingMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.consumerDataStandards.anon.First
import typingsJapgolly.consumerDataStandards.anon.TotalPages
import typingsJapgolly.consumerDataStandards.anon.Transactions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseBankingTransactionList
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var data: Transactions
  
  var links: First
  
  var meta: TotalPages
}
object ResponseBankingTransactionList {
  
  inline def apply(data: Transactions, links: First, meta: TotalPages): ResponseBankingTransactionList = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseBankingTransactionList]
  }
  
  extension [Self <: ResponseBankingTransactionList](x: Self) {
    
    inline def setData(value: Transactions): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: First): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: TotalPages): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
