package typingsJapgolly.consumerDataStandards.registerMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.consumerDataStandards.anon.Self
import typingsJapgolly.consumerDataStandards.anon.SoftwareProductId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SoftwareProductsStatusList
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Response data for the query
    */
  var data: js.Array[SoftwareProductId]
  
  var links: Self
  
  var meta: StringDictionary[Any]
}
object SoftwareProductsStatusList {
  
  inline def apply(data: js.Array[SoftwareProductId], links: Self, meta: StringDictionary[Any]): SoftwareProductsStatusList = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoftwareProductsStatusList]
  }
  
  extension [Self <: SoftwareProductsStatusList](x: Self) {
    
    inline def setData(value: js.Array[SoftwareProductId]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: SoftwareProductId*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setLinks(value: typingsJapgolly.consumerDataStandards.anon.Self): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: StringDictionary[Any]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
