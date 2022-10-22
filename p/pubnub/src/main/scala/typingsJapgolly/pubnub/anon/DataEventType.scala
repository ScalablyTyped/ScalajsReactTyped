package typingsJapgolly.pubnub.anon

import typingsJapgolly.pubnub.mod.ChannelMetadataObject
import typingsJapgolly.pubnub.mod.ObjectCustom
import typingsJapgolly.pubnub.pubnubStrings.channel
import typingsJapgolly.pubnub.pubnubStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataEventType[ChannelCustom /* <: ObjectCustom */] extends StObject {
  
  var data: ChannelMetadataObject[ChannelCustom]
  
  var event: set
  
  var `type`: channel
}
object DataEventType {
  
  inline def apply[ChannelCustom /* <: ObjectCustom */](data: ChannelMetadataObject[ChannelCustom]): DataEventType[ChannelCustom] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = "set")
    __obj.updateDynamic("type")("channel")
    __obj.asInstanceOf[DataEventType[ChannelCustom]]
  }
  
  extension [Self <: DataEventType[?], ChannelCustom /* <: ObjectCustom */](x: Self & DataEventType[ChannelCustom]) {
    
    inline def setData(value: ChannelMetadataObject[ChannelCustom]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: set): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setType(value: channel): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
