package typingsJapgolly.actionsOnGoogle

import typingsJapgolly.actionsOnGoogle.apiV2Mod.GoogleCloudDialogflowV2Context
import typingsJapgolly.actionsOnGoogle.contextMod.Contexts
import typingsJapgolly.actionsOnGoogle.dialogflowConvMod.DialogflowConversationOptions
import typingsJapgolly.actionsOnGoogle.dialogflowDialogflowMod.Dialogflow_
import typingsJapgolly.actionsOnGoogle.v1Mod.DialogflowV1Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/dialogflow", JSImport.Namespace)
@js.native
object dialogflowMod extends js.Object {
  @js.native
  /** @hidden */
  class ContextValues[TContexts /* <: Contexts */] ()
    extends typingsJapgolly.actionsOnGoogle.contextMod.ContextValues[TContexts] {
    def this(outputContexts: js.Array[DialogflowV1Context | GoogleCloudDialogflowV2Context]) = this()
    def this(outputContexts: js.Array[DialogflowV1Context | GoogleCloudDialogflowV2Context], _session: String) = this()
  }
  
  @js.native
  /** @public */
  class DialogflowConversation[TConvData, TUserStorage, TContexts /* <: Contexts */] ()
    extends typingsJapgolly.actionsOnGoogle.dialogflowConvMod.DialogflowConversation[TConvData, TUserStorage, TContexts] {
    def this(options: DialogflowConversationOptions[TConvData, TUserStorage]) = this()
  }
  
  val dialogflow: Dialogflow_ = js.native
}

