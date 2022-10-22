package typingsJapgolly.inboxsdk.mod

import typingsJapgolly.inboxsdk.mod.ButterBar.ButterBarInstance
import typingsJapgolly.inboxsdk.mod.Compose.ComposeInstance
import typingsJapgolly.inboxsdk.mod.Conversations.ConversationsInstance
import typingsJapgolly.inboxsdk.mod.Global.GlobalInstance
import typingsJapgolly.inboxsdk.mod.Keyboard.KeyboardInstance
import typingsJapgolly.inboxsdk.mod.Lists.ListsInstance
import typingsJapgolly.inboxsdk.mod.NavMenu.NavMenuInstance
import typingsJapgolly.inboxsdk.mod.Router.RouterInstance
import typingsJapgolly.inboxsdk.mod.Search.SearchInstance
import typingsJapgolly.inboxsdk.mod.Toolbars.ToolbarsInstance
import typingsJapgolly.inboxsdk.mod.User.UserInstance
import typingsJapgolly.inboxsdk.mod.Widgets.WidgetsInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InboxSDKInstance extends StObject {
  
  var ButterBar: ButterBarInstance
  
  var Compose: ComposeInstance
  
  var Conversations: ConversationsInstance
  
  var Global: GlobalInstance
  
  var Keyboard: KeyboardInstance
  
  var Lists: ListsInstance
  
  var NavMenu: NavMenuInstance
  
  var Router: RouterInstance
  
  var Search: SearchInstance
  
  var Toolbars: ToolbarsInstance
  
  var User: UserInstance
  
  var Widgets: WidgetsInstance
}
object InboxSDKInstance {
  
  inline def apply(
    ButterBar: ButterBarInstance,
    Compose: ComposeInstance,
    Conversations: ConversationsInstance,
    Global: GlobalInstance,
    Keyboard: KeyboardInstance,
    Lists: ListsInstance,
    NavMenu: NavMenuInstance,
    Router: RouterInstance,
    Search: SearchInstance,
    Toolbars: ToolbarsInstance,
    User: UserInstance,
    Widgets: WidgetsInstance
  ): InboxSDKInstance = {
    val __obj = js.Dynamic.literal(ButterBar = ButterBar.asInstanceOf[js.Any], Compose = Compose.asInstanceOf[js.Any], Conversations = Conversations.asInstanceOf[js.Any], Global = Global.asInstanceOf[js.Any], Keyboard = Keyboard.asInstanceOf[js.Any], Lists = Lists.asInstanceOf[js.Any], NavMenu = NavMenu.asInstanceOf[js.Any], Router = Router.asInstanceOf[js.Any], Search = Search.asInstanceOf[js.Any], Toolbars = Toolbars.asInstanceOf[js.Any], User = User.asInstanceOf[js.Any], Widgets = Widgets.asInstanceOf[js.Any])
    __obj.asInstanceOf[InboxSDKInstance]
  }
  
  extension [Self <: InboxSDKInstance](x: Self) {
    
    inline def setButterBar(value: ButterBarInstance): Self = StObject.set(x, "ButterBar", value.asInstanceOf[js.Any])
    
    inline def setCompose(value: ComposeInstance): Self = StObject.set(x, "Compose", value.asInstanceOf[js.Any])
    
    inline def setConversations(value: ConversationsInstance): Self = StObject.set(x, "Conversations", value.asInstanceOf[js.Any])
    
    inline def setGlobal(value: GlobalInstance): Self = StObject.set(x, "Global", value.asInstanceOf[js.Any])
    
    inline def setKeyboard(value: KeyboardInstance): Self = StObject.set(x, "Keyboard", value.asInstanceOf[js.Any])
    
    inline def setLists(value: ListsInstance): Self = StObject.set(x, "Lists", value.asInstanceOf[js.Any])
    
    inline def setNavMenu(value: NavMenuInstance): Self = StObject.set(x, "NavMenu", value.asInstanceOf[js.Any])
    
    inline def setRouter(value: RouterInstance): Self = StObject.set(x, "Router", value.asInstanceOf[js.Any])
    
    inline def setSearch(value: SearchInstance): Self = StObject.set(x, "Search", value.asInstanceOf[js.Any])
    
    inline def setToolbars(value: ToolbarsInstance): Self = StObject.set(x, "Toolbars", value.asInstanceOf[js.Any])
    
    inline def setUser(value: UserInstance): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
    
    inline def setWidgets(value: WidgetsInstance): Self = StObject.set(x, "Widgets", value.asInstanceOf[js.Any])
  }
}
