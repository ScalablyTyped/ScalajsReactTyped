package typingsJapgolly.actionsOnGoogle.helperHelperMod

import typingsJapgolly.actionsOnGoogle.commonMod.ProtoAny
import typingsJapgolly.actionsOnGoogle.conversationConversationMod.InputValueSpec
import typingsJapgolly.actionsOnGoogle.conversationConversationMod.Intent
import typingsJapgolly.actionsOnGoogle.v2Mod.GoogleActionsV2ExpectedIntent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/helper", "Helper")
@js.native
class Helper[TIntent /* <: Intent */, TValueSpec] protected () extends GoogleActionsV2ExpectedIntent {
  def this(options: HelperOptions[TIntent, TValueSpec]) = this()
  @JSName("inputValueData")
  var inputValueData_Helper: ProtoAny[InputValueSpec, TValueSpec] = js.native
}

