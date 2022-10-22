package typingsJapgolly.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelModeratedByAppInstanceUserSummary extends StObject {
  
  /**
    * Summary of the details of a Channel.
    */
  var ChannelSummary: js.UndefOr[typingsJapgolly.awsSdk.clientsChimesdkmessagingMod.ChannelSummary] = js.undefined
}
object ChannelModeratedByAppInstanceUserSummary {
  
  inline def apply(): ChannelModeratedByAppInstanceUserSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelModeratedByAppInstanceUserSummary]
  }
  
  extension [Self <: ChannelModeratedByAppInstanceUserSummary](x: Self) {
    
    inline def setChannelSummary(value: ChannelSummary): Self = StObject.set(x, "ChannelSummary", value.asInstanceOf[js.Any])
    
    inline def setChannelSummaryUndefined: Self = StObject.set(x, "ChannelSummary", js.undefined)
  }
}
