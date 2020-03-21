package typingsJapgolly.actionsOnGoogle.dialogflowDialogflowMod

import typingsJapgolly.actionsOnGoogle.assistantMod.AppHandler
import typingsJapgolly.actionsOnGoogle.contextMod.Contexts
import typingsJapgolly.actionsOnGoogle.dialogflowConvMod.DialogflowConversation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dialogflow_ extends js.Object {
  /** @public */
  def apply[TConversation /* <: DialogflowConversation[js.Object, js.Object, Contexts] */](): AppHandler with (DialogflowApp[js.Object, js.Object, Contexts, TConversation]) = js.native
  def apply[TConversation /* <: DialogflowConversation[js.Object, js.Object, Contexts] */](options: DialogflowOptions[js.Object, js.Object]): AppHandler with (DialogflowApp[js.Object, js.Object, Contexts, TConversation]) = js.native
}

