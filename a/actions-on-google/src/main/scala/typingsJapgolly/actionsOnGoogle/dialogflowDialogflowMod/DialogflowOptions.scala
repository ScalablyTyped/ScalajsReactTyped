package typingsJapgolly.actionsOnGoogle.dialogflowDialogflowMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.actionsOnGoogle.conversationConversationMod.ConversationAppOptions
import typingsJapgolly.actionsOnGoogle.conversationConversationMod.ConversationOptionsInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogflowOptions[TConvData, TUserStorage] extends ConversationAppOptions[TConvData, TUserStorage] {
  /**
    * Verifies whether the request comes from Dialogflow.
    * Uses header keys and values to check against ones specified by the developer
    * in the Dialogflow Fulfillment settings of the app.
    *
    * HTTP Code 403 will be thrown by default on verification error.
    *
    * @public
    */
  var verification: js.UndefOr[DialogflowVerification | DialogflowVerificationHeaders] = js.undefined
}

object DialogflowOptions {
  @scala.inline
  def apply[TConvData, TUserStorage](
    clientId: String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    init: js.UndefOr[CallbackTo[ConversationOptionsInit[TConvData, TUserStorage]]] = js.undefined,
    ordersv3: js.UndefOr[Boolean] = js.undefined,
    verification: DialogflowVerification | DialogflowVerificationHeaders = null
  ): DialogflowOptions[TConvData, TUserStorage] = {
    val __obj = js.Dynamic.literal()
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    init.foreach(p => __obj.updateDynamic("init")(p.toJsFn))
    if (!js.isUndefined(ordersv3)) __obj.updateDynamic("ordersv3")(ordersv3.asInstanceOf[js.Any])
    if (verification != null) __obj.updateDynamic("verification")(verification.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowOptions[TConvData, TUserStorage]]
  }
}

