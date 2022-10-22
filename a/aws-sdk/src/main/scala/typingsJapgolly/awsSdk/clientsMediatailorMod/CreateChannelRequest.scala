package typingsJapgolly.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateChannelRequest extends StObject {
  
  /**
    * The identifier for the channel you are working on.
    */
  var ChannelName: string
  
  /**
    * The slate used to fill gaps between programs in the schedule. You must configure filler slate if your channel uses the LINEAR PlaybackMode. MediaTailor doesn't support filler slate for channels using the LOOP PlaybackMode.
    */
  var FillerSlate: js.UndefOr[SlateSource] = js.undefined
  
  /**
    * The channel's output properties.
    */
  var Outputs: RequestOutputs
  
  /**
    * The type of playback mode to use for this channel. LINEAR - The programs in the schedule play once back-to-back in the schedule. LOOP - The programs in the schedule play back-to-back in an endless loop. When the last program in the schedule stops playing, playback loops back to the first program in the schedule.
    */
  var PlaybackMode: typingsJapgolly.awsSdk.clientsMediatailorMod.PlaybackMode
  
  /**
    * The tags to assign to the channel.
    */
  var Tags: js.UndefOr[mapOfString] = js.undefined
  
  /**
    * The tier of the channel.
    */
  var Tier: js.UndefOr[typingsJapgolly.awsSdk.clientsMediatailorMod.Tier] = js.undefined
}
object CreateChannelRequest {
  
  inline def apply(ChannelName: string, Outputs: RequestOutputs, PlaybackMode: PlaybackMode): CreateChannelRequest = {
    val __obj = js.Dynamic.literal(ChannelName = ChannelName.asInstanceOf[js.Any], Outputs = Outputs.asInstanceOf[js.Any], PlaybackMode = PlaybackMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateChannelRequest]
  }
  
  extension [Self <: CreateChannelRequest](x: Self) {
    
    inline def setChannelName(value: string): Self = StObject.set(x, "ChannelName", value.asInstanceOf[js.Any])
    
    inline def setFillerSlate(value: SlateSource): Self = StObject.set(x, "FillerSlate", value.asInstanceOf[js.Any])
    
    inline def setFillerSlateUndefined: Self = StObject.set(x, "FillerSlate", js.undefined)
    
    inline def setOutputs(value: RequestOutputs): Self = StObject.set(x, "Outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsVarargs(value: RequestOutputItem*): Self = StObject.set(x, "Outputs", js.Array(value*))
    
    inline def setPlaybackMode(value: PlaybackMode): Self = StObject.set(x, "PlaybackMode", value.asInstanceOf[js.Any])
    
    inline def setTags(value: mapOfString): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTier(value: Tier): Self = StObject.set(x, "Tier", value.asInstanceOf[js.Any])
    
    inline def setTierUndefined: Self = StObject.set(x, "Tier", js.undefined)
  }
}
