package typingsJapgolly.actionsOnGoogle.actionssdkActionssdkMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.actionsOnGoogle.conversationConversationMod.ConversationAppOptions
import typingsJapgolly.actionsOnGoogle.conversationConversationMod.ConversationOptionsInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsSdkOptions[TConvData, TUserStorage] extends ConversationAppOptions[TConvData, TUserStorage] {
  /**
    * Validates whether request is from Google through signature verification.
    * Uses Google-Auth-Library to verify authorization token against given Google Cloud Project ID.
    * Auth token is given in request header with key, "authorization".
    *
    * HTTP Code 403 will be thrown by default on verification error.
    *
    * @example
    * ```javascript
    *
    * const app = actionssdk({ verification: 'nodejs-cloud-test-project-1234' })
    * ```
    *
    * @public
    */
  var verification: js.UndefOr[ActionsSdkVerification | String] = js.undefined
}

object ActionsSdkOptions {
  @scala.inline
  def apply[TConvData, TUserStorage](
    clientId: String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    init: js.UndefOr[CallbackTo[ConversationOptionsInit[TConvData, TUserStorage]]] = js.undefined,
    ordersv3: js.UndefOr[Boolean] = js.undefined,
    verification: ActionsSdkVerification | String = null
  ): ActionsSdkOptions[TConvData, TUserStorage] = {
    val __obj = js.Dynamic.literal()
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    init.foreach(p => __obj.updateDynamic("init")(p.toJsFn))
    if (!js.isUndefined(ordersv3)) __obj.updateDynamic("ordersv3")(ordersv3.asInstanceOf[js.Any])
    if (verification != null) __obj.updateDynamic("verification")(verification.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsSdkOptions[TConvData, TUserStorage]]
  }
}

