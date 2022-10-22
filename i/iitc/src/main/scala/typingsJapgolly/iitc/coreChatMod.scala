package typingsJapgolly.iitc

import org.scalajs.dom.MouseEvent
import typingsJapgolly.iitc.coreInteltypesMod.Intel.MarkUpPortalType
import typingsJapgolly.iitc.iitcInts.`0`
import typingsJapgolly.iitc.iitcInts.`1`
import typingsJapgolly.iitc.iitcInts.`2`
import typingsJapgolly.iitc.iitcStrings.chatalerts
import typingsJapgolly.iitc.iitcStrings.chatall
import typingsJapgolly.iitc.iitcStrings.chatfaction
import typingsJapgolly.spectrum.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreChatMod {
  
  object global {
    
    @JSGlobal("Chat")
    @js.native
    open class Chat_ () extends StObject {
      
      // alerts
      var _alerts: chatStorage = js.native
      
      // faction
      var _faction: chatStorage = js.native
      
      // all
      var _public: chatStorage = js.native
      
      var _requestAlertsRunning: Boolean = js.native
      
      var _requestFactionRunning: Boolean = js.native
      
      var _requestPublicRunning: Boolean = js.native
      
      /** add nickname to chat-input line */
      def addNickname(nick: String): Unit = js.native
      
      /**
        * called by plugins (or other things?) that need to monitor COMM data streams when the user is not viewing them
        * instance: a unique string identifying the plugin requesting background COMM
        * channel: either 'all', 'faction' or (soon) 'alerts' - others possible in the future
        * flag: true for data wanted, false for not wanted
        */
      def backgroundChannelData(instance: String, channel: ChatChannels, flag: Boolean): Unit = js.native
      
      def chooseTab(tab: ChatChannels): Unit = js.native
      
      /** mouse event handler */
      def chooser(event: MouseEvent): Unit = js.native
      
      def genPostData(channel: ChatChannels, storageHash: chatStorage, getOlderMsgs: Boolean): Any = js.native
      
      /** @return name of active tab */
      def getActive(): String = js.native
      
      /** Override portal names that are used over and over, such as 'US Post Office' */
      def getChatPortalName(markup: MarkUpPortalType): String = js.native
      
      def handleAlerts(data: Any, olderMsgs: Boolean): Unit = js.native
      
      def handleFaction(data: Any, olderMsgs: Boolean): Unit = js.native
      
      def handlePublic(data: Any, olderMsgs: Boolean): Unit = js.native
      
      def handleTabCompletion(): Unit = js.native
      
      /** contains the logic to keep the correct scroll position. */
      def keepScrollPosition(box: JQuery, scrollBefore: Double, isOldMsgs: Boolean): Unit = js.native
      
      /**
        * checks if there are enough messages in the selected chat tab and
        * loads more if not.
        */
      def needMoreMessages(): Unit = js.native
      
      /** if user clicked a agent name */
      def nicknameClicked(event: MouseEvent, nickname: String): Unit = js.native
      
      /** send current message of current chat to server */
      def postMsg(): Unit = js.native
      
      def renderAlerts(oldMsgsWereAdded: Boolean): Unit = js.native
      
      /**
        * renders data from the data-hash to the element defined by the given
        * ID. Set 3rd argument to true if it is likely that old data has been
        * added. Latter is only required for scrolling.
        */
      def renderData(data: Any, element: chatfaction | chatall | chatalerts, likelyWereOldMsgs: Boolean): Unit = js.native
      
      def renderDivider(text: String): String = js.native
      
      def renderFaction(oldMsgsWereAdded: Boolean): Unit = js.native
      
      def renderMsg(
        msg: String,
        nick: String,
        time: Double,
        team: `0` | `1` | `2`,
        msgToPlayer: Boolean,
        systemNarrowcast: Boolean
      ): String = js.native
      
      def renderPublic(oldMsgsWereAdded: Boolean): Unit = js.native
      
      // [instance][channel] = flag;
      def request(): Unit = js.native
      
      def requestAlerts(getOlderMsgs: Boolean, isRetry: Boolean): Unit = js.native
      
      def requestFaction(getOlderMsgs: Boolean, isRetry: Boolean): Unit = js.native
      
      def requestPublic(getOlderMsgs: Boolean, isRetry: Boolean): Unit = js.native
      
      /** init */
      def setup(): Unit = js.native
      
      def setupPosting(): Unit = js.native
      
      def setupTime(): Unit = js.native
      
      /** activate a chat tab  */
      def show(tab: ChatChannels): Unit = js.native
      
      def tabToChannel(tab: String): ChatChannels = js.native
      def tabToChannel(tab: ChatChannels): ChatChannels = js.native
      
      /** Expand or collapse chat window */
      def toggle(): Unit = js.native
      
      /** store incoming data */
      def writeDataToHash(newData: Any, storageHash: chatStorage, isPublicChannel: Boolean, isOlderMsgs: Boolean): Unit = js.native
    }
    
    @JSGlobal("chat")
    @js.native
    def chat: Chat_ = js.native
    inline def chat_=(x: Chat_): Unit = js.Dynamic.global.updateDynamic("chat")(x.asInstanceOf[js.Any])
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.iitc.iitcStrings.all
      - typingsJapgolly.iitc.iitcStrings.faction
      - typingsJapgolly.iitc.iitcStrings.alerts
    */
    trait ChatChannels extends StObject
    object ChatChannels {
      
      inline def alerts: typingsJapgolly.iitc.iitcStrings.alerts = "alerts".asInstanceOf[typingsJapgolly.iitc.iitcStrings.alerts]
      
      inline def all: typingsJapgolly.iitc.iitcStrings.all = "all".asInstanceOf[typingsJapgolly.iitc.iitcStrings.all]
      
      inline def faction: typingsJapgolly.iitc.iitcStrings.faction = "faction".asInstanceOf[typingsJapgolly.iitc.iitcStrings.faction]
    }
    
    trait chatStorage extends StObject {
      
      var newestTimestamp: Double
      
      var oldestTimestamp: Double
    }
    object chatStorage {
      
      inline def apply(newestTimestamp: Double, oldestTimestamp: Double): chatStorage = {
        val __obj = js.Dynamic.literal(newestTimestamp = newestTimestamp.asInstanceOf[js.Any], oldestTimestamp = oldestTimestamp.asInstanceOf[js.Any])
        __obj.asInstanceOf[chatStorage]
      }
      
      extension [Self <: chatStorage](x: Self) {
        
        inline def setNewestTimestamp(value: Double): Self = StObject.set(x, "newestTimestamp", value.asInstanceOf[js.Any])
        
        inline def setOldestTimestamp(value: Double): Self = StObject.set(x, "oldestTimestamp", value.asInstanceOf[js.Any])
      }
    }
  }
}
