package typingsJapgolly.actionsOnGoogle

import typingsJapgolly.actionsOnGoogle.distServiceDialogflowApiV1Mod.DialogflowV1Context
import typingsJapgolly.actionsOnGoogle.distServiceDialogflowApiV2Mod.GoogleCloudDialogflowV2Context
import typingsJapgolly.actionsOnGoogle.distServiceDialogflowContextMod.Contexts
import typingsJapgolly.actionsOnGoogle.distServiceDialogflowConvMod.DialogflowConversationOptions
import typingsJapgolly.actionsOnGoogle.distServiceDialogflowDialogflowMod.Dialogflow_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServiceDialogflowMod {
  
  @JSImport("actions-on-google/dist/service/dialogflow", "ContextValues")
  @js.native
  /** @hidden */
  open class ContextValues[TContexts /* <: Contexts */] ()
    extends typingsJapgolly.actionsOnGoogle.distServiceDialogflowContextMod.ContextValues[TContexts] {
    def this(outputContexts: js.Array[DialogflowV1Context | GoogleCloudDialogflowV2Context]) = this()
    def this(outputContexts: js.Array[DialogflowV1Context | GoogleCloudDialogflowV2Context], _session: String) = this()
    def this(outputContexts: Unit, _session: String) = this()
  }
  
  @JSImport("actions-on-google/dist/service/dialogflow", "DialogflowConversation")
  @js.native
  /** @public */
  open class DialogflowConversation[TConvData, TUserStorage, TContexts /* <: Contexts */] ()
    extends typingsJapgolly.actionsOnGoogle.distServiceDialogflowConvMod.DialogflowConversation[TConvData, TUserStorage, TContexts] {
    def this(options: DialogflowConversationOptions[TConvData, TUserStorage]) = this()
  }
  
  @JSImport("actions-on-google/dist/service/dialogflow", "dialogflow")
  @js.native
  val dialogflow: Dialogflow_ = js.native
}
