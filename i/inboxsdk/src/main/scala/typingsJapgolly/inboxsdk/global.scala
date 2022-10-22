package typingsJapgolly.inboxsdk

import typingsJapgolly.inboxsdk.mod.InboxSDKInstance
import typingsJapgolly.inboxsdk.mod.LoadOptions
import typingsJapgolly.inboxsdk.mod.LoadScriptOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object InboxSDK {
    
    @JSGlobal("InboxSDK")
    @js.native
    val ^ : js.Any = js.native
    
    object Router {
      
      @JSGlobal("InboxSDK.Router.NativeListRouteIDs")
      @js.native
      object NativeListRouteIDs extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typingsJapgolly.inboxsdk.mod.Router.NativeListRouteIDs & Double] = js.native
        
        /* 1 */ val ALL_MAIL: typingsJapgolly.inboxsdk.mod.Router.NativeListRouteIDs.ALL_MAIL & Double = js.native
        
        /* 13 */ val ANY_LIST: typingsJapgolly.inboxsdk.mod.Router.NativeListRouteIDs.ANY_LIST & Double = js.native
        
        /* 6 */ val DONE: typingsJapgolly.inboxsdk.mod.Router.NativeListRouteIDs.DONE & Double = js.native
        
        /* 4 */ val DRAFTS: typingsJapgolly.inboxsdk.mod.Router.NativeListRouteIDs.DRAFTS & Double = js.native
        
        /* 11 */ val IMPORTANT: typingsJapgolly.inboxsdk.mod.Router.NativeListRouteIDs.IMPORTANT & Double = js.native
        
        /* 0 */ val INBOX: typingsJapgolly.inboxsdk.mod.Router.NativeListRouteIDs.INBOX & Double = js.native
        
        /* 8 */ val LABEL: typingsJapgolly.inboxsdk.mod.Router.NativeListRouteIDs.LABEL & Double = js.native
        
        /* 7 */ val REMINDERS: typingsJapgolly.inboxsdk.mod.Router.NativeListRouteIDs.REMINDERS & Double = js.native
        
        /* 12 */ val SEARCH: typingsJapgolly.inboxsdk.mod.Router.NativeListRouteIDs.SEARCH & Double = js.native
        
        /* 2 */ val SENT: typingsJapgolly.inboxsdk.mod.Router.NativeListRouteIDs.SENT & Double = js.native
        
        /* 5 */ val SNOOZED: typingsJapgolly.inboxsdk.mod.Router.NativeListRouteIDs.SNOOZED & Double = js.native
        
        /* 10 */ val SPAM: typingsJapgolly.inboxsdk.mod.Router.NativeListRouteIDs.SPAM & Double = js.native
        
        /* 3 */ val STARRED: typingsJapgolly.inboxsdk.mod.Router.NativeListRouteIDs.STARRED & Double = js.native
        
        /* 9 */ val TRASH: typingsJapgolly.inboxsdk.mod.Router.NativeListRouteIDs.TRASH & Double = js.native
      }
      
      @JSGlobal("InboxSDK.Router.NativeRouteIDs")
      @js.native
      object NativeRouteIDs extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typingsJapgolly.inboxsdk.mod.Router.NativeRouteIDs & Double] = js.native
        
        /* 1 */ val ALL_MAIL: typingsJapgolly.inboxsdk.mod.Router.NativeRouteIDs.ALL_MAIL & Double = js.native
        
        /* 19 */ val ANY_LIST: typingsJapgolly.inboxsdk.mod.Router.NativeRouteIDs.ANY_LIST & Double = js.native
        
        /* 15 */ val CHAT: typingsJapgolly.inboxsdk.mod.Router.NativeRouteIDs.CHAT & Double = js.native
        
        /* 14 */ val CHATS: typingsJapgolly.inboxsdk.mod.Router.NativeRouteIDs.CHATS & Double = js.native
        
        /* 17 */ val CONTACT: typingsJapgolly.inboxsdk.mod.Router.NativeRouteIDs.CONTACT & Double = js.native
        
        /* 16 */ val CONTACTS: typingsJapgolly.inboxsdk.mod.Router.NativeRouteIDs.CONTACTS & Double = js.native
        
        /* 6 */ val DONE: typingsJapgolly.inboxsdk.mod.Router.NativeRouteIDs.DONE & Double = js.native
        
        /* 4 */ val DRAFTS: typingsJapgolly.inboxsdk.mod.Router.NativeRouteIDs.DRAFTS & Double = js.native
        
        /* 11 */ val IMPORTANT: typingsJapgolly.inboxsdk.mod.Router.NativeRouteIDs.IMPORTANT & Double = js.native
        
        /* 0 */ val INBOX: typingsJapgolly.inboxsdk.mod.Router.NativeRouteIDs.INBOX & Double = js.native
        
        /* 8 */ val LABEL: typingsJapgolly.inboxsdk.mod.Router.NativeRouteIDs.LABEL & Double = js.native
        
        /* 7 */ val REMINDERS: typingsJapgolly.inboxsdk.mod.Router.NativeRouteIDs.REMINDERS & Double = js.native
        
        /* 12 */ val SEARCH: typingsJapgolly.inboxsdk.mod.Router.NativeRouteIDs.SEARCH & Double = js.native
        
        /* 2 */ val SENT: typingsJapgolly.inboxsdk.mod.Router.NativeRouteIDs.SENT & Double = js.native
        
        /* 18 */ val SETTINGS: typingsJapgolly.inboxsdk.mod.Router.NativeRouteIDs.SETTINGS & Double = js.native
        
        /* 5 */ val SNOOZED: typingsJapgolly.inboxsdk.mod.Router.NativeRouteIDs.SNOOZED & Double = js.native
        
        /* 10 */ val SPAM: typingsJapgolly.inboxsdk.mod.Router.NativeRouteIDs.SPAM & Double = js.native
        
        /* 3 */ val STARRED: typingsJapgolly.inboxsdk.mod.Router.NativeRouteIDs.STARRED & Double = js.native
        
        /* 13 */ val THREAD: typingsJapgolly.inboxsdk.mod.Router.NativeRouteIDs.THREAD & Double = js.native
        
        /* 9 */ val TRASH: typingsJapgolly.inboxsdk.mod.Router.NativeRouteIDs.TRASH & Double = js.native
      }
    }
    
    inline def load(version: Double): js.Promise[InboxSDKInstance] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(version.asInstanceOf[js.Any]).asInstanceOf[js.Promise[InboxSDKInstance]]
    inline def load(version: Double, appId: String): js.Promise[InboxSDKInstance] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(version.asInstanceOf[js.Any], appId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[InboxSDKInstance]]
    inline def load(version: Double, appId: String, opts: LoadOptions): js.Promise[InboxSDKInstance] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(version.asInstanceOf[js.Any], appId.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[InboxSDKInstance]]
    inline def load(version: Double, appId: Unit, opts: LoadOptions): js.Promise[InboxSDKInstance] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(version.asInstanceOf[js.Any], appId.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[InboxSDKInstance]]
    
    inline def loadScript(url: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadScript")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def loadScript(url: String, options: LoadScriptOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadScript")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  }
}
