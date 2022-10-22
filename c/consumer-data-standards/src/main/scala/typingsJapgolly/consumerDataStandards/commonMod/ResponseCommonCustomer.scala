package typingsJapgolly.consumerDataStandards.commonMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.consumerDataStandards.anon.CustomerUType
import typingsJapgolly.consumerDataStandards.anon.Self
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseCommonCustomer
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var data: CustomerUType
  
  var links: Self
  
  var meta: js.UndefOr[StringDictionary[Any]] = js.undefined
}
object ResponseCommonCustomer {
  
  inline def apply(data: CustomerUType, links: Self): ResponseCommonCustomer = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseCommonCustomer]
  }
  
  extension [Self <: ResponseCommonCustomer](x: Self) {
    
    inline def setData(value: CustomerUType): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: typingsJapgolly.consumerDataStandards.anon.Self): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: StringDictionary[Any]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
  }
}
