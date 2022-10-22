package typingsJapgolly.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Channel extends StObject {
  
  /**
    * The ARN of the channel.
    */
  var Arn: string
  
  /**
    * The name of the channel.
    */
  var ChannelName: string
  
  /**
    * Returns the state whether the channel is running or not.
    */
  var ChannelState: string
  
  /**
    * The timestamp of when the channel was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The slate used to fill gaps between programs in the schedule. You must configure filler slate if your channel uses the LINEAR PlaybackMode. MediaTailor doesn't support filler slate for channels using the LOOP PlaybackMode.
    */
  var FillerSlate: js.UndefOr[SlateSource] = js.undefined
  
  /**
    * The timestamp of when the channel was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The channel's output properties.
    */
  var Outputs: ResponseOutputs
  
  /**
    * The type of playback mode for this channel. LINEAR - Programs play back-to-back only once. LOOP - Programs play back-to-back in an endless loop. When the last program in the schedule plays, playback loops back to the first program in the schedule.
    */
  var PlaybackMode: string
  
  /**
    * The tags to assign to the channel.
    */
  var Tags: js.UndefOr[mapOfString] = js.undefined
  
  /**
    * The tier for this channel. STANDARD tier channels can contain live programs.
    */
  var Tier: string
}
object Channel {
  
  inline def apply(
    Arn: string,
    ChannelName: string,
    ChannelState: string,
    Outputs: ResponseOutputs,
    PlaybackMode: string,
    Tier: string
  ): Channel = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], ChannelName = ChannelName.asInstanceOf[js.Any], ChannelState = ChannelState.asInstanceOf[js.Any], Outputs = Outputs.asInstanceOf[js.Any], PlaybackMode = PlaybackMode.asInstanceOf[js.Any], Tier = Tier.asInstanceOf[js.Any])
    __obj.asInstanceOf[Channel]
  }
  
  extension [Self <: Channel](x: Self) {
    
    inline def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setChannelName(value: string): Self = StObject.set(x, "ChannelName", value.asInstanceOf[js.Any])
    
    inline def setChannelState(value: string): Self = StObject.set(x, "ChannelState", value.asInstanceOf[js.Any])
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setFillerSlate(value: SlateSource): Self = StObject.set(x, "FillerSlate", value.asInstanceOf[js.Any])
    
    inline def setFillerSlateUndefined: Self = StObject.set(x, "FillerSlate", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setOutputs(value: ResponseOutputs): Self = StObject.set(x, "Outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsVarargs(value: ResponseOutputItem*): Self = StObject.set(x, "Outputs", js.Array(value*))
    
    inline def setPlaybackMode(value: string): Self = StObject.set(x, "PlaybackMode", value.asInstanceOf[js.Any])
    
    inline def setTags(value: mapOfString): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTier(value: string): Self = StObject.set(x, "Tier", value.asInstanceOf[js.Any])
  }
}
