package typingsJapgolly.actionsOnGoogle.mod

import typingsJapgolly.actionsOnGoogle.contextMod.Contexts
import typingsJapgolly.actionsOnGoogle.dialogflowConvMod.DialogflowConversationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google", "DialogflowConversation")
@js.native
/** @public */
class DialogflowConversation[TConvData, TUserStorage, TContexts /* <: Contexts */] ()
  extends typingsJapgolly.actionsOnGoogle.dialogflowMod.DialogflowConversation[TConvData, TUserStorage, TContexts] {
  def this(options: DialogflowConversationOptions[TConvData, TUserStorage]) = this()
}

