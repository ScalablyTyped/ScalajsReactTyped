package typingsJapgolly.pubnub.mod

import typingsJapgolly.pubnub.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetChannelMetadataParameters[Custom /* <: ObjectCustom */] extends StObject {
  
  var channel: String
  
  var data: ChannelMetadata[Custom]
  
  var include: js.UndefOr[`0`] = js.undefined
}
object SetChannelMetadataParameters {
  
  inline def apply[Custom /* <: ObjectCustom */](channel: String, data: ChannelMetadata[Custom]): SetChannelMetadataParameters[Custom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetChannelMetadataParameters[Custom]]
  }
  
  extension [Self <: SetChannelMetadataParameters[?], Custom /* <: ObjectCustom */](x: Self & SetChannelMetadataParameters[Custom]) {
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setData(value: ChannelMetadata[Custom]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setInclude(value: `0`): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
  }
}
