package typingsJapgolly.consumerDataStandards.energyMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.consumerDataStandards.anon.Plans
import typingsJapgolly.consumerDataStandards.anon.Self
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnergyAccountDetailResponse
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var data: Plans
  
  var links: Self
  
  var meta: StringDictionary[Any]
}
object EnergyAccountDetailResponse {
  
  inline def apply(data: Plans, links: Self, meta: StringDictionary[Any]): EnergyAccountDetailResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnergyAccountDetailResponse]
  }
  
  extension [Self <: EnergyAccountDetailResponse](x: Self) {
    
    inline def setData(value: Plans): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: typingsJapgolly.consumerDataStandards.anon.Self): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: StringDictionary[Any]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
