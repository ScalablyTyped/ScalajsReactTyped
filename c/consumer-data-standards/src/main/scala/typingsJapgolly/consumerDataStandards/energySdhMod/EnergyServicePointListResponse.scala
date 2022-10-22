package typingsJapgolly.consumerDataStandards.energySdhMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.consumerDataStandards.anon.DictkServicePoints
import typingsJapgolly.consumerDataStandards.anon.First
import typingsJapgolly.consumerDataStandards.anon.TotalPages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnergyServicePointListResponse
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var data: DictkServicePoints
  
  var links: First
  
  var meta: TotalPages
}
object EnergyServicePointListResponse {
  
  inline def apply(data: DictkServicePoints, links: First, meta: TotalPages): EnergyServicePointListResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnergyServicePointListResponse]
  }
  
  extension [Self <: EnergyServicePointListResponse](x: Self) {
    
    inline def setData(value: DictkServicePoints): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: First): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: TotalPages): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
