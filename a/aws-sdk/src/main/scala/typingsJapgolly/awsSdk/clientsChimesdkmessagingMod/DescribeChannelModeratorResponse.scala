package typingsJapgolly.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeChannelModeratorResponse extends StObject {
  
  /**
    * The details of the channel moderator.
    */
  var ChannelModerator: js.UndefOr[typingsJapgolly.awsSdk.clientsChimesdkmessagingMod.ChannelModerator] = js.undefined
}
object DescribeChannelModeratorResponse {
  
  inline def apply(): DescribeChannelModeratorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeChannelModeratorResponse]
  }
  
  extension [Self <: DescribeChannelModeratorResponse](x: Self) {
    
    inline def setChannelModerator(value: ChannelModerator): Self = StObject.set(x, "ChannelModerator", value.asInstanceOf[js.Any])
    
    inline def setChannelModeratorUndefined: Self = StObject.set(x, "ChannelModerator", js.undefined)
  }
}
