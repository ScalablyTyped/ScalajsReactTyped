package typingsJapgolly.keycloakConnect.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Grant extends js.Object {
  var __raw: String
  var access_token: Token
  var expires_in: Double
  var id_token: Token
  var refresh_token: Token
  var token_type: String
  def isExpired(): Boolean
  def store(request: Request_[ParamsDictionary], response: Response_): Unit
  def update(grant: Grant): Unit
}

object Grant {
  @scala.inline
  def apply(
    __raw: String,
    access_token: Token,
    expires_in: Double,
    id_token: Token,
    isExpired: CallbackTo[Boolean],
    refresh_token: Token,
    store: (Request_[ParamsDictionary], Response_) => Callback,
    token_type: String,
    update: Grant => Callback
  ): Grant = {
    val __obj = js.Dynamic.literal(__raw = __raw.asInstanceOf[js.Any], access_token = access_token.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any], id_token = id_token.asInstanceOf[js.Any], refresh_token = refresh_token.asInstanceOf[js.Any], token_type = token_type.asInstanceOf[js.Any])
    __obj.updateDynamic("isExpired")(isExpired.toJsFn)
    __obj.updateDynamic("store")(js.Any.fromFunction2((t0: typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], t1: typingsJapgolly.express.mod.Response_) => store(t0, t1).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.keycloakConnect.mod.Grant) => update(t0).runNow()))
    __obj.asInstanceOf[Grant]
  }
}

