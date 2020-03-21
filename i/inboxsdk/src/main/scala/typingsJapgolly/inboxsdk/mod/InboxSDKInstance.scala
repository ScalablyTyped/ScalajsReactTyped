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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InboxSDKInstance extends js.Object {
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
  @scala.inline
  def apply(
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
}

