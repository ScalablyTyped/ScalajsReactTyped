package typingsJapgolly.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdkClientPinpointBrowser.typesChannelResponseMod.ChannelResponse
import typingsJapgolly.awsSdkClientPinpointBrowser.typesChannelResponseMod.UnmarshalledChannelResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesChannelsResponseMod {
  
  trait ChannelsResponse extends StObject {
    
    /**
      * A map of channels, with the ChannelType as the key and the Channel as the value.
      */
    var Channels: js.UndefOr[
        StringDictionary[ChannelResponse] | (js.Iterable[js.Tuple2[String, ChannelResponse]])
      ] = js.undefined
  }
  object ChannelsResponse {
    
    inline def apply(): ChannelsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChannelsResponse]
    }
    
    extension [Self <: ChannelsResponse](x: Self) {
      
      inline def setChannels(value: StringDictionary[ChannelResponse] | (js.Iterable[js.Tuple2[String, ChannelResponse]])): Self = StObject.set(x, "Channels", value.asInstanceOf[js.Any])
      
      inline def setChannelsUndefined: Self = StObject.set(x, "Channels", js.undefined)
    }
  }
  
  trait UnmarshalledChannelsResponse
    extends StObject
       with ChannelsResponse {
    
    /**
      * A map of channels, with the ChannelType as the key and the Channel as the value.
      */
    @JSName("Channels")
    var Channels_UnmarshalledChannelsResponse: js.UndefOr[StringDictionary[UnmarshalledChannelResponse]] = js.undefined
  }
  object UnmarshalledChannelsResponse {
    
    inline def apply(): UnmarshalledChannelsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledChannelsResponse]
    }
    
    extension [Self <: UnmarshalledChannelsResponse](x: Self) {
      
      inline def setChannels(value: StringDictionary[UnmarshalledChannelResponse]): Self = StObject.set(x, "Channels", value.asInstanceOf[js.Any])
      
      inline def setChannelsUndefined: Self = StObject.set(x, "Channels", js.undefined)
    }
  }
}
