package typingsJapgolly.feathersjsAuthenticationJwt

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.feathersjsAuthenticationJwt.mod.JwtFromRequestFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFromAuthHeader extends js.Object {
  def fromAuthHeader(): JwtFromRequestFunction
  def fromAuthHeaderAsBearerToken(): JwtFromRequestFunction
  def fromAuthHeaderWithScheme(auth_scheme: String): JwtFromRequestFunction
  def fromBodyField(field_name: String): JwtFromRequestFunction
  def fromExtractors(extractors: js.Array[JwtFromRequestFunction]): JwtFromRequestFunction
  def fromHeader(header_name: String): JwtFromRequestFunction
  def fromUrlQueryParameter(param_name: String): JwtFromRequestFunction
}

object AnonFromAuthHeader {
  @scala.inline
  def apply(
    fromAuthHeader: CallbackTo[JwtFromRequestFunction],
    fromAuthHeaderAsBearerToken: CallbackTo[JwtFromRequestFunction],
    fromAuthHeaderWithScheme: String => CallbackTo[JwtFromRequestFunction],
    fromBodyField: String => CallbackTo[JwtFromRequestFunction],
    fromExtractors: js.Array[JwtFromRequestFunction] => CallbackTo[JwtFromRequestFunction],
    fromHeader: String => CallbackTo[JwtFromRequestFunction],
    fromUrlQueryParameter: String => CallbackTo[JwtFromRequestFunction]
  ): AnonFromAuthHeader = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromAuthHeader")(fromAuthHeader.toJsFn)
    __obj.updateDynamic("fromAuthHeaderAsBearerToken")(fromAuthHeaderAsBearerToken.toJsFn)
    __obj.updateDynamic("fromAuthHeaderWithScheme")(js.Any.fromFunction1((t0: java.lang.String) => fromAuthHeaderWithScheme(t0).runNow()))
    __obj.updateDynamic("fromBodyField")(js.Any.fromFunction1((t0: java.lang.String) => fromBodyField(t0).runNow()))
    __obj.updateDynamic("fromExtractors")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.feathersjsAuthenticationJwt.mod.JwtFromRequestFunction]) => fromExtractors(t0).runNow()))
    __obj.updateDynamic("fromHeader")(js.Any.fromFunction1((t0: java.lang.String) => fromHeader(t0).runNow()))
    __obj.updateDynamic("fromUrlQueryParameter")(js.Any.fromFunction1((t0: java.lang.String) => fromUrlQueryParameter(t0).runNow()))
    __obj.asInstanceOf[AnonFromAuthHeader]
  }
}

