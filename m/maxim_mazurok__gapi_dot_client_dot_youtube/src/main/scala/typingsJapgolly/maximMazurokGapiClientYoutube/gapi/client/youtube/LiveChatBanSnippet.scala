package typingsJapgolly.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiveChatBanSnippet extends StObject {
  
  /** The duration of a ban, only filled if the ban has type TEMPORARY. */
  var banDurationSeconds: js.UndefOr[String] = js.undefined
  
  var bannedUserDetails: js.UndefOr[ChannelProfileDetails] = js.undefined
  
  /** The chat this ban is pertinent to. */
  var liveChatId: js.UndefOr[String] = js.undefined
  
  /** The type of ban. */
  var `type`: js.UndefOr[String] = js.undefined
}
object LiveChatBanSnippet {
  
  inline def apply(): LiveChatBanSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveChatBanSnippet]
  }
  
  extension [Self <: LiveChatBanSnippet](x: Self) {
    
    inline def setBanDurationSeconds(value: String): Self = StObject.set(x, "banDurationSeconds", value.asInstanceOf[js.Any])
    
    inline def setBanDurationSecondsUndefined: Self = StObject.set(x, "banDurationSeconds", js.undefined)
    
    inline def setBannedUserDetails(value: ChannelProfileDetails): Self = StObject.set(x, "bannedUserDetails", value.asInstanceOf[js.Any])
    
    inline def setBannedUserDetailsUndefined: Self = StObject.set(x, "bannedUserDetails", js.undefined)
    
    inline def setLiveChatId(value: String): Self = StObject.set(x, "liveChatId", value.asInstanceOf[js.Any])
    
    inline def setLiveChatIdUndefined: Self = StObject.set(x, "liveChatId", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
