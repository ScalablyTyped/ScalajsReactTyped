package typingsJapgolly.consumerDataStandards.registerMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.consumerDataStandards.anon.AccreditationLevel
import typingsJapgolly.consumerDataStandards.anon.Self
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseRegisterDataRecipientList
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Response data for the query
    */
  var data: js.Array[AccreditationLevel]
  
  var links: Self
  
  var meta: StringDictionary[Any]
}
object ResponseRegisterDataRecipientList {
  
  inline def apply(data: js.Array[AccreditationLevel], links: Self, meta: StringDictionary[Any]): ResponseRegisterDataRecipientList = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseRegisterDataRecipientList]
  }
  
  extension [Self <: ResponseRegisterDataRecipientList](x: Self) {
    
    inline def setData(value: js.Array[AccreditationLevel]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: AccreditationLevel*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setLinks(value: typingsJapgolly.consumerDataStandards.anon.Self): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: StringDictionary[Any]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
