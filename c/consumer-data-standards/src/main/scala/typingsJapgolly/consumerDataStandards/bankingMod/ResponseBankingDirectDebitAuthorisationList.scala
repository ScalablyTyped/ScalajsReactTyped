package typingsJapgolly.consumerDataStandards.bankingMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.consumerDataStandards.anon.DirectDebitAuthorisations
import typingsJapgolly.consumerDataStandards.anon.First
import typingsJapgolly.consumerDataStandards.anon.TotalPages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseBankingDirectDebitAuthorisationList
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var data: DirectDebitAuthorisations
  
  var links: First
  
  var meta: TotalPages
}
object ResponseBankingDirectDebitAuthorisationList {
  
  inline def apply(data: DirectDebitAuthorisations, links: First, meta: TotalPages): ResponseBankingDirectDebitAuthorisationList = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseBankingDirectDebitAuthorisationList]
  }
  
  extension [Self <: ResponseBankingDirectDebitAuthorisationList](x: Self) {
    
    inline def setData(value: DirectDebitAuthorisations): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: First): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: TotalPages): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
