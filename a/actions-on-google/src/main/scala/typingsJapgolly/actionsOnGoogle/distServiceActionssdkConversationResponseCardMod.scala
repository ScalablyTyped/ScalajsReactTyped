package typingsJapgolly.actionsOnGoogle

import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationResponseCardBasicMod.BasicCardOptions
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationResponseCardButtonMod.ButtonOptions
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationResponseCardTableMod.TableOptions
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationResponseRichMod._RichResponseItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServiceActionssdkConversationResponseCardMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response/card", "BasicCard")
  @js.native
  open class BasicCard protected ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationResponseCardBasicMod.BasicCard
       with _RichResponseItem {
    /** @public */
    def this(options: BasicCardOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response/card", "Button")
  @js.native
  open class Button protected ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationResponseCardButtonMod.Button {
    /**
      * @param options Button options
      * @public
      */
    def this(options: ButtonOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response/card", "Table")
  @js.native
  open class Table protected ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationResponseCardTableMod.Table
       with _RichResponseItem {
    /** @public */
    def this(options: TableOptions) = this()
  }
}
