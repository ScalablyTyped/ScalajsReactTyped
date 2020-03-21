package typingsJapgolly.feathersjsAuthentication.mod

import typingsJapgolly.feathersjsAuthentication.AnonAlgorithm
import typingsJapgolly.feathersjsAuthentication.AnonEnabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeathersAuthenticationOptions extends js.Object {
  var cookie: js.UndefOr[AnonEnabled] = js.undefined
  var entity: js.UndefOr[String] = js.undefined
  var header: js.UndefOr[String] = js.undefined
  var jwt: js.UndefOr[AnonAlgorithm] = js.undefined
  var passReqToCallback: js.UndefOr[Boolean] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var service: js.UndefOr[String] = js.undefined
  var session: js.UndefOr[Boolean] = js.undefined
}

object FeathersAuthenticationOptions {
  @scala.inline
  def apply(
    cookie: AnonEnabled = null,
    entity: String = null,
    header: String = null,
    jwt: AnonAlgorithm = null,
    passReqToCallback: js.UndefOr[Boolean] = js.undefined,
    path: String = null,
    service: String = null,
    session: js.UndefOr[Boolean] = js.undefined
  ): FeathersAuthenticationOptions = {
    val __obj = js.Dynamic.literal()
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    if (entity != null) __obj.updateDynamic("entity")(entity.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (jwt != null) __obj.updateDynamic("jwt")(jwt.asInstanceOf[js.Any])
    if (!js.isUndefined(passReqToCallback)) __obj.updateDynamic("passReqToCallback")(passReqToCallback.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    if (!js.isUndefined(session)) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeathersAuthenticationOptions]
  }
}

