package typingsJapgolly.actionsOnGoogle.conversationConversationMod

import typingsJapgolly.actionsOnGoogle.assistantMod.ServiceBaseApp
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConversationApp[TConvData, TUserStorage] extends ServiceBaseApp {
  /** @hidden */
  var _client: js.UndefOr[OAuth2Client] = js.native
  /** @public */
  var auth: js.UndefOr[OAuth2Config] = js.native
  /** @public */
  var init: js.UndefOr[js.Function0[ConversationOptionsInit[TConvData, TUserStorage]]] = js.native
  /** @public */
  var ordersv3: Boolean = js.native
}

