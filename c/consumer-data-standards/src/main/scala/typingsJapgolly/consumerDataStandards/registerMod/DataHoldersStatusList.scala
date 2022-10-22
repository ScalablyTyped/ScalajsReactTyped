package typingsJapgolly.consumerDataStandards.registerMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.consumerDataStandards.anon.LegalEntityId
import typingsJapgolly.consumerDataStandards.anon.Self
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataHoldersStatusList
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Response data for the query
    */
  var data: js.Array[LegalEntityId]
  
  var links: Self
  
  var meta: StringDictionary[Any]
}
object DataHoldersStatusList {
  
  inline def apply(data: js.Array[LegalEntityId], links: Self, meta: StringDictionary[Any]): DataHoldersStatusList = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataHoldersStatusList]
  }
  
  extension [Self <: DataHoldersStatusList](x: Self) {
    
    inline def setData(value: js.Array[LegalEntityId]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: LegalEntityId*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setLinks(value: typingsJapgolly.consumerDataStandards.anon.Self): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: StringDictionary[Any]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
