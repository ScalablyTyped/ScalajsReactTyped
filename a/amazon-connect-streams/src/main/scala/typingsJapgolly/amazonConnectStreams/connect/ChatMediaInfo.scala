package typingsJapgolly.amazonConnectStreams.connect

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.amazonConnectStreams.anon.ChatAutoAccept
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatMediaInfo extends StObject {
  
  val contactId: String
  
  def getConnectionToken(): js.Promise[ConnectionToken]
  @JSName("getConnectionToken")
  var getConnectionToken_Original: js.Function0[js.Promise[ConnectionToken]]
  
  val initialContactId: String
  
  val originalInfo: ChatAutoAccept
  
  val participantId: String
  
  val participantToken: String
}
object ChatMediaInfo {
  
  inline def apply(
    contactId: String,
    getConnectionToken: CallbackTo[js.Promise[ConnectionToken]],
    initialContactId: String,
    originalInfo: ChatAutoAccept,
    participantId: String,
    participantToken: String
  ): ChatMediaInfo = {
    val __obj = js.Dynamic.literal(contactId = contactId.asInstanceOf[js.Any], getConnectionToken = getConnectionToken.toJsFn, initialContactId = initialContactId.asInstanceOf[js.Any], originalInfo = originalInfo.asInstanceOf[js.Any], participantId = participantId.asInstanceOf[js.Any], participantToken = participantToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatMediaInfo]
  }
  
  extension [Self <: ChatMediaInfo](x: Self) {
    
    inline def setContactId(value: String): Self = StObject.set(x, "contactId", value.asInstanceOf[js.Any])
    
    inline def setGetConnectionToken(value: CallbackTo[js.Promise[ConnectionToken]]): Self = StObject.set(x, "getConnectionToken", value.toJsFn)
    
    inline def setInitialContactId(value: String): Self = StObject.set(x, "initialContactId", value.asInstanceOf[js.Any])
    
    inline def setOriginalInfo(value: ChatAutoAccept): Self = StObject.set(x, "originalInfo", value.asInstanceOf[js.Any])
    
    inline def setParticipantId(value: String): Self = StObject.set(x, "participantId", value.asInstanceOf[js.Any])
    
    inline def setParticipantToken(value: String): Self = StObject.set(x, "participantToken", value.asInstanceOf[js.Any])
  }
}
