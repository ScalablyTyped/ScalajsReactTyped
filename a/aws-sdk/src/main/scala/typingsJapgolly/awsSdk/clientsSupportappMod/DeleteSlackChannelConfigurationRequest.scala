package typingsJapgolly.awsSdk.clientsSupportappMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSlackChannelConfigurationRequest extends StObject {
  
  /**
    * The channel ID in Slack. This ID identifies a channel within a Slack workspace.
    */
  var channelId: typingsJapgolly.awsSdk.clientsSupportappMod.channelId
  
  /**
    * The team ID in Slack. This ID uniquely identifies a Slack workspace.
    */
  var teamId: typingsJapgolly.awsSdk.clientsSupportappMod.teamId
}
object DeleteSlackChannelConfigurationRequest {
  
  inline def apply(channelId: channelId, teamId: teamId): DeleteSlackChannelConfigurationRequest = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], teamId = teamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSlackChannelConfigurationRequest]
  }
  
  extension [Self <: DeleteSlackChannelConfigurationRequest](x: Self) {
    
    inline def setChannelId(value: channelId): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setTeamId(value: teamId): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
  }
}
