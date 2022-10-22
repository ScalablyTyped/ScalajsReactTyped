package typingsJapgolly.consumerDataStandards.bankingMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.consumerDataStandards.anon.Addresses
import typingsJapgolly.consumerDataStandards.anon.Self
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseBankingAccountByIdV2
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var data: Addresses
  
  var links: Self
  
  var meta: js.UndefOr[StringDictionary[Any]] = js.undefined
}
object ResponseBankingAccountByIdV2 {
  
  inline def apply(data: Addresses, links: Self): ResponseBankingAccountByIdV2 = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseBankingAccountByIdV2]
  }
  
  extension [Self <: ResponseBankingAccountByIdV2](x: Self) {
    
    inline def setData(value: Addresses): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: typingsJapgolly.consumerDataStandards.anon.Self): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: StringDictionary[Any]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
  }
}
