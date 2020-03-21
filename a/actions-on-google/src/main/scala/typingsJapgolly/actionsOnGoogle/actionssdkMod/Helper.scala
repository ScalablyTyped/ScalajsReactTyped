package typingsJapgolly.actionsOnGoogle.actionssdkMod

import typingsJapgolly.actionsOnGoogle.conversationConversationMod.Intent
import typingsJapgolly.actionsOnGoogle.helperHelperMod.HelperOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk", "Helper")
@js.native
class Helper[TIntent /* <: Intent */, TValueSpec] protected ()
  extends typingsJapgolly.actionsOnGoogle.conversationMod.Helper[TIntent, TValueSpec] {
  def this(options: HelperOptions[TIntent, TValueSpec]) = this()
}

