package typingsJapgolly.pubnub.anon

import typingsJapgolly.pubnub.mod.ObjectCustom
import typingsJapgolly.pubnub.mod.UUIDMetadataObject
import typingsJapgolly.pubnub.pubnubStrings.set
import typingsJapgolly.pubnub.pubnubStrings.uuid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataUUIDMetadataObject[UUIDCustom /* <: ObjectCustom */] extends StObject {
  
  var data: UUIDMetadataObject[UUIDCustom]
  
  var event: set
  
  var `type`: uuid
}
object DataUUIDMetadataObject {
  
  inline def apply[UUIDCustom /* <: ObjectCustom */](data: UUIDMetadataObject[UUIDCustom]): DataUUIDMetadataObject[UUIDCustom] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = "set")
    __obj.updateDynamic("type")("uuid")
    __obj.asInstanceOf[DataUUIDMetadataObject[UUIDCustom]]
  }
  
  extension [Self <: DataUUIDMetadataObject[?], UUIDCustom /* <: ObjectCustom */](x: Self & DataUUIDMetadataObject[UUIDCustom]) {
    
    inline def setData(value: UUIDMetadataObject[UUIDCustom]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: set): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setType(value: uuid): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
